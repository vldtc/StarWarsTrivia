package com.example.starwarstrivia.ui.vehicles

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.starwarstrivia.R
import com.example.starwarstrivia.databinding.FragmentVehiclesBinding

class VehiclesFragment : Fragment() {

    private var _binding : FragmentVehiclesBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: VehiclesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vehiclesViewModel =
            ViewModelProvider(this).get(VehiclesViewModel::class.java)

        _binding = FragmentVehiclesBinding.inflate(inflater, container, false)

        val textView: TextView = binding.tvName
        vehiclesViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VehiclesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}