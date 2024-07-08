package com.example.adapterrecyclerviewcardview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.adapterrecyclerviewcardview.databinding.ItemRvBinding
import com.example.adapterrecyclerviewcardview.model.Cat

class CatAdapter : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    private var listCat = mutableListOf<Cat>()

    fun attList(lista: MutableList<Cat>) {
        listCat = lista
        notifyDataSetChanged()
    }
    fun toAdd() {
        listCat.add(Cat("New Cat", "snooze mode"))
        notifyItemChanged(listCat.size)
    }
    fun remove(){
        listCat.removeAt(0)
        notifyItemRemoved(0)
    }


    inner class CatViewHolder(val binding: ItemRvBinding) : ViewHolder(binding.root) {
        fun bind(cat: Cat) {
            binding.textName.text = cat.nome
            binding.textMessage.text = cat.mensagem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val binding = ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val cat = listCat[position]
        holder.bind(cat)
    }

    override fun getItemCount(): Int = listCat.size
}