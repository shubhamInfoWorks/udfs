package io.infoworks.customers.att.udfs;

import java.sql.Date;
import java.util.Calendar;
import org.apache.hadoop.hive.ql.exec.UDF;

public class SysdatetoDateFormatHiveUDF extends UDF {

  public static Date evaluate(Date input) {
    return new java.sql.Date(Calendar.getInstance().getTime().getTime());
  }
}
