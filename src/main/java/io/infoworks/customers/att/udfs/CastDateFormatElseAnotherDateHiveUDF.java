package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang3.StringUtils;

public class CastDateFormatElseAnotherDateHiveUDF {
  public static Object evaluate(String input, String secondString, String secondDate, String dateformat) throws ParseException {

    DateFormat dateFormat = new SimpleDateFormat(dateformat);

    if (StringUtils.isEmpty(input)) {
      return null;
    }

    if (input.equals(secondString)) {
      return dateFormat.format(new SimpleDateFormat(dateformat).parse(input).getTime());
    }

    return dateFormat.format(new SimpleDateFormat(dateformat).parse(secondDate).getTime());

  }

}
