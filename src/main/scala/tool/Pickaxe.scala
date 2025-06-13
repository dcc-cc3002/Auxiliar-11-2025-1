package tool

import block.Stone

class Pickaxe extends ATool("Pickaxe") {
  override def visitStone(b: Stone, c: world.Chunk): Unit = {
    addBlock(b)
    c.removeBlock(b)
  }
}
