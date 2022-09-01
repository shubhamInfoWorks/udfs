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

      //System.out.println(TrimRegexp_replaceHiveUDF.evaluate("日本人 中國的 ~=[]()%+{}@","[^\\x00-\\x7F]","AA"));

     // System.out.println(NullIFHiveUDF.evaluate("","ADITYA"));
//System.out.println(CoalesceNullIF.evaluate("ADITYA","ADITYA","Latest"));
      //System.out.println(CastNUllIFtoTimestamp0.evaluate("2012/10/04","","yyyy/MM/dd"));
     // System.out.println(CoalesceCastToTimestamp0.evaluate("2022-10-20 00:00:56"));
      //System.out.println(CoalesceCastToTimestamp0.evaluate(null));
      //System.out.println(CoalesceCastToTimestamp0.evaluate(""));

    //System.out.println(StringtoDate.evaluate("2012/10/09","yyyy/MM/dd"));

   //System.out.println(SysdatetoDateFormatHiveUDF.evaluate(Calendar.getInstance().getTime(), "YYYY/MM/dd"));
    //System.out.println(SysdatetoIntHiveUDF.evaluate(Calendar.getInstance().getTime()));

    //System.out.println(StringtoDateFormatHiveUDF.evaluate("20220907","yyyyDDmm"));
   // System.out.println(divide.evaluate(26789,10000));

//System.out.println(caswhen_multiplethen_HiveUDF.evaluate("J"));
    //System.out.println((CastStringToTimestampFormatHiveUDF.evaluate("2021/05/04 23:45:30.05","yyyy/MM/dd HH:mm:ss.SSS")));

   // System.out.println(Calendar.getInstance().getTime());

    //System.out.println(CastNullIFtoDateFormatHiveUDF.evaluate("20210504","~","yyyyMMdd"));

    System.out.println(SubstrCharlengthTrimTrailHiveUDF.evaluate("abcde      ",1));
  }
}
