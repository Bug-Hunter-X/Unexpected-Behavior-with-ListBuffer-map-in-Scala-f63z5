```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Correct usage: update the buffer with the result of the map operation
  buffer ++= buffer.map(_ * 2)

  println(buffer) // Output: ListBuffer(1, 2, 3, 2, 4, 6) - Correct!
  
  //Alternative using `transform` which modifies the ListBuffer in place
  val buffer2 = new ListBuffer[Int](1,2,3)
  buffer2.transform(_ * 2)
  println(buffer2) //Output: ListBuffer(2, 4, 6)
}
```