package br.edu.infnet.investorquiz.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
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

//        val view = inflater.inflate(R.layout.fragment_q1, container, false)
//        val btnAvancar = view.findViewById<Button>(R.id.btn_avancar)

//        btnAvancar.setOnClickListener {
//            val navController = this.findNavController()
//            navController.navigate(R.id.action_q1_to_q2)
//        }
//        return view
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentQ1Binding.bind(view)

        radioGroup = view?.findViewById(R.id.)
    }



    fun orderCupcake(quantity: Int) {
        // Update the view model with the quantity
        sharedViewModel.one_point_answer()

        // If no flavor is set in the view model yet, select vanilla as default flavor

        // Navigate to the next destination to select the flavor of the cupcakes
        findNavController().navigate(R.id.action_q1_to_q2)
    }

}