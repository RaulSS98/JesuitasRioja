package com.example.jesuitasrioja.ui.enlaces

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.jesuitasrioja.databinding.FragmentEnlacesBinding

class EnlacesFragment : Fragment() {


    private var _binding: FragmentEnlacesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentEnlacesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val jesuitas: ImageView=binding.imageView3
        jesuitas.setOnClickListener(){
            var Jesuen: Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jesuitasrioja.org/"))
            startActivity(Jesuen)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}