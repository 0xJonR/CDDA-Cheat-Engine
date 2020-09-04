package test
import org.scalatest.funsuite.AnyFunSuite
import cheatEngine.jsonfind
import scala.io.{BufferedSource, Source}
class IOTests extends AnyFunSuite  {
  test("jsonfind"){
    val fileDir = "/data/json/items/melee/swords_and_blades.json"
    val sysdir = System.getProperty("user.dir")
    System.out.println(sysdir)
    val dir = sysdir+fileDir
    assert(jsonfind.findFile(fileDir).nonEmpty)
  }
  test("UserOnWindows"){
    System.out.println(jsonfind.userOnWindows())
  }
  test("JSON test"){
    val testStr1: String = """{
                     |    "type": "GENERIC",
                     |    "id": "bagh_nakha",
                     |    "name": { "str": "tiger claws", "str_pl": "tiger claws" },
                     |    "description": "Also called bagh nakha or iron paw, this is a small claw-like bladed weapon from India designed to be concealed under and against the palm.",
                     |    "weight": "92 g",
                     |    "to_hit": 3,
                     |    "color": "dark_gray",
                     |    "symbol": "{",
                     |    "material": [ "steel" ],
                     |    "bashing": 1,
                     |    "cutting": 6,
                     |    "flags": [ "UNARMED_WEAPON", "DURABLE_MELEE" ],
                     |    "price": 20000,
                     |    "qualities": [ [ "CUT", 1 ], [ "BUTCHER", 14 ] ]
                     |  }""".stripMargin
    System.out.println(testStr1)
  }

}
