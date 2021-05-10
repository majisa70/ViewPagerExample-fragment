package com.example.viewpagerexamplefragment

import androidx.lifecycle.ViewModel

//store all scene data
class MyViewModel : ViewModel() {
    val sceneList = ArrayList<Scenes>() //list of scene data
    var cityList: List<String>  // list of city names

    init {  //initiate the photo list
        sceneList.add(
            Scenes(
                0,"",
                "Baseball",
                R.drawable.baseball,
                R.drawable.baseball_photo

            )
        )
        sceneList.add(
            Scenes(
                1,"",
                "Basketball",
                R.drawable.basketball,
                R.drawable.basketball_photo

            )
        )
        sceneList.add(
            Scenes(
                2,"",
                "Football",
                R.drawable.football,
                R.drawable.football_photo

            )
        )
        sceneList.add(Scenes(3,"", "Other",
            R.drawable.other,
            R.drawable.other_photo))


    }

    init {
        //get the set of city names (remove redundant names)
        val tempSet = mutableSetOf<String>()  //empty set
        sceneList.forEach { tempSet.add(it.city) }
        cityList = tempSet.toList()  //convert the set into a list
    }
}