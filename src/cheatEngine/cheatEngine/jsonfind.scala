package cheatEngine

import play.api.libs.json.JsValue
import scala.io.{BufferedSource, Source}

object jsonfind {
  final val backslash: String = if(userOnWindows()) """\"""" else "/"
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
    val str = backslash + "data" + backslash + "json"
    str
  }

  /**
   * returns file path to item path json directory
   * @return
   */
  def getItemFilePath(): String = {
    ConstructBaseFilePath() + backslash + "items"
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
