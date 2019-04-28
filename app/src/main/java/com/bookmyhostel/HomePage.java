package com.bookmyhostel;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class HomePage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Toolbar toolbar;
    private MaterialSearchView materialSearchView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView)findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.open_dawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Hostel_fragment()).commit();
            navigationView.setCheckedItem(R.id.hostel_id);
        }




        navigationView.setNavigationItemSelectedListener(this);
        materialSearchView = (MaterialSearchView)findViewById(R.id.search_view);

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search_id);
        materialSearchView.setMenuItem(menuItem);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.profile_id){
            Toast.makeText(this, "Profile Is selected", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.about_id){
            Toast.makeText(this, "about Is Selected", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.contact_id){
            Toast.makeText(this, "Contact Is Selected", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.logout_id){
            Toast.makeText(this, "Log-out Is Seleted", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.search_id){
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id){
            case R.id.profile_id1:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Profile_fragment()).commit();
                break;
            case R.id.hostel_id:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Hostel_fragment()).commit();
                break;
            case R.id.bookmark_id:
                Toast.makeText(this, "bookmark", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chanegPassword_id:
                Toast.makeText(this, "Change Password", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contactUs_Id:
                Toast.makeText(this, "Contact Us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aboutUs_id:
                Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout1_id:
                Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
