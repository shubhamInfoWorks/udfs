package io.infoworks.customers.att.udfs;

public class NvlTrimHiveUDF {
  public static Object evaluate(String input, Object defaultInput) {
    if (input != null) {
      input = input.trim();
      return input;
    }
    return defaultInput;
  }
}
