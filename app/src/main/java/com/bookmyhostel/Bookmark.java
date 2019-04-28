package com.bookmyhostel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class Bookmark extends AppCompatActivity {
    Toolbar toolbar;
    private MaterialSearchView materialSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        materialSearchView = (MaterialSearchView)findViewById(R.id.search_view);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search_id);
        materialSearchView.setMenuItem(menuItem);
        return true;
    }
}
