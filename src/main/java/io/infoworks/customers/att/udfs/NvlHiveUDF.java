package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlHiveUDF extends UDF {

  public static String evaluate(String input, String defaultInput) {
    if (input != null) {
      return input;
    }
    return defaultInput;
  }
}
