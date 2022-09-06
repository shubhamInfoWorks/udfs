package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class DivideHiveUDF extends UDF {

    public static double evaluate(Integer input, String divisor) {


        return input / Double.valueOf(divisor);


    }

//
    public static double evaluate(String input1, String divisor) {


            return Double.valueOf(input1) / Double.valueOf(divisor);



    }

    public static double evaluate(Double input, String divisor) {


        return input / Double.valueOf(divisor);


    }


}
