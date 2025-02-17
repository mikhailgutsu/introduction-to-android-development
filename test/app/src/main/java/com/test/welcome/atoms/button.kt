package com.test.welcome.atoms

import com.test.R

import android.content.Context
import android.widget.Toast
import android.view.Gravity
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class button(context: Context) : androidx.appcompat.widget.AppCompatButton(context) {
    init {
        text = "START"
        setPadding(50, 50, 50, 50)
        gravity = Gravity.CENTER
        background = ContextCompat.getDrawable(context, R.drawable.custom_button)

        layoutParams = LinearLayout.LayoutParams(
            (resources.displayMetrics.widthPixels * 0.8).toInt(),
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            gravity = Gravity.CENTER
        }

        setOnClickListener {
            Toast.makeText(context, "BTN_PRESSED!", Toast.LENGTH_SHORT).show()
        }
    }
}
