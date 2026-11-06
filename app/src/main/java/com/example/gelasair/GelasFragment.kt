
package com.example.gelasair

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gelasair.databinding.FragmentGelasBinding

class GelasFragment : Fragment() {

    private var _binding: FragmentGelasBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: GelasViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        Log.d("GelasFragment", "onCreateView dipanggil")

        _binding = FragmentGelasBinding.inflate(
            inflater, container, false
        )

        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("GelasFragment", "onViewCreated dipanggil")

        viewModel = ViewModelProvider(requireActivity())
            .get(GelasViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("GelasFragment", "onDestroyView dipanggil")

        _binding = null
    }
}
