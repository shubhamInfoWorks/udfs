package io.infoworks.customers.att.udfs;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
public class NullIFHiveUDF extends UDF {

    public static String evaluate(String input,String secondexpression) {
        if (StringUtils.isEmpty(input)) {
            return null;
        }
        if(input.equals(secondexpression))
        {
           return null;
        }

        return input;

    }
}
