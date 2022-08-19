package io.infoworks.customers.att.udfs;

import java.io.Serializable;
import java.util.function.Function;
import org.apache.hadoop.hive.ql.exec.UDF;

public class NonASCIICleanupHiveUDF extends UDF {


  public static String evaluate(String unTransformed) {
    if (unTransformed == null) {
      return null;
    }
    String transformed = unTransformed.replaceAll("[^\\x00-\\x7F]", "");
    return transformed;
  }
}
