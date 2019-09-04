package com.theapache64.quickpercent


/**
 * To find what percent of a number is another number
 */

fun Number.isWhatPercentOf(of: Float): Float {
    return (this.toFloat() * 100) / of
}


fun Number.isWhatPercentOf(of: Int): Float {
    return isWhatPercentOf(of.toFloat())
}


fun Number.isWhatPercentOf(of: Long): Float {
    return isWhatPercentOf(of.toFloat())
}


fun Number.isWhatPercentOf(of: Double): Float {
    return isWhatPercentOf(of.toFloat())
}
