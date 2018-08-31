package com.regionaltolima.worldskills.turistapp;

import android.net.Uri;
import android.nfc.cardemulation.HostNfcFService;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.regionaltolima.worldskills.turistapp.Fragments.InicioFragment;
import com.regionaltolima.worldskills.turistapp.Fragments.SitiosFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        InicioFragment.OnFragmentInteractionListener,
        SitiosFragment.OnFragmentInteractionListener {

    InicioFragment fragmentInicio;
    SitiosFragment fragmentSitios;

    MenuItem item_list, item_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentInicio = new InicioFragment();
        fragmentSitios = new SitiosFragment();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                iniciarFragment();
            }
        },100);

    }

    /**
     * Metodo Para Mostrar el Fragment Correspondiente
     */
    private void iniciarFragment() {
        reiniciarContenedor();
        setTitle(setTit());
        verificarView();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            if (S.CONTEXTO == S.INICIO){
               getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragmentInicio).commit();
            }else{
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragmentSitios).commit();
            }
            }
        },100);
    }

    private void verificarView() {
        if (S.is){
            if (S.VIEW == S.LIST){
                item_grid.setVisible(true);
                item_list.setVisible(false);

            }else if(S.VIEW == S.GRID){
                item_grid.setVisible(false);
                item_list.setVisible(true);
            }
        }else {
            item_list.setVisible(false);
            item_grid.setVisible(false);
        }
    }

    /**
     * Metodo que Setea el Tirulo de La APP En el Toolbar
     * @return nombre a setear
     */
    private String setTit() {

        if (S.CONTEXTO == S.CENTROS){
            return "Centros Comerciales";
        }
        if (S.CONTEXTO == S.HOTELES){
            return "Hoteles";
        }
        if (S.CONTEXTO == S.RESTAURANTES){
            return "Restaurantes";
        }
        else {
           return "Inicio";
        }
    }

    private void reiniciarContenedor() {
        getSupportFragmentManager().beginTransaction().remove(fragmentSitios).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        item_list = menu.findItem(R.id.action_list);
        item_grid = menu.findItem(R.id.action_grid);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_list) {
            S.VIEW = S.LIST;
        }if (id == R.id.action_grid) {
            S.VIEW = S.GRID;
        }

        iniciarFragment();
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {
            S.CONTEXTO = S.INICIO;
            S.is = false;
        } else if (id == R.id.nav_cc) {
            S.CONTEXTO = S.CENTROS;
            S.is = true;

        } else if (id == R.id.nav_hoteles) {
            S.CONTEXTO = S.HOTELES;
            S.is = true;

        } else if (id == R.id.nav_restaurantes) {
            S.CONTEXTO = S.RESTAURANTES;
            S.is = true;
        }

        iniciarFragment();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
