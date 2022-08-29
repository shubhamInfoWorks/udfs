package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;

public class CastNullIFtoDateFormatElseAnotherDateHiveUDF {
  public static Object evaluate(String input, String secondDate, String dateformat) throws ParseException {

    DateFormat dateFormat = new SimpleDateFormat(dateformat);
    if (StringUtils.isEmpty(input)) {
      return dateFormat.format(new SimpleDateFormat(dateformat).parse(secondDate).getTime());
    }

    return dateFormat.format(new SimpleDateFormat(dateformat).parse(input).getTime());

  }

}
