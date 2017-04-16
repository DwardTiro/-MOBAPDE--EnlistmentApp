package com.example.owner.minichallenge2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingCartActivity extends AppCompatActivity {

    private Button btnConfirm;
    private Button btnLogout;
    private ListView lvCourseList;
    ArrayList<Course> courseArray;
    Course course;
    ListAdapter courseAdapter;
    Course item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        courseArray = new ArrayList<Course>();
        //Populate array list
        //int courseID, prereqID, capacity;
       // String courseName, courseDescription;
        course = new Course();
        course.setCourseName("MOBAPDE");
        course.setPrereqID(4438);

        courseArray.add(course);
        System.out.println(courseArray.get(0).getCourseName());

        courseAdapter = new ArrayAdapter<Course>(this, android.R.layout.simple_list_item_1, courseArray);
        //Make array adapter
        lvCourseList = (ListView) findViewById(R.id.lvCourseList);
        lvCourseList.toString();
        lvCourseList.setAdapter(courseAdapter);

        lvCourseList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                item = (Course) parent.getAdapter().getItem(position);
                System.out.println(item.getCourseName());
            }
        });
    }

    public void logoutClick(View v){
        startActivity(new Intent(getApplicationContext(), ShoppingCartActivity.class));
        finish();
    }

    public void confirmCick(View v){
        System.out.println("YAY");
    }
    //list down data
}
