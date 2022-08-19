package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class TrimHiveUDF extends UDF {

  public static String evaluate(String input) {
    if (StringUtils.isEmpty(input)) {
      return input;
    }
    return input.trim();
  }
}
