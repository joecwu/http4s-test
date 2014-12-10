package com.joecwu.test.http4s

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}

import org.http4s.Header.{`Transfer-Encoding`, `Content-Type`}
import org.http4s._
import org.http4s.MediaType._
import org.http4s.dsl._
import org.http4s.json4s.jackson.Json4sJacksonSupport._
import org.http4s.server._
import org.http4s.server.middleware.EntityLimiter
import org.http4s.server.middleware.EntityLimiter.EntityTooLarge
import org.http4s.server.middleware.PushSupport._

import scalaz.stream.Process
import scalaz.concurrent.Task
import scalaz.concurrent.Strategy.DefaultTimeoutScheduler
import org.http4s.dsl./

/**
 * Created by Joe on 2014/12/11.
 */
object TestService {
  def service(implicit executionContext: ExecutionContext = ExecutionContext.global) = HttpService {
    case req @ GET -> Root => Ok(
      <html>
        <head>
          <title>test</title>
        </head>
        <body>
          <h1>test!!!</h1>
        </body>
      </html>
    )
    case GET -> Root / "ping" => Ok("pong")
  }

}
