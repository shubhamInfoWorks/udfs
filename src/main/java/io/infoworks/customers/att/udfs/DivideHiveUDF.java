package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class DivideHiveUDF extends UDF {

  public static double evaluate(Integer input, String divisor) {

    return input / Double.valueOf(divisor);
  }

  //
  public static String evaluate(String input1, String divisor) {
    Double output = Double.valueOf(input1) / Double.valueOf(divisor);
    return output.toString();
  }

  public static Double evaluate(String input1, Double divisor) {

    return Double.valueOf(input1) / Double.valueOf(divisor);
  }

  public static double evaluate(Double input, String divisor) {

    return input / Double.valueOf(divisor);
  }
}
