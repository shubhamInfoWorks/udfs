package io.infoworks.customers.att.udfs;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class SubstrHiveUDF extends UDF {

  public static String evaluate(String input, Integer startIndex, int endIndex) {
    if (StringUtils.isEmpty(input)) {
      return input;
    }
    return input.substring(startIndex, endIndex);
  }
}
