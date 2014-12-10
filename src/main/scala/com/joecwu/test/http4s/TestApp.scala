package com.joecwu.test.http4s

import org.http4s.server.blaze.BlazeBuilder
/**
 * Created by Joe on 2014/12/11.
 */
object TestApp extends App {
  BlazeBuilder.bindHttp(8080)
    .mountService(TestService.service)
    .run
    .awaitShutdown()
}
