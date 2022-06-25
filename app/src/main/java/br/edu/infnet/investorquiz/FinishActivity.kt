package br.edu.infnet.investorquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinishActivity : AppCompatActivity() {

    private lateinit var perfil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        perfil = findViewById(R.id.textPerfil)

        var intent = intent
        var result = intent.getStringExtra("result")

        perfil.text = result.toString()
    }
}