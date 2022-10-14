package com.example.a3monthhomework7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.a3monthhomework7.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val data = arrayListOf<UserData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = DataAdapter(data, object : MyOnclickListener {
            override fun onClicked(data: UserData) {
                val fragment = SecondFragment()
                val bundle = Bundle()
                bundle.putSerializable("key", data)
                fragment.arguments = bundle
                replaceFragment(fragment)
            }

        })
        binding.recyclerView.adapter = adapter

    }

    private fun loadData() {
        data.add(
            UserData(
                "Conor", "McGregor", "34",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Diaz", "Nate", "37",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Khabib", "Nurmagomedov", "34",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Porie", "Dastin", "33",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Valentina", "Shevchenko", "34",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Tony", "Ferguson", "39",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Charles", "Oliveira", "32",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Islam", "Mahachev", "31",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )
        data.add(
            UserData(
                "Gaethje", "Justin", "33",
                "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            )
        )

    }


}