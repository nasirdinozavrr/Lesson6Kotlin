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
        data.add(Music("Feel It Still", "Portugal. The Man", "3:22"))
        data.add(Music("Summer Wine", "Nancy Sinatra", "5:36"))
        data.add(Music("Love Street", "The Doors", "4:51"))
        data.add(Music("Dancing Queen", "ABBA", "3:41"))
        data.add(Music("Looking for the Summer", "Chris Rea", "3:29"))
        data.add(Music("Return To Innocence", "Chris Rea", "5:20"))
        data.add(Music("Sweet Green Fields", "The Doors", "3:50"))
        data.add(Music("High Hopes", "David Gilmour", "3:40"))
        data.add(Music("Billie Jean", "Michael Jackson", "3:04"))
        data.add(Music("Chinawoman", "Russian Ballerina", "2:50"))

    }

}