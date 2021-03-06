// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/IntentApi.proto

package com.google.protos.speech.apps.intentapi;

public final class IntentApi {
  private IntentApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar.intentApiGrammar);
  }
  public interface IntentApiGrammarOrBuilder
      extends com.google.protobuf.MessageLiteOrBuilder {
    
    // optional string languageModel = 1;
    boolean hasLanguageModel();
    String getLanguageModel();
    
    // optional int32 maxNbest = 2;
    boolean hasMaxNbest();
    int getMaxNbest();
    
    // optional .RecognitionContext recognitionContext = 3;
    boolean hasRecognitionContext();
    com.google.protos.speech.common.RecognitionContextProto.RecognitionContext getRecognitionContext();
    
    // optional string grxmlGrammar = 4;
    boolean hasGrxmlGrammar();
    String getGrxmlGrammar();
  }
  public static final class IntentApiGrammar extends
      com.google.protobuf.GeneratedMessageLite
      implements IntentApiGrammarOrBuilder {
    // Use IntentApiGrammar.newBuilder() to construct.
    private IntentApiGrammar(Builder builder) {
      super(builder);
    }
    private IntentApiGrammar(boolean noInit) {}
    
    private static final IntentApiGrammar defaultInstance;
    public static IntentApiGrammar getDefaultInstance() {
      return defaultInstance;
    }
    
    public IntentApiGrammar getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    private int bitField0_;
    // optional string languageModel = 1;
    public static final int LANGUAGEMODEL_FIELD_NUMBER = 1;
    private java.lang.Object languageModel_;
    public boolean hasLanguageModel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getLanguageModel() {
      java.lang.Object ref = languageModel_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          languageModel_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLanguageModelBytes() {
      java.lang.Object ref = languageModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        languageModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 maxNbest = 2;
    public static final int MAXNBEST_FIELD_NUMBER = 2;
    private int maxNbest_;
    public boolean hasMaxNbest() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getMaxNbest() {
      return maxNbest_;
    }
    
    // optional .RecognitionContext recognitionContext = 3;
    public static final int RECOGNITIONCONTEXT_FIELD_NUMBER = 3;
    private com.google.protos.speech.common.RecognitionContextProto.RecognitionContext recognitionContext_;
    public boolean hasRecognitionContext() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.google.protos.speech.common.RecognitionContextProto.RecognitionContext getRecognitionContext() {
      return recognitionContext_;
    }
    
    // optional string grxmlGrammar = 4;
    public static final int GRXMLGRAMMAR_FIELD_NUMBER = 4;
    private java.lang.Object grxmlGrammar_;
    public boolean hasGrxmlGrammar() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getGrxmlGrammar() {
      java.lang.Object ref = grxmlGrammar_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          grxmlGrammar_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGrxmlGrammarBytes() {
      java.lang.Object ref = grxmlGrammar_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        grxmlGrammar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      languageModel_ = "";
      maxNbest_ = 0;
      recognitionContext_ = com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.getDefaultInstance();
      grxmlGrammar_ = "";
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
        output.writeBytes(1, getLanguageModelBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, maxNbest_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, recognitionContext_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getGrxmlGrammarBytes());
      }
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getLanguageModelBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, maxNbest_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, recognitionContext_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getGrxmlGrammarBytes());
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
    
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseDelimitedFrom(
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
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar, Builder>
        implements com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammarOrBuilder {
      // Construct using com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar.newBuilder()
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
        languageModel_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        maxNbest_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        recognitionContext_ = com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.getDefaultInstance();
        bitField0_ = (bitField0_ & ~0x00000004);
        grxmlGrammar_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar getDefaultInstanceForType() {
        return com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar.getDefaultInstance();
      }
      
      public com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar build() {
        com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar buildPartial() {
        com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar result = new com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.languageModel_ = languageModel_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maxNbest_ = maxNbest_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.recognitionContext_ = recognitionContext_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.grxmlGrammar_ = grxmlGrammar_;
        result.bitField0_ = to_bitField0_;
        return result;
      }
      
      public Builder mergeFrom(com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar other) {
        if (other == com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar.getDefaultInstance()) return this;
        if (other.hasLanguageModel()) {
          setLanguageModel(other.getLanguageModel());
        }
        if (other.hasMaxNbest()) {
          setMaxNbest(other.getMaxNbest());
        }
        if (other.hasRecognitionContext()) {
          mergeRecognitionContext(other.getRecognitionContext());
        }
        if (other.hasGrxmlGrammar()) {
          setGrxmlGrammar(other.getGrxmlGrammar());
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
              languageModel_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              maxNbest_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.Builder subBuilder = com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.newBuilder();
              if (hasRecognitionContext()) {
                subBuilder.mergeFrom(getRecognitionContext());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setRecognitionContext(subBuilder.buildPartial());
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              grxmlGrammar_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string languageModel = 1;
      private java.lang.Object languageModel_ = "";
      public boolean hasLanguageModel() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getLanguageModel() {
        java.lang.Object ref = languageModel_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          languageModel_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLanguageModel(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        languageModel_ = value;
        
        return this;
      }
      public Builder clearLanguageModel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        languageModel_ = getDefaultInstance().getLanguageModel();
        
        return this;
      }
      void setLanguageModel(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        languageModel_ = value;
        
      }
      
      // optional int32 maxNbest = 2;
      private int maxNbest_ ;
      public boolean hasMaxNbest() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getMaxNbest() {
        return maxNbest_;
      }
      public Builder setMaxNbest(int value) {
        bitField0_ |= 0x00000002;
        maxNbest_ = value;
        
        return this;
      }
      public Builder clearMaxNbest() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maxNbest_ = 0;
        
        return this;
      }
      
      // optional .RecognitionContext recognitionContext = 3;
      private com.google.protos.speech.common.RecognitionContextProto.RecognitionContext recognitionContext_ = com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.getDefaultInstance();
      public boolean hasRecognitionContext() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.google.protos.speech.common.RecognitionContextProto.RecognitionContext getRecognitionContext() {
        return recognitionContext_;
      }
      public Builder setRecognitionContext(com.google.protos.speech.common.RecognitionContextProto.RecognitionContext value) {
        if (value == null) {
          throw new NullPointerException();
        }
        recognitionContext_ = value;
        
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder setRecognitionContext(
          com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.Builder builderForValue) {
        recognitionContext_ = builderForValue.build();
        
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder mergeRecognitionContext(com.google.protos.speech.common.RecognitionContextProto.RecognitionContext value) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            recognitionContext_ != com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.getDefaultInstance()) {
          recognitionContext_ =
            com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.newBuilder(recognitionContext_).mergeFrom(value).buildPartial();
        } else {
          recognitionContext_ = value;
        }
        
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder clearRecognitionContext() {
        recognitionContext_ = com.google.protos.speech.common.RecognitionContextProto.RecognitionContext.getDefaultInstance();
        
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      // optional string grxmlGrammar = 4;
      private java.lang.Object grxmlGrammar_ = "";
      public boolean hasGrxmlGrammar() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getGrxmlGrammar() {
        java.lang.Object ref = grxmlGrammar_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          grxmlGrammar_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGrxmlGrammar(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        grxmlGrammar_ = value;
        
        return this;
      }
      public Builder clearGrxmlGrammar() {
        bitField0_ = (bitField0_ & ~0x00000008);
        grxmlGrammar_ = getDefaultInstance().getGrxmlGrammar();
        
        return this;
      }
      void setGrxmlGrammar(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        grxmlGrammar_ = value;
        
      }
      
      // @@protoc_insertion_point(builder_scope:IntentApiGrammar)
    }
    
    static {
      defaultInstance = new IntentApiGrammar(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:IntentApiGrammar)
    public static final int INTENT_API_GRAMMAR_FIELD_NUMBER = 13;
    public static final
      com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
        com.google.protos.speech.service.SpeechService.Grammar,
        com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar> intentApiGrammar = com.google.protobuf.GeneratedMessageLite
            .newSingularGeneratedExtension(
          com.google.protos.speech.service.SpeechService.Grammar.getDefaultInstance(),
          com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar.getDefaultInstance(),
          com.google.protos.speech.apps.intentapi.IntentApi.IntentApiGrammar.getDefaultInstance(),
          null,
          13,
          com.google.protobuf.WireFormat.FieldType.MESSAGE);
  }
  
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
