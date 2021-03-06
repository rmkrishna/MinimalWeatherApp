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

package you.devknights.minimalweather.ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomappbar.BottomAppBar


import you.devknights.minimalweather.R

/**
 * This will be the Base [AppCompatActivity] for all the Activity in the App
 * @author vinayagasundar
 */
abstract class MinimalWeatherAppActivity : AppCompatActivity() {


    private var mToolbar: Toolbar? = null

    private var bottomAppBar: BottomAppBar? = null


    /**
     * Return the layout resource ID which used in [.setContentView]
     * @return
     */
    @get:LayoutRes
    abstract val layoutResId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)

        mToolbar = findViewById(R.id.toolbar)
        bottomAppBar = findViewById(R.id.bottom_bar)
        mToolbar?.title = null
    }
}
