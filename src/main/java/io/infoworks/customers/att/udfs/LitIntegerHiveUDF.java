package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class LitIntegerHiveUDF extends UDF {

  public static Integer evaluate(Integer input) {
    return input;
  }
}
