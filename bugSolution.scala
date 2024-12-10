```scala
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(i: Int): Future[Int] = Future { 
    if (i == 0) throw new Exception("Cannot divide by zero")
    42 / i 
  }.recover { 
    case e: Exception => 
      println(s"An error occurred: ${e.getMessage}") 
      0 // Or another suitable default value
  }
}
```