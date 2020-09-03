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
}
