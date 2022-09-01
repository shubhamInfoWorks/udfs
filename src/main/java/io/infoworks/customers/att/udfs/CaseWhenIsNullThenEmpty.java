package io.infoworks.customers.att.udfs;

public class CaseWhenIsNullThenEmpty {
  public static String evaluate(String input, String secondString) {
    if (input == null) {
      return null;
    }
    return input;
  }

}
