package com.example.owner.minichallenge2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class SearchActivity extends AppCompatActivity {
    ListView listView;
    String[] course_ids;
    String[] course_descs;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView = (ListView)findViewById(R.id.courselist);
        course_ids = getResources().getStringArray(R.array.course_name);
        course_descs = getResources().getStringArray(R.array.course_desc);
        int i = 0;
        courseAdapter = new CourseAdapter(getApplicationContext(), R.layout.course_layout);
        listView.setAdapter(courseAdapter);
        for(String ids: course_ids){

            Course course = new Course(ids, course_descs[i]);
            courseAdapter.add(course);
            i++;

        }
    }
}
