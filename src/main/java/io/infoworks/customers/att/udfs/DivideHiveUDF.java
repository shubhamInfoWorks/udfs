package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class DivideHiveUDF extends UDF {

    public static double evaluate(Integer input, String divisor) {

        if (input / Integer.parseInt(divisor) == 0) {
            return input / Integer.parseInt(divisor);
        } else {
            return input / Integer.parseInt(divisor);
        }


    }
}
