package com.example.park;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ProfileDetails extends AppCompatActivity {


   // private String[] mNavigationDrawerItemTitles;
    //private DrawerLayout mDrawerLayout;
     //private ListView mDrawerList;

    Button profile, parkingspace, parkingstatus, notifications, logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);



        profile = (Button) findViewById(R.id.profile);
        parkingspace = (Button) findViewById(R.id.parkingspace);
        parkingstatus = (Button) findViewById(R.id.parkingstatus);
        notifications = (Button) findViewById(R.id.notifications);
        logout = (Button) findViewById(R.id.logout);

        profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProfileDetails.this, Profile.class);
                startActivity(intent);
            }
        });

        parkingspace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProfileDetails.this, ViewParkingSpace.class);
                startActivity(intent);
            }
        });

        parkingstatus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProfileDetails.this, ParkingStatus.class);
                startActivity(intent);
            }
        });



        notifications.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProfileDetails.this, Notifications.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProfileDetails.this, Menu.class);
                startActivity(intent);
            }
        });
        // mNavigationDrawerItemTitles= getResources().getStringArray(R.array.navigation_drawer_items_array);
      //  mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
       // mDrawerList = (ListView) findViewById(R.id.left_drawer);

      //  objectdrawer.ObjectDrawerItem[] drawerItem = new objectdrawer.ObjectDrawerItem[3];

     //   drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_action_copy, "Create");
       // drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_action_refresh, "Read");
        //drawerItem[2] = new ObjectDrawerItem(R.drawable.ic_action_share, "Help");



    }
}
