package com.example.a3_bookhub.fragment

import android.app.AlertDialog
import android.app.DownloadManager.Request
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.a3_bookhub.R
import com.example.a3_bookhub.adapter.DashboardRecyclerAdapter
import com.example.a3_bookhub.util.ConnectionManager
import model.Book

class DashboardFragment : Fragment() {
    private lateinit var recyclerDashboard: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var recyclerAdapter: DashboardRecyclerAdapter
    private lateinit var btnCheckInternet: Button

    private val bookInfoList = arrayListOf<Book>(
        Book("P.S. I love You", "Cecelia Ahern", "Rs. 299", "4.5", R.drawable.ps_ily),
        Book("The Great Gatsby", "F. Scott Fitzgerald", "Rs. 399", "4.1", R.drawable.great_gatsby),
        Book("Anna Karenina", "Leo Tolstoy", "Rs. 199", "4.3", R.drawable.anna_kare),
        Book("Madame Bovary", "Gustave Flaubert", "Rs. 500", "4.0", R.drawable.madame),
        Book("War and Peace", "Leo Tolstoy", "Rs. 249", "4.8", R.drawable.war_and_peace),
        Book("Lolita", "Vladimir Nabokov", "Rs. 349", "3.9", R.drawable.lolita),
        Book("Middlemarch", "George Eliot", "Rs. 599", "4.2", R.drawable.middlemarch),
        Book("The Adventures of Huckleberry Finn", "Mark Twain", "Rs. 699", "4.5", R.drawable.adventures_finn),
        Book("Moby-Dick", "Herman Melville", "Rs. 499", "4.5", R.drawable.moby_dick),
        Book("The Lord of the Rings", "J.R.R Tolkien", "Rs. 749", "5.0", R.drawable.lord_of_rings)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Layout Manager, for the RecyclerView
        layoutManager = LinearLayoutManager(activity)

        // activity as Context: Typecast the type of 'activity' to 'Context'
        recyclerAdapter = DashboardRecyclerAdapter(activity as Context, bookInfoList)
        recyclerDashboard = view.findViewById(R.id.recyclerDashboard)
        // Initialise the adapter and layout manager
        recyclerDashboard.adapter = recyclerAdapter
        recyclerDashboard.layoutManager = layoutManager
        layoutManager = LinearLayoutManager(activity)

        // Check Internet connectivity in the app.
        btnCheckInternet = view.findViewById(R.id.btnCheckInternet)
        btnCheckInternet.setOnClickListener {
            if(ConnectionManager().checkConnectivity(activity as Context)) {
                // Create an alert dialog
                val dialog = AlertDialog.Builder(activity as Context)
                dialog.setTitle("Success")
                dialog.setMessage("Internet connection found")

                // Button that results in a positive action
                dialog.setPositiveButton("OK") {
                    text, listener ->
                    // Do nothing
                }

                // Button that results in a negative action
                dialog.setNegativeButton("Cancel") {
                        text, listener ->
                    // Do nothing
                }
                dialog.create()
                dialog.show()
            }
            else {
                val dialog = AlertDialog.Builder(activity as Context)
                dialog.setTitle("Error")
                dialog.setMessage("Internet connection not found")
                dialog.setPositiveButton("OK") {
                        text, listener ->
                    // Do nothing
                }

                dialog.setNegativeButton("Cancel") {
                        text, listener ->
                    // Do nothing
                }
                dialog.create()
                dialog.show()
            }
        }

        // inflater.inflater(fragment name, container, attachToRoot = false)
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }
}