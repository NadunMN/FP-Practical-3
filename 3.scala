import scala.math.BigDecimal
import scala.io.StdIn.readLine

object Main{
    def average(num1:Double, num2:Double): Double = {
        (num1+num2)/2
    }

    def convert(num: Double): Float = {
        val roundedNum= BigDecimal(num).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
        roundedNum
    }


    def main(args: Array[String]): Unit ={
        var num1 = 10;
        var num2 =23.43;
        val result = average(num1, num2)
        val finalResult = convert(result)
        println(s"Final Result is: $finalResult")
    }
}