package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;

public class ReturnZeroIfParamsEqualHiveUDF {

  public static Object evaluate(Integer input,Integer secondexpression, String dateformat)
      throws ParseException {
    if (input == null) {
      return 0;
    }
    if(input.equals(secondexpression))
    {
      return 0;
    }

    DateFormat dateFormat = new SimpleDateFormat(dateformat);
    return dateFormat.format(new SimpleDateFormat(dateformat).parse(String.valueOf(input)).getTime());

  }

}
