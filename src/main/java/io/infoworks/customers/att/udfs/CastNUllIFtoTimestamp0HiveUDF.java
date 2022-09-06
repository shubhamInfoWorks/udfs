package io.infoworks.customers.att.udfs;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class CastNUllIFtoTimestamp0HiveUDF extends UDF {

    public static Timestamp evaluate(String input, String secondexpression,String timestampformat) throws ParseException {

        if (StringUtils.isEmpty(input)) {
            return null;
        }


        SimpleDateFormat parseFormat = new SimpleDateFormat(timestampformat);
        return new java.sql.Timestamp(parseFormat.parse(NullIFHiveUDF.evaluate(input, secondexpression)).getTime());

    }
}
