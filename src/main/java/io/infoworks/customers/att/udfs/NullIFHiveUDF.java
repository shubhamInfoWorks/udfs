package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class NullIFHiveUDF extends UDF {

  public static String evaluate(String input, String secondexpression) {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    if (input.equals(secondexpression)) {
      return null;
    }

    return input;
  }

  public static long evaluate(long input, String secondexpression) {

    if (String.valueOf(input).equals(String.valueOf(secondexpression))) {
      return 0;
    }

    return input;
  }
}
