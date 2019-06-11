// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri june 10 12:06:35 CST 2019
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String SOURCE_NAME;
  public String get_SOURCE_NAME() {
    return SOURCE_NAME;
  }
  public void set_SOURCE_NAME(String SOURCE_NAME) {
    this.SOURCE_NAME = SOURCE_NAME;
  }
  public QueryResult with_SOURCE_NAME(String SOURCE_NAME) {
    this.SOURCE_NAME = SOURCE_NAME;
    return this;
  }
  private String SCHEMA_NAME;
  public String get_SCHEMA_NAME() {
    return SCHEMA_NAME;
  }
  public void set_SCHEMA_NAME(String SCHEMA_NAME) {
    this.SCHEMA_NAME = SCHEMA_NAME;
  }
  public QueryResult with_SCHEMA_NAME(String SCHEMA_NAME) {
    this.SCHEMA_NAME = SCHEMA_NAME;
    return this;
  }
  private String TABLE_NAME;
  public String get_TABLE_NAME() {
    return TABLE_NAME;
  }
  public void set_TABLE_NAME(String TABLE_NAME) {
    this.TABLE_NAME = TABLE_NAME;
  }
  public QueryResult with_TABLE_NAME(String TABLE_NAME) {
    this.TABLE_NAME = TABLE_NAME;
    return this;
  }
  private String COLUMN_NAME;
  public String get_COLUMN_NAME() {
    return COLUMN_NAME;
  }
  public void set_COLUMN_NAME(String COLUMN_NAME) {
    this.COLUMN_NAME = COLUMN_NAME;
  }
  public QueryResult with_COLUMN_NAME(String COLUMN_NAME) {
    this.COLUMN_NAME = COLUMN_NAME;
    return this;
  }
  private String DATA_TYPE;
  public String get_DATA_TYPE() {
    return DATA_TYPE;
  }
  public void set_DATA_TYPE(String DATA_TYPE) {
    this.DATA_TYPE = DATA_TYPE;
  }
  public QueryResult with_DATA_TYPE(String DATA_TYPE) {
    this.DATA_TYPE = DATA_TYPE;
    return this;
  }
  private Integer DATA_LENGTH;
  public Integer get_DATA_LENGTH() {
    return DATA_LENGTH;
  }
  public void set_DATA_LENGTH(Integer DATA_LENGTH) {
    this.DATA_LENGTH = DATA_LENGTH;
  }
  public QueryResult with_DATA_LENGTH(Integer DATA_LENGTH) {
    this.DATA_LENGTH = DATA_LENGTH;
    return this;
  }
  private Integer DATA_SCALE;
  public Integer get_DATA_SCALE() {
    return DATA_SCALE;
  }
  public void set_DATA_SCALE(Integer DATA_SCALE) {
    this.DATA_SCALE = DATA_SCALE;
  }
  public QueryResult with_DATA_SCALE(Integer DATA_SCALE) {
    this.DATA_SCALE = DATA_SCALE;
    return this;
  }
  private String FORMAT;
  public String get_FORMAT() {
    return FORMAT;
  }
  public void set_FORMAT(String FORMAT) {
    this.FORMAT = FORMAT;
  }
  public QueryResult with_FORMAT(String FORMAT) {
    this.FORMAT = FORMAT;
    return this;
  }
  private String PRIMARY_KEYS;
  public String get_PRIMARY_KEYS() {
    return PRIMARY_KEYS;
  }
  public void set_PRIMARY_KEYS(String PRIMARY_KEYS) {
    this.PRIMARY_KEYS = PRIMARY_KEYS;
  }
  public QueryResult with_PRIMARY_KEYS(String PRIMARY_KEYS) {
    this.PRIMARY_KEYS = PRIMARY_KEYS;
    return this;
  }
  private Integer COLUMN_ID;
  public Integer get_COLUMN_ID() {
    return COLUMN_ID;
  }
  public void set_COLUMN_ID(Integer COLUMN_ID) {
    this.COLUMN_ID = COLUMN_ID;
  }
  public QueryResult with_COLUMN_ID(Integer COLUMN_ID) {
    this.COLUMN_ID = COLUMN_ID;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.SOURCE_NAME == null ? that.SOURCE_NAME == null : this.SOURCE_NAME.equals(that.SOURCE_NAME));
    equal = equal && (this.SCHEMA_NAME == null ? that.SCHEMA_NAME == null : this.SCHEMA_NAME.equals(that.SCHEMA_NAME));
    equal = equal && (this.TABLE_NAME == null ? that.TABLE_NAME == null : this.TABLE_NAME.equals(that.TABLE_NAME));
    equal = equal && (this.COLUMN_NAME == null ? that.COLUMN_NAME == null : this.COLUMN_NAME.equals(that.COLUMN_NAME));
    equal = equal && (this.DATA_TYPE == null ? that.DATA_TYPE == null : this.DATA_TYPE.equals(that.DATA_TYPE));
    equal = equal && (this.DATA_LENGTH == null ? that.DATA_LENGTH == null : this.DATA_LENGTH.equals(that.DATA_LENGTH));
    equal = equal && (this.DATA_SCALE == null ? that.DATA_SCALE == null : this.DATA_SCALE.equals(that.DATA_SCALE));
    equal = equal && (this.FORMAT == null ? that.FORMAT == null : this.FORMAT.equals(that.FORMAT));
    equal = equal && (this.PRIMARY_KEYS == null ? that.PRIMARY_KEYS == null : this.PRIMARY_KEYS.equals(that.PRIMARY_KEYS));
    equal = equal && (this.COLUMN_ID == null ? that.COLUMN_ID == null : this.COLUMN_ID.equals(that.COLUMN_ID));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.SOURCE_NAME == null ? that.SOURCE_NAME == null : this.SOURCE_NAME.equals(that.SOURCE_NAME));
    equal = equal && (this.SCHEMA_NAME == null ? that.SCHEMA_NAME == null : this.SCHEMA_NAME.equals(that.SCHEMA_NAME));
    equal = equal && (this.TABLE_NAME == null ? that.TABLE_NAME == null : this.TABLE_NAME.equals(that.TABLE_NAME));
    equal = equal && (this.COLUMN_NAME == null ? that.COLUMN_NAME == null : this.COLUMN_NAME.equals(that.COLUMN_NAME));
    equal = equal && (this.DATA_TYPE == null ? that.DATA_TYPE == null : this.DATA_TYPE.equals(that.DATA_TYPE));
    equal = equal && (this.DATA_LENGTH == null ? that.DATA_LENGTH == null : this.DATA_LENGTH.equals(that.DATA_LENGTH));
    equal = equal && (this.DATA_SCALE == null ? that.DATA_SCALE == null : this.DATA_SCALE.equals(that.DATA_SCALE));
    equal = equal && (this.FORMAT == null ? that.FORMAT == null : this.FORMAT.equals(that.FORMAT));
    equal = equal && (this.PRIMARY_KEYS == null ? that.PRIMARY_KEYS == null : this.PRIMARY_KEYS.equals(that.PRIMARY_KEYS));
    equal = equal && (this.COLUMN_ID == null ? that.COLUMN_ID == null : this.COLUMN_ID.equals(that.COLUMN_ID));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SOURCE_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.SCHEMA_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TABLE_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.COLUMN_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.DATA_TYPE = JdbcWritableBridge.readString(5, __dbResults);
    this.DATA_LENGTH = JdbcWritableBridge.readInteger(6, __dbResults);
    this.DATA_SCALE = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FORMAT = JdbcWritableBridge.readString(8, __dbResults);
    this.PRIMARY_KEYS = JdbcWritableBridge.readString(9, __dbResults);
    this.COLUMN_ID = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SOURCE_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.SCHEMA_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TABLE_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.COLUMN_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.DATA_TYPE = JdbcWritableBridge.readString(5, __dbResults);
    this.DATA_LENGTH = JdbcWritableBridge.readInteger(6, __dbResults);
    this.DATA_SCALE = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FORMAT = JdbcWritableBridge.readString(8, __dbResults);
    this.PRIMARY_KEYS = JdbcWritableBridge.readString(9, __dbResults);
    this.COLUMN_ID = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(SOURCE_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SCHEMA_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TABLE_NAME, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(COLUMN_NAME, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(DATA_TYPE, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(DATA_LENGTH, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DATA_SCALE, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FORMAT, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRIMARY_KEYS, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(COLUMN_ID, 10 + __off, 4, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(SOURCE_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SCHEMA_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TABLE_NAME, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(COLUMN_NAME, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(DATA_TYPE, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(DATA_LENGTH, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DATA_SCALE, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FORMAT, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRIMARY_KEYS, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(COLUMN_ID, 10 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.SOURCE_NAME = null;
    } else {
    this.SOURCE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SCHEMA_NAME = null;
    } else {
    this.SCHEMA_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TABLE_NAME = null;
    } else {
    this.TABLE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COLUMN_NAME = null;
    } else {
    this.COLUMN_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_TYPE = null;
    } else {
    this.DATA_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_LENGTH = null;
    } else {
    this.DATA_LENGTH = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_SCALE = null;
    } else {
    this.DATA_SCALE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FORMAT = null;
    } else {
    this.FORMAT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRIMARY_KEYS = null;
    } else {
    this.PRIMARY_KEYS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COLUMN_ID = null;
    } else {
    this.COLUMN_ID = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.SOURCE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_NAME);
    }
    if (null == this.SCHEMA_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SCHEMA_NAME);
    }
    if (null == this.TABLE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TABLE_NAME);
    }
    if (null == this.COLUMN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COLUMN_NAME);
    }
    if (null == this.DATA_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATA_TYPE);
    }
    if (null == this.DATA_LENGTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DATA_LENGTH);
    }
    if (null == this.DATA_SCALE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DATA_SCALE);
    }
    if (null == this.FORMAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FORMAT);
    }
    if (null == this.PRIMARY_KEYS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRIMARY_KEYS);
    }
    if (null == this.COLUMN_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.COLUMN_ID);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.SOURCE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_NAME);
    }
    if (null == this.SCHEMA_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SCHEMA_NAME);
    }
    if (null == this.TABLE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TABLE_NAME);
    }
    if (null == this.COLUMN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COLUMN_NAME);
    }
    if (null == this.DATA_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATA_TYPE);
    }
    if (null == this.DATA_LENGTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DATA_LENGTH);
    }
    if (null == this.DATA_SCALE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DATA_SCALE);
    }
    if (null == this.FORMAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FORMAT);
    }
    if (null == this.PRIMARY_KEYS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRIMARY_KEYS);
    }
    if (null == this.COLUMN_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.COLUMN_ID);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_NAME==null?"":SOURCE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCHEMA_NAME==null?"":SCHEMA_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TABLE_NAME==null?"":TABLE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_NAME==null?"":COLUMN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_TYPE==null?"":DATA_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_LENGTH==null?"":"" + DATA_LENGTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_SCALE==null?"":"" + DATA_SCALE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FORMAT==null?"":FORMAT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRIMARY_KEYS==null?"":PRIMARY_KEYS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_ID==null?"":"" + COLUMN_ID, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_NAME==null?"":SOURCE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCHEMA_NAME==null?"":SCHEMA_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TABLE_NAME==null?"":TABLE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_NAME==null?"":COLUMN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_TYPE==null?"":DATA_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_LENGTH==null?"":"" + DATA_LENGTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_SCALE==null?"":"" + DATA_SCALE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FORMAT==null?"":FORMAT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRIMARY_KEYS==null?"":PRIMARY_KEYS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_ID==null?"":"" + COLUMN_ID, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_NAME = null; } else {
      this.SOURCE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SCHEMA_NAME = null; } else {
      this.SCHEMA_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TABLE_NAME = null; } else {
      this.TABLE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COLUMN_NAME = null; } else {
      this.COLUMN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATA_TYPE = null; } else {
      this.DATA_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_LENGTH = null; } else {
      this.DATA_LENGTH = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_SCALE = null; } else {
      this.DATA_SCALE = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FORMAT = null; } else {
      this.FORMAT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRIMARY_KEYS = null; } else {
      this.PRIMARY_KEYS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COLUMN_ID = null; } else {
      this.COLUMN_ID = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_NAME = null; } else {
      this.SOURCE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SCHEMA_NAME = null; } else {
      this.SCHEMA_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TABLE_NAME = null; } else {
      this.TABLE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COLUMN_NAME = null; } else {
      this.COLUMN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATA_TYPE = null; } else {
      this.DATA_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_LENGTH = null; } else {
      this.DATA_LENGTH = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_SCALE = null; } else {
      this.DATA_SCALE = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FORMAT = null; } else {
      this.FORMAT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRIMARY_KEYS = null; } else {
      this.PRIMARY_KEYS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COLUMN_ID = null; } else {
      this.COLUMN_ID = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("SOURCE_NAME", this.SOURCE_NAME);
    __sqoop$field_map.put("SCHEMA_NAME", this.SCHEMA_NAME);
    __sqoop$field_map.put("TABLE_NAME", this.TABLE_NAME);
    __sqoop$field_map.put("COLUMN_NAME", this.COLUMN_NAME);
    __sqoop$field_map.put("DATA_TYPE", this.DATA_TYPE);
    __sqoop$field_map.put("DATA_LENGTH", this.DATA_LENGTH);
    __sqoop$field_map.put("DATA_SCALE", this.DATA_SCALE);
    __sqoop$field_map.put("FORMAT", this.FORMAT);
    __sqoop$field_map.put("PRIMARY_KEYS", this.PRIMARY_KEYS);
    __sqoop$field_map.put("COLUMN_ID", this.COLUMN_ID);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SOURCE_NAME", this.SOURCE_NAME);
    __sqoop$field_map.put("SCHEMA_NAME", this.SCHEMA_NAME);
    __sqoop$field_map.put("TABLE_NAME", this.TABLE_NAME);
    __sqoop$field_map.put("COLUMN_NAME", this.COLUMN_NAME);
    __sqoop$field_map.put("DATA_TYPE", this.DATA_TYPE);
    __sqoop$field_map.put("DATA_LENGTH", this.DATA_LENGTH);
    __sqoop$field_map.put("DATA_SCALE", this.DATA_SCALE);
    __sqoop$field_map.put("FORMAT", this.FORMAT);
    __sqoop$field_map.put("PRIMARY_KEYS", this.PRIMARY_KEYS);
    __sqoop$field_map.put("COLUMN_ID", this.COLUMN_ID);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("SOURCE_NAME".equals(__fieldName)) {
      this.SOURCE_NAME = (String) __fieldVal;
    }
    else    if ("SCHEMA_NAME".equals(__fieldName)) {
      this.SCHEMA_NAME = (String) __fieldVal;
    }
    else    if ("TABLE_NAME".equals(__fieldName)) {
      this.TABLE_NAME = (String) __fieldVal;
    }
    else    if ("COLUMN_NAME".equals(__fieldName)) {
      this.COLUMN_NAME = (String) __fieldVal;
    }
    else    if ("DATA_TYPE".equals(__fieldName)) {
      this.DATA_TYPE = (String) __fieldVal;
    }
    else    if ("DATA_LENGTH".equals(__fieldName)) {
      this.DATA_LENGTH = (Integer) __fieldVal;
    }
    else    if ("DATA_SCALE".equals(__fieldName)) {
      this.DATA_SCALE = (Integer) __fieldVal;
    }
    else    if ("FORMAT".equals(__fieldName)) {
      this.FORMAT = (String) __fieldVal;
    }
    else    if ("PRIMARY_KEYS".equals(__fieldName)) {
      this.PRIMARY_KEYS = (String) __fieldVal;
    }
    else    if ("COLUMN_ID".equals(__fieldName)) {
      this.COLUMN_ID = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("SOURCE_NAME".equals(__fieldName)) {
      this.SOURCE_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("SCHEMA_NAME".equals(__fieldName)) {
      this.SCHEMA_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("TABLE_NAME".equals(__fieldName)) {
      this.TABLE_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("COLUMN_NAME".equals(__fieldName)) {
      this.COLUMN_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("DATA_TYPE".equals(__fieldName)) {
      this.DATA_TYPE = (String) __fieldVal;
      return true;
    }
    else    if ("DATA_LENGTH".equals(__fieldName)) {
      this.DATA_LENGTH = (Integer) __fieldVal;
      return true;
    }
    else    if ("DATA_SCALE".equals(__fieldName)) {
      this.DATA_SCALE = (Integer) __fieldVal;
      return true;
    }
    else    if ("FORMAT".equals(__fieldName)) {
      this.FORMAT = (String) __fieldVal;
      return true;
    }
    else    if ("PRIMARY_KEYS".equals(__fieldName)) {
      this.PRIMARY_KEYS = (String) __fieldVal;
      return true;
    }
    else    if ("COLUMN_ID".equals(__fieldName)) {
      this.COLUMN_ID = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
