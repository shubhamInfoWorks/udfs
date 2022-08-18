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
        input.substring(7, 11) + "-" + input.substring(1, 3) + "-" + input.substring(4, 6)
            + input.substring(11, 20);
    System.out.println(timestampString);
    SimpleDateFormat parseFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
    return new java.sql.Timestamp(parseFormat.parse(timestampString).getTime());
  }
}
