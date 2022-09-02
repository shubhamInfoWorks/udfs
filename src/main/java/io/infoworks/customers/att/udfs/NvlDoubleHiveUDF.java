package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlDoubleHiveUDF extends UDF {

    public static Double evaluate(String input, Double defaultInput) {
        if (input != null) {
            return Double.valueOf(input);
        }

        return defaultInput;
    }
}
