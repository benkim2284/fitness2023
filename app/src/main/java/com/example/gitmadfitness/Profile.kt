package com.example.gitmadfitness

class Profile (name: String, schedule: MutableList<String>,
    interests: MutableList<String>, friends: MutableList<Profile>, gyms: MutableList<String>){

    val nameProfile = name
    val scheduleProfile = schedule
    val interestsProfile = interests
    val friendsProfile = friends
    val gymsProfile = gyms

    //write individual functions to change each profile element separately (more efficient than
    //updating all elements each time one element is changed).

}