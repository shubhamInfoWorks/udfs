package io.infoworks.customers.att.udfs;

import java.io.Serializable;
import java.util.function.Function;
import org.apache.hadoop.hive.ql.exec.UDF;

public class DecimalCleanupHiveUDF extends UDF {

  public static Double evaluate(String unTransformed) {
    if (unTransformed == null) {
      return null;
    }
    if (unTransformed.trim().contains("")) {
      return -1.0;
    }
    if (unTransformed.matches("[a-zA-Z]+")) {
      return -1.0;
    }
    return Double.parseDouble(unTransformed);
  }
}
