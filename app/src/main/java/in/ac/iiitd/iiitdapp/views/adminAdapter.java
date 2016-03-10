package in.ac.iiitd.iiitdapp.views;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import in.ac.iiitd.iiitdapp.R;
import in.ac.iiitd.iiitdapp.model.LoadAdminData;
import in.ac.iiitd.iiitdapp.model.LoadData;

/**
 * Created by karan barsiwal on 09-03-2016.
 */
public class AdminAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    LoadAdminData loadData =new LoadAdminData();
    private LayoutInflater inflater;
    public AdminAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.faculty_cardview,parent,false);
        RecyclerView.ViewHolder fc = new AdminCards(v);
        return fc;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((AdminCards)holder).image.setImageURI(Uri.parse(loadData.data.get(position).getImageUrl()));
        ((AdminCards)holder).name.setText(loadData.data.get(position).getName());
        ((AdminCards)holder).about.setText(loadData.data.get(position).getAbout());

    }

    @Override
    public int getItemCount() {
        return loadData.data.size();
    }
    public static class AdminCards extends RecyclerView.ViewHolder{
        TextView name,about;
        SimpleDraweeView image;
        public AdminCards (View v){
            super(v);
            name = (TextView) v.findViewById(R.id.name);
            about = (TextView) v.findViewById(R.id.about);
            image = (SimpleDraweeView) v.findViewById(R.id.cardimg);
        }
    }
}
