package com.test.welcome.atoms

import android.content.Context
import android.view.Gravity

class header(context: Context) : androidx.appcompat.widget.AppCompatTextView(context) {
    init {
        text = "Welcome to Test Android-Kotlin Application!"
        textSize = 20f
        setPadding(50, 30, 50, 10)
        gravity = Gravity.CENTER
    }
}