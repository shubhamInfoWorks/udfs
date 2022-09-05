package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;

public class ReturnZeroIfParamsEqualHiveUDF {

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
