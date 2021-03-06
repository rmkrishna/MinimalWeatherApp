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


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import you.devknights.minimalweather.ui.city.CityViewModel
import you.devknights.minimalweather.ui.landing.LandingViewModel
import you.devknights.minimalweather.ui.weather.WeatherViewModel
import you.devknights.minimalweather.viewmodel.MinimalViewModelFactory

/**
 * @author vinayagasundar
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(LandingViewModel::class)
    abstract fun bindLandingViewModel(landingViewModel: LandingViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WeatherViewModel::class)
    abstract fun bindWeatherViewModel(weatherViewModel: WeatherViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CityViewModel::class)
    abstract fun bindCityViewModel(cityViewModel: CityViewModel): ViewModel



    @Binds
    abstract fun bindViewModelFactory(factory: MinimalViewModelFactory): ViewModelProvider.Factory
}
