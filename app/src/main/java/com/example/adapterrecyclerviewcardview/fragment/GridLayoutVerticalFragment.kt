package com.example.adapterrecyclerviewcardview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapterrecyclerviewcardview.R
import com.example.adapterrecyclerviewcardview.adapter.CatAdapter
import com.example.adapterrecyclerviewcardview.model.Cat


class GridLayoutVerticalFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var catAdapter: CatAdapter
    lateinit var buttonToAdd: Button
    lateinit var buttonRemove: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grid_layout_vertical, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaCat = mutableListOf(Cat("Cat", getString(R.string.message_cat)))

        recyclerView = view.findViewById(R.id.recyclerView)
        buttonRemove = view.findViewById(R.id.buttonRemove)
        buttonToAdd = view.findViewById(R.id.buttonToAdd)
        catAdapter = CatAdapter()
        catAdapter.attList(listaCat)
        recyclerView.adapter = catAdapter
        recyclerView.layoutManager = GridLayoutManager(context, 2, RecyclerView.VERTICAL,false)

        buttonToAdd.setOnClickListener {
            catAdapter.toAdd()
        }
        buttonRemove.setOnClickListener {
            catAdapter.remove()
        }

    }
}