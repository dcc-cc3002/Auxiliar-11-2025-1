package tool

import block.{Block, Stone, Wood}
import world.Chunk

import scala.collection.mutable.ArrayBuffer

abstract class ATool(val name: String) extends Tool {
  private val collectedBlocks: ArrayBuffer[Block] = ArrayBuffer.empty

  protected def addBlock(block: Block): Unit = {
    collectedBlocks += block
  }

  def obtainBlocks(): Array[Block] = collectedBlocks.toArray

  def visitStone(b: Stone, c: Chunk): Unit = {}
  def visitWood(b: Wood, c: Chunk): Unit = {}

}
