package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class CoalesceHiveUDF extends UDF {

  public static Object evaluate(String input, Object... defaults) {
    return Utils.coalesce(defaults);

  }
}
