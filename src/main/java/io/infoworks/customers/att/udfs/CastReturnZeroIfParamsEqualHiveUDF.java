package io.infoworks.customers.att.udfs;

public class CastReturnZeroIfParamsEqualHiveUDF {
  public static Integer evaluate(Integer input,Integer secondexpression) {
    if (input == null) {
      return 0;
    }
    if(input.equals(secondexpression))
    {
      return 0;
    }

    return input;

  }

}
