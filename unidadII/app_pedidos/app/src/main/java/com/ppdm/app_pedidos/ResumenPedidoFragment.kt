package com.ppdm.app_pedidos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.ppdm.app_pedidos.databinding.FragmentResumenPedidoBinding


class ResumenPedidoFragment : Fragment() {

    private lateinit var binding: FragmentResumenPedidoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResumenPedidoBinding.inflate(inflater, container, false)

        val comida = arguments?.getString("comida") ?: "No seleccionado"
        val extras = arguments?.getString("extras") ?: "Sin extras"

        binding.txtResumen.text = "Comida: $comida\nExtras: $extras"

        binding.btnConfirmar.setOnClickListener {
            Toast.makeText(requireContext(), "Pedido confirmado", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.inicioFragment)
        }

        binding.btnEditar.setOnClickListener {
            val result = bundleOf("comida" to comida, "extras" to extras)
            setFragmentResult("editarPedido", result)
            findNavController().popBackStack(R.id.seleccionComidaFragment, false)
        }

        return binding.root
    }
}
