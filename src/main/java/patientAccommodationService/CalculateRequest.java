// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patientAccommodation.proto

package patientAccommodationService;

/**
 * <pre>
 *Client Streaming 
 * </pre>
 *
 * Protobuf type {@code patientAccommodationService.CalculateRequest}
 */
public  final class CalculateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:patientAccommodationService.CalculateRequest)
    CalculateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculateRequest.newBuilder() to construct.
  private CalculateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculateRequest() {
    numberDays_ = 0;
    price_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculateRequest(
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

            numberDays_ = input.readInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            price_ = rawValue;
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
    return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            patientAccommodationService.CalculateRequest.class, patientAccommodationService.CalculateRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code patientAccommodationService.CalculateRequest.Price}
   */
  public enum Price
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PUBLIC = 0;</code>
     */
    PUBLIC(0),
    /**
     * <code>SEMIPRIVATE = 1;</code>
     */
    SEMIPRIVATE(1),
    /**
     * <code>PRIVATE = 2;</code>
     */
    PRIVATE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PUBLIC = 0;</code>
     */
    public static final int PUBLIC_VALUE = 0;
    /**
     * <code>SEMIPRIVATE = 1;</code>
     */
    public static final int SEMIPRIVATE_VALUE = 1;
    /**
     * <code>PRIVATE = 2;</code>
     */
    public static final int PRIVATE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Price valueOf(int value) {
      return forNumber(value);
    }

    public static Price forNumber(int value) {
      switch (value) {
        case 0: return PUBLIC;
        case 1: return SEMIPRIVATE;
        case 2: return PRIVATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Price>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Price> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Price>() {
            public Price findValueByNumber(int number) {
              return Price.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return patientAccommodationService.CalculateRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Price[] VALUES = values();

    public static Price valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Price(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:patientAccommodationService.CalculateRequest.Price)
  }

  public static final int NUMBERDAYS_FIELD_NUMBER = 1;
  private int numberDays_;
  /**
   * <code>int32 numberDays = 1;</code>
   */
  public int getNumberDays() {
    return numberDays_;
  }

  public static final int PRICE_FIELD_NUMBER = 2;
  private int price_;
  /**
   * <code>.patientAccommodationService.CalculateRequest.Price price = 2;</code>
   */
  public int getPriceValue() {
    return price_;
  }
  /**
   * <code>.patientAccommodationService.CalculateRequest.Price price = 2;</code>
   */
  public patientAccommodationService.CalculateRequest.Price getPrice() {
    @SuppressWarnings("deprecation")
    patientAccommodationService.CalculateRequest.Price result = patientAccommodationService.CalculateRequest.Price.valueOf(price_);
    return result == null ? patientAccommodationService.CalculateRequest.Price.UNRECOGNIZED : result;
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
    if (numberDays_ != 0) {
      output.writeInt32(1, numberDays_);
    }
    if (price_ != patientAccommodationService.CalculateRequest.Price.PUBLIC.getNumber()) {
      output.writeEnum(2, price_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numberDays_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numberDays_);
    }
    if (price_ != patientAccommodationService.CalculateRequest.Price.PUBLIC.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, price_);
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
    if (!(obj instanceof patientAccommodationService.CalculateRequest)) {
      return super.equals(obj);
    }
    patientAccommodationService.CalculateRequest other = (patientAccommodationService.CalculateRequest) obj;

    boolean result = true;
    result = result && (getNumberDays()
        == other.getNumberDays());
    result = result && price_ == other.price_;
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
    hash = (37 * hash) + NUMBERDAYS_FIELD_NUMBER;
    hash = (53 * hash) + getNumberDays();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + price_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static patientAccommodationService.CalculateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static patientAccommodationService.CalculateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static patientAccommodationService.CalculateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static patientAccommodationService.CalculateRequest parseFrom(
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
  public static Builder newBuilder(patientAccommodationService.CalculateRequest prototype) {
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
   * <pre>
   *Client Streaming 
   * </pre>
   *
   * Protobuf type {@code patientAccommodationService.CalculateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:patientAccommodationService.CalculateRequest)
      patientAccommodationService.CalculateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              patientAccommodationService.CalculateRequest.class, patientAccommodationService.CalculateRequest.Builder.class);
    }

    // Construct using patientAccommodationService.CalculateRequest.newBuilder()
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
      numberDays_ = 0;

      price_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return patientAccommodationService.PatientAccommodationServiceImpl.internal_static_patientAccommodationService_CalculateRequest_descriptor;
    }

    @java.lang.Override
    public patientAccommodationService.CalculateRequest getDefaultInstanceForType() {
      return patientAccommodationService.CalculateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public patientAccommodationService.CalculateRequest build() {
      patientAccommodationService.CalculateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public patientAccommodationService.CalculateRequest buildPartial() {
      patientAccommodationService.CalculateRequest result = new patientAccommodationService.CalculateRequest(this);
      result.numberDays_ = numberDays_;
      result.price_ = price_;
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
      if (other instanceof patientAccommodationService.CalculateRequest) {
        return mergeFrom((patientAccommodationService.CalculateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(patientAccommodationService.CalculateRequest other) {
      if (other == patientAccommodationService.CalculateRequest.getDefaultInstance()) return this;
      if (other.getNumberDays() != 0) {
        setNumberDays(other.getNumberDays());
      }
      if (other.price_ != 0) {
        setPriceValue(other.getPriceValue());
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
      patientAccommodationService.CalculateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (patientAccommodationService.CalculateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numberDays_ ;
    /**
     * <code>int32 numberDays = 1;</code>
     */
    public int getNumberDays() {
      return numberDays_;
    }
    /**
     * <code>int32 numberDays = 1;</code>
     */
    public Builder setNumberDays(int value) {
      
      numberDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numberDays = 1;</code>
     */
    public Builder clearNumberDays() {
      
      numberDays_ = 0;
      onChanged();
      return this;
    }

    private int price_ = 0;
    /**
     * <code>.patientAccommodationService.CalculateRequest.Price price = 2;</code>
     */
    public int getPriceValue() {
      return price_;
    }
    /**
     * <code>.patientAccommodationService.CalculateRequest.Price price = 2;</code>
     */
    public Builder setPriceValue(int value) {
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.patientAccommodationService.CalculateRequest.Price price = 2;</code>
     */
    public patientAccommodationService.CalculateRequest.Price getPrice() {
      @SuppressWarnings("deprecation")
      patientAccommodationService.CalculateRequest.Price result = patientAccommodationService.CalculateRequest.Price.valueOf(price_);
      return result == null ? patientAccommodationService.CalculateRequest.Price.UNRECOGNIZED : result;
    }
    /**
     * <code>.patientAccommodationService.CalculateRequest.Price price = 2;</code>
     */
    public Builder setPrice(patientAccommodationService.CalculateRequest.Price value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      price_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.patientAccommodationService.CalculateRequest.Price price = 2;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0;
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


    // @@protoc_insertion_point(builder_scope:patientAccommodationService.CalculateRequest)
  }

  // @@protoc_insertion_point(class_scope:patientAccommodationService.CalculateRequest)
  private static final patientAccommodationService.CalculateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new patientAccommodationService.CalculateRequest();
  }

  public static patientAccommodationService.CalculateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalculateRequest>() {
    @java.lang.Override
    public CalculateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public patientAccommodationService.CalculateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

