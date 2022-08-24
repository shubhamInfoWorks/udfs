package io.infoworks.customers.att.udfs;

import java.text.ParseException;

public class Test {

  public static void main(String[] args) throws ParseException {
   //String input2 = "A09B11A2022 23:59:59";
      //String input="";
  // System.out.println(StringToTimestampHiveUDF.evaluate(input));


//    System.out.println(LitHiveUDF.evaluate(input));
    //System.out.println(TrimOReplaceSubstringHiveUDF.evaluate(input, 30, "", ""));
 // System.out.println(DecimalCleanupHiveUDF.evaluate(""));
    //System.out.println(NonASCIICleanupHiveUDF.evaluate("日本人 中國的 ~=[]()%+{}@;’#!$_&- " +" éè  ;∞¥₤€ We hopè you find it inform@tiv€" +" Thank You!"));

    //System.out.println(NonASCIICleanupHiveUDF.evaluate(""));

     // System.out.println(CastStringToTimestamp0.evaluate("2022-10-20 00:00:56"));
     // System.out.println(StringToTimestampHiveUDF.evaluate(input2));

      System.out.println(TrimRegexp_replaceHiveUDF.evaluate("日本人 中國的 ~=[]()%+{}@","[^\\x00-\\x7F]","AA"));

     // System.out.println(CoalesceCastToTimestamp0.evaluate("2022-10-20 00:00:56"));
      //System.out.println(CoalesceCastToTimestamp0.evaluate(null));
      //System.out.println(CoalesceCastToTimestamp0.evaluate(""));
  }
}
