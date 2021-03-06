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

package you.devknights.minimalweather.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import you.devknights.minimalweather.ui.city.select.SelectCityFragment
import you.devknights.minimalweather.ui.weather.WeatherFragment

/**
 * @author vinayagasundar
 */
@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    internal abstract fun contributeLandingFragment(): WeatherFragment

    @ContributesAndroidInjector
    internal abstract fun contributeSelectCityFragment(): SelectCityFragment
}
