package com.example.starwarstrivia.ui.people

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import com.example.starwarstrivia.R
import com.example.starwarstrivia.databinding.FragmentPeopleBinding

class PeopleFragment : Fragment() {

    private var _binding: FragmentPeopleBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: PeopleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val peopleViewModel =
            ViewModelProvider(this).get(PeopleViewModel::class.java)

        _binding = FragmentPeopleBinding.inflate(inflater, container, false)

        val textView: TextView = binding.tvName
        peopleViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}