package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.datanucleus.util.StringUtils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CastAsdateHiveUDF extends UDF {

    public static Date evaluate(String input, String timestmapformat) throws ParseException {
        if (StringUtils.isEmpty(input)) {

            return null;
        }

        try {

            SimpleDateFormat parseFormat = new SimpleDateFormat(timestmapformat);
            Date dt = new Date(parseFormat.parse(input).getTime());

            return dt;

        } catch (Exception e) {
            return null;

        }

    }
}




