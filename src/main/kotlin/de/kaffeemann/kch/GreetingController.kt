package de.kaffeemann.kch

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@RestController
public class GreetingController {
    var template: String = "Hello, %s!"

    @GetMapping("/")
    fun greeting(@RequestParam("name") name: String?):Greeting{
        val targetName = if (name.isNullOrEmpty()) "World" else name
        return Greeting("kotlin", String.format(template, targetName))
    }
}