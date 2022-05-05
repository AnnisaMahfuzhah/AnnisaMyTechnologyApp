package com.example.annisamytechnologyapp.ui.technology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.annisamytechnologyapp.databinding.FragmentTechnologyBinding
import com.example.annisamytechnologyapp.ui.model.TechnologyViewModel

class TechnologyFragment : Fragment() {

    private var _binding: FragmentTechnologyBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    companion object {
        const val handphonelist = "handponelist"
        const val laptoplist = "laptoplist"
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentTechnologyBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}