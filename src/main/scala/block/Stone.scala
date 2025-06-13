package block

import tool.Tool
import world.Chunk

class Stone extends ABlock("Stone") {
  def accept(visitor: Tool, c: Chunk): Unit = {
    visitor.visitStone(this, c)
  }
}
