package tool

import block.{Block, Dirt, Wood}
import world.Chunk

class Shovel extends ATool("Shovel") {
  def use(b: Block, c: Chunk): Unit = {
    b match {
      case d: Dirt => {
        addBlock(d)
        c.removeBlock(d)
      }
      case w: Wood =>
        c.removeBlock(w)
      case _ => ()
    }
  }

  override def visitDirt(b: Dirt, c: Chunk): Unit = {
    addBlock(b)
    c.removeBlock(b)
  }

  override def visitWood(b: Wood, c: Chunk): Unit = {
    c.removeBlock(b)
  }

}