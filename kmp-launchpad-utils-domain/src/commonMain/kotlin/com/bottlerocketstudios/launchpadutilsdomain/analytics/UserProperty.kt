package com.bottlerocketstudios.launchpadutilsdomain.analytics

/** Used in [AnalyticsInterface.setUserProperty]. */
interface UserProperty : BaseAnalyticsUserProperty {
    val propertyName: String
    val propertyValue: String

    override fun createUserProperty(): UserProperty =
        CustomUserProperty(propertyName, propertyValue)
}
