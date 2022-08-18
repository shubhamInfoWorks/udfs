package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class CoalesceAsCharHiveUDF extends UDF {

  public static String evaluate(String input, int size, Object defaultInput) {
    String coalescedObject = (String) Utils.coalesce(input, defaultInput);
    return coalescedObject.substring(0, size);
  }
}
