package io.infoworks.customers.att.udfs;


import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlIntegerHiveUDF extends UDF {

    public static int evaluate(Integer input, Integer defaultInput) {
        if (input!= null) {
            return (input);
        }
        return (defaultInput);
    }
}
