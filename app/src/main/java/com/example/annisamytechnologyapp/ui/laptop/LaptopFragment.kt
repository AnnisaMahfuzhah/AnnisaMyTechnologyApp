package com.example.annisamytechnologyapp.ui.laptop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.annisamytechnologyapp.databinding.FragmentLaptopBinding


class LaptopFragment : Fragment() {

    private var _binding: FragmentLaptopBinding? = null
    private val binding get() = _binding!!
    private lateinit var lplist : Map<String, String>

    companion object {
        const val nama = "nama"
        const val kapasitas = "kapasitas"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lplist = mapOf(
            nama to arguments?.getString(nama),
            kapasitas to arguments?.get(kapasitas)
        ) as Map<String, String>
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLaptopBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textLaptop.text = lplist[nama]
        binding.textLaptop.text = lplist[kapasitas]
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}