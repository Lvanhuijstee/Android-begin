package com.example.multiscreenapps3;

public class schoolClasses {

    String cijfer;
    String klas;

    public schoolClasses(int list_row,String cijfer, String vak) {
        this.cijfer = cijfer;
        this.klas = vak;
    }

    public String getcijfer() {
        return cijfer;
    }

    public String getvak() {
        return klas;
    }

    public void setCijfer(String cijfer) {
        this.cijfer = cijfer;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }
}
