package com.example.actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.Search -> {
                Toast.makeText(this,"You clicked search",Toast.LENGTH_LONG).show()
                return true
            }R.id.Favorite -> {
                Toast.makeText(this,"You clicked Favorite",Toast.LENGTH_LONG).show()
                return true
            }R.id.Share -> {
                Toast.makeText(this,"You clicked Share",Toast.LENGTH_LONG).show()
                return true
            }R.id.WhatsApp -> {
                Toast.makeText(this,"You clicked WhatsApp",Toast.LENGTH_LONG).show()
                return true
            }R.id.Instagram -> {
                Toast.makeText(this,"You clicked Instagram",Toast.LENGTH_LONG).show()
                return true
            } else -> super.onOptionsItemSelected(item)
        }

    }

}