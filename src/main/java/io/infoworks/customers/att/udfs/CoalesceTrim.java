package io.infoworks.customers.att.udfs;

import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.hive.ql.exec.UDF;

public class CoalesceTrim extends UDF {

  public static String evaluate(String input, Object... defaults) {
    if (input != null) {
      input = input.trim();
      return input;
    }
    return (String) Utils.coalesce(defaults);

  }
}
