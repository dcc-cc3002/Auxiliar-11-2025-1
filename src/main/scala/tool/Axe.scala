package tool

import block.{Block, Stone, Wood}
import world.Chunk

class Axe extends ATool("Axe") {
  def use(b: Block, c: Chunk): Unit = {
    b match {
      case w: Wood => {
        addBlock(w)
        c.removeBlock(w)
      }
      case s: Stone =>
        c.removeBlock(s)
      case _ => ()
    }
  }
  
  override def visitWood(b: Wood, c: Chunk): Unit = {
    addBlock(b)
    c.removeBlock(b)
  }

  override def visitStone(b: Stone, c: Chunk): Unit = {
    c.removeBlock(b)
  }
}
