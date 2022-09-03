package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


public class SystimetoIntHiveUDF extends UDF{
public static Integer evaluate (Time input, String timeformat) throws ParseException {

   // Date date = Calendar.getInstance().getTime();x
   // DateFormat dateFormat = new SimpleDateFormat(dateformat);
   // String strDate = dateFormat.format(date);


    return Integer.valueOf(LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("HHmmss")));
}
}
