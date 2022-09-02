package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;

public class CaseWhenIsNullThenEmpty {
  public static String evaluate(String input, String secondString) {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    return input;
  }

}
