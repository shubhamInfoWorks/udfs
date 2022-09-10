package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlFloatHiveUDF extends UDF {

  public static Float evaluate(String input, Float defaultInput) {

    if (input != null) {
      return Float.valueOf((input));
    }
    return (defaultInput);
  }
}
