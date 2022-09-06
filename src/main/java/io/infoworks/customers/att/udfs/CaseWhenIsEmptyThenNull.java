package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class CaseWhenIsEmptyThenNull extends UDF {
  public static String evaluate(String input) {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    return input;
  }

}
