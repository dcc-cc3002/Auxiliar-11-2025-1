package tool

import block.Wood
import world.Chunk

class Axe extends ATool("Axe") {
  override def visitWood(b: Wood, c: Chunk): Unit = {
    addBlock(b)
    c.removeBlock(b)
  }
}
