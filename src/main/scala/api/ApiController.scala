package api

import com.springer.samatra.extras.{RoutePrinting, WebServer, WebappContextHandler}
import com.springer.samatra.routing.Routings.{Controller}
import com.springer.samatra.routing.StandardResponses.Implicits._
import org.json4s._
import org.json4s.native.Serialization.write

object ApiController extends Controller {
  import domain.Domain._
  implicit val formats = DefaultFormats

  get("/repos/:subject") { req =>
    val key = {req.captured("subject")}
    write(subjectToRepoMapping(key))
  }

  def main(args: Array[String]): Unit = {
    new WebServer(sys.env("PORT").toInt)
      .addHandler(new WebappContextHandler with RoutePrinting {}
        .addRoutes("/*", ApiController)
        .printRoutesTo(System.out)
      ).start()
  }
}