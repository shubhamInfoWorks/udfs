package io.infoworks.customers.att.udfs;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class LitHiveUDF extends UDF {

  public static <T> T evaluate(T input) {
    return input;
  }
}
