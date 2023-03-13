package com.example.a3_bookhub.fragment

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a3_bookhub.R
import com.example.a3_bookhub.adapter.DashboardRecyclerAdapter

class DashboardFragment : Fragment() {
    lateinit var recyclerDashboard: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var recyclerAdapter: DashboardRecyclerAdapter
    val bookList = arrayListOf<String>(
        "PS hi",
        "The Great Gatsby",
        "Annao Karenine",
        "Madam Bovary",
        "War and Peace",
        "Lolita",
        "Moby-Dick",
        "The Lord of the Rings"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        layoutManager = LinearLayoutManager(activity)
        // activity as Context: Typecast the type of 'activity' to 'Context'
        recyclerAdapter = DashboardRecyclerAdapter(activity as Context, bookList)
        recyclerDashboard = view.findViewById(R.id.recyclerDashboard)
        recyclerDashboard.adapter = recyclerAdapter
        recyclerDashboard.layoutManager = layoutManager



        // inflater.inflater(fragment name, container, attachToRoot = false)
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }
}