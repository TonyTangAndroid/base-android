package dev.arunkumar.android.dagger.fragment

import androidx.fragment.app.Fragment
import javax.inject.Scope

/**
 * Scope to denote that an object's lasts for the duration of [Fragment] instance.
 */
@Scope
@Retention
annotation class PerFragment