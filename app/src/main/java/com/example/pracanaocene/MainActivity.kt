package com.example.pracanaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zablokujwybory = findViewById<Button>(R.id.btn_zab)
        val odblokujwybory = findViewById<Button>(R.id.btn_edy)
        var pmezcz = findViewById<RadioButton>(R.id.mez)
        var pkob = findViewById<RadioButton>(R.id.kob)
        val muzyka = findViewById<CheckBox>(R.id.muzyka)
        val gry = findViewById<CheckBox>(R.id.gry)
        val turystyka = findViewById<CheckBox>(R.id.turystyka)
        val sport = findViewById<CheckBox>(R.id.sport)
        var wiek = findViewById<EditText>(R.id.wiek)

        zablokujwybory.setOnClickListener {
            pmezcz.isEnabled = false
            pkob.isEnabled = false
            muzyka.isEnabled = false
            gry.isEnabled = false
            turystyka.isEnabled = false
            sport.isEnabled = false
            wiek.isEnabled = false

        }
        odblokujwybory.setOnClickListener {
            pmezcz.isEnabled = true
            pkob.isEnabled = true
            muzyka.isEnabled = true
            gry.isEnabled = true
            turystyka.isEnabled = true
            sport.isEnabled = true
            wiek.isEnabled = true
        }
        findViewById<Button>(R.id.btn_wys).setOnClickListener {
            var plec = " "
            var zainteresowania = " "
            if (pmezcz.isChecked){
                plec += "Mężczyzna"
            }
            if (pkob.isChecked){
                plec += "kobieta"
            }
            if (sport.isChecked){
                zainteresowania += "Sport"
            }
            if (gry.isChecked){
                zainteresowania += "Gry"
            }
            if (turystyka.isChecked){
                zainteresowania += "turystyka"
            }
            if (muzyka.isChecked){
                zainteresowania += "Muzyka"
        }
            var wynik = "Twoja płeć to : " +plec + "\n Twoj wiek to : " +wiek.text.toString() + "\n Twoje zaintereswoania to : " + zainteresowania
            Toast.makeText(applicationContext,"Twoje dane to : \n" + wynik, Toast.LENGTH_SHORT).show()






        }
    }
}