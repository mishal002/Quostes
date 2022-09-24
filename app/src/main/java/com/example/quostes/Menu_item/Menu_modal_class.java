package com.example.quostes.Menu_item;

public class Menu_modal_class
{

    String s ;
    int i;
    int image;

    public Menu_modal_class(int image) {

        this.image = image;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Menu_modal_class(String s, int i) {
        this.s=s;
        this.i=i;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
