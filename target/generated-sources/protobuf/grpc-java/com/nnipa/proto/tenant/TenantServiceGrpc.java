package com.nnipa.proto.tenant;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: tenant/tenant_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TenantServiceGrpc {

  private TenantServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.nnipa.proto.tenant.TenantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.CreateTenantRequest,
      com.nnipa.proto.tenant.CreateTenantResponse> getCreateTenantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTenant",
      requestType = com.nnipa.proto.tenant.CreateTenantRequest.class,
      responseType = com.nnipa.proto.tenant.CreateTenantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.CreateTenantRequest,
      com.nnipa.proto.tenant.CreateTenantResponse> getCreateTenantMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.CreateTenantRequest, com.nnipa.proto.tenant.CreateTenantResponse> getCreateTenantMethod;
    if ((getCreateTenantMethod = TenantServiceGrpc.getCreateTenantMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getCreateTenantMethod = TenantServiceGrpc.getCreateTenantMethod) == null) {
          TenantServiceGrpc.getCreateTenantMethod = getCreateTenantMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.CreateTenantRequest, com.nnipa.proto.tenant.CreateTenantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTenant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.CreateTenantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.CreateTenantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("CreateTenant"))
              .build();
        }
      }
    }
    return getCreateTenantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantRequest,
      com.nnipa.proto.tenant.GetTenantResponse> getGetTenantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTenant",
      requestType = com.nnipa.proto.tenant.GetTenantRequest.class,
      responseType = com.nnipa.proto.tenant.GetTenantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantRequest,
      com.nnipa.proto.tenant.GetTenantResponse> getGetTenantMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantRequest, com.nnipa.proto.tenant.GetTenantResponse> getGetTenantMethod;
    if ((getGetTenantMethod = TenantServiceGrpc.getGetTenantMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getGetTenantMethod = TenantServiceGrpc.getGetTenantMethod) == null) {
          TenantServiceGrpc.getGetTenantMethod = getGetTenantMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.GetTenantRequest, com.nnipa.proto.tenant.GetTenantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTenant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.GetTenantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.GetTenantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("GetTenant"))
              .build();
        }
      }
    }
    return getGetTenantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantByCodeRequest,
      com.nnipa.proto.tenant.GetTenantResponse> getGetTenantByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTenantByCode",
      requestType = com.nnipa.proto.tenant.GetTenantByCodeRequest.class,
      responseType = com.nnipa.proto.tenant.GetTenantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantByCodeRequest,
      com.nnipa.proto.tenant.GetTenantResponse> getGetTenantByCodeMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantByCodeRequest, com.nnipa.proto.tenant.GetTenantResponse> getGetTenantByCodeMethod;
    if ((getGetTenantByCodeMethod = TenantServiceGrpc.getGetTenantByCodeMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getGetTenantByCodeMethod = TenantServiceGrpc.getGetTenantByCodeMethod) == null) {
          TenantServiceGrpc.getGetTenantByCodeMethod = getGetTenantByCodeMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.GetTenantByCodeRequest, com.nnipa.proto.tenant.GetTenantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTenantByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.GetTenantByCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.GetTenantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("GetTenantByCode"))
              .build();
        }
      }
    }
    return getGetTenantByCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.TenantExistsRequest,
      com.nnipa.proto.tenant.TenantExistsResponse> getTenantExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TenantExists",
      requestType = com.nnipa.proto.tenant.TenantExistsRequest.class,
      responseType = com.nnipa.proto.tenant.TenantExistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.TenantExistsRequest,
      com.nnipa.proto.tenant.TenantExistsResponse> getTenantExistsMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.TenantExistsRequest, com.nnipa.proto.tenant.TenantExistsResponse> getTenantExistsMethod;
    if ((getTenantExistsMethod = TenantServiceGrpc.getTenantExistsMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getTenantExistsMethod = TenantServiceGrpc.getTenantExistsMethod) == null) {
          TenantServiceGrpc.getTenantExistsMethod = getTenantExistsMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.TenantExistsRequest, com.nnipa.proto.tenant.TenantExistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TenantExists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.TenantExistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.TenantExistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("TenantExists"))
              .build();
        }
      }
    }
    return getTenantExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.UpdateTenantRequest,
      com.nnipa.proto.tenant.UpdateTenantResponse> getUpdateTenantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTenant",
      requestType = com.nnipa.proto.tenant.UpdateTenantRequest.class,
      responseType = com.nnipa.proto.tenant.UpdateTenantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.UpdateTenantRequest,
      com.nnipa.proto.tenant.UpdateTenantResponse> getUpdateTenantMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.UpdateTenantRequest, com.nnipa.proto.tenant.UpdateTenantResponse> getUpdateTenantMethod;
    if ((getUpdateTenantMethod = TenantServiceGrpc.getUpdateTenantMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getUpdateTenantMethod = TenantServiceGrpc.getUpdateTenantMethod) == null) {
          TenantServiceGrpc.getUpdateTenantMethod = getUpdateTenantMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.UpdateTenantRequest, com.nnipa.proto.tenant.UpdateTenantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTenant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.UpdateTenantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.UpdateTenantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("UpdateTenant"))
              .build();
        }
      }
    }
    return getUpdateTenantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.ActivateTenantRequest,
      com.google.protobuf.Empty> getActivateTenantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateTenant",
      requestType = com.nnipa.proto.tenant.ActivateTenantRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.ActivateTenantRequest,
      com.google.protobuf.Empty> getActivateTenantMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.ActivateTenantRequest, com.google.protobuf.Empty> getActivateTenantMethod;
    if ((getActivateTenantMethod = TenantServiceGrpc.getActivateTenantMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getActivateTenantMethod = TenantServiceGrpc.getActivateTenantMethod) == null) {
          TenantServiceGrpc.getActivateTenantMethod = getActivateTenantMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.ActivateTenantRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateTenant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.ActivateTenantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("ActivateTenant"))
              .build();
        }
      }
    }
    return getActivateTenantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.SuspendTenantRequest,
      com.google.protobuf.Empty> getSuspendTenantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendTenant",
      requestType = com.nnipa.proto.tenant.SuspendTenantRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.SuspendTenantRequest,
      com.google.protobuf.Empty> getSuspendTenantMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.SuspendTenantRequest, com.google.protobuf.Empty> getSuspendTenantMethod;
    if ((getSuspendTenantMethod = TenantServiceGrpc.getSuspendTenantMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getSuspendTenantMethod = TenantServiceGrpc.getSuspendTenantMethod) == null) {
          TenantServiceGrpc.getSuspendTenantMethod = getSuspendTenantMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.SuspendTenantRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendTenant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.SuspendTenantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("SuspendTenant"))
              .build();
        }
      }
    }
    return getSuspendTenantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantStatusRequest,
      com.nnipa.proto.tenant.GetTenantStatusResponse> getGetTenantStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTenantStatus",
      requestType = com.nnipa.proto.tenant.GetTenantStatusRequest.class,
      responseType = com.nnipa.proto.tenant.GetTenantStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantStatusRequest,
      com.nnipa.proto.tenant.GetTenantStatusResponse> getGetTenantStatusMethod() {
    io.grpc.MethodDescriptor<com.nnipa.proto.tenant.GetTenantStatusRequest, com.nnipa.proto.tenant.GetTenantStatusResponse> getGetTenantStatusMethod;
    if ((getGetTenantStatusMethod = TenantServiceGrpc.getGetTenantStatusMethod) == null) {
      synchronized (TenantServiceGrpc.class) {
        if ((getGetTenantStatusMethod = TenantServiceGrpc.getGetTenantStatusMethod) == null) {
          TenantServiceGrpc.getGetTenantStatusMethod = getGetTenantStatusMethod =
              io.grpc.MethodDescriptor.<com.nnipa.proto.tenant.GetTenantStatusRequest, com.nnipa.proto.tenant.GetTenantStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTenantStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.GetTenantStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nnipa.proto.tenant.GetTenantStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantServiceMethodDescriptorSupplier("GetTenantStatus"))
              .build();
        }
      }
    }
    return getGetTenantStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TenantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenantServiceStub>() {
        @java.lang.Override
        public TenantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenantServiceStub(channel, callOptions);
        }
      };
    return TenantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TenantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenantServiceBlockingStub>() {
        @java.lang.Override
        public TenantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenantServiceBlockingStub(channel, callOptions);
        }
      };
    return TenantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TenantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenantServiceFutureStub>() {
        @java.lang.Override
        public TenantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenantServiceFutureStub(channel, callOptions);
        }
      };
    return TenantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a new tenant synchronously
     * </pre>
     */
    default void createTenant(com.nnipa.proto.tenant.CreateTenantRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.CreateTenantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTenantMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get tenant by ID
     * </pre>
     */
    default void getTenant(com.nnipa.proto.tenant.GetTenantRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTenantMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get tenant by code
     * </pre>
     */
    default void getTenantByCode(com.nnipa.proto.tenant.GetTenantByCodeRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTenantByCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if tenant exists
     * </pre>
     */
    default void tenantExists(com.nnipa.proto.tenant.TenantExistsRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.TenantExistsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTenantExistsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update tenant
     * </pre>
     */
    default void updateTenant(com.nnipa.proto.tenant.UpdateTenantRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.UpdateTenantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTenantMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activate tenant
     * </pre>
     */
    default void activateTenant(com.nnipa.proto.tenant.ActivateTenantRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateTenantMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suspend tenant
     * </pre>
     */
    default void suspendTenant(com.nnipa.proto.tenant.SuspendTenantRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendTenantMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get tenant status
     * </pre>
     */
    default void getTenantStatus(com.nnipa.proto.tenant.GetTenantStatusRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTenantStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TenantService.
   */
  public static abstract class TenantServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TenantServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TenantService.
   */
  public static final class TenantServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TenantServiceStub> {
    private TenantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new tenant synchronously
     * </pre>
     */
    public void createTenant(com.nnipa.proto.tenant.CreateTenantRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.CreateTenantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTenantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get tenant by ID
     * </pre>
     */
    public void getTenant(com.nnipa.proto.tenant.GetTenantRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTenantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get tenant by code
     * </pre>
     */
    public void getTenantByCode(com.nnipa.proto.tenant.GetTenantByCodeRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTenantByCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if tenant exists
     * </pre>
     */
    public void tenantExists(com.nnipa.proto.tenant.TenantExistsRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.TenantExistsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTenantExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update tenant
     * </pre>
     */
    public void updateTenant(com.nnipa.proto.tenant.UpdateTenantRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.UpdateTenantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTenantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activate tenant
     * </pre>
     */
    public void activateTenant(com.nnipa.proto.tenant.ActivateTenantRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateTenantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suspend tenant
     * </pre>
     */
    public void suspendTenant(com.nnipa.proto.tenant.SuspendTenantRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendTenantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get tenant status
     * </pre>
     */
    public void getTenantStatus(com.nnipa.proto.tenant.GetTenantStatusRequest request,
        io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTenantStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TenantService.
   */
  public static final class TenantServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TenantServiceBlockingStub> {
    private TenantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new tenant synchronously
     * </pre>
     */
    public com.nnipa.proto.tenant.CreateTenantResponse createTenant(com.nnipa.proto.tenant.CreateTenantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTenantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get tenant by ID
     * </pre>
     */
    public com.nnipa.proto.tenant.GetTenantResponse getTenant(com.nnipa.proto.tenant.GetTenantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTenantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get tenant by code
     * </pre>
     */
    public com.nnipa.proto.tenant.GetTenantResponse getTenantByCode(com.nnipa.proto.tenant.GetTenantByCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTenantByCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if tenant exists
     * </pre>
     */
    public com.nnipa.proto.tenant.TenantExistsResponse tenantExists(com.nnipa.proto.tenant.TenantExistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTenantExistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update tenant
     * </pre>
     */
    public com.nnipa.proto.tenant.UpdateTenantResponse updateTenant(com.nnipa.proto.tenant.UpdateTenantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTenantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activate tenant
     * </pre>
     */
    public com.google.protobuf.Empty activateTenant(com.nnipa.proto.tenant.ActivateTenantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateTenantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suspend tenant
     * </pre>
     */
    public com.google.protobuf.Empty suspendTenant(com.nnipa.proto.tenant.SuspendTenantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendTenantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get tenant status
     * </pre>
     */
    public com.nnipa.proto.tenant.GetTenantStatusResponse getTenantStatus(com.nnipa.proto.tenant.GetTenantStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTenantStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TenantService.
   */
  public static final class TenantServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TenantServiceFutureStub> {
    private TenantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new tenant synchronously
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nnipa.proto.tenant.CreateTenantResponse> createTenant(
        com.nnipa.proto.tenant.CreateTenantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTenantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get tenant by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nnipa.proto.tenant.GetTenantResponse> getTenant(
        com.nnipa.proto.tenant.GetTenantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTenantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get tenant by code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nnipa.proto.tenant.GetTenantResponse> getTenantByCode(
        com.nnipa.proto.tenant.GetTenantByCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTenantByCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if tenant exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nnipa.proto.tenant.TenantExistsResponse> tenantExists(
        com.nnipa.proto.tenant.TenantExistsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTenantExistsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nnipa.proto.tenant.UpdateTenantResponse> updateTenant(
        com.nnipa.proto.tenant.UpdateTenantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTenantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activate tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> activateTenant(
        com.nnipa.proto.tenant.ActivateTenantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateTenantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suspend tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> suspendTenant(
        com.nnipa.proto.tenant.SuspendTenantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendTenantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get tenant status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nnipa.proto.tenant.GetTenantStatusResponse> getTenantStatus(
        com.nnipa.proto.tenant.GetTenantStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTenantStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TENANT = 0;
  private static final int METHODID_GET_TENANT = 1;
  private static final int METHODID_GET_TENANT_BY_CODE = 2;
  private static final int METHODID_TENANT_EXISTS = 3;
  private static final int METHODID_UPDATE_TENANT = 4;
  private static final int METHODID_ACTIVATE_TENANT = 5;
  private static final int METHODID_SUSPEND_TENANT = 6;
  private static final int METHODID_GET_TENANT_STATUS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TENANT:
          serviceImpl.createTenant((com.nnipa.proto.tenant.CreateTenantRequest) request,
              (io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.CreateTenantResponse>) responseObserver);
          break;
        case METHODID_GET_TENANT:
          serviceImpl.getTenant((com.nnipa.proto.tenant.GetTenantRequest) request,
              (io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantResponse>) responseObserver);
          break;
        case METHODID_GET_TENANT_BY_CODE:
          serviceImpl.getTenantByCode((com.nnipa.proto.tenant.GetTenantByCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantResponse>) responseObserver);
          break;
        case METHODID_TENANT_EXISTS:
          serviceImpl.tenantExists((com.nnipa.proto.tenant.TenantExistsRequest) request,
              (io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.TenantExistsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TENANT:
          serviceImpl.updateTenant((com.nnipa.proto.tenant.UpdateTenantRequest) request,
              (io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.UpdateTenantResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_TENANT:
          serviceImpl.activateTenant((com.nnipa.proto.tenant.ActivateTenantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SUSPEND_TENANT:
          serviceImpl.suspendTenant((com.nnipa.proto.tenant.SuspendTenantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TENANT_STATUS:
          serviceImpl.getTenantStatus((com.nnipa.proto.tenant.GetTenantStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.nnipa.proto.tenant.GetTenantStatusResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateTenantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.CreateTenantRequest,
              com.nnipa.proto.tenant.CreateTenantResponse>(
                service, METHODID_CREATE_TENANT)))
        .addMethod(
          getGetTenantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.GetTenantRequest,
              com.nnipa.proto.tenant.GetTenantResponse>(
                service, METHODID_GET_TENANT)))
        .addMethod(
          getGetTenantByCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.GetTenantByCodeRequest,
              com.nnipa.proto.tenant.GetTenantResponse>(
                service, METHODID_GET_TENANT_BY_CODE)))
        .addMethod(
          getTenantExistsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.TenantExistsRequest,
              com.nnipa.proto.tenant.TenantExistsResponse>(
                service, METHODID_TENANT_EXISTS)))
        .addMethod(
          getUpdateTenantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.UpdateTenantRequest,
              com.nnipa.proto.tenant.UpdateTenantResponse>(
                service, METHODID_UPDATE_TENANT)))
        .addMethod(
          getActivateTenantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.ActivateTenantRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ACTIVATE_TENANT)))
        .addMethod(
          getSuspendTenantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.SuspendTenantRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SUSPEND_TENANT)))
        .addMethod(
          getGetTenantStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nnipa.proto.tenant.GetTenantStatusRequest,
              com.nnipa.proto.tenant.GetTenantStatusResponse>(
                service, METHODID_GET_TENANT_STATUS)))
        .build();
  }

  private static abstract class TenantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TenantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nnipa.proto.tenant.TenantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TenantService");
    }
  }

  private static final class TenantServiceFileDescriptorSupplier
      extends TenantServiceBaseDescriptorSupplier {
    TenantServiceFileDescriptorSupplier() {}
  }

  private static final class TenantServiceMethodDescriptorSupplier
      extends TenantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TenantServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TenantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TenantServiceFileDescriptorSupplier())
              .addMethod(getCreateTenantMethod())
              .addMethod(getGetTenantMethod())
              .addMethod(getGetTenantByCodeMethod())
              .addMethod(getTenantExistsMethod())
              .addMethod(getUpdateTenantMethod())
              .addMethod(getActivateTenantMethod())
              .addMethod(getSuspendTenantMethod())
              .addMethod(getGetTenantStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
