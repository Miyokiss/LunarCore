// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ReserveStaminaExchangeCsReqOuterClass {
  /**
   * Protobuf type {@code ReserveStaminaExchangeCsReq}
   */
  public static final class ReserveStaminaExchangeCsReq extends ProtoMessage<ReserveStaminaExchangeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 num = 2;</code>
     */
    private int num;

    private ReserveStaminaExchangeCsReq() {
    }

    /**
     * @return a new empty instance of {@code ReserveStaminaExchangeCsReq}
     */
    public static ReserveStaminaExchangeCsReq newInstance() {
      return new ReserveStaminaExchangeCsReq();
    }

    /**
     * <code>optional uint32 num = 2;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 num = 2;</code>
     * @return this
     */
    public ReserveStaminaExchangeCsReq clearNum() {
      bitField0_ &= ~0x00000001;
      num = 0;
      return this;
    }

    /**
     * <code>optional uint32 num = 2;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <code>optional uint32 num = 2;</code>
     * @param value the num to set
     * @return this
     */
    public ReserveStaminaExchangeCsReq setNum(final int value) {
      bitField0_ |= 0x00000001;
      num = value;
      return this;
    }

    @Override
    public ReserveStaminaExchangeCsReq copyFrom(final ReserveStaminaExchangeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        num = other.num;
      }
      return this;
    }

    @Override
    public ReserveStaminaExchangeCsReq mergeFrom(final ReserveStaminaExchangeCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNum()) {
        setNum(other.num);
      }
      return this;
    }

    @Override
    public ReserveStaminaExchangeCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      num = 0;
      return this;
    }

    @Override
    public ReserveStaminaExchangeCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ReserveStaminaExchangeCsReq)) {
        return false;
      }
      ReserveStaminaExchangeCsReq other = (ReserveStaminaExchangeCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasNum() || num == other.num);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(num);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ReserveStaminaExchangeCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // num
            num = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.num, num);
      }
      output.endObject();
    }

    @Override
    public ReserveStaminaExchangeCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ReserveStaminaExchangeCsReq clone() {
      return new ReserveStaminaExchangeCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ReserveStaminaExchangeCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ReserveStaminaExchangeCsReq(), data).checkInitialized();
    }

    public static ReserveStaminaExchangeCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ReserveStaminaExchangeCsReq(), input).checkInitialized();
    }

    public static ReserveStaminaExchangeCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ReserveStaminaExchangeCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ReserveStaminaExchangeCsReq messages
     */
    public static MessageFactory<ReserveStaminaExchangeCsReq> getFactory() {
      return ReserveStaminaExchangeCsReqFactory.INSTANCE;
    }

    private enum ReserveStaminaExchangeCsReqFactory implements MessageFactory<ReserveStaminaExchangeCsReq> {
      INSTANCE;

      @Override
      public ReserveStaminaExchangeCsReq create() {
        return ReserveStaminaExchangeCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName num = FieldName.forField("num");
    }
  }
}
