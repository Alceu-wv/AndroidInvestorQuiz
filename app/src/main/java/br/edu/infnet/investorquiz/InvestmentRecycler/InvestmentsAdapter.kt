package br.edu.infnet.investorquiz.InvestmentRecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.edu.infnet.investorquiz.databinding.RowInvestmentBinding

class InvestmentsAdapter : RecyclerView.Adapter<InvestmentsViewHolder>() {

    private var investmentList: List<Investment> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InvestmentsViewHolder {
        val item = RowInvestmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return InvestmentsViewHolder(item)
    }

    override fun onBindViewHolder(holder: InvestmentsViewHolder, position: Int) {
        holder.bind(investmentList[position])
    }

    override fun getItemCount(): Int {
        return investmentList.count()
    }

    fun updateInvestments(list: List<Investment>) {
        investmentList = list
    }
}