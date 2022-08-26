package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class CoalesceNullIFHiveUDF extends UDF {

    public static String evaluate(String input, String secondexpression, String defaultinput) {

        if (input.isEmpty()) {
            return null;

        }
        return Utils.coalesce(NullIFHiveUDF.evaluate(input,secondexpression),defaultinput);

    }


}