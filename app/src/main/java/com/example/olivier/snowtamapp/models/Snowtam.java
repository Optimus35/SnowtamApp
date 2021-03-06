package com.example.olivier.snowtamapp.models;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Olivier on 24/11/2016.
 */
public class Snowtam {

    private String A;
    private String B;
    private String C;
    private String F;
    private String G;
    private String H;
    private String N;
    private String R;
    private String S;
    private  String T;
    private LatLng latLng;

    String tabmorceau[] = null;
    String stringmorceaucoupe;
    ArrayList arrayListmorceau = new ArrayList();


    public Snowtam(String rawSnowtam,double lng,double lat ) {
        setSnowtamDataSnowtam(rawSnowtam);
        setLatLng(lng,lat);
    }

    private void setSnowtamDataSnowtam(String stringdata) {

        tabmorceau = stringdata.split(" ");

        for (int u = 0; u < tabmorceau.length; u++) {

      /*  if (tabmorceau[u].equals(")")) {
            break;
        }
    */
            if (tabmorceau[u].equals(")")) {
                break;
            }
            switch (tabmorceau[u]) {
                case "A)":
                    for (int y = u; y < tabmorceau.length; y++) {
                        if (tabmorceau[y].equals("B)")) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");
                    A = stringmorceaucoupe;
                    arrayListmorceau.clear();
                    break;


                case "B)":
                    for (int y = u; y < tabmorceau.length; y++) {
                        if (tabmorceau[y].equals("C)")) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");

                    B = stringmorceaucoupe;
                    arrayListmorceau.clear();
                    break;


                case "C)":
                    for (int y = u; y < tabmorceau.length; y++) {
                        if (tabmorceau[y].equals("F)")) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");

                    C = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;

                case "F)":
                    for (int y = u; y < tabmorceau.length; y++) {
                        if (tabmorceau[y].equals("G)")) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");

                    F = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;


                case "G)":

                    for (int y = u; y < tabmorceau.length; y++) {
                        if (tabmorceau[y].equals("H)")) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");

                    G = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;


                case "H)":
                    for (int y = u; y < tabmorceau.length; y++) {
                        if (tabmorceau[y].equals("N)")) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");

                    H = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;


                case "N)":

                    for (int y = u; y < tabmorceau.length; y++) {
                        if (tabmorceau[y].equals("R)")) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");

                    N = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;

                case "R)":

                    for (int y = u; y < tabmorceau.length; y++) {
                        if ((tabmorceau[y].equals("T)")) || (tabmorceau[y].equals("S)"))) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");
                    R = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;


                case "S)":
                    for (int y = u; y < tabmorceau.length; y++) {
                        if ((tabmorceau[y].equals("T)"))) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");

                    S = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;


                case "T)":

                    for (int y = u; y < tabmorceau.length; y++) {
                        if ((tabmorceau[y].equals(""))) {
                            break;
                        }
                        arrayListmorceau.add(tabmorceau[y]);
                    }
                    stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");
                    T = (stringmorceaucoupe);
                    arrayListmorceau.clear();
                    break;
            }

        }

    }

    public String getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public String getC() {
        return C;
    }

    public String getF() {
        return F;
    }

    public String getG() {
        return G;
    }

    public String getH() {
        return H;
    }

    public String getN() {
        return N;
    }

    public String getR() {
        return R;
    }

    public String getS() {
        return S;
    }

    public String getT() {
        return T;
    }


    public LatLng getLatLng() {
        return latLng;
    }

    private void setLatLng(double lng, double lat) {
        this.latLng = new LatLng(lat,lng);
    }
}
