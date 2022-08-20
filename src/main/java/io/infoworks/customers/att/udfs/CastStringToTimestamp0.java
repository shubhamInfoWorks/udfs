package io.infoworks.customers.att.udfs;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import java.time.LocalDate;
public class CastStringToTimestamp0 extends UDF{

    public static Timestamp evaluate(String input) throws ParseException {
        if (StringUtils.isEmpty(input)) {
            return null;
        }


        Timestamp parsedtimestamp = Timestamp.valueOf(input);

        return parsedtimestamp;
    }
}

