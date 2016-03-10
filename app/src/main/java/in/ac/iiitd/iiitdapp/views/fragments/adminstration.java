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
import in.ac.iiitd.iiitdapp.views.AdminAdapter;
import in.ac.iiitd.iiitdapp.views.FacultyAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Adminstration.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Adminstration#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Adminstration extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;


    public Adminstration() {
        // Required empty public constructor
    }
    public static Adminstration newInstance() {
        Adminstration fragment = new Adminstration();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adminstration, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view2);
        mLayoutmanager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutmanager);
        mAdapter = new AdminAdapter(this.getContext());
        recyclerView.setAdapter(mAdapter);
        return view;
    }
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
