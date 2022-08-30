package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;

public class CastNullIFtoDateFormatHiveUDF {
  public static String evaluate(String input, String secondexpression,String dateformat) throws ParseException {

    if (StringUtils.isEmpty(input)) {
      return null;
    }

    DateFormat dateFormat = new SimpleDateFormat(dateformat);
    return dateFormat.format(new SimpleDateFormat(dateformat).parse(NullIFHiveUDF.evaluate(input, secondexpression)).getTime());

  }

}
