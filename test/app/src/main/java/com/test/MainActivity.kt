// Our Component are in com.test package
package com.test

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
    /*
     *  override fun onCreate(...) redeclare the onCreate method which calls on Activity init
     *  savedInstanceState: Bundle? - sends the actual status of application if app-restarts
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        /*
         *  calls parent-method onCreate from AppCompatActivity for correct application initialization
         */
        super.onCreate(savedInstanceState)

        /*
         *  TextView(this) - create the text-area TextView
         *  this - sends actual Context (MainActivity) for TextView
         */
        val textView = TextView(this)
        /*
         *  Set-Up the "Frenki!" for output on interface
         */
        textView.text = "Frenki!"
        /*
         *  textSize = 24f for font-size, 24 (size) , f - float
         */
        textView.textSize = 24f
        /*
         *  setPadding(left, top, right, bottom) - padding-inside (in px)
         */
        textView.setPadding(50, 50, 50, 50)
        /*
         *  setContentView(...) - set the textView as main UI component of interface
         */
        setContentView(textView)
    }
}