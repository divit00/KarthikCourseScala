package main.scala.exercise1_logical

import scala.io.StdIn._
//Write a Scala function to check if a given number is both even and positive.
//Sample Data: 14

object EvenAndPositive {

  def main(args: Array[String]): Unit = {

    val input_number = readInt()
    println("Input Number : " + input_number)

    if (input_number > 0 & input_number % 2 == 0) {
      println("Input Number is positive and even")
    }
    else {
      println("Input Number is not positive and even")
    }
  }

}
