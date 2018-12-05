package it.maior.scala.spring.rest.greeting

class Greeting(val id: Long, val content: String) {
    def getId: Long = id

    def getContent: String = content
}
