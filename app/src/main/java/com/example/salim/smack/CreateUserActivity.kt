package com.example.salim.smack

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {


    var userAvatar ="profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }



    fun generateUserAvatar(view: View)
    {
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)


        if (color == 0) //check whether the color is light or dark
        {
            userAvatar = "light$avatar" // the name of the light category images
        }
        else
        {
            userAvatar = "dark$avatar" // the name of the dark category images
        }

        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceId)

    }



    fun generateColorClicked(view: View) // generating random RGB format colors for the user avatar
    {
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

        val savedR = r.toDouble()/255
        val savedG = g.toDouble()/255
        val savedB = b.toDouble()/255

        avatarColor = "[$savedR, $savedG, $savedB, 1]"

    }

    fun createUserClicked(view: View)
    {

    }
}
