package com.example.salim.smack.Model

/**
 * Created by salimhaddad on 4/30/18.
 */
class Channel(val name: String, val description: String, val id: String) {

    override fun toString(): String {
        return "#$name"
    }

}