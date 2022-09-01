package io.infoworks.customers.att.udfs;

public class CaseWhenIsEmptyThenNull {
  public static String evaluate(String input) {
    if (input.isEmpty()) {
      return null;
    }
    return input;
  }

}
