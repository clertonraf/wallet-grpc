# Wallet with gRPC

### Requirements
A wallet server and a wallet client. 

The wallet server will keep track of a users monetary balance in the system. 

The client will emulate users depositing and withdrawing funds.

### Wallet Server
The wallet server expose the interface described below via gRPC, using `port 50051`.

#### Interfaces

#### Deposit
> Deposit funds to the users wallet.

###### Input
```sh
User id
Amount
Currency (allowed values are EUR, USD, GBP)
```
###### Output
* No output needed

###### Errors
```sh
Unknown currency
```
##### Withdraw
> Withdraw funds from the users wallet.

###### Input
```sh
User id
Amount
Currency (allowed values are EUR, USD, GBP)
```
###### Output
* No output needed

###### Errors
```sh
Unknown currency, insufficient funds
```
##### Balance
> Get the users current balance.

###### Input
```sh
User id
Output
The balance of the users account for each currency
```

#### Database
Latest version of MySQL server available on dockerhub

The is no need to run any scripts on database. 

If the client makes a new deposit with a new user id, a new account is automatically created with the 3 wallets (USD, GBP, EUR).

The are only two tables into the `walletSist` schema for this example:

````
account                   wallet
___________________     _______________________________________
| user | version |      | user | currency | balance | version |
-------------------     ---------------------------------------
````

* `user` is the primary key for `account`.
* `wallet` has a composite key `user` and `currency`. `user` references `account`.
* An `account` has many `wallet`. A `wallet` references to a single `account`.


#### Integration Test
```sh
Make a withdrawal of USD 200 for user with id 1. Must return "insufficient_funds".
Make a deposit of USD 100 to user with id 1.
Check that all balances are correct
Make a withdrawal of USD 200 for user with id 1. Must return "insufficient_funds".
Make a deposit of EUR 100 to user with id 1.
Check that all balances are correct
Make a withdrawal of USD 200 for user with id 1. Must return "insufficient_funds".
Make a deposit of USD 100 to user with id 1.
Check that all balances are correct
Make a withdrawal of USD 200 for user with id 1. Must return "ok".
Check that all balances are correct
Make a withdrawal of USD 200 for user with id 1. Must return "insufficient_funds".
```
#### Wallet Client
The wallet client emulate a number of users concurrently using the wallet. 

The wallet client must connect to the wallet server over gRPC, using `port 50051`. 

The client eliminating users doing rounds (a sequence of events). 

Whenever a round is needed it is picked at random from the following list of available rounds

```sh
Round A
Deposit 100 USD
Withdraw 200 USD
Deposit 100 EUR
Get Balance
Withdraw 100 USD
Get Balance
Withdraw 100 USD
```
```
Round B
Withdraw 100 GBP
Deposit 300 GPB
Withdraw 100 GBP
Withdraw 100 GBP
Withdraw 100 GBP
```
````
Round C
Get Balance
Deposit 100 USD
Deposit 100 USD
Withdraw 100 USD
Depsoit 100 USD
Get Balance
Withdraw 200 USD
Get Balance
````

The wallet client has the following CLI parameters:
```
users (number of concurrent users emulated)
concurrent_threads_per_user (number of concurrent requests a user will make)
rounds_per_thread (number of rounds each thread is executing)
```

The client exits when all rounds has been executed.

## Technologies

* Java 1.8
* Gradle 4.5
* gRPC-java 1.9.0
* jUnit 4.12
* Hibernate 4 + c3p0
* Docker compose (already setup in your machine)


### Gradle Plugins

The following plugins are already setup (in `build.gradle`):

* [protobuf-gradle-plugin](https://github.com/google/protobuf-gradle-plugin)
* [gradle-versions-plugin](https://github.com/ben-manes/gradle-versions-plugin)
* [IDEA plugin](https://docs.gradle.org/current/userguide/idea_plugin.html)

## Quick start


* Generate code and the jars:

```sh
./gradlew buildDist
./gradlew fatJarClient
./gradlew fatJarClient
```

* Check that your now you have the updated jars are into the folder:
````
build/libs/wallet-grpc-client-1.0-SNAPSHOT.jar
build/libs/wallet-grpc-server-1.0-SNAPSHOT.jar
````

* Inside the project's root folder, start the server with `Docker Compose` command on terminal:

```sh
docker-compose up
```
 Now you should be able to see the server will be listening to `port 50051`. Also, every operation on database will be logged on console.

* To start the client, don't forget to insert the three parameters: 

```sh
java -jar build/libs/build/libs/wallet-grpc-client-1.0-SNAPSHOT.jar <numUsers> <numThreads> <numRounds>
```

Running the client with 5 concurrent users, running 4 concurrent threads each, with 3 rounds each

```sh
java -jar build/libs/build/libs/wallet-grpc-client-1.0-SNAPSHOT.jar 5 4 3
```

## Running the integration tests

The test runs on `port 50053` to not conflict to any runnig instance.

The client and the server are simulated, connecting with each other, considering a single user and a single thread.


Since the docker compose file is attached to run only the server, to run the integration test inside the code, you must:

* Run a local standalone mysql. An alternative is run a detached version of mysql on docker: 

```sh
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=12345 -d mysql --default-authentication-plugin=mysql_native_password

```

A `test/resources/hibernate.cfg.xml` file is provided just for test scenarios. The differences relies on the host connection. This time, will try to connect to `localhost` instead of the docker container name. 

* Run `gradle test` with log level `INFO`
````
./gradlew test -i
````

### Contact
clertonfilho at gmail.com