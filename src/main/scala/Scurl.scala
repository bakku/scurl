import scalaj.http._
import org.kohsuke.args4j.{CmdLineException, CmdLineParser}
import scala.collection.JavaConverters._

object ScurlApplication extends App {
  val parser = new CmdLineParser(ScurlCLI)

  try {
    parser.parseArgument(args.toList.asJava)
  }
  catch {
    case e: CmdLineException =>
      println(s"Error: ${e.getMessage}")
      println("Usage:")
      parser.printUsage(System.out)
      System.exit(1)
  }

  println(s"Request Method = ${ScurlCLI.requestMethod}")
}
