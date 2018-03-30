package com.example.shashank.wash;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        showHome();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (fragment instanceof HomeFragment){
                if (backPressedTime + 2000 > System.currentTimeMillis())
                {
                    backToast.cancel();
                    super.onBackPressed();
                    return;
                }
                else {
                    showHome();
                    backToast = Toast.makeText(getBaseContext(), "Press back again to Exit", Toast.LENGTH_SHORT);
                    backToast.show();
                }
                backPressedTime  = System.currentTimeMillis();
            }
            else if (fragment instanceof ServicesFragment){
                if (backPressedTime + 1000 > System.currentTimeMillis())
                {
                    backToast.cancel();
                    showHome();
                }
                else {
                    showServices();
                    backToast = Toast.makeText(getBaseContext(), "Press back again to Home", Toast.LENGTH_SHORT);
                    backToast.show();
                }
                backPressedTime  = System.currentTimeMillis();
            }
            else if (fragment instanceof FaqFragment){
                if (backPressedTime + 1000 > System.currentTimeMillis())
                {
                    backToast.cancel();
                    showHome();
                }
                else {
                    showFaq();
                    backToast = Toast.makeText(getBaseContext(), "Press back again to Home", Toast.LENGTH_SHORT);
                    backToast.show();
                }
                backPressedTime  = System.currentTimeMillis();
            }
            else if (fragment instanceof ContactUsFragment){
                if (backPressedTime + 1000 > System.currentTimeMillis())
                {
                    backToast.cancel();
                    showHome();
                }
                else {
                    showContactUs();
                    backToast = Toast.makeText(getBaseContext(), "Press back again to Home", Toast.LENGTH_SHORT);
                    backToast.show();
                }
                backPressedTime  = System.currentTimeMillis();
            }
            else if (fragment instanceof ServiceAreasFragment){
                if (backPressedTime + 1000 > System.currentTimeMillis())
                {
                    backToast.cancel();
                    showHome();
                }
                else {
                    showServiceAreas();
                    backToast = Toast.makeText(getBaseContext(), "Press back again to Home", Toast.LENGTH_SHORT);
                    backToast.show();
                }
                backPressedTime  = System.currentTimeMillis();
            }
            else if (fragment instanceof WalletFragment){
                if (backPressedTime + 1000 > System.currentTimeMillis())
                {
                    backToast.cancel();
                    showHome();
                }
                else {
                    showWallet();
                    backToast = Toast.makeText(getBaseContext(), "Press back again to Home", Toast.LENGTH_SHORT);
                    backToast.show();
                }
                backPressedTime  = System.currentTimeMillis();
            }
            else if (fragment instanceof SettingFragment){
                if (backPressedTime + 1000 > System.currentTimeMillis())
                {
                    backToast.cancel();
                    showHome();
                }
                else {
                    showSetting();
                    backToast = Toast.makeText(getBaseContext(), "Press back again to Home", Toast.LENGTH_SHORT);
                    backToast.show();
                }
                backPressedTime  = System.currentTimeMillis();
            }
            else {
                backToast.cancel();
                showHome();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
    /*    if (id == R.id.action_settings) {
            fragment = new SettingFragment();
        }

        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    */
        return super.onOptionsItemSelected(item);
    }

    private void showHome() {
        fragment = new HomeFragment();
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    }

    private void showServices() {
        fragment = new ServicesFragment();
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    }

    private void showFaq() {
        fragment = new FaqFragment();
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    }

    private void showContactUs() {
        fragment = new ContactUsFragment();
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    }

    private void showServiceAreas() {
        fragment = new ServiceAreasFragment();
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    }

    private void showWallet() {
        fragment = new WalletFragment();
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    }

    private void showSetting() {
        fragment = new SettingFragment();
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }
    }

    Fragment fragment = null;

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

            if (id == R.id.nav_home) {
            fragment = new HomeFragment();
        } else if (id == R.id.nav_services) {
            fragment = new ServicesFragment();
        } else if (id == R.id.nav_faq) {
            fragment = new FaqFragment();
        } else if (id == R.id.nav_contact_us) {
            fragment = new ContactUsFragment();
        } else if (id == R.id.nav_service_areas) {
            fragment = new ServiceAreasFragment();
        } else if (id == R.id.nav_wallet) {
                fragment = new WalletFragment();
        }
        if (fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, fragment, fragment.getTag()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
