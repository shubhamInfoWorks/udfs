package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.sql.Date;

public class ConcatColumnHiveUDF extends UDF {

    public static String evaluate(String input, String SecondColumn)

    {
        if (StringUtils.isEmpty(input)) {
            return input;
        }

        return input+SecondColumn;

    }

}
