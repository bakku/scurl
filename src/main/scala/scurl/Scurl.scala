package scurl

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
      printUsage
      System.exit(1)
  }

  if (noURLGiven) {
    println("No URL given\n")
    printUsage
    System.exit(2)
  }

  if (shouldPrintHelp) {
    printUsage
  }
  else {
    RequestInitializer.issue_request
  }

  private def noURLGiven = ScurlCLI.list.size == 0

  private def shouldPrintHelp = ScurlCLI.help

  private def printUsage = {
    println("Usage:")
    parser.printUsage(System.out)
  }
}
