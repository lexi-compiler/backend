package lexi.language.kotlin.ir.tast

case class IrFunction(
  var name: String,
  var `type`: String,
  var functionBody: IrFunctionBody
) extends IrNode

case class IrFunctionBody(
  var expression: String
)
