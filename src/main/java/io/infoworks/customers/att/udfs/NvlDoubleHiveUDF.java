package io.infoworks.customers.att.udfs;

import java.math.BigDecimal;
import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlDoubleHiveUDF extends UDF {

  public static Double evaluate(String input, Double defaultInput) {
    if (input != null) {
      return Double.valueOf(input);
    }
    return defaultInput;
  }

  public static BigDecimal evaluate(String input, BigDecimal defaultInput) {
    BigDecimal output = defaultInput;
    if (input != null) {
      output = new BigDecimal(Double.valueOf(input));
    }
    return output;
  }

  public static Long evaluate(String input, Long defaultInput) {
    if (input != null) {
      return Long.valueOf(input);
    }

    return defaultInput;
  }

  public static Integer evaluate(String input, Integer defaultInput) {
    if (input != null) {
      return Integer.valueOf(input);
    }
    return defaultInput;
  }

  public static Float evaluate(String input, Float defaultInput) {
    if (input != null) {
      return Float.valueOf(input);
    }
    return defaultInput;
  }

  public static String evaluate(String input, String defaultInput) {
    if (input != null) {
      return input;
    }
    return defaultInput;
  }
}
