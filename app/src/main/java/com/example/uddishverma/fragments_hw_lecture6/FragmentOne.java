package com.example.uddishverma.fragments_hw_lecture6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment{

    public static final String TAG = "FragmentOne";
    
    private DetailsPassedListener dpl;

    public void setDetailsPassedListener(DetailsPassedListener detailsPassedListener)   {
        dpl = detailsPassedListener;
    }

    public static FragmentOne newInstance(int id) {

        Bundle args = new Bundle();
        args.putInt("studentId", id);

        FragmentOne fragment = new FragmentOne();
        fragment.setArguments(args);
        return fragment;
    }


    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: Inside Fragment class");
        if(dpl != null) {
            dpl.detailsPassed();
        }
//         Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }


    public interface DetailsPassedListener    {
        void detailsPassed();
    }

}
