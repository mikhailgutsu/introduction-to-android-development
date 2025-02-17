package com.test.welcome.atoms

import android.content.Context
import android.view.Gravity

class message(context: Context) : androidx.appcompat.widget.AppCompatTextView(context) {
    init {
        text = "* Press button to start..."
        textSize = 14f
        setPadding(50, 10, 50, 20)
        gravity = Gravity.CENTER
    }
}