package tool

import block.{Block, Dirt, Stone}
import world.Chunk

class Pickaxe extends ATool("Pickaxe") {
  def use(b: Block, c: Chunk): Unit = {
    b match {
      case s: Stone => {
        addBlock(s)
        c.removeBlock(s)
      }
      case d: Dirt =>
        c.removeBlock(d)

      case _ => ()
    }
  }
  
  override def visitStone(b: Stone, c: Chunk): Unit = {
    addBlock(b)
    c.removeBlock(b)
  }

  override def visitDirt(b: Dirt, c: Chunk): Unit = {
    c.removeBlock(b)
  }
}
