package main.scala.exercise1_logical

import scala.io.StdIn.readInt

//Implement a Scala function to check if a given number is odd and not divisible by 3.
//Sample Data: 27
object OddNumberCheck {
  def main(args: Array[String]): Unit = {

    val input_number = readInt()

    if (input_number % 2 == 1 & input_number % 3 != 0) {
      println("given number is odd and not divisible by 3")
    }

    else println("given number is not (odd and not divisible by 3)")

  }

}
