// import scala.io.StdIn.readLine
object evenNumber{

    def sumOfAllInteger(number: List[Int]): Int={
        val sizrOfList = number.length
        var sum =0
        for (x <- 0 to (sizrOfList-1)){// for (x <-0 until sizeOfList)
         //until is get first value but not last value
         // to is get first and last value
            if(number(x)%2 == 0){
                sum = sum + number(x)
            }  
        }
        sum
    }

    def main(args: Array[String]): Unit={
        val numbers = List.range(1,20)
        val result = sumOfAllInteger(numbers)
        println(s"given List: $numbers")
        println(s"Sum of even number: $result")
    }
}