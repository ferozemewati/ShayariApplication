package com.example.shayariapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayariapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var shayariList = ArrayList<DataEntity>()
    private lateinit var myViewModel: MyViewModel

    private val rvAdaptor by lazy {
        RvAdaptor(this, shayariList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

      //  shayariList.addAll(SimpleData.data)
        binding.rV.layoutManager = LinearLayoutManager(this)
        binding.rV.adapter=rvAdaptor

        binding.fab.setOnClickListener { view ->
           // startActivity(Intent(this,AddEditActivity::class.java))
            rvAdaptor.shayariList = myViewModel.shayariList
            rvAdaptor.notifyDataSetChanged()

        }
    }

}