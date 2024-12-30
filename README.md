# Scala ListBuffer.map Unexpected Behavior

This example demonstrates a common misunderstanding in Scala regarding the `ListBuffer.map` method. Unlike some other mutable collections in other languages, `map` on a Scala `ListBuffer` doesn't modify the original `ListBuffer` in place; it returns a *new* `ListBuffer` containing the transformed elements. This can be a source of unexpected behavior if you assume it's modifying the original.

The `bug.scala` file shows the incorrect usage, and `bugSolution.scala` provides the corrected version.