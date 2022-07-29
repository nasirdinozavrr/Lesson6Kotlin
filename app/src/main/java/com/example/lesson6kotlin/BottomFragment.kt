package com.example.lesson6kotlin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson6kotlin.databinding.FragmentBottomBinding



class BottomFragment : Fragment() {
    private lateinit var binding: FragmentBottomBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBottomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = ArrayList<Music>()
        addData(data)
        val adapter = MusicAdapter(data = data){
            val intent = Intent(requireContext(), SecondActivity::class.java)
            intent.putExtra("key1", data[it].title)
            startActivity(intent)
        }
        binding.recycler.adapter = adapter
    }

    private fun addData(data: ArrayList<Music>){

    }

}