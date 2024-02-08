package com.bottlerocketstudios.launchpadutilsdomain.flows

import com.bottlerocketstudios.launchpadutilsdomain.logger.Loggable
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

/**
 *  Helper functions to get access down casted mutable SharedFlows
 *    due to SharedFlow being covariant we must use templates with upper
 *    bounds to show type errors at build instead of run time.
 */
interface SharedFlowHelpers : Loggable {
    suspend fun SharedFlow<Number>.emit(value: Number) =
        (this as? MutableSharedFlow<Number>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "[emitValue] unable to emit value for $this") }

    suspend fun SharedFlow<CharSequence>.emit(value: CharSequence) =
        (this as? MutableSharedFlow<CharSequence>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "[emitValue] unable to emit value for $this") }

    suspend fun SharedFlow<Boolean>.emit(value: Boolean) =
        (this as? MutableSharedFlow<Boolean>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "[emitValue] unable to emit value for $this") }

    suspend fun SharedFlow<Unit>.emit(value: Unit) =
        (this as? MutableSharedFlow<Unit>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "unable to emit value for $this") }

    fun <T> SharedFlow<T>.tryEmit(value: T) =
        (this as? MutableSharedFlow<T>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun SharedFlow<Number>.tryEmit(value: Number) =
        (this as? MutableSharedFlow<Number>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun SharedFlow<CharSequence>.tryEmit(value: CharSequence) =
        (this as? MutableSharedFlow<CharSequence>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun SharedFlow<Boolean>.tryEmit(value: Boolean) =
        (this as? MutableSharedFlow<Boolean>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun SharedFlow<Unit>.tryEmit(value: Unit) =
        (this as? MutableSharedFlow<Unit>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }
}
