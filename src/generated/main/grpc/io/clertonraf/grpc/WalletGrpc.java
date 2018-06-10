package io.clertonraf.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The Account service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: wallet.proto")
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "wallet.Wallet";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDepositMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest,
      io.clertonraf.grpc.WalletResponse> METHOD_DEPOSIT = getDepositMethod();

  private static volatile io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest,
      io.clertonraf.grpc.WalletResponse> getDepositMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest,
      io.clertonraf.grpc.WalletResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest, io.clertonraf.grpc.WalletResponse> getDepositMethod;
    if ((getDepositMethod = WalletGrpc.getDepositMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDepositMethod = WalletGrpc.getDepositMethod) == null) {
          WalletGrpc.getDepositMethod = getDepositMethod = 
              io.grpc.MethodDescriptor.<io.clertonraf.grpc.WalletRequest, io.clertonraf.grpc.WalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "wallet.Wallet", "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.clertonraf.grpc.WalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.clertonraf.grpc.WalletResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("Deposit"))
                  .build();
          }
        }
     }
     return getDepositMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getWithdrawMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest,
      io.clertonraf.grpc.WalletResponse> METHOD_WITHDRAW = getWithdrawMethod();

  private static volatile io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest,
      io.clertonraf.grpc.WalletResponse> getWithdrawMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest,
      io.clertonraf.grpc.WalletResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<io.clertonraf.grpc.WalletRequest, io.clertonraf.grpc.WalletResponse> getWithdrawMethod;
    if ((getWithdrawMethod = WalletGrpc.getWithdrawMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawMethod = WalletGrpc.getWithdrawMethod) == null) {
          WalletGrpc.getWithdrawMethod = getWithdrawMethod = 
              io.grpc.MethodDescriptor.<io.clertonraf.grpc.WalletRequest, io.clertonraf.grpc.WalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "wallet.Wallet", "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.clertonraf.grpc.WalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.clertonraf.grpc.WalletResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("Withdraw"))
                  .build();
          }
        }
     }
     return getWithdrawMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBalanceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.clertonraf.grpc.BalanceRequest,
      io.clertonraf.grpc.BalanceResponse> METHOD_BALANCE = getBalanceMethod();

  private static volatile io.grpc.MethodDescriptor<io.clertonraf.grpc.BalanceRequest,
      io.clertonraf.grpc.BalanceResponse> getBalanceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.clertonraf.grpc.BalanceRequest,
      io.clertonraf.grpc.BalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<io.clertonraf.grpc.BalanceRequest, io.clertonraf.grpc.BalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = WalletGrpc.getBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBalanceMethod = WalletGrpc.getBalanceMethod) == null) {
          WalletGrpc.getBalanceMethod = getBalanceMethod = 
              io.grpc.MethodDescriptor.<io.clertonraf.grpc.BalanceRequest, io.clertonraf.grpc.BalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "wallet.Wallet", "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.clertonraf.grpc.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.clertonraf.grpc.BalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("Balance"))
                  .build();
          }
        }
     }
     return getBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    return new WalletStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletFutureStub(channel);
  }

  /**
   * <pre>
   * The Account service definition.
   * </pre>
   */
  public static abstract class WalletImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a deposit
     * </pre>
     */
    public void deposit(io.clertonraf.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<io.clertonraf.grpc.WalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Makes a Withdraw
     * </pre>
     */
    public void withdraw(io.clertonraf.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<io.clertonraf.grpc.WalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the balance
     * </pre>
     */
    public void balance(io.clertonraf.grpc.BalanceRequest request,
        io.grpc.stub.StreamObserver<io.clertonraf.grpc.BalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDepositMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.clertonraf.grpc.WalletRequest,
                io.clertonraf.grpc.WalletResponse>(
                  this, METHODID_DEPOSIT)))
          .addMethod(
            getWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.clertonraf.grpc.WalletRequest,
                io.clertonraf.grpc.WalletResponse>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.clertonraf.grpc.BalanceRequest,
                io.clertonraf.grpc.BalanceResponse>(
                  this, METHODID_BALANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * The Account service definition.
   * </pre>
   */
  public static final class WalletStub extends io.grpc.stub.AbstractStub<WalletStub> {
    private WalletStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a deposit
     * </pre>
     */
    public void deposit(io.clertonraf.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<io.clertonraf.grpc.WalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Makes a Withdraw
     * </pre>
     */
    public void withdraw(io.clertonraf.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<io.clertonraf.grpc.WalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the balance
     * </pre>
     */
    public void balance(io.clertonraf.grpc.BalanceRequest request,
        io.grpc.stub.StreamObserver<io.clertonraf.grpc.BalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Account service definition.
   * </pre>
   */
  public static final class WalletBlockingStub extends io.grpc.stub.AbstractStub<WalletBlockingStub> {
    private WalletBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a deposit
     * </pre>
     */
    public io.clertonraf.grpc.WalletResponse deposit(io.clertonraf.grpc.WalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Makes a Withdraw
     * </pre>
     */
    public io.clertonraf.grpc.WalletResponse withdraw(io.clertonraf.grpc.WalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the balance
     * </pre>
     */
    public io.clertonraf.grpc.BalanceResponse balance(io.clertonraf.grpc.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Account service definition.
   * </pre>
   */
  public static final class WalletFutureStub extends io.grpc.stub.AbstractStub<WalletFutureStub> {
    private WalletFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a deposit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.clertonraf.grpc.WalletResponse> deposit(
        io.clertonraf.grpc.WalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Makes a Withdraw
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.clertonraf.grpc.WalletResponse> withdraw(
        io.clertonraf.grpc.WalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the balance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.clertonraf.grpc.BalanceResponse> balance(
        io.clertonraf.grpc.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_BALANCE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSIT:
          serviceImpl.deposit((io.clertonraf.grpc.WalletRequest) request,
              (io.grpc.stub.StreamObserver<io.clertonraf.grpc.WalletResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((io.clertonraf.grpc.WalletRequest) request,
              (io.grpc.stub.StreamObserver<io.clertonraf.grpc.WalletResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((io.clertonraf.grpc.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<io.clertonraf.grpc.BalanceResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.clertonraf.grpc.WalletProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getDepositMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
