package io.infoworks.customers.att.udfs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang.StringUtils;

public class CastNullIFtoDateFormatHiveUDF {
  public static LocalDate evaluate(String input, String secondexpression,String dateformat) throws ParseException {

    if (StringUtils.isEmpty(input)) {
      return null;
    }

    DateFormat dateFormat = new SimpleDateFormat(dateformat);
    return LocalDate.parse(NullIFHiveUDF.evaluate(input, secondexpression), DateTimeFormatter.ofPattern(dateformat));

  }

}
