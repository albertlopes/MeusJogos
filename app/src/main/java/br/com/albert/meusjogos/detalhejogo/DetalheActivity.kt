package br.com.albert.meusjogos.detalhejogo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.albert.meusjogos.R
import br.com.albert.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_detalhe.*

class DetalheActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)
        setSupportActionBar(toolbar)

        val jogo : Jogo = intent.getParcelableExtra("JOGO")

        Toast.makeText(this,jogo.titulo,Toast.LENGTH_LONG).show()


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
