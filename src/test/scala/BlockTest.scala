import block.{Block, Dirt, Stone, Wood}
import munit.FunSuite

class BlockTest extends FunSuite {
  var d: Dirt = _
  var s: Stone = _
  var w: Wood = _

  override def beforeEach(context: BeforeEach): Unit = {
    d = new Dirt()
    s = new Stone()
    w = new Wood()
  }

  test("Dirt is a block") {
    assert(d.isInstanceOf[Block])
    assertEquals(d.name,"Dirt")
  }

  test("Stone is a block") {
    assert(s.isInstanceOf[Block])
    assertEquals(s.name,"Stone")
  }

  test("Wood is a block") {
    assert(w.isInstanceOf[Block])
    assertEquals(w.name,"Wood")
  }
}
