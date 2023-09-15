package com.example.initialtodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.initialtodo.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    val listaDeTarefas: Array<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setAddButtonClick()
    }

    fun setAddButtonClick(){
        binding.addButton.setOnClickListener() {
            println("clicou!")
        }
    }
}

