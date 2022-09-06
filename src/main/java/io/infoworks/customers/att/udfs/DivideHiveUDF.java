package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;

public class DivideHiveUDF extends UDF {

    public static double evaluate(Integer input, String divisor) {


        return input / Integer.parseInt(divisor);


    }


    public static double evaluate(String input1, String divisor1) {


            return Integer.valueOf(input1) / Integer.parseInt(divisor1);



    }


}
