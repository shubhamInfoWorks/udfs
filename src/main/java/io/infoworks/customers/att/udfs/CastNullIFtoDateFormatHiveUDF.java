package io.infoworks.customers.att.udfs;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class CastNullIFtoDateFormatHiveUDF extends UDF {
  public static Date evaluate(String input, String secondexpression, String dateformat) throws ParseException {

    if (StringUtils.isEmpty(input)) {
      return null;
    }

    DateFormat dateFormat = new SimpleDateFormat(dateformat);
    return Date.valueOf(LocalDate.parse(NullIFHiveUDF.evaluate(input, secondexpression), DateTimeFormatter.ofPattern(dateformat)));

  }

}
