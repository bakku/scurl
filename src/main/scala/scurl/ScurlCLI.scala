package scurl

import org.kohsuke.args4j.{Option, Argument}
import scala.collection.JavaConverters._

object ScurlCLI {

  @Option(name = "--method", aliases = Array("-m"), required = false, usage = "HTTP Method")
  var requestMethod: String = "GET"

  @Option(name = "--cookies", aliases = Array("-c"), required = false, usage = "Show Cookies")
  var showCookies: Boolean = false

  @Option(name = "--help", aliases = Array("-h"), required = false, usage = "Show usage")
  var help: Boolean = false

  @Option(name = "--headers", aliases = Array("-H"), required = false, usage = "Show headers")
  var showHeaders: Boolean = false

  @Argument
  var list = new java.util.LinkedList[String]

}
