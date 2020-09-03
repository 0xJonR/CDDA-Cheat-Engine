package cheatEngine

import play.api.libs.json.JsValue
import scala.io.{BufferedSource, Source}

object jsonfind {
  /**
   *
   * @param fileDir: name of file to open
   * @return returns iterable representation of file
   */
  def findFile(fileDir: String): BufferedSource = {
    val sys = System.getProperty("user.dir")
    val dir = sys + fileDir
    Source.fromFile(dir)
  }

  /**
   * returns true if executing on windows. required for backslash navigation of directory
   * @return
   */
  def userOnWindows(): Boolean = {
    System.getProperty("os.name").contains("windows")
  }

  /**
   * Returns file path to json base directory
   * @return
   */
  def ConstructBaseFilePath(): String = {
    val slash: String = if(userOnWindows()) """\""" else "/"
    val str = slash + "data" + slash + "json"
    str
  }
  /**
   * turns file into an entire json collection*
   * @param file: represent file source
   *            * @return JSON collection
   */
  def filetoJSON(file: BufferedSource): JsValue = {
    ???
  }
}
