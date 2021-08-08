// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patientAccommodation.proto

package patientAccommodationService;

/**
 * Protobuf type {@code patientAccommodationService.CalculatetResponse}
 */
public  final class CalculatetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:patientAccommodationService.CalculatetResponse)
    CalculatetResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculatetResponse.newBuilder() to construct.
  private CalculatetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculatetResponse() {
    totalPrice_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculatetResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            totalPrice_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculatetResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculatetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            patientAccommodationService.CalculatetResponse.class, patientAccommodationService.CalculatetResponse.Builder.class);
  }

  public static final int TOTALPRICE_FIELD_NUMBER = 1;
  private int totalPrice_;
  /**
   * <code>int32 totalPrice = 1;</code>
   */
  public int getTotalPrice() {
    return totalPrice_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (totalPrice_ != 0) {
      output.writeInt32(1, totalPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalPrice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, totalPrice_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof patientAccommodationService.CalculatetResponse)) {
      return super.equals(obj);
    }
    patientAccommodationService.CalculatetResponse other = (patientAccommodationService.CalculatetResponse) obj;

    boolean result = true;
    result = result && (getTotalPrice()
        == other.getTotalPrice());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOTALPRICE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalPrice();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static patientAccommodationService.CalculatetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static patientAccommodationService.CalculatetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static patientAccommodationService.CalculatetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static patientAccommodationService.CalculatetResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(patientAccommodationService.CalculatetResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code patientAccommodationService.CalculatetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:patientAccommodationService.CalculatetResponse)
      patientAccommodationService.CalculatetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculatetResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculatetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              patientAccommodationService.CalculatetResponse.class, patientAccommodationService.CalculatetResponse.Builder.class);
    }

    // Construct using patientAccommodationService.CalculatetResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      totalPrice_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculatetResponse_descriptor;
    }

    @java.lang.Override
    public patientAccommodationService.CalculatetResponse getDefaultInstanceForType() {
      return patientAccommodationService.CalculatetResponse.getDefaultInstance();
    }

    @java.lang.Override
    public patientAccommodationService.CalculatetResponse build() {
      patientAccommodationService.CalculatetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public patientAccommodationService.CalculatetResponse buildPartial() {
      patientAccommodationService.CalculatetResponse result = new patientAccommodationService.CalculatetResponse(this);
      result.totalPrice_ = totalPrice_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof patientAccommodationService.CalculatetResponse) {
        return mergeFrom((patientAccommodationService.CalculatetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(patientAccommodationService.CalculatetResponse other) {
      if (other == patientAccommodationService.CalculatetResponse.getDefaultInstance()) return this;
      if (other.getTotalPrice() != 0) {
        setTotalPrice(other.getTotalPrice());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      patientAccommodationService.CalculatetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (patientAccommodationService.CalculatetResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int totalPrice_ ;
    /**
     * <code>int32 totalPrice = 1;</code>
     */
    public int getTotalPrice() {
      return totalPrice_;
    }
    /**
     * <code>int32 totalPrice = 1;</code>
     */
    public Builder setTotalPrice(int value) {
      
      totalPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 totalPrice = 1;</code>
     */
    public Builder clearTotalPrice() {
      
      totalPrice_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:patientAccommodationService.CalculatetResponse)
  }

  // @@protoc_insertion_point(class_scope:patientAccommodationService.CalculatetResponse)
  private static final patientAccommodationService.CalculatetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new patientAccommodationService.CalculatetResponse();
  }

  public static patientAccommodationService.CalculatetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculatetResponse>
      PARSER = new com.google.protobuf.AbstractParser<CalculatetResponse>() {
    @java.lang.Override
    public CalculatetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculatetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculatetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculatetResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public patientAccommodationService.CalculatetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
