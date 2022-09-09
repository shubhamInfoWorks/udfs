package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class CoalesceNullIFHiveUDF extends UDF {

    public static long evaluate(String input, String secondexpression, String defaultinput) {

        try {
            return Long.parseLong(Utils.coalesce(NullIFHiveUDF.evaluate(input, secondexpression), defaultinput));
        }

        catch(Exception e){

            return 0;
        }

    }


    public static long evaluate(long input, String secondexpression, long defaultinput) {


         //   return Utils.coalesce(NullIFHiveUDF.evaluate(input, secondexpression), defaultinput);

       return  ObjectUtils.firstNonNull(NullIFHiveUDF.evaluate(input, secondexpression), defaultinput);




    }


}