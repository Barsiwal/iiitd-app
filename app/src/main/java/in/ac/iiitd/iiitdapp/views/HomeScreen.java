package in.ac.iiitd.iiitdapp.views;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Calendar;

import br.com.goncalves.pugnotification.notification.PugNotification;
import in.ac.iiitd.iiitdapp.R;
import in.ac.iiitd.iiitdapp.views.tabbed.About;
import in.ac.iiitd.iiitdapp.views.tabbed.Events;
import in.ac.iiitd.iiitdapp.views.tabbed.People;
import in.ac.iiitd.iiitdapp.views.tabbed.Research;
import mehdi.sakout.fancybuttons.FancyButton;

public class HomeScreen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    FancyButton research, people, events, about;
    private PendingIntent pendingIntent;
    private PendingIntent pendingIntent2;
    private PendingIntent pendingIntent3;
    private PendingIntent pendingIntent4;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        Intent alarmIntent = new Intent(HomeScreen.this, AlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(HomeScreen.this, 0, alarmIntent, 0);
        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        int interval = 1000 * 60 * 20;

        /*START ALARM*/

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY );
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 30);

        /* Repeating on every 1 minutes interval */
        manager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                1000 * 60 * 60*24*7, pendingIntent);







        Intent alarmIntent2 = new Intent(HomeScreen.this, AlarmReceiver2.class);
        pendingIntent2 = PendingIntent.getBroadcast(HomeScreen.this, 0, alarmIntent, 0);
        AlarmManager manager2 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        int interval2 = 1000 * 60 * 20;

        /*START ALARM*/

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
        calendar2.set(Calendar.HOUR_OF_DAY, 14);
        calendar2.set(Calendar.MINUTE, 30);

        /* Repeating on every 1 minutes interval */
        manager2.setRepeating(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(),
                1000 * 60 * 60*24*7, pendingIntent2);





        Intent alarmIntent3 = new Intent(HomeScreen.this, AlarmReceiver3.class);
        pendingIntent3 = PendingIntent.getBroadcast(HomeScreen.this, 0, alarmIntent, 0);
        AlarmManager manager3 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        int interval3 = 1000 * 60 * 20;

        /*START ALARM*/

        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(System.currentTimeMillis());
        calendar3.set(Calendar.HOUR_OF_DAY, 20);
        calendar3.set(Calendar.MINUTE, 53);

        /* Repeating on every 1 minutes interval */
        manager3.setRepeating(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(),
                1000 * 60 * 5, pendingIntent3);





//        Intent alarmIntent4 = new Intent(HomeScreen.this, AlarmReceiver4.class);
//        pendingIntent4 = PendingIntent.getBroadcast(HomeScreen.this, 0, alarmIntent, 0);
//        AlarmManager manager4 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//        int interval4 = 1000 * 60 * 20;
//
//        /*START ALARM*/
//
//        Calendar calendar4 = Calendar.getInstance();
//        calendar4.setTimeInMillis(System.currentTimeMillis());
//        calendar4.set(Calendar.HOUR_OF_DAY, 20);
//        calendar4.set(Calendar.MINUTE, 53);
//
//        /* Repeating on every 1 minutes interval */
//        manager4.setRepeating(AlarmManager.RTC_WAKEUP, calendar4.getTimeInMillis(),
//                1000 * 60 * 60*24*7, pendingIntent4);







        pendingIntent = PendingIntent.getBroadcast(HomeScreen.this, 0, alarmIntent, 0);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(null);
        research = (FancyButton) findViewById(R.id.btn_Research);
        people = (FancyButton) findViewById(R.id.btn_People);
        events = (FancyButton) findViewById(R.id.btn_Events);
        about = (FancyButton) findViewById(R.id.btn_About);
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, Research.class);
                startActivity(i);
            }
        });
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, People.class);
                startActivity(i);
            }
        });
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, Events.class);
                startActivity(i);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, About.class);
                startActivity(i);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
