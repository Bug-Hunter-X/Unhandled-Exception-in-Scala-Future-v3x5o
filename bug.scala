```scala
import scala.concurrent.{ExecutionContext, Future}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(i: Int): Future[Int] = Future { 
    if (i == 0) throw new Exception("Cannot divide by zero")
    42 / i 
  }
}
```