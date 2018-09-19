package br.com.albert.meusjogos.listajogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import br.com.albert.meusjogos.R
import br.com.albert.meusjogos.detalhejogo.DetalheActivity
import br.com.albert.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)

        rvJogos.adapter = JogosAdapter(this, getJogos(),  { jogo ->
           val detalheIntent = Intent(this, DetalheActivity::class.java)

            detalheIntent.putExtra("JOGO",jogo)


            startActivity(detalheIntent)

            })
        rvJogos.layoutManager = LinearLayoutManager(this)

    }

    private fun getJogos(): List<Jogo> {

        return listOf(

                Jogo(R.drawable.valkyrie,"Valkyrie Profile", 1999,"Melçhor RPG"),
                Jogo(R.drawable.kof,"King of fighters 98", 1997,"Melhor jogo de luta"),
                Jogo(R.drawable.bloodborne,"Bloodborne", 2015,"Melhor dark souls vitoriano"),
                Jogo(R.drawable.dc,"Dino Crisis", 1998,"Nao Informado"),
                Jogo(R.drawable.mariogalaxy,"Mario Galaxy 2", 2000,"Nao Informado"),
                Jogo(R.drawable.alttp,"Zelda: A link to the past", 1999,"Nao Informado")

        )
    }
}
