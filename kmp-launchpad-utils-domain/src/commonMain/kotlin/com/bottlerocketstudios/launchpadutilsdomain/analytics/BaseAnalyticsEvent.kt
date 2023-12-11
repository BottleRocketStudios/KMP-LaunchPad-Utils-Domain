package com.bottlerocketstudios.launchpadutilsdomain.analytics

/** Interface to standardize a function to create an abstracted analytics object to be passed to the overall analytics interface functions. */
interface BaseAnalyticsEvent {
    fun createAnalyticsEvent(): Any
}
