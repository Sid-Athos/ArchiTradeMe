package app

import io.jooby.annotations.*

@Path("/")
class Controller {

  @GET
  fun sayHi(): String {
    return "Welcome to Jooby!"
  }
}
