package in.ac.iiitd.iiitdapp.views.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.ac.iiitd.iiitdapp.R;

public class Page1 extends Fragment {
    public Page1() {
        // Required empty public constructor
    }
    public static Page1 newInstance() {
        Page1 fragment = new Page1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_page1, container, false);
        return layout;
    }
}
