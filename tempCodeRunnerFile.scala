import scala.io.StdIn.readLine

object StringReverse {
  def stringReverse(input: String): String = {
    if (input.isEmpty) ""
    else stringReverse(input.tail) + input.head
  }

  def main(args: Array[String]): Unit = {
    val str1 = "Computer Science"
    val reversed = stringReverse(str1)
    println(s"Original string: $str1")
    println(s"Reversed string: $reversed")
  }
}
