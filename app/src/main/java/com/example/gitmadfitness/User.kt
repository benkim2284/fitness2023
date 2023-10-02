package com.example.gitmadfitness

class User(val name: String, private var password: String) {
    val phoneNumber = ""
    val schedule = mutableListOf<String>()
    val interests = mutableListOf<String>()
    val friends = mutableListOf<Profile>()
    val blocked = mutableListOf<Profile>()
    val gyms = mutableListOf<String>()
    val profile = Profile(name, schedule, interests, friends, gyms)
    //First need to write the Chat Class
    //val chatSessions = mutableListOf<Chat>()


    //Need to find a way to efficiently update user data.


    //Allows the users to change their passwords
    fun changePassword(newPassword: String) {
        if (newPassword != password) {
            password = newPassword
        }
    }

    //"friends" and "blocked" are lists we want to modify the moment the action happens.
    fun modifyFriends(person: Profile, option: String) {
        if (option == "add") {
            friends.add(person)
        } else if (option == "remove") {
            friends.remove(person)
        }
    }
    fun modifyBlocked(person: Profile, option: String) {
        if (option == "block") {
            friends.add(person)
        } else if (option == "unblock") {
            friends.remove(person)
        }
    }

    //still need to write class that changes the




}