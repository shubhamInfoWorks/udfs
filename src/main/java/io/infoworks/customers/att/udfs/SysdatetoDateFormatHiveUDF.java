package io.infoworks.customers.att.udfs;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class SysdatetoDateFormatHiveUDF extends UDF {

    public static Date evaluate(Date input)
    {



        return new Date();

    }
}
