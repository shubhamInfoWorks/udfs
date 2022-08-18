package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class CoalesceAsCharHiveUDF extends UDF {

  public static Object evaluate(String input, int size, Object defaultInput) {
    Object coalescedObject = Utils.coalesce(input, defaultInput);
    coalescedObject = coalescedObject.toString().substring(0, size);
    return coalescedObject;
  }
}
