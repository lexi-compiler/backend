package lexi.language.kotlin.ir

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ASMCompilerSpec extends AnyFunSpec with Matchers {
  describe("compile") {
    it("writes a java class file") {
      ASMCompiler.compile()
    }
  }
}
