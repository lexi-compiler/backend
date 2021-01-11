package lexi.language.kotlin.ir.nodes

case class Function(
                     val name: String,
                     val `type`: String,
                     val functionBody: FunctionBody
                   ) extends IrNode

case class FunctionBody(
                         val expression: String
                       )