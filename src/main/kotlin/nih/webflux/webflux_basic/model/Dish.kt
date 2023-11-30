package nih.webflux.webflux_basic.model

data class Dish(
    val description: String = "",
    val delivered: Boolean = false,
) {
   fun isDelivered(): Boolean {
       return delivered
   }
}
