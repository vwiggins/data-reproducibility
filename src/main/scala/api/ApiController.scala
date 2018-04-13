package api

import com.springer.samatra.extras.{RoutePrinting, WebServer, WebappContextHandler}
import com.springer.samatra.routing.Routings.{Controller}
import com.springer.samatra.routing.StandardResponses.Implicits._

object ApiController extends Controller {
  get("/repos/:subject") { req => s"hi ${req.captured("subject")}" }

  def main(args: Array[String]): Unit = {
    new WebServer(8080)
      .addHandler(new WebappContextHandler with RoutePrinting {}
        .addRoutes("/*", ApiController)
        .printRoutesTo(System.out)
      ).start()
  }
}