package request

import scurl.ScurlCLI
import scalaj.http._

abstract class Request(url: String) {

  def execute

  def printBody(response: HttpResponse[String]) = {
    println("Response Body:")
    println(response.body)
  }
  
  def printCookies(response: HttpResponse[String]) = {
    if (ScurlCLI.showCookies) {
      println("Cookies:")

      response.cookies.foreach { println } 

      print("\n")
    }
  }

  def printHeaders(response: HttpResponse[String]) = {
    if (ScurlCLI.showHeaders) {
      println("Headers:")

      response.headers.foreach { case (headerKey, headerValue) => {
        print(s"${headerKey}: ") 
        println(headerValue.mkString(", ")) 
      }}

      print("\n")
    }
  }
}
