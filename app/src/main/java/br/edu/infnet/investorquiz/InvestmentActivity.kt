package br.edu.infnet.investorquiz

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import br.edu.infnet.investorquiz.InvestmentRecycler.InvestmentsAdapter
import br.edu.infnet.investorquiz.InvestmentRecycler.InvestmentsViewModel
import br.edu.infnet.investorquiz.databinding.ActivityInvestmentBinding
import kotlinx.android.synthetic.main.activity_investment.*

class InvestmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInvestmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvestmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}