package in.ac.iiitd.iiitdapp.model.pojo;
public class instructor {
    public String ImageUrl;
    public String name;
    public String about;
    public instructor(String imageUrl,String name,String about){
        this.ImageUrl = imageUrl;
        this.name = name;
        this.about = about;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
