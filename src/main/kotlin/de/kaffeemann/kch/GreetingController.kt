package de.kaffeemann.kch

@RestController
public class GreetingController {
    var template: String = "Hello, %s!"

    @GetMapping("/")
    fun greeting(@RequestParam("name") name: String?):Greeting{
        val targetName = if (name.isNullOrEmtpy()) "World" else name
        return Greeting("kotlin", String.format(template, targetName))
    }
}