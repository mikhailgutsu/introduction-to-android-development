package com.test.welcome.atoms

import android.content.Context
import android.widget.Toast

class button(context: Context) : androidx.appcompat.widget.AppCompatButton(context) {
    init {
        text = "START"
        setPadding(50, 20, 50, 50)

        setOnClickListener {
            Toast.makeText(context, "BTN_PRESSED!", Toast.LENGTH_SHORT).show()
        }
    }
}
