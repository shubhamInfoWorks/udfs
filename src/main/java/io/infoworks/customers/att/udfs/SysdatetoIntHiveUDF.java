package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class SysdatetoIntHiveUDF extends UDF{
public static Integer evaluate (Date input) throws ParseException {
    if(input==null)

    {
        return null;
    }
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
    String strDate = dateFormat.format(input);
    return Integer.parseInt(strDate);
}
}
