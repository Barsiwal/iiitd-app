package in.ac.iiitd.iiitdapp.views.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.ac.iiitd.iiitdapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Research_at_iiitd.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Research_at_iiitd#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Research_at_iiitd extends Fragment {

    private OnFragmentInteractionListener mListener;

    public Research_at_iiitd() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static Research_at_iiitd newInstance() {
        Research_at_iiitd fragment = new Research_at_iiitd();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_research_at_iiitd, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event





    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
