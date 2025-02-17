package com.test.welcome.atoms

import android.content.Context

class header(context: Context) : androidx.appcompat.widget.AppCompatTextView(context) {
    init {
        text = "Welcome to Test Android-Kotlin Application!"
        textSize = 28f
        setPadding(50, 30, 50, 10)
    }
}