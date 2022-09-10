package io.infoworks.customers.att.udfs;

import java.sql.Timestamp;
import org.apache.hadoop.hive.ql.exec.UDF;

public class TimestampTransformerHiveUDF extends UDF {

  public static Timestamp evaluate(Timestamp untransformed) {
    return new Timestamp(System.currentTimeMillis());
  }
}
