package scurl

import request._

object RequestInitializer {
  
  def issue_request = {
    val requestMethod = ScurlCLI.requestMethod.toUpperCase
    val url = ScurlCLI.list.get(0)
    
    val requestInstance = determineRequestType(requestMethod, url)
    requestInstance.execute
  }

  private def determineRequestType(requestMethod: String, url: String) = requestMethod match {
    case "GET" => new GetRequest(url)
    case _ => throw new UnsupportedMethodException(s"${requestMethod} is not an supported HTTP method")
  }
}
