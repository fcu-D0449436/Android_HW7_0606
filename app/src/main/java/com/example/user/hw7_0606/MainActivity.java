package com.example.user.hw7_0606;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getHotelFromFirebase();
    }

    private void getHotelFromFirebase(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference nyRef = database.getReference("");
        nyRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()){
                    DataSnapshot dsSName = ds.child("Name");
                    DataSnapshot dsAKind = ds.child("Add");

                    String hotelName = (String)dsSName.getValue();
                    String kind = (String)dsAKind.getValue();
                    Log.v("AdoptHotel",hotelName + ";" + kind);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.v("AdoptHotel",databaseError.getMessage());
            }
        });
    }

}
