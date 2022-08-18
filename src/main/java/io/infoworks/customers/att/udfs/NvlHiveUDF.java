package io.infoworks.customers.att.udfs;

public class NvlHiveUDF {

  public static <T> T evaluate(T input, T defaultInput) {
    if (input != null) {
      return input;
    }
    return defaultInput;
  }
}
