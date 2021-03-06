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

package you.devknights.minimalweather.database.dao



import androidx.lifecycle.LiveData
import androidx.room.*
import you.devknights.minimalweather.database.WeatherDatabase
import you.devknights.minimalweather.database.entity.Weather

/**
 * A DAO interface for [Weather] model
 * @author vinayagasundar
 */

@Dao
interface WeatherDAO {

    @Query("SELECT * FROM " + WeatherDatabase.TABLE_WEATHER)
    fun all(): List<Weather>

    @Insert
    fun insert(weather: Weather)

    @Query("SELECT * FROM " + WeatherDatabase.TABLE_WEATHER +
            " WHERE latitude = :latitude AND longitude = :longitude" +
            " AND endTime >= :currentTimeInSecs ORDER BY endTime DESC")
    fun getWeatherByLocation(latitude: String, longitude: String, currentTimeInSecs: Long): LiveData<Weather>

    @Query("SELECT * FROM " + WeatherDatabase.TABLE_WEATHER
            + " WHERE endTime <= :currentTimeInMills")
    fun getAllExpiredData(currentTimeInMills: Long): List<Weather>

    @Delete
    fun deleteWeatherData(weathers: List<Weather>)
}
