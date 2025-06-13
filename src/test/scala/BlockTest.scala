import block.{Block, Stone, Wood}
import munit.FunSuite

class BlockTest extends FunSuite {
  var s: Stone = _
  var w: Wood = _

  override def beforeEach(context: BeforeEach): Unit = {
    s = new Stone()
    w = new Wood()
  }

  test("Dirt is a block") {
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
