package com.example.jogodavelhahmm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jogodavelhahmm.databinding.SelectMainBinding


class SelectModoActivity : AppCompatActivity () {

    private lateinit var binding: SelectMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SelectMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botao01.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            //Início da proxima atividade.
            startActivity(intent)

        }

        binding.botao00.setOnClickListener {

            val intent = Intent(this, RoboActivity::class.java)
            //Início da proxima atividade.
            startActivity(intent)


        }
    }
}