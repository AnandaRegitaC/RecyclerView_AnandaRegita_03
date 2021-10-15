package com.example.recyclerview_ananda_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antmant,
                nameSuperhero = "Ant-Man",
                descSuperhero = "Antman memiliki kekuatan: Memanipulasi ukuran, Berkomunikasi dengan semut, Ahli listrik"
            ),
            Superhero(
                R.drawable.aquaman,
                nameSuperhero = "Aquaman",
                descSuperhero = "Aquaman memiliki kekuatan: Sihir, Melihat masa lalu, Mengobati, Membuat Force Shield"
            ),
            Superhero(
                R.drawable.batman,
                nameSuperhero = "Batman",
                descSuperhero = "Batman memiliki kekuatan: Kecerdasan, Ahli Beladiri, Ahli Akrobat, Penyelidik Militan"
            ),
            Superhero(
                R.drawable.blackpanther,
                nameSuperhero = "Black Panther",
                descSuperhero = "Black Panther memiliki kekuatan: Tangkas dan gesit, Kekebalan diplomatik, Kekayaan melimpah"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain America",
                descSuperhero = "Capt. America memiliki kekuatan: Kebal lelah, Anti Peluru, Mampu mengangkat palu Thor"
            ),
            Superhero(
                R.drawable.gamora,
                nameSuperhero = "Gamora",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.ironman,
                nameSuperhero = "Ironman",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.nebula,
                nameSuperhero = "Nebula",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.spiderman,
                nameSuperhero = "Spiderman",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.thor,
                nameSuperhero = "Thor",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.wonderwoman,
                nameSuperhero = "Wonder Woman",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}