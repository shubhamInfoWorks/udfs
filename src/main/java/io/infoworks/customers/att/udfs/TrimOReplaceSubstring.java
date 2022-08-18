package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class TrimOReplaceSubstring extends UDF {

  public static String evaluate(String input, Integer beginIndexForSubstring, String searchString,
      String replaceString) {
    if (input == null) {
      return null;
    }
    input = input.substring(beginIndexForSubstring);
    input = input.replace(searchString, replaceString);
    input = input.trim();
    return input;
  }
}
