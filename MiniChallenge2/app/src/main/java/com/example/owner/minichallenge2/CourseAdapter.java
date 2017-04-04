package com.example.owner.minichallenge2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sai on 4/5/2017.
 */

public class CourseAdapter extends ArrayAdapter {
    List list = new ArrayList();
    public CourseAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler{
        TextView course_id;
        TextView course_desc;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        DataHandler handler;

        row = convertView;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.course_layout, parent, false);
            handler = new DataHandler();
            handler.course_desc = (TextView)row.findViewById(R.id.courseDesc);
            handler.course_id = (TextView)row.findViewById(R.id.courseID);
            row.setTag(handler);
        }
        else{
            handler = (DataHandler)row.getTag();

        }

        Course course;

        course = (Course)this.getItem(position);

        handler.course_desc.setText(course.getCourseDescription());
        handler.course_id.setText(course.getCourseName());

        return row;
    }
}
