package com.test.welcome

import android.content.Context
import android.widget.LinearLayout
import android.view.Gravity

import com.test.welcome.atoms.header
import com.test.welcome.atoms.message
import com.test.welcome.atoms.button

class WelcomeScreen(context: Context) : LinearLayout(context) {
    init {
        orientation = VERTICAL
        gravity = Gravity.CENTER

        addView(header(context))
        addView(message(context))
        addView(button(context))
    }
}