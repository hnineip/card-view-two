package com.hnineiphyu.recyclerviewtuto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.recyclerviewtuto1.adapter.ShoesAdapter
import com.hnineiphyu.recyclerviewtuto1.model.ShoeOne

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.shoes_recycler)

        val shoeArray = arrayListOf<ShoeOne>()

        shoeArray.add(ShoeOne(R.drawable.shoeone,"Zoom Freak 1 Soul","Glo","$130"))
        shoeArray.add(ShoeOne(R.drawable.shoetwo,"Nik Air Force","Limited Edition","$110"))
        shoeArray.add(ShoeOne(R.drawable.shoethree,"Nik Air Max","Men's Shoe","$120"))
        shoeArray.add(ShoeOne(R.drawable.shoefour,"Nik Joy Run","Flyknit","$180"))
        shoeArray.add(ShoeOne(R.drawable.shoefive,"Nike React Presto","Men's","$120"))
        shoeArray.add(ShoeOne(R.drawable.shoesix,"NikCourt Air Zoom","Vapor X Knit","$170"))

        val shoesAdapter = ShoesAdapter(shoeArray)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = shoesAdapter
    }
}
