package request

import scalaj.http._

class GetRequest(url: String) extends Request(url) {
  
  def execute = {
    val response = Http(url).asString
     
    printStatusCode(response)
    printCookies(response)
    printHeaders(response)
    printBody(response)
  }

}
