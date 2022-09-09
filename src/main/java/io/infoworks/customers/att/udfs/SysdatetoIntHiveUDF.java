package io.infoworks.customers.att.udfs;

//import jdk.vm.ci.meta.Local;
import org.apache.hadoop.hive.ql.exec.UDF;

import org.apache.spark.sql.Column;
import org.apache.spark.sql.functions;

import java.text.ParseException;


public class SysdatetoIntHiveUDF extends UDF{
public static Column evaluate (Integer input) throws ParseException {

   // Date date = Calendar.getInstance().getTime();x
   // DateFormat dateFormat = new SimpleDateFormat(dateformat);
   // String strDate = dateFormat.format(date);

   // long now = System.currentTimeMillis();
   //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");


  return functions.current_timestamp();

}
}
