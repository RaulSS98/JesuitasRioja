package com.example.jesuitasrioja.ui.contacto

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
import com.example.jesuitasrioja.databinding.FragmentContactoBinding


class ContactoFragment : Fragment() {


    private var _binding: FragmentContactoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentContactoBinding.inflate(inflater, container, false)
        val root: View = binding.root //hasta aqui okey

      val email: ImageView=binding.imageView5

        email.setOnClickListener(){
            var Email: Intent=Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:csc@jesuitasrioja.org?subject=Peticion de informacion"))
            startActivity(Email)
        }

        var telef: ImageView=binding.imageView7
        telef.setOnClickListener(){
            var Telef: Intent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:941221700"))
            startActivity(Telef)
        }

        var dir: ImageView=binding.imageView9
        dir.setOnClickListener(){
            var Dir: Intent=Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Duques de Najera, 19 26002 Logroño"))
            startActivity(Dir)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}