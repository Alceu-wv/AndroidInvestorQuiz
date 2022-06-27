package br.edu.infnet.investorquiz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    private lateinit var perfil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        perfil = findViewById(R.id.textPerfil)

        var intent = intent
        var result = intent.getStringExtra("result")

        perfil.text = result.toString()

        button_banco.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bancopaulista.com.br"))
            startActivity(intent)
        }

        button_next.setOnClickListener {
            var intent = Intent(this, InvestmentActivity::class.java)
            startActivity(intent)
        }
    }
}