package com.tutorial.list_view_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/*
ListView is a ViewGroup which is used to display the list of scrollable of items in multiple rows and the list items are automatically
inserted to the list using an adapter.



Generally, the adapter pulls data from a sources such as an array or database and converts
each item into a result view and that’s placed into the list.

Android Adapter
In android, Adapter will act as an intermediate between the data sources and adapter views such as ListView, Gridview to fill the data into adapter views.
 The adapter will hold the data and iterates through an items in data set and generate the views for each item in the list.

Generally, in android we have a different types of adapters available to fetch the data from different data sources to fill the data into adapter views, those .
ArrayAdapter ->	It will expects an Array or List as input.
CurosrAdapter ->	It will accepts an instance of cursor as an input.
SimpleAdapter ->	It will accepts a static data defined in the resources.
BaseAdapter ->	It is a generic implementation for all three adapter types and it can be used for ListView, Gridview or Spinners based on our requirements
 */
public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] users = { "Vinod", "Vishal", "Nilesh", "Eva", "Dhanraj", "Santosh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.userlist);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        mListView.setAdapter(aAdapter);
    }
}
