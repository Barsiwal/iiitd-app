package in.ac.iiitd.iiitdapp.model;

import java.util.ArrayList;
import java.util.List;

import in.ac.iiitd.iiitdapp.model.pojo.AlarmPojo;

/**
 * Created by karan barsiwal on 16-04-2016.
 */
public class LoadPojo {
    public List<AlarmPojo> data;
    public LoadPojo(){
        data = new ArrayList<AlarmPojo>();
//        data.add(new AlarmPojo("karan",));
    }

}
