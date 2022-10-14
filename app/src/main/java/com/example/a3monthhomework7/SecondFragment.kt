package com.example.a3monthhomework7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.a3monthhomework7.databinding.FragmentSecondBinding
import com.squareup.picasso.Picasso


class SecondFragment : Fragment() {
private lateinit var binding:FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = this.arguments
        val inputData = args?.getSerializable("key") as UserData
        binding.tvSurname2.text = inputData.surName
        binding.tvAge2.text=inputData.age
        binding.tvName2.text = inputData.name
        Picasso.get().load(inputData.image).into(binding.ivProfile)
    }
}
