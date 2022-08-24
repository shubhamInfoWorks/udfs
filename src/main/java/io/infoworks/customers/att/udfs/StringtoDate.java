package io.infoworks.customers.att.udfs;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringtoDate extends UDF{

    public static LocalDate evaluate(String input, String dateformat) throws ParseException {

        if(input.isEmpty())

        {
            return null;

        }

        DateTimeFormatter format = DateTimeFormatter.ofPattern(dateformat);

        LocalDate date = LocalDate.parse(input, format);
        return date;
    }
}
