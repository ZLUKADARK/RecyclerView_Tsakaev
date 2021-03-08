package com.example.recyclerview_tsakaev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int images[] = {R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,R.drawable.profile2,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.resview);

        s1 = getResources().getStringArray(R.array.students);
        s2 = getResources().getStringArray(R.array.group);
        s3 = getResources().getStringArray(R.array.uneversity);

        ViewAdapter viewAdapter = new ViewAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(viewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}