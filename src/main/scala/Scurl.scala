import scalaj.http._

object ScurlApplication extends App {
  val response = Http("http://www.google.de").asString
  println(response.body)
}
