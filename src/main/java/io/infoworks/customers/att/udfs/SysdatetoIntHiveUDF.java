package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.sql.Time;
import java.time.LocalDateTime;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;


public class SysdatetoIntHiveUDF extends UDF{
public static Integer evaluate (Integer input) throws ParseException {

   // Date date = Calendar.getInstance().getTime();x
   // DateFormat dateFormat = new SimpleDateFormat(dateformat);
   // String strDate = dateFormat.format(date);


    return Integer.valueOf(LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("HHmmss")));
}
}
