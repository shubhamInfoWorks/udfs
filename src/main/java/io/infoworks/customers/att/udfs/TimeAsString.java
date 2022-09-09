package io.infoworks.customers.att.udfs;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import org.apache.hadoop.hive.ql.exec.UDF;

public class TimeAsString extends UDF {

  public static String evaluate(String input, String format) throws ParseException {
    return CastStringToTimestampFormatHiveUDF.evaluate(input, format).toLocalDateTime().format(
        DateTimeFormatter.ofPattern("HH:mm:ss"));
  }
}
