import scala.io.StdIn.readLine

object stringReverse{

    def stringReverse(input: String): String ={
        if(input.isEmpty) ""
        else stringReverse(input.tail) + input.head
    }

    def main(args: Array[String]): Unit = {
        val str1 = "Computer Science"
        val reversed = stringReverse(str1)
        println(s"Orginal string: $str1")
        println(s"Reverse string: $reversed")
    }
}