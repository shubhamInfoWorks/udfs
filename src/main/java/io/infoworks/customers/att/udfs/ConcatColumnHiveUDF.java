package io.infoworks.customers.att.udfs;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class ConcatColumnHiveUDF extends UDF {

  public static String evaluate(String input, String Firstcolumn, String SecondColumn) {

    if (StringUtils.isEmpty(SecondColumn) && StringUtils.isEmpty(Firstcolumn) ){
      return null;
    }

    if (StringUtils.isEmpty(SecondColumn))
      return Firstcolumn;

    if (StringUtils.isEmpty(Firstcolumn))
      return SecondColumn;

    return Firstcolumn + SecondColumn;
  }
}
