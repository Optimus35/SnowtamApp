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
    String S;
    String T;

    String tradA;
    String tradB;
    String tradC;
    String tradF;
    String tradG;
    String tradH;
    String tradN;
    String tradR;
    String tradS;
    String tradT;

    String [] tabsplitslash = null;

    String tabmorceau[] = null;
    String stringmorceaucoupe;
    ArrayList arrayListmorceau = new ArrayList();


    String tabmorceausnow[] = null;
    String stringmorceaucoupesnow;
    ArrayList arrayListmorceausnow = new ArrayList();


////////////// Decoupage

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
                T =(stringmorceaucoupe);
                arrayListmorceau.clear();
                break;
        }

    }

}



///////// Decodage

    public void TradAll(String stringdata)
    {
        tabmorceausnow = stringdata.split(" ");


        int u =0;

            switch (tabmorceausnow[u]) {

                case "A)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);
                    arrayListmorceausnow.add(tabmorceausnow[u+1]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradA = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "B)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    String resultB = TradB(tabmorceausnow[u+1]);
                    tabmorceausnow[u+1]=resultB;

                    arrayListmorceausnow.add(tabmorceausnow[u+1]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradB = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "C)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    String resultC = TradC(tabmorceausnow[u+1]);
                    tabmorceausnow[u+1]=resultC;

                    arrayListmorceausnow.add(tabmorceausnow[u+1]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradC = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "F)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    tabsplitslash = tabmorceausnow[(u + 1)].split("/");

                    for(int y = u; y <= (tabsplitslash.length - 1); y++ )
                    {
                        String resultF = TradF(tabsplitslash[y]);
                        tabsplitslash[y] = resultF;
                        arrayListmorceausnow.add(tabsplitslash[y]);
                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradF = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "G)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    tabsplitslash = tabmorceausnow[u+1].split("/");

                    for(int y = u; y <= (tabsplitslash.length - 1); y++ )
                    {
                        String resultG = TradG(tabsplitslash[y],y);
                        tabsplitslash[y] = resultG;
                        arrayListmorceausnow.add(tabsplitslash[y]);
                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradG = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "H)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    tabsplitslash = tabmorceausnow[u+1].split("/");

                    for(int y = u; y <= (tabsplitslash.length - 1); y++ )
                    {
                        String resultH = TradH(tabsplitslash[y]);
                        tabsplitslash[y] = resultH;
                        arrayListmorceausnow.add(tabsplitslash[y]);
                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradH = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "N)":


                    for(int y = u; y < (tabmorceausnow.length - 1); y++ )
                    {
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }

                    tabsplitslash = tabmorceausnow[tabmorceausnow.length].split("/");

                    for(int y = u; y < (tabsplitslash.length - 1); y++ )
                    {
                        arrayListmorceausnow.add(tabsplitslash[y]);
                    }

                    String resultN = TradF(tabsplitslash[(tabsplitslash.length - 1)]);
                    tabsplitslash[(tabsplitslash.length - 1)] = resultN;

                    arrayListmorceausnow.add(tabsplitslash[(tabsplitslash.length - 1)]);


                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradN = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "R)":

                    for(int y = u; y < (tabmorceausnow.length - 1); y++ )
                    {
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }

                    tabsplitslash = tabmorceausnow[tabmorceausnow.length].split("/");

                    for(int y = u; y < (tabsplitslash.length - 1); y++ )
                    {
                        arrayListmorceausnow.add(tabsplitslash[y]);
                    }

                    String resultR = TradF(tabsplitslash[(tabsplitslash.length - 1)]);
                    tabsplitslash[(tabsplitslash.length - 1)] = resultR;
                    arrayListmorceausnow.add(tabsplitslash[(tabsplitslash.length - 1)]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradR = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "S)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    String resultS = TradS(tabmorceausnow[u + 1]);
                    tabmorceausnow[u+1]=resultS;

                    arrayListmorceausnow.add(tabmorceausnow[u+1]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradS = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "T)":

                    for(int y = u; y <= (tabmorceausnow.length -1); y++ )
                    {
                        tabsplitslash = tabmorceausnow[y].split("/");

                        if (tabsplitslash.length == 1)
                        {
                            arrayListmorceausnow.add(tabmorceausnow[y]);
                        }
                        else
                        {
                            for (int x=0; x<= (tabsplitslash.length -1); x++)
                            {
                                String resultT = TradT(tabsplitslash[y]);
                                tabsplitslash[y] = resultT;
                                arrayListmorceausnow.add(tabsplitslash[y]);
                            }
                        }

                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradT = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;

            }
    }


    private String TradB(String stringdata)
    {
        String decouptempsjours=stringdata.substring(0,2);
        String decouptempsmois=stringdata.substring(2,4);
        String decouptempsheure=stringdata.substring(4,7);
        String decouptempsminute=stringdata.substring(6);

        String decouptempsmoistrad = TradMois(decouptempsmois);

        String resultdecod = "";

        resultdecod = decouptempsjours+ " " +decouptempsmoistrad+ " " +decouptempsheure+ "h" +decouptempsminute+"UTC";

        return resultdecod;
    }


    private String TradC(String stringdata)
    {
        int intmorceau2 = Integer.parseInt(stringdata);
        String resultdecod;

        if ( intmorceau2 == 88)
        {
            resultdecod = "ALL RUNWAYS";
        }
        else
        {
            if ( intmorceau2 <= 50)
            {
                resultdecod ="RUNWAY "+stringdata+"L";
            }
            else {
                resultdecod ="RUNWAY "+stringdata+"R";
            }
        }
        return resultdecod;
    }



    private String TradF(String stringdata)
    {

        String resultdecod="";

        switch (stringdata) {

            case "NIL":
                resultdecod="CLEAR AND DRY";
                break;

            case "0":
                resultdecod="CLEAR AND DRY";
                break;

            case "1":
                resultdecod="DAMP";
                break;

            case "2":
                resultdecod="WET or WATER PATCHES";
                break;

            case "3":
                resultdecod="RIME OR FROST COVERED";
                break;

            case "4":
                resultdecod="DRY SNOW";
                break;

            case "5":
                resultdecod="WET SNOW";
                break;

            case "6":
                resultdecod="SLUSH";
                break;

            case "7":
                resultdecod="ICE";
                break;

            case "8":
                resultdecod="COMPACTED OR ROLLED SNOW";
                break;

            case "9":
                resultdecod="FROZEN RUTS OR RIDGES";
                break;

            case "/":
                resultdecod = stringdata;
                break;

        }
        return resultdecod;
    }



    private String TradG(String stringdata, int p)
    {
        String resultdecod="";

        if (stringdata.equals("XX"))
        {
            resultdecod = "NON SIGNIFICATIVE";
        }
        else
        {
            if (stringdata.equals("/"))
            {
                resultdecod = stringdata;
            }
            else {
                if (p > 1)
                {
                    resultdecod = stringdata+"mm";
                }
                else {
                    resultdecod = "MEAN DEPTH "+stringdata+"mm";
                }

            }
        }

        return resultdecod;
    }



    private String TradH(String stringdata)
    {

        String resultdecod="";

        switch (stringdata) {

            case "1":
                resultdecod="POOR";
                break;

            case "2":
                resultdecod="MEDIUM TO POOR";
                break;

            case "3":
                resultdecod="MEDIUM";
                break;

            case "4":
                resultdecod="MEDIUM TO GOOD";
                break;

            case "5":
                resultdecod="GOOD";
                break;

            case "9":
                resultdecod="NO FIABILITY MESURES";
                break;

            case "/":
                resultdecod = stringdata;
                break;

        }
        return resultdecod;
    }


    private String TradMois(String stringdata)
    {

        String resultdecod="";

        switch (stringdata) {

            case "01":
                resultdecod="JANUARY";
                break;

            case "02":
                resultdecod="FEBRUARY";
                break;

            case "03":
                resultdecod="MARCH";
                break;

            case "04":
                resultdecod="APRIL";
                break;

            case "05":
                resultdecod="MAY";
                break;

            case "06":
                resultdecod="JUNE";
                break;

            case "07":
                resultdecod = "JULY";
                break;

            case "08":
                resultdecod="AUGUST";
                break;

            case "09":
                resultdecod="SEPTEMBER";
                break;

            case "10":
                resultdecod="OCTOBER";
                break;

            case "11":
                resultdecod="NOVEMBER";
                break;

            case "12":
                resultdecod="DECEMBER";
                break;

        }
        return resultdecod;
    }


    private String TradS(String stringdata)
    {
        String decouptempsjours=stringdata.substring(0,2);
        String decouptempsmois=stringdata.substring(2,4);
        String decouptempsheure=stringdata.substring(4,7);
        String decouptempsminute=stringdata.substring(6);

        String decouptempsmoistrad = TradMois(decouptempsmois);

        String resultdecod = "";
        resultdecod = "NEXT OBSERVATION: "+decouptempsjours+ " " +decouptempsmoistrad+ " " +decouptempsheure+ "h" +decouptempsminute+"UTC";

        return resultdecod;
    }


    private String TradT(String stringdata)
    {

        String resultdecod="";

        switch (stringdata) {

            case "10":
                resultdecod="10%";
                break;

            case "25":
                resultdecod="11-25%";
                break;

            case "50":
                resultdecod="26-50%";
                break;

            case "100":
                resultdecod="51-100%";
                break;

            case "PERCENT":
                resultdecod="";
                break;

            case "TWYS":
                resultdecod="TAXIWAYS";
                break;

            case "/":
                resultdecod = stringdata;
                break;

        }
        return resultdecod;
    }




/////////////// Get Set Snowtam

    public String getA() {
        return A;
    }
    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
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

    public String getS() {
        return S;
    }
    public void setS(String S) {
        this.S = S;
    }

    public String getT() {
        return T;
    }
    public void setT(String T) {
        this.T = T;
    }



    ////////// Get Set Decodage

    public String getTradA() {
        return tradA;
    }
    public void setTradA(String tradA) {
        this.tradA = tradA;
    }

    public String getTradB() {
        return tradB;
    }
    public void setTradB(String tradB) {
        this.tradB = tradB;
    }

    public String getTradC() {
        return tradC;
    }
    public void setTradC(String tradC) {
        this.tradC = tradC;
    }

    public String getTradF() {
        return tradF;
    }
    public void setTradF(String tradF) {
        this.tradF = tradF;
    }

    public String getTradG() {
        return tradG;
    }
    public void setTradG(String tradG) {
        this.tradG = tradG;
    }

    public String getTradH() {
        return tradH;
    }
    public void setTradH(String tradH) {
        this.tradH = tradH;
    }

    public String getTradN() {
        return tradN;
    }
    public void setTradN(String tradN) {
        this.tradN = tradN;
    }

    public String getTradR() {
        return tradR;
    }
    public void setTradR(String tradR) {
        this.tradR = tradR;
    }

    public String getTradS() {
        return tradS;
    }
    public void setTradS(String tradS) {
        this.tradS = tradS;
    }

    public String getTradT() {
        return tradT;
    }
    public void setTradT(String tradT) {
        this.tradT = tradT;
    }



}





