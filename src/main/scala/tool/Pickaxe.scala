package tool

import block.Stone
import world.Chunk

class Pickaxe extends ATool("Pickaxe") {
  override def visitStone(b: Stone, c: Chunk): Unit = {
    addBlock(b)
    c.removeBlock(b)
  }
}
