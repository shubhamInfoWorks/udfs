package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class ReturnZeroIfParamsEqualHiveUDF extends UDF {

  public static Integer evaluate(Integer input,String secondInteger, String dateformat)
      throws ParseException {
    if (input == null) {
      return 0;
    }
    if(input.equals(secondInteger))
    {
      return 0;
    }

    return input;

  }

}
