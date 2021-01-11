package lexi.language.kotlin.ir.nodes

import scala.collection.mutable.ListBuffer

trait IrNode {
  var children: ListBuffer[IrNode] = ListBuffer()
}
