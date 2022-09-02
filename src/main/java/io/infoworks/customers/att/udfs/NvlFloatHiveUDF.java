package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class NvlFloatHiveUDF extends UDF {


    public static Float evaluate(Float input, Float defaultInput) {

        if (input!= null) {
            return (input);
        }
        return (defaultInput);
    }


}
