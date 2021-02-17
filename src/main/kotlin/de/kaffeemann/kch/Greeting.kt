package de.kaffeemann.kch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

public class Greeting(language: String, content: String){
    var language: String = language
    var content: String = content

    get() = field
}
