package io.infoworks.customers.att.udfs;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class StringToTimestampHiveUDF extends UDF {

  public static Timestamp evaluate(String input) throws ParseException {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    String timestampString =
        input.substring(7, 4) + "-" + input.substring(1, 2) + "-" + input.substring(11, 9);
    SimpleDateFormat parseFormat = new SimpleDateFormat("YYYY-MM-DDBHH:MI:SS");
    return new java.sql.Timestamp(parseFormat.parse(timestampString).getTime());
  }
}
