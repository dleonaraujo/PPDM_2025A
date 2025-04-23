package com.ppdm.app_pedidos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ppdm.app_pedidos.databinding.FragmentSeleccionComidaBinding

class SeleccionComidaFragment : Fragment() {

    private lateinit var binding: FragmentSeleccionComidaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeleccionComidaBinding.inflate(inflater, container, false)

        binding.btnSiguiente.setOnClickListener {
            val selectedId = binding.radioGroupComida.checkedRadioButtonId
            if (selectedId != -1) {
                val selectedComida = binding.root.findViewById<RadioButton>(selectedId).text.toString()
                val bundle = Bundle().apply {
                    putString("comida", selectedComida)
                }
                findNavController().navigate(R.id.action_seleccionComidaFragment_to_seleccionExtrasFragment, bundle)
            }
        }

        return binding.root
    }
}
