package block
import tool.Tool
import world.Chunk

class Dirt extends ABlock("Dirt") {
  def accept(visitor: Tool, c: Chunk): Unit = {
    visitor.visitDirt(this, c)
  }
}