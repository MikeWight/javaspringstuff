package com.mayezin.arty

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArtyApplication

fun main(args: Array<String>) {
	runApplication<ArtyApplication>(*args)
}


@RestController
class HtmlController {

  @GetMapping("/")
  fun blog(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!")
  )

}

data class Message(@Id val id: String?, val text: String)