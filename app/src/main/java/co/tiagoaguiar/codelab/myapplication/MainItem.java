package co.tiagoaguiar.codelab.myapplication;

public class MainItem {

    private int id;
    private int drawableId;
    private int textStringId;
    private int color;


    public MainItem(int id, int drawable,int textStringId,  int color) {
        this.id = id;
        this.drawableId = drawableId;
        this.textStringId = textStringId;
        this.color = color;
    }


    public void setColor(int color) {

        this.color = color;
    }

    public void setDrawableId(int color) {
        this.drawableId = drawableId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }

    public int getTextStringId() {
        return textStringId;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return color;
    }

    public int getDrawableId() {
        return drawableId;
    }
}
