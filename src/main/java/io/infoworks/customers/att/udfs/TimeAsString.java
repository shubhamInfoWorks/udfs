package io.infoworks.customers.att.udfs;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.apache.hadoop.hive.ql.exec.UDF;

public class TimeAsString extends UDF {

  public static String evaluate(String input) throws ParseException {

    SimpleDateFormat parseFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return new java.sql.Timestamp(parseFormat.parse(String.valueOf(new Timestamp(System.currentTimeMillis()))).getTime()).toLocalDateTime().format(
      DateTimeFormatter.ofPattern("HH:mm:ss"));


  }
}
