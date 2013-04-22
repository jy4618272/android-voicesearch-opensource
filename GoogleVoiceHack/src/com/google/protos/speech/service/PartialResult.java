// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/PartialResult.proto

package com.google.protos.speech.service;

public final class PartialResult {
  private PartialResult() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface PartialRecognitionResultOrBuilder
      extends com.google.protobuf.MessageLiteOrBuilder {
    
    // repeated .RecognitionResultPart part = 1;
    java.util.List<com.google.protos.speech.service.PartialResult.RecognitionResultPart> 
        getPartList();
    com.google.protos.speech.service.PartialResult.RecognitionResultPart getPart(int index);
    int getPartCount();
  }
  public static final class PartialRecognitionResult extends
      com.google.protobuf.GeneratedMessageLite
      implements PartialRecognitionResultOrBuilder {
    // Use PartialRecognitionResult.newBuilder() to construct.
    private PartialRecognitionResult(Builder builder) {
      super(builder);
    }
    private PartialRecognitionResult(boolean noInit) {}
    
    private static final PartialRecognitionResult defaultInstance;
    public static PartialRecognitionResult getDefaultInstance() {
      return defaultInstance;
    }
    
    public PartialRecognitionResult getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    // repeated .RecognitionResultPart part = 1;
    public static final int PART_FIELD_NUMBER = 1;
    private java.util.List<com.google.protos.speech.service.PartialResult.RecognitionResultPart> part_;
    public java.util.List<com.google.protos.speech.service.PartialResult.RecognitionResultPart> getPartList() {
      return part_;
    }
    public java.util.List<? extends com.google.protos.speech.service.PartialResult.RecognitionResultPartOrBuilder> 
        getPartOrBuilderList() {
      return part_;
    }
    public int getPartCount() {
      return part_.size();
    }
    public com.google.protos.speech.service.PartialResult.RecognitionResultPart getPart(int index) {
      return part_.get(index);
    }
    public com.google.protos.speech.service.PartialResult.RecognitionResultPartOrBuilder getPartOrBuilder(
        int index) {
      return part_.get(index);
    }
    
    private void initFields() {
      part_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < part_.size(); i++) {
        output.writeMessage(1, part_.get(i));
      }
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < part_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, part_.get(i));
      }
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.PartialRecognitionResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.protos.speech.service.PartialResult.PartialRecognitionResult prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.protos.speech.service.PartialResult.PartialRecognitionResult, Builder>
        implements com.google.protos.speech.service.PartialResult.PartialRecognitionResultOrBuilder {
      // Construct using com.google.protos.speech.service.PartialResult.PartialRecognitionResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        part_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protos.speech.service.PartialResult.PartialRecognitionResult getDefaultInstanceForType() {
        return com.google.protos.speech.service.PartialResult.PartialRecognitionResult.getDefaultInstance();
      }
      
      public com.google.protos.speech.service.PartialResult.PartialRecognitionResult build() {
        com.google.protos.speech.service.PartialResult.PartialRecognitionResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.protos.speech.service.PartialResult.PartialRecognitionResult buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protos.speech.service.PartialResult.PartialRecognitionResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.protos.speech.service.PartialResult.PartialRecognitionResult buildPartial() {
        com.google.protos.speech.service.PartialResult.PartialRecognitionResult result = new com.google.protos.speech.service.PartialResult.PartialRecognitionResult(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          part_ = java.util.Collections.unmodifiableList(part_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.part_ = part_;
        return result;
      }
      
      public Builder mergeFrom(com.google.protos.speech.service.PartialResult.PartialRecognitionResult other) {
        if (other == com.google.protos.speech.service.PartialResult.PartialRecognitionResult.getDefaultInstance()) return this;
        if (!other.part_.isEmpty()) {
          if (part_.isEmpty()) {
            part_ = other.part_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartIsMutable();
            part_.addAll(other.part_);
          }
          
        }
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              
              return this;
            default: {
              if (!parseUnknownField(input, extensionRegistry, tag)) {
                
                return this;
              }
              break;
            }
            case 10: {
              com.google.protos.speech.service.PartialResult.RecognitionResultPart.Builder subBuilder = com.google.protos.speech.service.PartialResult.RecognitionResultPart.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addPart(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .RecognitionResultPart part = 1;
      private java.util.List<com.google.protos.speech.service.PartialResult.RecognitionResultPart> part_ =
        java.util.Collections.emptyList();
      private void ensurePartIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          part_ = new java.util.ArrayList<com.google.protos.speech.service.PartialResult.RecognitionResultPart>(part_);
          bitField0_ |= 0x00000001;
         }
      }
      
      public java.util.List<com.google.protos.speech.service.PartialResult.RecognitionResultPart> getPartList() {
        return java.util.Collections.unmodifiableList(part_);
      }
      public int getPartCount() {
        return part_.size();
      }
      public com.google.protos.speech.service.PartialResult.RecognitionResultPart getPart(int index) {
        return part_.get(index);
      }
      public Builder setPart(
          int index, com.google.protos.speech.service.PartialResult.RecognitionResultPart value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartIsMutable();
        part_.set(index, value);
        
        return this;
      }
      public Builder setPart(
          int index, com.google.protos.speech.service.PartialResult.RecognitionResultPart.Builder builderForValue) {
        ensurePartIsMutable();
        part_.set(index, builderForValue.build());
        
        return this;
      }
      public Builder addPart(com.google.protos.speech.service.PartialResult.RecognitionResultPart value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartIsMutable();
        part_.add(value);
        
        return this;
      }
      public Builder addPart(
          int index, com.google.protos.speech.service.PartialResult.RecognitionResultPart value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartIsMutable();
        part_.add(index, value);
        
        return this;
      }
      public Builder addPart(
          com.google.protos.speech.service.PartialResult.RecognitionResultPart.Builder builderForValue) {
        ensurePartIsMutable();
        part_.add(builderForValue.build());
        
        return this;
      }
      public Builder addPart(
          int index, com.google.protos.speech.service.PartialResult.RecognitionResultPart.Builder builderForValue) {
        ensurePartIsMutable();
        part_.add(index, builderForValue.build());
        
        return this;
      }
      public Builder addAllPart(
          java.lang.Iterable<? extends com.google.protos.speech.service.PartialResult.RecognitionResultPart> values) {
        ensurePartIsMutable();
        super.addAll(values, part_);
        
        return this;
      }
      public Builder clearPart() {
        part_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        
        return this;
      }
      public Builder removePart(int index) {
        ensurePartIsMutable();
        part_.remove(index);
        
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:PartialRecognitionResult)
    }
    
    static {
      defaultInstance = new PartialRecognitionResult(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:PartialRecognitionResult)
  }
  
  public interface RecognitionResultPartOrBuilder
      extends com.google.protobuf.MessageLiteOrBuilder {
    
    // optional string transcript = 1;
    boolean hasTranscript();
    String getTranscript();
    
    // optional double stabilityConfidence = 2;
    boolean hasStabilityConfidence();
    double getStabilityConfidence();
  }
  public static final class RecognitionResultPart extends
      com.google.protobuf.GeneratedMessageLite
      implements RecognitionResultPartOrBuilder {
    // Use RecognitionResultPart.newBuilder() to construct.
    private RecognitionResultPart(Builder builder) {
      super(builder);
    }
    private RecognitionResultPart(boolean noInit) {}
    
    private static final RecognitionResultPart defaultInstance;
    public static RecognitionResultPart getDefaultInstance() {
      return defaultInstance;
    }
    
    public RecognitionResultPart getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    private int bitField0_;
    // optional string transcript = 1;
    public static final int TRANSCRIPT_FIELD_NUMBER = 1;
    private java.lang.Object transcript_;
    public boolean hasTranscript() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getTranscript() {
      java.lang.Object ref = transcript_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          transcript_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTranscriptBytes() {
      java.lang.Object ref = transcript_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        transcript_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional double stabilityConfidence = 2;
    public static final int STABILITYCONFIDENCE_FIELD_NUMBER = 2;
    private double stabilityConfidence_;
    public boolean hasStabilityConfidence() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public double getStabilityConfidence() {
      return stabilityConfidence_;
    }
    
    private void initFields() {
      transcript_ = "";
      stabilityConfidence_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTranscriptBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, stabilityConfidence_);
      }
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTranscriptBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, stabilityConfidence_);
      }
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.protos.speech.service.PartialResult.RecognitionResultPart parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.protos.speech.service.PartialResult.RecognitionResultPart prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.protos.speech.service.PartialResult.RecognitionResultPart, Builder>
        implements com.google.protos.speech.service.PartialResult.RecognitionResultPartOrBuilder {
      // Construct using com.google.protos.speech.service.PartialResult.RecognitionResultPart.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        transcript_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        stabilityConfidence_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protos.speech.service.PartialResult.RecognitionResultPart getDefaultInstanceForType() {
        return com.google.protos.speech.service.PartialResult.RecognitionResultPart.getDefaultInstance();
      }
      
      public com.google.protos.speech.service.PartialResult.RecognitionResultPart build() {
        com.google.protos.speech.service.PartialResult.RecognitionResultPart result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.protos.speech.service.PartialResult.RecognitionResultPart buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protos.speech.service.PartialResult.RecognitionResultPart result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.protos.speech.service.PartialResult.RecognitionResultPart buildPartial() {
        com.google.protos.speech.service.PartialResult.RecognitionResultPart result = new com.google.protos.speech.service.PartialResult.RecognitionResultPart(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.transcript_ = transcript_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.stabilityConfidence_ = stabilityConfidence_;
        result.bitField0_ = to_bitField0_;
        return result;
      }
      
      public Builder mergeFrom(com.google.protos.speech.service.PartialResult.RecognitionResultPart other) {
        if (other == com.google.protos.speech.service.PartialResult.RecognitionResultPart.getDefaultInstance()) return this;
        if (other.hasTranscript()) {
          setTranscript(other.getTranscript());
        }
        if (other.hasStabilityConfidence()) {
          setStabilityConfidence(other.getStabilityConfidence());
        }
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              
              return this;
            default: {
              if (!parseUnknownField(input, extensionRegistry, tag)) {
                
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              transcript_ = input.readBytes();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              stabilityConfidence_ = input.readDouble();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string transcript = 1;
      private java.lang.Object transcript_ = "";
      public boolean hasTranscript() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getTranscript() {
        java.lang.Object ref = transcript_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          transcript_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTranscript(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        transcript_ = value;
        
        return this;
      }
      public Builder clearTranscript() {
        bitField0_ = (bitField0_ & ~0x00000001);
        transcript_ = getDefaultInstance().getTranscript();
        
        return this;
      }
      void setTranscript(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        transcript_ = value;
        
      }
      
      // optional double stabilityConfidence = 2;
      private double stabilityConfidence_ ;
      public boolean hasStabilityConfidence() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public double getStabilityConfidence() {
        return stabilityConfidence_;
      }
      public Builder setStabilityConfidence(double value) {
        bitField0_ |= 0x00000002;
        stabilityConfidence_ = value;
        
        return this;
      }
      public Builder clearStabilityConfidence() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stabilityConfidence_ = 0D;
        
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:RecognitionResultPart)
    }
    
    static {
      defaultInstance = new RecognitionResultPart(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:RecognitionResultPart)
  }
  
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}