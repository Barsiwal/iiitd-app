package in.ac.iiitd.iiitdapp.model;

import java.util.ArrayList;
import java.util.List;

import in.ac.iiitd.iiitdapp.model.pojo.administrator;
import in.ac.iiitd.iiitdapp.model.pojo.instructor;

/**
 * Created by deepanshuarora on 09/03/16.
 */
public class LoadAdminData {
    public List<administrator> data;

    public LoadAdminData() {
        data = new ArrayList<administrator>();
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/faculty/new/prof-dheeraj-sanghi.jpg", "Dheeraj Sanghi", "Visiting Faculty\n" +
                "Dean of Academics & External Relations\n" +
                "dheerajiiitd.ac.in"));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/faculty/new/vishweswaran.jpg", "G.S. Visweswaran", "Visiting Faculty\n" +
                "Dean of Student Affairs\n" +
                "viswesiiitd.ac.in"));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/faculty/new/puspendra.jpg", "Pushpendra Singh", "Associate Professor (CSE)\n" +
                "Associate Dean of IRD\n" +
                "psinghiiitd.ac.in"));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/arun.jpg", "Arun Verma", "General Manager (Facilities)\n" +
                "Service Block\n" +
                "arunviiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/kansal.jpg", "Ashwani Kansal", "Deputy General Manager / Acting Registrar\n" +
                "Room No. A-103, Faculty & Research Building\n" +
                "kansaliiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/kapil.jpg", "Kapil Chawla", "Controller of Finance\n" +
                "Room No. A-102, Faculty & Research Building\n" +
                "kapiliiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/sanjay.jpg", "Sanjay Roy", "General Manager (Projects)\n" +
                "Service Block\n" +
                "sanjayiiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/abhinay.jpg", "Abhinay Saxena", "Manager (IT)\n" +
                "Server Room\n" +
                "abhinayiiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/adarsh.jpg", "Adarsh Kumar Agarwal", "Junior Manager (System Admin & Networking)\n" +
                "Server Room\n" +
                "                       adarshiiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/ajay.jpg", "Ajay Kumar", "Deputy Manager (Store & Purchase)\n" +
                "Service Block\n" +
                "ajayiiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/amit.jpg", "Amit Shankdher", "Deputy Manager (Finance & Accounts)\n" +
                "Room No. A-101\n" +
                "amitiiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/new/ankit-photo.jpg", "Ankit Agarwal", "Web Manager\n" +
                "Server Room\n" +
                "ankitiiitd.ac.in" ));
        data.add(new administrator("https://www.iiitd.ac.in/sites/default/files/images/staff/Anoop%20Singh.JPG", "Anoop Singh", "Deputy Manager\n" +
                "(HR & Support Services)\n" +
                "Room No. A-108\n" +
                "anoopiiitd.ac.in" ));

    }
}

