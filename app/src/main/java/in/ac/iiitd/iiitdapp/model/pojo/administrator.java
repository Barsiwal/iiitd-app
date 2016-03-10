package in.ac.iiitd.iiitdapp.model.pojo;

/**
 * Created by deepanshuarora on 09/03/16.
 */
public class administrator {
    public String ImagUrl;
    public String Name;
    public String About;
    public administrator(String imageUrl,String name,String about){
        this.ImagUrl = imageUrl;
        this.Name = name;
        this.About = about;
    }
    public String getImageUrl() {
        return ImagUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImagUrl = imageUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        this.About = about;
    }
}
