package com.example.starwarstrivia.ui.starships

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.starwarstrivia.R
import com.example.starwarstrivia.databinding.FragmentStarshipsBinding

class StarshipsFragment : Fragment() {

    private var _binding: FragmentStarshipsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: StarshipsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val starshipsViewModel =
            ViewModelProvider(this).get(StarshipsViewModel::class.java)

        _binding = FragmentStarshipsBinding.inflate(inflater, container, false)

        val textView: TextView = binding.tvName
        starshipsViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StarshipsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}