package in.ac.iiitd.iiitdapp.views.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.ac.iiitd.iiitdapp.R;
import in.ac.iiitd.iiitdapp.views.FacultyAdapter;

public class Faculty extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;


    public Faculty() {
        // Required empty public constructor
    }
    public static Faculty newInstance() {
        Faculty fragment = new Faculty();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faculty, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mLayoutmanager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutmanager);
        mAdapter = new FacultyAdapter(this.getContext());
        recyclerView.setAdapter(mAdapter);
        return view;
    }
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
