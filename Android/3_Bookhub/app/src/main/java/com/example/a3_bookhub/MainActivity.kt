package com.example.a3_bookhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.a3_bookhub.fragment.AboutAppFragment
import com.example.a3_bookhub.fragment.DashboardFragment
import com.example.a3_bookhub.fragment.FavouritesFragment
import com.example.a3_bookhub.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    var previousMenuItem: MenuItem ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frame)
        navigationView = findViewById(R.id.navigationView)
        openDashboard()
        // Add click listeners to the menu items.
        navigationView.setNavigationItemSelectedListener {
            // 'it' -> will give us the currently selected item.

            if(previousMenuItem != null) {
                previousMenuItem?.isChecked = false
            }

            it.isChecked = true
            it.isChecked = true
            previousMenuItem = it
            when(it.itemId) {
                R.id.dashboard -> {
                    openDashboard()
                    drawerLayout.closeDrawers()
                }
                R.id.favourites -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, FavouritesFragment())
                        .addToBackStack("Favourites")
                        .commit()
                    supportActionBar?.title = "Favourites"
                    drawerLayout.closeDrawers()
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, ProfileFragment())
                        .addToBackStack("Profile")
                        .commit()
                    supportActionBar?.title = "Profile"
                    drawerLayout.closeDrawers()
                }
                R.id.aboutApp -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, AboutAppFragment())
                        .addToBackStack("About App")
                        .commit()
                    supportActionBar?.title = "About App"
                    drawerLayout.closeDrawers()
                }
            }

            return@setNavigationItemSelectedListener true
        }

        // The button on the action bar
        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this@MainActivity, // where it will appear
            drawerLayout, // what it will open
            R.string.open_drawer, // Action strings
            R.string.close_drawer
        )
        // Check when the hamburger icon is clicked.
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        // Change the hamburger icon to the back arrow icon, depending on the state of the drawer.
        actionBarDrawerToggle.syncState()

        // Set the action bar to the toolbar we created
        setSupportActionBar(toolbar)
    }

    private fun setSupportActionBar(toolbar: Toolbar) {
        // Set the title as 'Toolbar Title'
        supportActionBar?.title = "Toolbar Title"
        // Enable the home button
        supportActionBar?.setHomeButtonEnabled(true)
    }

    // Add a click listener to the action bar.
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Grab the ID of the item
        val id = item.itemId
        // Check if the ID matches with that of the home button
        if(id == android.R.id.home) {
            // If it does, open the drawer.
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }

    // Custom method for the Dashboard i.e. main fragment.
    private fun openDashboard() {
        val fragment = DashboardFragment()
        val transaction = supportFragmentManager.beginTransaction()
        // Replace the blank frame with the Dashboard Fragment
        transaction.replace(R.id.frame,fragment)
            //Add the fragment to the Back Stack with the name "Dashboard"
            .addToBackStack("Dashboard")
            .commit()
        // Set the title of the Action Bar to "Dashboard"
        supportActionBar?.title = "Dashboard"
        navigationView.setCheckedItem(R.id.dashboard)
    }

    override fun onBackPressed() {
        // Holds the currently displayed fragment
        val fragment = supportFragmentManager.findFragmentById(R.id.frame)
        when(fragment) {
            /* If the user is in any other fragment other than the Dashboard, then,
             * on pressing the back button, he will be redirected to the Dashboard.
             * */
            !is DashboardFragment -> openDashboard()
            // Otherwise, the back button will work as expected.
            else -> super.onBackPressed()
        }
    }
}