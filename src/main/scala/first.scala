package org.example.divit

import org.apache.spark
import org.apache.spark.SparkConf
import org.apache.spark.sql.catalyst.dsl.expressions.StringToAttributeConversionHelper
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.{SaveMode, SparkSession}
import org.apache.spark.sql.functions.{add_months, avg, coalesce, col, column, count, date_add, date_format, date_sub,
  datediff, dayofmonth, dayofweek, dayofyear, desc, initcap, lag, lit, max, min, month, split, sum, to_date,
  to_timestamp, when, year}
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

object first {

  def main(args:Array[String]):Unit= {

    val sparkConf = new SparkConf()

    sparkConf.set("spark.app.name", "first-program")
    sparkConf.set("spark.master", "local[*]")

    val spark = SparkSession.builder()
      .config(sparkConf)
      .getOrCreate()


    //
    // import spark.implicits._
    //
    //    val df = List(("2023-10-07", "15:30:00")).toDF("date_str", "time_str")
    //    df.printSchema()
    //    val formattedDf = df.withColumn("date", to_date(col("date_str")))
    //      .withColumn("time", to_timestamp(col("time_str")))
    //
    //    formattedDf.show()
    //    formattedDf.printSchema()
    //
    //


    scala.io.StdIn.readInt()
  }

}

