package com.trytolearn.didagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var darkKnight : DarkKnight
    @Inject lateinit var light: HolyKnight
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerBattleComponent.create().injection(this)

        val tv = findViewById<TextView>(R.id.tv)
        tv.text = "Dark :"+darkKnight.setEquip()+" Light: "+ light.setEquip()
    }
}