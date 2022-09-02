package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;

public class CaseWhenIsEmptyThenNull {
  public static String evaluate(String input) {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    return input;
  }

}
