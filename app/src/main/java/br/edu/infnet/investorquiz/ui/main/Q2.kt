package br.edu.infnet.investorquiz.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import br.edu.infnet.investorquiz.R
import br.edu.infnet.investorquiz.databinding.FragmentQ1Binding
import br.edu.infnet.investorquiz.databinding.FragmentQ2Binding

class Q2 : Fragment() {

    var radioGroup: RadioGroup? = null
    lateinit var radioButton: Button
    private var binding : FragmentQ2Binding? = null
    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentQ2Binding.inflate(inflater, container, false)
        this.binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding = FragmentQ1Binding.bind(view)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            q2Fragment = this@Q2
        }

        radioGroup = view?.findViewById(R.id.radioGroup)
        radioButton = view.findViewById(R.id.button)


        radioButton.setOnClickListener{
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
            if (selectedOption == -1) {
                Toast.makeText(context, "Selecione uma das opções", Toast.LENGTH_SHORT).show()
            } else {
                radioButton = view?.findViewById(selectedOption)!!
                Toast.makeText(context, radioButton.text, Toast.LENGTH_SHORT).show()

                account_points(selectedOption)

                findNavController().navigate(R.id.action_q2_to_q3)
            }
        }
    }

    fun account_points(selectedOption: Int) {
        when(selectedOption) {
            R.id.radioButton -> sharedViewModel.one_point_answer()
            R.id.radioButton2 -> sharedViewModel.two_point_answer()
            R.id.radioButton3 -> sharedViewModel.three_point_answer()
            R.id.radioButton4 -> sharedViewModel.four_point_answer()
        }
        sharedViewModel.count_answer()
    }
}