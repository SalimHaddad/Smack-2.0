package com.example.salim.smack.Services

import android.graphics.Color
import java.util.*

/**
 * Created by salimhaddad on 4/29/18.
 */
object UserDataService {


    var id          = ""
    var avatarColor = ""
    var avatarName  = ""
    var email       = ""
    var name        = ""



    fun logout()
    {
        id                     = ""
        avatarColor            = ""
        avatarName             = ""
        email                  = ""
        name                   = ""
        AuthService.authToken  = ""
        AuthService.userEmail  = ""
        AuthService.isLoggedIn = false

    }




    fun returnAvatarColor(components: String) : Int{

        val strippedColors = components
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")



        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColors)
        if(scanner.hasNext())
        {
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }

        return Color.rgb(r, g, b)

    }


}