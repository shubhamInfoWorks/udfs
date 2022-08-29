package io.infoworks.customers.att.udfs;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SysdatetoDateFormatHiveUDF extends UDF {

    public static Object evaluate(Date input, String format)
    {
        if(input==null)

        {
            return null;
        }

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);


    }
}