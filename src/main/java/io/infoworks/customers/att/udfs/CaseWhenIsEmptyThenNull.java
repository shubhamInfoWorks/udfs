package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.sql.Date;

public class CaseWhenIsEmptyThenNull extends UDF {
  public static Date evaluate(String input) {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    return Date.valueOf(input);
  }

}
