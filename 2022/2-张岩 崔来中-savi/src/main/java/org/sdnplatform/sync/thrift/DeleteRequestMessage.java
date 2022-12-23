package org.sdnplatform.sync.thrift;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SuppressWarnings("all") public class DeleteRequestMessage implements org.apache.thrift.TBase<DeleteRequestMessage, DeleteRequestMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeleteRequestMessage");
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STORE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("storeName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteRequestMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteRequestMessageTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    STORE_NAME((short)2, "storeName"),
    KEY((short)3, "key"),
    VERSION((short)4, "version");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return HEADER;
          return STORE_NAME;
          return KEY;
          return VERSION;
        default:
          return null;
      }
    }
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
    private final short _thriftId;
    private final String _fieldName;
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
    public short getThriftFieldId() {
      return _thriftId;
    }
    public String getFieldName() {
      return _fieldName;
    }
  }
  private _Fields optionals[] = {_Fields.VERSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.STORE_NAME, new org.apache.thrift.meta_data.FieldMetaData("storeName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, VectorClock.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeleteRequestMessage.class, metaDataMap);
  }
  public DeleteRequestMessage() {
  }
  public DeleteRequestMessage(
    AsyncMessageHeader header,
    String storeName,
    ByteBuffer key)
  {
    this();
    this.header = header;
    this.storeName = storeName;
    this.key = key;
  }
  public DeleteRequestMessage(DeleteRequestMessage other) {
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    if (other.isSetStoreName()) {
      this.storeName = other.storeName;
    }
    if (other.isSetKey()) {
      this.key = org.apache.thrift.TBaseHelper.copyBinary(other.key);
;
    }
    if (other.isSetVersion()) {
      this.version = new VectorClock(other.version);
    }
  }
  public DeleteRequestMessage deepCopy() {
    return new DeleteRequestMessage(this);
  }
  @Override
  public void clear() {
    this.header = null;
    this.storeName = null;
    this.key = null;
    this.version = null;
  }
  public AsyncMessageHeader getHeader() {
    return this.header;
  }
  public DeleteRequestMessage setHeader(AsyncMessageHeader header) {
    this.header = header;
    return this;
  }
  public void unsetHeader() {
    this.header = null;
  }
  public boolean isSetHeader() {
    return this.header != null;
  }
  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }
  public String getStoreName() {
    return this.storeName;
  }
  public DeleteRequestMessage setStoreName(String storeName) {
    this.storeName = storeName;
    return this;
  }
  public void unsetStoreName() {
    this.storeName = null;
  }
  public boolean isSetStoreName() {
    return this.storeName != null;
  }
  public void setStoreNameIsSet(boolean value) {
    if (!value) {
      this.storeName = null;
    }
  }
  public byte[] getKey() {
    setKey(org.apache.thrift.TBaseHelper.rightSize(key));
    return key == null ? null : key.array();
  }
  public ByteBuffer bufferForKey() {
    return key;
  }
  public DeleteRequestMessage setKey(byte[] key) {
    setKey(key == null ? (ByteBuffer)null : ByteBuffer.wrap(key));
    return this;
  }
  public DeleteRequestMessage setKey(ByteBuffer key) {
    this.key = key;
    return this;
  }
  public void unsetKey() {
    this.key = null;
  }
  public boolean isSetKey() {
    return this.key != null;
  }
  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }
  public VectorClock getVersion() {
    return this.version;
  }
  public DeleteRequestMessage setVersion(VectorClock version) {
    this.version = version;
    return this;
  }
  public void unsetVersion() {
    this.version = null;
  }
  public boolean isSetVersion() {
    return this.version != null;
  }
  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((AsyncMessageHeader)value);
      }
      break;
    case STORE_NAME:
      if (value == null) {
        unsetStoreName();
      } else {
        setStoreName((String)value);
      }
      break;
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((ByteBuffer)value);
      }
      break;
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((VectorClock)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();
    case STORE_NAME:
      return getStoreName();
    case KEY:
      return getKey();
    case VERSION:
      return getVersion();
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case HEADER:
      return isSetHeader();
    case STORE_NAME:
      return isSetStoreName();
    case KEY:
      return isSetKey();
    case VERSION:
      return isSetVersion();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteRequestMessage)
      return this.equals((DeleteRequestMessage)that);
    return false;
  }
  public boolean equals(DeleteRequestMessage that) {
    if (that == null)
      return false;
    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }
    boolean this_present_storeName = true && this.isSetStoreName();
    boolean that_present_storeName = true && that.isSetStoreName();
    if (this_present_storeName || that_present_storeName) {
      if (!(this_present_storeName && that_present_storeName))
        return false;
      if (!this.storeName.equals(that.storeName))
        return false;
    }
    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }
    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(DeleteRequestMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    DeleteRequestMessage typedOther = (DeleteRequestMessage)other;
    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(typedOther.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, typedOther.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStoreName()).compareTo(typedOther.isSetStoreName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeName, typedOther.storeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey()).compareTo(typedOther.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, typedOther.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DeleteRequestMessage(");
    boolean first = true;
    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("storeName:");
    if (this.storeName == null) {
      sb.append("null");
    } else {
      sb.append(this.storeName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.key, sb);
    }
    first = false;
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      if (this.version == null) {
        sb.append("null");
      } else {
        sb.append(this.version);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }
  public void validate() throws org.apache.thrift.TException {
    if (header == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'header' was not present! Struct: " + toString());
    }
    if (storeName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'storeName' was not present! Struct: " + toString());
    }
    if (key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'key' was not present! Struct: " + toString());
    }
    if (header != null) {
      header.validate();
    }
    if (version != null) {
      version.validate();
    }
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private static class DeleteRequestMessageStandardSchemeFactory implements SchemeFactory {
    public DeleteRequestMessageStandardScheme getScheme() {
      return new DeleteRequestMessageStandardScheme();
    }
  }
  private static class DeleteRequestMessageStandardScheme extends StandardScheme<DeleteRequestMessage> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, DeleteRequestMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new AsyncMessageHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storeName = iprot.readString();
              struct.setStoreNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readBinary();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.version = new VectorClock();
              struct.version.read(iprot);
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }
    public void write(org.apache.thrift.protocol.TProtocol oprot, DeleteRequestMessage struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.storeName != null) {
        oprot.writeFieldBegin(STORE_NAME_FIELD_DESC);
        oprot.writeString(struct.storeName);
        oprot.writeFieldEnd();
      }
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeBinary(struct.key);
        oprot.writeFieldEnd();
      }
      if (struct.version != null) {
        if (struct.isSetVersion()) {
          oprot.writeFieldBegin(VERSION_FIELD_DESC);
          struct.version.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class DeleteRequestMessageTupleSchemeFactory implements SchemeFactory {
    public DeleteRequestMessageTupleScheme getScheme() {
      return new DeleteRequestMessageTupleScheme();
    }
  }
  private static class DeleteRequestMessageTupleScheme extends TupleScheme<DeleteRequestMessage> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeleteRequestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.header.write(oprot);
      oprot.writeString(struct.storeName);
      oprot.writeBinary(struct.key);
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVersion()) {
        struct.version.write(oprot);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeleteRequestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      struct.storeName = iprot.readString();
      struct.setStoreNameIsSet(true);
      struct.key = iprot.readBinary();
      struct.setKeyIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.version = new VectorClock();
        struct.version.read(iprot);
        struct.setVersionIsSet(true);
      }
    }
  }
}
