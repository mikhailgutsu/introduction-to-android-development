package com.test.welcome.atoms

import android.content.Context

class message(context: Context) : androidx.appcompat.widget.AppCompatTextView(context) {
    init {
        text = "* Press button to start..."
        textSize = 18f
        setPadding(50, 10, 50, 20)
    }
}