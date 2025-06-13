package block

import tool.Tool
import world.Chunk

trait Block {
  def accept(visitor: Tool, c: Chunk): Unit
}
