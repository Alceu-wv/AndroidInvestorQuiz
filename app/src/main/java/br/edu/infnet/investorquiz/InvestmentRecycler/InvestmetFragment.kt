package br.edu.infnet.investorquiz.InvestmentRecycler

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import br.edu.infnet.investorquiz.R
import br.edu.infnet.investorquiz.databinding.ActivityInvestmentBinding
import br.edu.infnet.investorquiz.databinding.FragmentInvestmetBinding

class InvestmetFragment : Fragment() {

    private var _binding: FragmentInvestmetBinding? = null
    private val binding get() = _binding!!

    private val adapter = InvestmentsAdapter()
    private lateinit var viewModel: InvestmentsViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, b: Bundle?): View {

        viewModel = ViewModelProvider(this).get(InvestmentsViewModel::class.java)
        _binding = FragmentInvestmetBinding.inflate(inflater, container, false)

        binding.recyclerInvestments.layoutManager = LinearLayoutManager(context)

        binding.recyclerInvestments.adapter = adapter

        viewModel.getAll()
        observe()

        return binding.root
    }

    private fun observe() {
        viewModel.investmets.observe(viewLifecycleOwner) {
            adapter.updateInvestments(it)
        }
    }
}