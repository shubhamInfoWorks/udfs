package io.infoworks.customers.att.udfs;

import java.text.DecimalFormat;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class NullCheckWithAsDecimalHiveUDF extends UDF {

  public static Object evaluate(String input) {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    return Double.parseDouble(input);
  }
}
