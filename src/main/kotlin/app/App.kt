package app

import io.jooby.Kooby
import io.jooby.runApp

class App: Kooby({

  mvc(Controller())
})

fun main(args: Array<String>) {
  runApp(args, App::class)
}
