package me.grpc.stubs;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Bank.ConvertCurrencyRequest,
      me.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = me.grpc.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = me.grpc.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Bank.ConvertCurrencyRequest,
      me.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Bank.ConvertCurrencyRequest, me.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Bank.ConvertCurrencyRequest, me.grpc.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetAccountRequest,
      me.grpc.stubs.Bank.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccount",
      requestType = me.grpc.stubs.Bank.GetAccountRequest.class,
      responseType = me.grpc.stubs.Bank.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetAccountRequest,
      me.grpc.stubs.Bank.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetAccountRequest, me.grpc.stubs.Bank.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
          BankServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Bank.GetAccountRequest, me.grpc.stubs.Bank.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.GetAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetListAccountsRequest,
      me.grpc.stubs.Bank.GetListAccountsResponse> getGetListAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccount",
      requestType = me.grpc.stubs.Bank.GetListAccountsRequest.class,
      responseType = me.grpc.stubs.Bank.GetListAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetListAccountsRequest,
      me.grpc.stubs.Bank.GetListAccountsResponse> getGetListAccountMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetListAccountsRequest, me.grpc.stubs.Bank.GetListAccountsResponse> getGetListAccountMethod;
    if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
          BankServiceGrpc.getGetListAccountMethod = getGetListAccountMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Bank.GetListAccountsRequest, me.grpc.stubs.Bank.GetListAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.GetListAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.GetListAccountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccount"))
                  .build();
          }
        }
     }
     return getGetListAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest,
      me.grpc.stubs.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfAccountTransactions",
      requestType = me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest.class,
      responseType = me.grpc.stubs.Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest,
      me.grpc.stubs.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest, me.grpc.stubs.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;
    if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
          BankServiceGrpc.getGetStreamOfAccountTransactionsMethod = getGetStreamOfAccountTransactionsMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest, me.grpc.stubs.Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStreamOfAccountTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStreamOfAccountTransactions"))
                  .build();
          }
        }
     }
     return getGetStreamOfAccountTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction,
      me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitStreamOfTransaction",
      requestType = me.grpc.stubs.Bank.AccountTransaction.class,
      responseType = me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction,
      me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction, me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionMethod;
    if ((getSubmitStreamOfTransactionMethod = BankServiceGrpc.getSubmitStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getSubmitStreamOfTransactionMethod = BankServiceGrpc.getSubmitStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getSubmitStreamOfTransactionMethod = getSubmitStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Bank.AccountTransaction, me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "submitStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("submitStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getSubmitStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction,
      me.grpc.stubs.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeStreamOfTransaction",
      requestType = me.grpc.stubs.Bank.AccountTransaction.class,
      responseType = me.grpc.stubs.Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction,
      me.grpc.stubs.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction, me.grpc.stubs.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;
    if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getExecuteStreamOfTransactionMethod = getExecuteStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Bank.AccountTransaction, me.grpc.stubs.Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "executeStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("executeStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction,
      com.google.protobuf.Empty> getSubmitTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitTransaction",
      requestType = me.grpc.stubs.Bank.AccountTransaction.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction,
      com.google.protobuf.Empty> getSubmitTransactionMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Bank.AccountTransaction, com.google.protobuf.Empty> getSubmitTransactionMethod;
    if ((getSubmitTransactionMethod = BankServiceGrpc.getSubmitTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getSubmitTransactionMethod = BankServiceGrpc.getSubmitTransactionMethod) == null) {
          BankServiceGrpc.getSubmitTransactionMethod = getSubmitTransactionMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Bank.AccountTransaction, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "submitTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("submitTransaction"))
                  .build();
          }
        }
     }
     return getSubmitTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void convert(me.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(me.grpc.stubs.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccount(me.grpc.stubs.Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.GetListAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming model
     * </pre>
     */
    public void getStreamOfAccountTransactions(me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfAccountTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> submitStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubmitStreamOfTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionMethod(), responseObserver);
    }

    /**
     */
    public void submitTransaction(me.grpc.stubs.Bank.AccountTransaction request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Bank.ConvertCurrencyRequest,
                me.grpc.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Bank.GetAccountRequest,
                me.grpc.stubs.Bank.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetListAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Bank.GetListAccountsRequest,
                me.grpc.stubs.Bank.GetListAccountsResponse>(
                  this, METHODID_GET_LIST_ACCOUNT)))
          .addMethod(
            getGetStreamOfAccountTransactionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest,
                me.grpc.stubs.Bank.AccountTransaction>(
                  this, METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS)))
          .addMethod(
            getSubmitStreamOfTransactionMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                me.grpc.stubs.Bank.AccountTransaction,
                me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse>(
                  this, METHODID_SUBMIT_STREAM_OF_TRANSACTION)))
          .addMethod(
            getExecuteStreamOfTransactionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                me.grpc.stubs.Bank.AccountTransaction,
                me.grpc.stubs.Bank.AccountTransaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTION)))
          .addMethod(
            getSubmitTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Bank.AccountTransaction,
                com.google.protobuf.Empty>(
                  this, METHODID_SUBMIT_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void convert(me.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(me.grpc.stubs.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccount(me.grpc.stubs.Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.GetListAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming model
     * </pre>
     */
    public void getStreamOfAccountTransactions(me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfAccountTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> submitStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSubmitStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void submitTransaction(me.grpc.stubs.Bank.AccountTransaction request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public me.grpc.stubs.Bank.ConvertCurrencyResponse convert(me.grpc.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public me.grpc.stubs.Bank.GetAccountResponse getAccount(me.grpc.stubs.Bank.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public me.grpc.stubs.Bank.GetListAccountsResponse getListAccount(me.grpc.stubs.Bank.GetListAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming model
     * </pre>
     */
    public java.util.Iterator<me.grpc.stubs.Bank.AccountTransaction> getStreamOfAccountTransactions(
        me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfAccountTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty submitTransaction(me.grpc.stubs.Bank.AccountTransaction request) {
      return blockingUnaryCall(
          getChannel(), getSubmitTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<me.grpc.stubs.Bank.ConvertCurrencyResponse> convert(
        me.grpc.stubs.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<me.grpc.stubs.Bank.GetAccountResponse> getAccount(
        me.grpc.stubs.Bank.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<me.grpc.stubs.Bank.GetListAccountsResponse> getListAccount(
        me.grpc.stubs.Bank.GetListAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> submitTransaction(
        me.grpc.stubs.Bank.AccountTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_GET_LIST_ACCOUNT = 2;
  private static final int METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS = 3;
  private static final int METHODID_SUBMIT_TRANSACTION = 4;
  private static final int METHODID_SUBMIT_STREAM_OF_TRANSACTION = 5;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTION = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((me.grpc.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((me.grpc.stubs.Bank.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNT:
          serviceImpl.getListAccount((me.grpc.stubs.Bank.GetListAccountsRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.GetListAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS:
          serviceImpl.getStreamOfAccountTransactions((me.grpc.stubs.Bank.GetStreamOfAccountTransactionRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction>) responseObserver);
          break;
        case METHODID_SUBMIT_TRANSACTION:
          serviceImpl.submitTransaction((me.grpc.stubs.Bank.AccountTransaction) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
        case METHODID_SUBMIT_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.submitStreamOfTransaction(
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.PerformStreamOfTransactionsResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransaction(
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Bank.AccountTransaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return me.grpc.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetListAccountMethod())
              .addMethod(getGetStreamOfAccountTransactionsMethod())
              .addMethod(getSubmitStreamOfTransactionMethod())
              .addMethod(getExecuteStreamOfTransactionMethod())
              .addMethod(getSubmitTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
