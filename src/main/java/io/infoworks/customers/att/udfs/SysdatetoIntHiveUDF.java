package io.infoworks.customers.att.udfs;

//import jdk.vm.ci.meta.Local;
import org.apache.hadoop.hive.ql.exec.UDF;

//import java.sql.Time;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;


public class SysdatetoIntHiveUDF extends UDF{
public static LocalTime evaluate (Integer input) throws ParseException {

   // Date date = Calendar.getInstance().getTime();x
   // DateFormat dateFormat = new SimpleDateFormat(dateformat);
   // String strDate = dateFormat.format(date);

   // long now = System.currentTimeMillis();
   //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    return LocalTime.now();
}
}
