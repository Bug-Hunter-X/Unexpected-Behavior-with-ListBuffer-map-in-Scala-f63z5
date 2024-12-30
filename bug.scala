```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Incorrect usage of map; map returns a new ListBuffer, it does not modify the original.
  buffer.map(_ * 2)

  println(buffer) // Output: ListBuffer(1, 2, 3) - Unexpected!
}
```