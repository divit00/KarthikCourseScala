package main.scala.exercise1_logical

import scala.io.StdIn._
//Create a Scala program to determine if a given value is either less than -10 or greater than 10.
//Sample Data: -15
object RangeCheckOr {

  def main(args: Array[String]): Unit = {

    val input_number = readInt()
    println("Input Number : " + input_number)

    if (input_number > 10 || input_number < -10) {
      println("Input Number is either less than -10 or greater than 10")
    }
    else {
      println("Input Number is not less than -10 or greater than 10")
    }
  }

}
