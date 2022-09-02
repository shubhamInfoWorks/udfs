package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlDoubleHiveUDF extends UDF {

    public static Double evaluate(Double input, Double defaultInput) {
        if (input != null) {
            return input;
        }

        return defaultInput;
    }
}
