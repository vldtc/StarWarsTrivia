package com.example.starwarstrivia.ui.species

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.starwarstrivia.R
import com.example.starwarstrivia.databinding.FragmentSpeciesBinding

class SpeciesFragment : Fragment() {

    private var _binding: FragmentSpeciesBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SpeciesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val speciesViewModel =
           ViewModelProvider(this).get(SpeciesViewModel::class.java)

        _binding = FragmentSpeciesBinding.inflate(inflater, container, false)

        val textView: TextView = binding.tvName
        speciesViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpeciesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}