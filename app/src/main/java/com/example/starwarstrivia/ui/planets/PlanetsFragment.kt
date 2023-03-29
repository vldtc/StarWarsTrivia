package com.example.starwarstrivia.ui.planets

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.starwarstrivia.R
import com.example.starwarstrivia.databinding.FragmentPlanetsBinding

class PlanetsFragment : Fragment() {

    private var _binding: FragmentPlanetsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: PlanetsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val planetsViewModel =
            ViewModelProvider(this).get(PlanetsViewModel::class.java)

        _binding = FragmentPlanetsBinding.inflate(inflater, container, false)

        val textView: TextView = binding.tvName
        planetsViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlanetsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}