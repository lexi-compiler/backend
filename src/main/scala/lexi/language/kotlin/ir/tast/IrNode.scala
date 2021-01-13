package lexi.language.kotlin.ir.tast

import scala.collection.mutable.ListBuffer

trait IrNode {
  var children: ListBuffer[IrNode] = ListBuffer()
}
