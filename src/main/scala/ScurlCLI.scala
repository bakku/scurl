import org.kohsuke.args4j.{Option, Argument}
import scala.collection.JavaConverters._

object ScurlCLI {

  @Option(name = "--method", required = false, usage = "HTTP Method")
  var requestMethod: String = null

  @Argument
  var list = new java.util.LinkedList[String]

}
