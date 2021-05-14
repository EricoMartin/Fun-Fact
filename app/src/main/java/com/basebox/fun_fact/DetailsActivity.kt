package com.basebox.fun_fact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.basebox.fun_fact.databinding.ActivityDetailsBinding
import com.basebox.fun_fact.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private var binding: ActivityDetailsBinding? = null
    private var logo = 0
    private var name:String?  = null
    private var detail:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAS, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS )
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)

        setUpFactDetail()
    }

    private fun setUpFactDetail() {
        binding?.detailView?.text = detail
        binding?.logoView?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding =  null
    }
}