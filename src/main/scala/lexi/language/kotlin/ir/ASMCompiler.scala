package lexi.language.kotlin.ir

import org.objectweb.asm._

import java.nio.file.{Files, Path}

object ASMCompiler {
  def compile(): Unit = {
    val writer = new ClassWriter(ClassWriter.COMPUTE_MAXS)
    writer.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "GeneratedClass", null, "java/lang/Object", null)

    val method = writer.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
    method.visitCode
    method.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
    method.visitLdcInsn("Hello world!")
    method.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false)
    method.visitInsn(Opcodes.RETURN)
    method.visitMaxs(0, 0)
    method.visitEnd

    writer.visitEnd

    val bytes = writer.toByteArray
    Files.write(Path.of("/Users/mattmoore/Desktop/GeneratedClass.class"), bytes)
  }
}
