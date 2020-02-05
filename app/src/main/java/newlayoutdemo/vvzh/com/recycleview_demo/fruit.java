package newlayoutdemo.vvzh.com.recycleview_demo;

public class Fruit {
    private String fruit_name;
    private int imgId;

    public Fruit(String fruit_name, int imgId) {
        this.fruit_name = fruit_name;
        this.imgId = imgId;
    }

    public String getFruit_name() {
        return fruit_name;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
