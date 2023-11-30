package nih.webflux.webflux_basic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebfluxBasicApplication

fun main(args: Array<String>) {
	runApplication<WebfluxBasicApplication>(*args)
}
