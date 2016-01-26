package in.ac.iiitd.iiitdapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.ac.iiitd.iiitdapp.classes.instructor;

/**
 * Created by karan barsiwal on 26-01-2016.
 */
public class FacultyAdapter extends RecyclerView.Adapter<FacultyAdapter.FacultyCards> {
    //private List<instructor> faculties;
    @Override

    public FacultyCards onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.faculty_cardview,parent,false);
        FacultyCards fc = new FacultyCards((CardView) v);
        return fc;
    }

    @Override
    public void onBindViewHolder(FacultyCards holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
    public static class FacultyCards extends RecyclerView.ViewHolder{
        public CardView cardview;
        public FacultyCards (CardView v){
            super(v);
            cardview = v;
        }
    }
}
