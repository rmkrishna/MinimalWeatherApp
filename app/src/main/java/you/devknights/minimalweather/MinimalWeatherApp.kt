/*
 * Copyright 2017 vinayagasundar
 * Copyright 2017 randhirgupta
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package you.devknights.minimalweather

import android.app.Activity
import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

import javax.inject.Inject

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import you.devknights.minimalweather.database.KeyValueStore
import you.devknights.minimalweather.di.AppInjector

/**
 * [Application] instance of the Weather App.
 * we can initialize all the library here.
 * @author vinayagasundar
 */

class MinimalWeatherApp : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var keyValueStore: KeyValueStore

    override fun onCreate() {
        super.onCreate()

        AppInjector.init(this)

        AppCompatDelegate.setDefaultNightMode(keyValueStore.getAutoNightMode())
    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return dispatchingAndroidInjector
    }


}
