package br.edu.infnet.investorquiz.InvestmentRecycler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InvestmentsViewModel : ViewModel() {
    private val listInvestments = MutableLiveData<List<Investment>>()
    val investmets: LiveData<List<Investment>> = listInvestments

    fun getAll() {
        listInvestments.value = listOf<Investment>(
            Investment("Investimento1", 1.6, "Este é o investimento 1"),
            Investment("Investimento2", 2.6, "Este é o investimento 2"),
            Investment("Investimento3", 3.6, "Este é o investimento 3"),
        )
    }
}