package nih.webflux.webflux_basic.controller

import nih.webflux.webflux_basic.model.Dish
import nih.webflux.webflux_basic.service.KitchenService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class ServerController(
    val kitchenService: KitchenService
) {
    @GetMapping(value = ["/server/dishes"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun serveDishes(): Flux<Dish> {
        return kitchenService.getDishes()
    }

    @GetMapping(value = ["/served-dishes"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun deliverDishes(): Flux<Dish> {
        return kitchenService.getDishes()
            .map {dish -> Dish.deliver(dish)}
    }
}
