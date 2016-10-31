package request

import scalaj.http._

class GetRequest(url: String) extends Request(url) {
  
  def execute = {
    val response = Http(url).asString
     
    printCookies(response)
    printHeaders(response)
    printBody(response)
  }

}
