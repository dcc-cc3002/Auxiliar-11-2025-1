import block.{Dirt, Stone, Wood}
import munit.FunSuite
import tool.{Axe, Pickaxe, Shovel}
import world.{Chunk, Player}

class WorldTest extends FunSuite {
  var player: Player = _
  var chunk: Chunk = _

  override def beforeEach(context: BeforeEach): Unit = {
    player = new Player()
    chunk = new Chunk()
    chunk.addBlock(new Stone())
    chunk.addBlock(new Wood())
    chunk.addBlock(new Dirt())
  }

  test("A block can be added to a chunk") {
    assertEquals(chunk.blocks.length, 3)
    val b = new Stone()
    chunk.addBlock(b)
    assertEquals(chunk.blocks.length, 4)
  }

  test("A block can be removed from a chunk") {
    assertEquals(chunk.blocks.length, 3)
    val b = new Stone()
    chunk.addBlock(b)
    assertEquals(chunk.blocks.length, 4)
    chunk.removeBlock(b)
    assertEquals(chunk.blocks.length, 3)
  }

  test("Player can mine with a Pickaxe") {
    val pickaxe = new Pickaxe()
    player.mine(pickaxe, chunk)
    assertEquals(pickaxe.obtainBlocks().length, 1)
  }

  test("Player can mine with a Axe") {
    val axe = new Axe()
    player.mine(axe, chunk)
    assertEquals(axe.obtainBlocks().length, 1)
  }

  test("Player can mine with a Shovel") {
    val shovel = new Shovel()
    player.mine(shovel, chunk)
    assertEquals(shovel.obtainBlocks().length, 1)
  }
}