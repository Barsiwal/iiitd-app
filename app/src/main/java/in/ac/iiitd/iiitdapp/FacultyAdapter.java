package in.ac.iiitd.iiitdapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by karan barsiwal on 26-01-2016.
 */
public class FacultyAdapter extends RecyclerView.Adapter<FacultyAdapter.FacultyCards> {
    @Override
    public FacultyCards onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(FacultyCards holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class FacultyCards extends RecyclerView.ViewHolder{
        public FacultyCards (View itemView){
            super(itemView);
        }
    }
}
