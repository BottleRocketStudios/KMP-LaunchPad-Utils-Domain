package com.bottlerocketstudios.launchpadutilsdomain.flows

import com.bottlerocketstudios.launchpadutilsdomain.logger.Loggable
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

interface SharedFlowHelpers : Loggable {
    /**
     *  Helper functions to get access down casted mutable SharedFlows
     *    due to SharedFlow being covariant we must use templates with upper bounds to show type errors at build instead of run time.
     */
    suspend fun <T : Number?> SharedFlow<T>.emit(value: T) =
        (this as? MutableSharedFlow<T>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "[emitValue] unable to emit value for $this") }

    suspend fun <T : CharSequence> SharedFlow<T>.emit(value: T) =
        (this as? MutableSharedFlow<T>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "[emitValue] unable to emit value for $this") }

    suspend fun SharedFlow<Boolean>.emit(value: Boolean) =
        (this as? MutableSharedFlow<Boolean>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "[emitValue] unable to emit value for $this") }

    suspend fun SharedFlow<Unit>.emit(value: Unit) =
        (this as? MutableSharedFlow<Unit>)?.emit(value) ?: run { log.w("BaseViewModel.emit()", "unable to emit value for $this") }

    fun <T> SharedFlow<T>.tryEmit(value: T) =
        (this as? MutableSharedFlow<T>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun <T : Number?> SharedFlow<T>.tryEmit(value: T) =
        (this as? MutableSharedFlow<T>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun <T : CharSequence?> SharedFlow<T>.tryEmit(value: T) =
        (this as? MutableSharedFlow<T>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun <T : Boolean?> SharedFlow<T>.tryEmit(value: T) =
        (this as? MutableSharedFlow<T>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }

    fun <T : Unit?> SharedFlow<T>.tryEmit(value: T) =
        (this as? MutableSharedFlow<T>)?.tryEmit(value) ?: run { log.w("BaseViewModel.tryEmit()", "[emitValue] unable to emit value for $this") }
}
