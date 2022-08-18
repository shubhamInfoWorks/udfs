package io.infoworks.customers.att.udfs;

import java.text.ParseException;

public class Test {

  public static void main(String[] args) throws ParseException {
    System.out.println(StringToTimestampHiveUDF.evaluate(""));
  }
}
