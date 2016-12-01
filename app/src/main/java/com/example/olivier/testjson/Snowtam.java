package com.example.olivier.testjson;

import java.util.ArrayList;

/**
 * Created by Olivier on 24/11/2016.
 */
public class Snowtam {

    String A;
    String B;
    String C;
    String F;
    String G;
    String H;
    String N;
    String R;
    String T;

    String tabmorceau[] = null;
    String stringmorceaucoupe;
    ArrayList arrayListmorceau = new ArrayList();


    public void Decoupage (String stringdata) {

    tabmorceau = stringdata.split(" ");

    for (int u = 0; u < tabmorceau.length; u++) {

      /*  if (tabmorceau[u].equals(")")) {
            break;
        }
    */

        if (tabmorceau[u].equals("")) {
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

                A = (stringmorceaucoupe);
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

                B = (stringmorceaucoupe);
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
                    if ((tabmorceau[y].equals("T)")) || (tabmorceau[y].equals(")"))) {
                        break;
                    }
                    arrayListmorceau.add(tabmorceau[y]);
                }
                stringmorceaucoupe = arrayListmorceau.toString().replace("[", "").replace("]", "").replace(",", " ");
                R = (stringmorceaucoupe);
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
                T =(stringmorceaucoupe);
                arrayListmorceau.clear();
                break;
        }

    }

}

    public String getA() {
        return A;
    }
    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return C;
    }
    public void setB(String B) {
        this.B = B;
    }

    public String getC() {
        return C;
    }
    public void setC(String C) {
        this.C = C;
    }

    public String getF() {
        return F;
    }
    public void setF(String F) {
        this.F = F;
    }

    public String getG() {
        return G;
    }
    public void setG(String G) {
        this.G = G;
    }

    public String getH() {
        return H;
    }
    public void setH(String H) {
        this.H = H;
    }

    public String getN() {
        return N;
    }
    public void setN(String N) {
        this.N = N;
    }

    public String getR() {
        return R;
    }
    public void setR(String R) {
        this.R = R;
    }

    public String getT() {
        return T;
    }
    public void setT(String T) {
        this.T = T;
    }



}
