package com.example.fandilai.login_page

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fandilai.login_page.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            repositoryName.text = "Medium Android Repository Article"
            repositoryOwner.text = "Fandi"
            numberOfStars.text = "1000 stars"

        }

        var repository = Repository("Medium Android Repository Article",
                "Fandi", 1000, true)

        binding.repository = repository
        binding.executePendingBindings()



    }
}
