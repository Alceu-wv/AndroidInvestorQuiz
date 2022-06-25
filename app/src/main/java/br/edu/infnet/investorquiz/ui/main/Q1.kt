package br.edu.infnet.investorquiz.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import br.edu.infnet.investorquiz.R
import br.edu.infnet.investorquiz.databinding.FragmentQ1Binding
import br.edu.infnet.investorquiz.ui.main.MainViewModel

class Q1 : Fragment(R.layout.fragment_q1) {

    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private var binding : FragmentQ1Binding? = null
    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentQ1Binding.inflate(inflater, container, false)
        this.binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding = FragmentQ1Binding.bind(view)
        binding?.apply {
            viewModel = sharedViewModel
            lifecycleOwner = viewLifecycleOwner
            q1Fragment = this@Q1
        }

        radioGroup = view?.findViewById(R.id.radioGroup)
        var nextButton : Button = view.findViewById(R.id.btn_avancar)

        radioGroup!!.setOnClickListener{
            nextButton.isEnabled = false
        }


        nextButton.setOnClickListener {
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
            if (selectedOption == -1) {
                Toast.makeText(context, "Selecione uma das opções", Toast.LENGTH_SHORT).show()
            } else {
                radioButton = view?.findViewById(selectedOption)!!
                Toast.makeText(context, radioButton.text, Toast.LENGTH_SHORT).show()

                account_points(selectedOption)

                findNavController().navigate(R.id.action_q1_to_q2)

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