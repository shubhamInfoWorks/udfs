package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class divideHiveUDF extends UDF {

    public static double evaluate(double input, double divisor) {
        if (input == 0) {

            return 0;
        }
        if (input / divisor == 0) {
            return (int) (input / divisor);
        } else {
            return input / divisor;
        }


    }
}
