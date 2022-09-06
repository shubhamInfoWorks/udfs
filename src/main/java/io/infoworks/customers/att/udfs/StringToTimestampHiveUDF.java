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
//09B11A2022 23:59:59

  try {
      String timestampString =
              input.substring(6, 10) + "-" + input.substring(0, 2) + "-" + input.substring(3, 5)
                      + input.substring(10, 19);

      // input.substring(7, 11) + "-" + input.substring(1, 3) + "-" + input.substring(4, 6)+input.substring(11, 20);
     // System.out.println(timestampString);
      SimpleDateFormat parseFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      return new java.sql.Timestamp(parseFormat.parse(timestampString).getTime());
  }
  catch (Exception e) {

      return null;
  }


  }
}
