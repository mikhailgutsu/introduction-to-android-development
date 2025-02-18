// Our Component are in com.test package
package com.test
import  com.test.welcome.WelcomeScreen

// Need from transmit data on Activity creation (save the status)
import android.os.Bundle
// Class for text output on android-interface
import android.widget.TextView
// based class fro Activity which supports the UI components
import androidx.appcompat.app.AppCompatActivity

/*
 *  class MainActivity inits the main Activity of application
 *  : AppCompatActivity() inheritance from AppCompatActivity for use all possibility of android-interface
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(WelcomeScreen(this))
    }
}