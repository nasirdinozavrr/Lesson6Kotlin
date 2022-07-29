package com.example.lesson6kotlin

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson6kotlin.databinding.ItemMusicBinding

class MusicAdapter(private val data: ArrayList<Music>, private val onClick: (pos: Int) -> Unit):
                   RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = data.size

    private fun getMusic(position: Int): Music = data[position]

    inner class MusicViewHolder(private val binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind() {
            binding.title.text = getMusic(adapterPosition).title
            binding.artist.text = getMusic(adapterPosition).artist
            binding.tvText.text = (adapterPosition + 1).toString()
            binding.tvTiming.text = getMusic(adapterPosition).timing.toString()

            binding.root.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }
}