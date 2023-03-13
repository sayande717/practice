package com.example.a3_bookhub.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.a3_bookhub.R
import kotlinx.coroutines.NonDisposableHandle.parent

class DashboardRecyclerAdapter(val context: Context, val itemList: ArrayList<String>): RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>() {
    class DashboardViewHolder(view:View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.txtItemTitle)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DashboardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_dashboard_single_row,parent,false)
        return DashboardViewHolder(view)
    }

    override fun onBindViewHolder(p0: DashboardViewHolder, p1: Int) {
        // p1 = Position of the list item
        val text = itemList[p1]
        p0.textView.text = text
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}