package nih.webflux.webflux_basic.model

data class Dish(
    val description: String,
) {
    private var delivered: Boolean = false
    companion object {
        fun deliver(dishes: Dish): Dish {
            val deliveredDish = Dish("${dishes.description} delivered!")
            deliveredDish.delivered = true
            return deliveredDish
        }
    }

   fun isDelivered(): Boolean {
       return delivered
   }
}
