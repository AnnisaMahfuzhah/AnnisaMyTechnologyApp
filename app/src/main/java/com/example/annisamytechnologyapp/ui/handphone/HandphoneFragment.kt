package com.example.annisamytechnologyapp.ui.handphone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.annisamytechnologyapp.databinding.FragmentHandphoneBinding

class HandphoneFragment : Fragment() {

    private var _binding: FragmentHandphoneBinding? = null
    private val binding get() = _binding!!
    private lateinit var hplist : Map<String, String>

    companion object {
        const val nama = "nama"
        const val kapasitas = "kapasitas"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hplist = mapOf(
            nama to arguments?.getString(nama),
            kapasitas to arguments?.get(kapasitas)
        ) as Map<String, String>
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHandphoneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textHandphone.text = hplist[nama]
        binding.textHandphone.text = hplist[kapasitas]
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}