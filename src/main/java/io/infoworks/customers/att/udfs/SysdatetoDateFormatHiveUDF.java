package io.infoworks.customers.att.udfs;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SysdatetoDateFormatHiveUDF extends UDF {

    public static LocalDate evaluate(Date input, String format)
    {
        if(input==null)

        {
            return null;
        }

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern(format);
        String text = date.format(formatters);
        LocalDate parsedDate = LocalDate.parse(text, formatters);
        return parsedDate;

    }
}
