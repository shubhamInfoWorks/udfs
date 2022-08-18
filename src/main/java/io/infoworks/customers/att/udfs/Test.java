package io.infoworks.customers.att.udfs;

import java.text.ParseException;

public class Test {

  public static void main(String[] args) throws ParseException {
    String input = "A09A11A2022 23:59:59";
    System.out.println(StringToTimestampHiveUDF.evaluate(input));
  }
}
