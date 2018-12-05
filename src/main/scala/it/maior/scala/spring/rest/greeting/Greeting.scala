package it.maior.scala.spring.rest

class Greeting(val id: Long, val content: String) {
    def getId: Long = id

    def getContent: String = content
}
