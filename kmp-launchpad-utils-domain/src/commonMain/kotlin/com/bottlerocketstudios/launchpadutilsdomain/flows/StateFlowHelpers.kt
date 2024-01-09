package com.bottlerocketstudios.launchpadutilsdomain.flows

import com.bottlerocketstudios.launchpadutilsdomain.logger.Loggable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface StateFlowHelpers : Loggable {
    /** Helper functions to avoid needing downcast declarations for public MutableStateFlow */
    fun <T : Number> StateFlow<T>.setValue(value: T) {
        (this as? MutableStateFlow<T>)?.value = value
    }

    fun <T : CharSequence> StateFlow<T>.setValue(value: T) {
        (this as? MutableStateFlow<T>)?.value = value
    }

    fun StateFlow<Boolean>.setValue(value: Boolean) {
        (this as? MutableStateFlow<Boolean>)?.value = value
    }

    fun StateFlow<Unit>.setValue(value: Unit) {
        (this as? MutableStateFlow<Unit>)?.value = value
    }
}
