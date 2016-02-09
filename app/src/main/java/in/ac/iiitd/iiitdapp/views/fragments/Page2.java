package in.ac.iiitd.iiitdapp.views.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.ac.iiitd.iiitdapp.R;

public class Page2 extends Fragment {


    public Page2() {
        // Required empty public constructor
    }

    public static Page2 newInstance() {
        Page2 fragment = new Page2();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_page2, container, false);
        return layout;
    }
}
