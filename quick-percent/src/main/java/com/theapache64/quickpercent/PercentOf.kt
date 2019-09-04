package com.theapache64.quickpercent


/**
 * To find percent of a number
 */

fun Number.percentOf(of: Float): Float {
    return (of / 100) * this.toFloat()
}

fun Number.percentOf(of: Int): Float {
    return percentOf(of.toFloat())
}

fun Number.percentOf(of: Long): Float {
    return percentOf(of.toFloat())
}

fun Number.percentOf(of: Double): Float {
    return percentOf(of.toFloat())
}
