package it.maior.scala.spring.rest.greeting

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class  GreetingApplication

object GreetingApplication extends App {
  SpringApplication.run(classOf[GreetingApplication])
}

