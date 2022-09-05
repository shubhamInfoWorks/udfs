package io.infoworks.customers.att.udfs;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringtoDateFormatHiveUDF extends UDF{
    public static LocalDate evaluate(String input, String defaultConcatvalue , String dateformat) throws ParseException {

        if(StringUtils.isEmpty(input))

        {
            return null;

        }
        input=defaultConcatvalue+input;
        DateFormat dateFormat = new SimpleDateFormat(dateformat);
        return LocalDate.parse(input, DateTimeFormatter.ofPattern(dateformat));

    }
}
