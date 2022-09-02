package io.infoworks.customers.att.udfs;


import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlIntegerHiveUDF extends UDF {

    public static int evaluate(String input, Integer defaultInput) {
        if (!StringUtils.isEmpty(input)) {
            return Integer.parseInt(input);
        }
        return defaultInput;
    }
}
