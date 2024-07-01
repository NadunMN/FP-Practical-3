import scala.io.StdIn.readLine
object stringList{
    def listOfString(str: List[String]): List[String] = {

        str.filter(str => str.length >5)
    }

    def main(args: Array[String]): Unit ={
        val str = List("Scala", "Java", "Python", "JavaScript", "Go", "Kotlin")
        val newone = listOfString(str)
        println(s"Original list: $str")
        println(s"Filtered list: $newone")
    }
}