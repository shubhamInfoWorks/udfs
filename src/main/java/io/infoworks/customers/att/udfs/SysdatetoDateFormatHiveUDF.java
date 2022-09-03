package io.infoworks.customers.att.udfs;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class SysdatetoDateFormatHiveUDF extends UDF {

    public static LocalDate evaluate(Date input, String format)
    {


        LocalDate date = LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern(format);
        String text = date.format(formatters);
        LocalDate parsedDate = LocalDate.parse(text, formatters);
        return parsedDate;

    }
}
