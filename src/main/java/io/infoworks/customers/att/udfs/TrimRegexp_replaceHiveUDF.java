package io.infoworks.customers.att.udfs;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.datanucleus.util.StringUtils;

public class TrimRegexp_replaceHiveUDF extends UDF {


  public static String evaluate(String unTransformed) {
    if (unTransformed == null) {
      return null;
    }

    if (StringUtils.isEmpty(unTransformed))
    {
      return null;
    }
    String transformed = unTransformed.replaceAll("[^\\x00-\\x7F]", "");
    return transformed;
  }
}
