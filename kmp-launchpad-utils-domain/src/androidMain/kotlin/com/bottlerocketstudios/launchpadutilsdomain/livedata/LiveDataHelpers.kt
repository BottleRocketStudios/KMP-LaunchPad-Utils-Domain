package com.bottlerocketstudios.launchpadutilsdomain.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bottlerocketstudios.launchpadutilsdomain.logger.Loggable

interface LiveDataHelpers : Loggable {
    /** Helper function to avoid needing downcast declarations for public MutableLiveData or LiveEvent */
    fun <T> LiveData<T>.set(value: T?) = (this as? MutableLiveData<T>)?.setValue(value)
        ?: run { log.w("LiveDataHelpers", "unable to setValue for $this") }

    /** Helper function to avoid needing downcast declarations for public MutableLiveData or LiveEvent */
    fun <T> LiveData<T>.postValue(value: T?) = (this as? MutableLiveData<T>)?.postValue(value)
        ?: run { log.w("LiveDataHelpers", "unable to postValue for $this") }
}
