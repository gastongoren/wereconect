/*
 * Copyright (c) 2019 KAVAK. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * KAVAK ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with KAVAK.
 */

package com.example.wereconnect.infraestructure.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * ViewModelKey
 *
 * @author (c) 2019, UVI TECH SAPI De CV, KAVAK
 */
@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)