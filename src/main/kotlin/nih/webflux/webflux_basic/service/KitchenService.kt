package nih.webflux.webflux_basic.service

import nih.webflux.webflux_basic.model.Dish
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import java.time.Duration

@Service
class KitchenService {
    fun getDishes(): Flux<Dish> {
        return Flux.generate<Dish> { sink -> sink.next(randomDish()) }
            .delayElements(Duration.ofMillis(250))

    }

    private fun randomDish(): Dish {
        return menu.shuffled().first()
    }

    private val menu = listOf(
        Dish("Sesame chicken"),
        Dish("Lo mein noodles, plain"),
        Dish("Sweet & sour beef")
    )
}
