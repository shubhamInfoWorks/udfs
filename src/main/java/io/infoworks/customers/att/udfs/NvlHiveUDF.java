package io.infoworks.customers.att.udfs;

public class NvlHiveUDF {

  public static Object evaluate(String input, Object defaultInput) {
    if (input != null) {
      return input;
    }
    return defaultInput;
  }
}
