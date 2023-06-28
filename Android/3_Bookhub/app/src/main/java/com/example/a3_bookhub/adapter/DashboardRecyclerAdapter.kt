package com.example.a3_bookhub.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import com.example.a3_bookhub.R
import model.Book

class DashboardRecyclerAdapter(private val context: Context, private val itemList: ArrayList<Book>): RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>() {
    class DashboardViewHolder(view:View): RecyclerView.ViewHolder(view) {
        val txtBookName: TextView = view.findViewById(R.id.txtRecyclerRowTitle)
        val txtRecyclerRowAuthor: TextView = view.findViewById(R.id.txtRecyclerRowAuthor)
        val txtRecyclerRowPrice: TextView = view.findViewById(R.id.txtRecyclerRowPrice)
        val txtRecyclerRowRating: TextView = view.findViewById(R.id.txtRecyclerRowRating)
        val imgRecyclerRowIcon: ImageView = view.findViewById(R.id.imgRecyclerRowIcon)
        val relativeLayoutContent: RelativeLayout = view.findViewById(R.id.relativeLayoutContent)
    }

    // What to do when creating the view?
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DashboardViewHolder {
        val view = LayoutInflater.from(this.context).inflate(
            R.layout.recycler_dashboard_single_row,
            context,
            false)

        return DashboardViewHolder(view)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        // p1 = Position of the list item
        val book = itemList[position]
        // Put the text in the textView element of the list.
        holder.txtBookName.text = book.bookName
        holder.txtRecyclerRowAuthor.text = book.bookAuthor
        holder.txtRecyclerRowPrice.text = book.bookCost
        holder.txtRecyclerRowRating.text = book.bookRating
        holder.imgRecyclerRowIcon.setImageResource(book.bookImage)

        // Adding click listener to the view
        holder.relativeLayoutContent.setOnClickListener {
            Toast.makeText(
                context,
                "Clicked on ${holder.txtBookName.text}",
                Toast.LENGTH_SHORT
            ).show()
        }

    }

    // Get the total number of items
    override fun getItemCount(): Int {
        return itemList.size
    }
}