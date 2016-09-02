package com.example.uddishverma.fragments_hw_lecture6;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    public static final String TAG = "MainActivity";

    ListView detailsListView;
    ArrayList<StudentDetails.studentDetails> detailsList;
    TextView textName, textSkills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailsList = StudentDetails.getDetails();
        detailsListView = (ListView) findViewById(R.id.list_view);

        DetailsListAdapter listAdapter = new DetailsListAdapter(detailsList);
        detailsListView.setAdapter(listAdapter);

        //implementing the interface
        FragmentOne fragOne = new FragmentOne();
        FragmentOne.DetailsPassedListener detailsPassedListener =
                new FragmentOne.DetailsPassedListener() {
                    @Override
                    public void detailsPassed() {
                        Log.d(TAG, "onItemClick: Inside the interface");
                        detailsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Log.d(TAG, "onItemClick: Inside on click listener");
                                if(position == 0)   {
                                    textName = (TextView) findViewById(R.id.text_name);
                                    textSkills = (TextView) findViewById(R.id.text_skills);
                                    Log.d(TAG, "onItemClick: Setting the text");
                                    textName.setText("UDDISH VERMA");
                                    textSkills.setText("ANDROID DEVELOPER");
                                }
                                if(position == 1)   {
                                    textName = (TextView) findViewById(R.id.text_name);
                                    textSkills = (TextView) findViewById(R.id.text_skills);
                                    Log.d(TAG, "onItemClick: Setting the text");
                                    textName.setText("MOHIT KUMAR");
                                    textSkills.setText("NOOBIE");
                                }
                                if(position == 2)   {
                                    textName = (TextView) findViewById(R.id.text_name);
                                    textSkills = (TextView) findViewById(R.id.text_skills);
                                    Log.d(TAG, "onItemClick: Setting the text");
                                    textName.setText("ARINDAM");
                                    textSkills.setText("FULL STACK DEV");
                                }
                                if(position == 3)   {
                                    textName = (TextView) findViewById(R.id.text_name);
                                    textSkills = (TextView) findViewById(R.id.text_skills);
                                    Log.d(TAG, "onItemClick: Setting the text");
                                    textName.setText("RUSHIL");
                                    textSkills.setText("WEB DEVELOPER");
                                }
                                if(position == 4)   {
                                    textName = (TextView) findViewById(R.id.text_name);
                                    textSkills = (TextView) findViewById(R.id.text_skills);
                                    Log.d(TAG, "onItemClick: Setting the text");
                                    textName.setText("MAYANK");
                                    textSkills.setText("ANDROID DEVELOPER");
                                }
                                if(position == 5)   {
                                    textName = (TextView) findViewById(R.id.text_name);
                                    textSkills = (TextView) findViewById(R.id.text_skills);
                                    Log.d(TAG, "onItemClick: Setting the text");
                                    textName.setText("SHOURYA MALIK");
                                    textSkills.setText("ENDFRAME DEVELOPER");
                                }
                                if(position == 6)   {
                                    textName = (TextView) findViewById(R.id.text_name);
                                    textSkills = (TextView) findViewById(R.id.text_skills);
                                    Log.d(TAG, "onItemClick: Setting the text");
                                    textName.setText("SAMARTH");
                                    textSkills.setText("WEB DEVELOPER");
                                }
                            }
                        });

                    }
                };
        fragOne.setDetailsPassedListener(detailsPassedListener);
        final FragmentManager fragMgr = getSupportFragmentManager();
        FragmentTransaction fragTxn = fragMgr.beginTransaction();
        fragTxn.add(R.id.fragment_container, fragOne, null);
        fragTxn.commit();

    }

    private class DetailsListAdapter extends BaseAdapter {

        class DetailsViewHolder {
            ImageView photo;
            TextView textName;
            TextView textSkills;
        }

        public DetailsListAdapter(ArrayList<StudentDetails.studentDetails> mDetails) {
            this.mDetails = mDetails;
        }

        private ArrayList<StudentDetails.studentDetails> mDetails;

        @Override
        public int getCount() {
            return mDetails.size();
        }

        @Override
        public Object getItem(int position) {
            return mDetails.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
             DetailsViewHolder detailsViewHolder = new DetailsViewHolder();

            if (convertView == null) {
                convertView = li.inflate(R.layout.list_photo_id, null);
                detailsViewHolder.photo = (ImageView) convertView.findViewById(R.id.photo_id);
                detailsViewHolder.textName = (TextView) convertView.findViewById(R.id.text_name);
                detailsViewHolder.textSkills = (TextView) convertView.findViewById(R.id.text_skills);
                convertView.setTag(detailsViewHolder);
            } else {
                detailsViewHolder = (DetailsViewHolder) convertView.getTag();
            }

            StudentDetails.studentDetails thisDetails = (StudentDetails.studentDetails) getItem(position);
            detailsViewHolder.photo.setImageResource(thisDetails.photoId);
            return convertView;
        }


    }
}
