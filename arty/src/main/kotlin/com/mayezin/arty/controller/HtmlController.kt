package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

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