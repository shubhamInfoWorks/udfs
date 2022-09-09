package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
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


    public static long evaluate(long input, long secondexpression, long defaultinput) {

        try {
            return Utils.coalesce(NullIFHiveUDF.evaluate(input, secondexpression), defaultinput);
        }

        catch(Exception e){

            return 0;
        }

    }


}