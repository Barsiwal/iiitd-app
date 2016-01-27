package in.ac.iiitd.iiitdapp;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

public class FacultyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    LoadData loadData =new LoadData();
    private LayoutInflater inflater;
    public FacultyAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.faculty_cardview,parent,false);
        RecyclerView.ViewHolder fc = new FacultyCards(v);
        return fc;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((FacultyCards)holder).image.setImageURI(Uri.parse(loadData.data.get(position).getImageUrl()));
        ((FacultyCards)holder).name.setText(loadData.data.get(position).getName());
        ((FacultyCards)holder).about.setText(loadData.data.get(position).getAbout());

    }

    @Override
    public int getItemCount() {
        return loadData.data.size();
    }
    public static class FacultyCards extends RecyclerView.ViewHolder{
        TextView name,about;
        SimpleDraweeView image;
        public FacultyCards (View v){
            super(v);
            name = (TextView) v.findViewById(R.id.name);
            about = (TextView) v.findViewById(R.id.about);
            image = (SimpleDraweeView) v.findViewById(R.id.cardimg);
        }
    }
}
