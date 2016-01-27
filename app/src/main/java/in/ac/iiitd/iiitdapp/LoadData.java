package in.ac.iiitd.iiitdapp;

import java.util.ArrayList;
import java.util.List;

import in.ac.iiitd.iiitdapp.pojo.instructor;

/**
 * Created by karan barsiwal on 27-01-2016.
 */
public class LoadData {
    public List<instructor> data;
    public LoadData(){
        data  = new ArrayList<instructor>();
        data.add(new instructor("https://www.iiitd.ac.in/sites/default/files/images/faculty/new/alex.jpg","Alexander Fell","Assistant Professor (ECE) alex@iiitd.ac.in  PhD (2012), Indian Institute of Science, Bangalore, India"));

    }
}
