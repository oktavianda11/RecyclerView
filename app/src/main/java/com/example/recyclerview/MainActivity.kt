package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.deku,
                nameSuperhero = "Izuku Midoriya",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "8/10"
            ),
            Superhero(
                R.drawable.denji,
                nameSuperhero = "Denji",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.evangelion,
                nameSuperhero = "Eva - 001",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "7/10"
            ),
            Superhero(
                R.drawable.guts,
                nameSuperhero = "Guts",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.johanliebert,
                nameSuperhero = "Johan Liebert",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "9/10"
            ),
            Superhero(
                R.drawable.lawliett,
                nameSuperhero = "L",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.luffy,
                nameSuperhero = "Monkey D. Luffy",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.mereoleona,
                nameSuperhero = "Vermillion Mereoleona",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.ray,
                nameSuperhero = "Ray",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "8/10"
            ),
            Superhero(
                R.drawable.vagabond,
                nameSuperhero = "Miyamoto Musashi",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                ratingSuperhero = "10/10"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}