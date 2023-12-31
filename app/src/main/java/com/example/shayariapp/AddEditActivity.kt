package com.example.shayariapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shayariapp.databinding.ActivityAddEditBinding
import com.google.android.material.snackbar.Snackbar

class AddEditActivity : AppCompatActivity() {

private lateinit var binding: ActivityAddEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityAddEditBinding.inflate(layoutInflater)
     setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title

    }
}