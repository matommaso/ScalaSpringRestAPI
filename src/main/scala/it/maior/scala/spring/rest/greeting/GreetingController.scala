package it.maior.scala.spring.rest.greeting

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController class GreetingController {

  val template = "Hello, %s"
  val counter = new AtomicLong

  @RequestMapping(Array("/greeting")) def greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = new Greeting(counter.incrementAndGet, template.format(name))
}