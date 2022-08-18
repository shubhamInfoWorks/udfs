package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlTrimHiveUDF extends UDF {

  public static Object evaluate(String input, Object defaultInput) {
    if (input != null) {
      input = input.trim();
      return input;
    }
    return defaultInput;
  }
}
