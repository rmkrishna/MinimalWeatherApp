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

package you.devknights.minimalweather.repo.weather;

import android.location.Location;

import you.devknights.minimalweather.database.entity.WeatherEntity;

/**
 * @author vinayagasundar
 */

public interface WeatherDataSource {

    void insert(WeatherEntity weatherEntity);

    WeatherEntity getWeatherInfoByLocation(Location location);
}