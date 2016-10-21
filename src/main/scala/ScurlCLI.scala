import org.kohsuke.args4j.Option

object ScurlCLI {

  @Option(name = "--method", required = false, usage = "HTTP Method")
  var requestMethod: String = null

}
