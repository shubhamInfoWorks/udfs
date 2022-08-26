package io.infoworks.customers.att.udfs;
import org.apache.hadoop.hive.ql.exec.UDF;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringtoDateFormatHiveUDF extends UDF{

    public static Object evaluate(String input, String dateformat) throws ParseException {

        if(input.isEmpty())

        {
            return null;

        }

        DateFormat dateFormat = new SimpleDateFormat(dateformat);
        return dateFormat.format(new SimpleDateFormat(dateformat).parse(input));

    }
}
