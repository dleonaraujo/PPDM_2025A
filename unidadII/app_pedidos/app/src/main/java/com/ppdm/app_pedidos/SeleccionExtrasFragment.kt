package com.ppdm.app_pedidos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ppdm.app_pedidos.databinding.FragmentSeleccionExtrasBinding

class SeleccionExtrasFragment : Fragment() {

    private lateinit var binding: FragmentSeleccionExtrasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeleccionExtrasBinding.inflate(inflater, container, false)

        val comida = arguments?.getString("comida") ?: ""

        binding.btnSiguiente.setOnClickListener {
            val extrasSeleccionados = mutableListOf<String>()
            if (binding.chkBebida.isChecked) extrasSeleccionados.add("Bebida")
            if (binding.chkPapas.isChecked) extrasSeleccionados.add("Papas")
            if (binding.chkPostre.isChecked) extrasSeleccionados.add("Postre")

            val bundle = Bundle().apply {
                putString("comida", comida)
                putString("extras", extrasSeleccionados.joinToString(", "))
            }

            findNavController().navigate(R.id.action_seleccionExtrasFragment_to_resumenPedidoFragment, bundle)
        }

        return binding.root
    }
}
