package com.kopikode.myrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant Man",
                "Manusia Semut"
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Manusia Semut"

        ),
            Superhero(
                R.drawable.marvel,
                "The Marvels",
                "Manusia Semut"
            ),
            Superhero(
                R.drawable.spiderman,
                "Spider-Man",
                "Manusia Semut"
            ),
            Superhero(
                R.drawable.thor,
                "Thor",
                "Manusia Semut"
            ),

            Superhero(
                R.drawable.aquaman,
                "Aquaman",
                "Manusia Semut"
        ),

            Superhero(
                R.drawable.avenger,
                "Avenger",
                "Manusia Semut"
            ),
            Superhero(
                R.drawable.eternal,
                "Eternal",
                "Manusia Semut"
        )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}