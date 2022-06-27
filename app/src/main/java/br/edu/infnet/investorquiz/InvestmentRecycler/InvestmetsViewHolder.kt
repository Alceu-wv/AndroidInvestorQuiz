package br.edu.infnet.investorquiz.InvestmentRecycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import br.edu.infnet.investorquiz.R
import br.edu.infnet.investorquiz.databinding.RowInvestmentBinding

class InvestmentsViewHolder(private val bind: RowInvestmentBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(investment: Investment) {
        bind.textInvestment.text = investment.title
        bind.rateInvestment.text = investment.rate.toString()
        bind.descriptionInvestment.text = investment.description
    }
}