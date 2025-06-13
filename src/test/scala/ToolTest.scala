import block.{Stone, Wood}
import munit.FunSuite
import tool.{Axe, Pickaxe, Tool}
import world.Chunk

class ToolTest extends FunSuite {
  var axe: Axe = _
  var pickaxe: Pickaxe = _
  var chunk: Chunk = _

  override def beforeEach(context: BeforeEach): Unit = {
    axe = new Axe()
    pickaxe = new Pickaxe()
    chunk = new Chunk()
  }

  test("Axe is a tool") {
    assert(axe.isInstanceOf[Tool])
    assertEquals(axe.name, "Axe")
  }

  test("Pickaxe is a tool") {
    assert(pickaxe.isInstanceOf[Tool])
    assertEquals(pickaxe.name, "Pickaxe")
  }

  test("Axe can remove wood") {
    val wood = new Wood()
    val stone = new Stone()
    chunk.addBlock(wood)
    chunk.addBlock(stone)
    chunk.getMinedWithVisitor(axe)
    assert(axe.obtainBlocks().contains(wood))
    assert(!axe.obtainBlocks().contains(stone))
  }

  test("Pickaxe can remove stone") {
    val stone = new Stone()
    val wood = new Wood()
    chunk.addBlock(stone)
    chunk.addBlock(wood)
    chunk.getMinedWithVisitor(pickaxe)
    assert(pickaxe.obtainBlocks().contains(stone))
    assert(!pickaxe.obtainBlocks().contains(wood))
  }
}
