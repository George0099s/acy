package com.enterprise.acy.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enterprise.acy.R
import com.enterprise.acy.presentation.ui.Login

class MainActivity : AppCompatActivity() {
    private val login = Login()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container, login).commit()
    }
}
