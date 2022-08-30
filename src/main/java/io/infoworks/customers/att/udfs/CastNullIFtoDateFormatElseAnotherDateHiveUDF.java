package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;

public class CastNullIFtoDateFormatElseAnotherDateHiveUDF {

  public static String evaluate(String input, String secondString, String date, String dateformat)
      throws ParseException {

    DateFormat dateFormat = new SimpleDateFormat(dateformat);
    if (StringUtils.isEmpty(input)) {
      return null;
    }

    if (!input.equals(secondString)) {
      return dateFormat.format(new SimpleDateFormat(dateformat).parse(input).getTime());
    }

    return dateFormat.format(new SimpleDateFormat(dateformat).parse(date).getTime());

  }

}
