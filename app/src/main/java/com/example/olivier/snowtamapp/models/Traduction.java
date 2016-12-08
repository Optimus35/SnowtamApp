package com.example.olivier.snowtamapp.models;


import java.util.ArrayList;

/**
 * Created by Olivier on 01/12/2016.
 */
public class Traduction {



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

    int intmorceau2;

    String tabmorceausnow[] = null;
    String stringmorceaucoupesnow;
    ArrayList arrayListmorceausnow = new ArrayList();



    public void TradAll(String stringdata)
    {
        tabmorceausnow = stringdata.split(" ");

        for (int u = 0; u < tabmorceausnow.length; u++) {

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

                    String resultB = TradB(tabmorceausnow[(tabmorceausnow.length - 1)]);
                    tabmorceausnow[u+1]=resultB;

                    arrayListmorceausnow.add(tabmorceausnow[u+1]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradB = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "C)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    String resultC = TradC(tabmorceausnow[(tabmorceausnow.length - 1)]);
                    tabmorceausnow[(u+1)]=resultC;

                    arrayListmorceausnow.add(tabmorceausnow[(u+1)]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradC = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "F)":
                    arrayListmorceausnow.add(tabmorceausnow[0]);
                    for(int y = u; y < (tabmorceausnow.length); y++ )
                    {
                        String resultF = TradF(tabmorceausnow[y]);
                        tabmorceausnow[y] = resultF;
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradF = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "G)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);
                    arrayListmorceausnow.add("MEAN DEPTH ");
                    for(int y = u+1; y < tabmorceausnow.length; y++ )
                    {
                        String resultG = TradG(tabmorceausnow[y]);
                        tabmorceausnow[y] = resultG;
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradG = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "H)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);
                    for(int y = u; y < tabmorceausnow.length; y++ )
                    {
                        String resultH = TradH(tabmorceausnow[y]);
                        tabmorceausnow[y] = resultH;
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradH = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "N)":

                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    for(int y = u+1; y < ((tabmorceausnow.length)-1); y++ )
                    {
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }

                    String resultN = TradF(tabmorceausnow[((tabmorceausnow.length)-1)]);
                    tabmorceausnow[((tabmorceausnow.length)-1)] = resultN;

                    arrayListmorceausnow.add(tabmorceausnow[((tabmorceausnow.length)-1)]);

                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradN = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;


                case "R)":
                    arrayListmorceausnow.add(tabmorceausnow[u]);

                    for(int y = u+1; y < ((tabmorceausnow.length)-1); y++ )
                    {
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }

                    String resultR = TradF(tabmorceausnow[((tabmorceausnow.length)-1)]);
                    tabmorceausnow[((tabmorceausnow.length)-1)] = resultR;
                    arrayListmorceausnow.add(tabmorceausnow[((tabmorceausnow.length)-1)]);

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
                    arrayListmorceausnow.add(tabmorceausnow[u]);
                    for(int y = u; y < tabmorceausnow.length; y++ )
                    {
                        String resultT = TradT(tabmorceausnow[y]);
                        tabmorceausnow[y] = resultT;
                        arrayListmorceausnow.add(tabmorceausnow[y]);
                    }
                    stringmorceaucoupesnow = arrayListmorceausnow.toString().replace("[", "").replace("]", "").replace(",", " ");

                    tradT = stringmorceaucoupesnow;
                    arrayListmorceausnow.clear();
                    break;

            }
        }
    }


    private String TradB(String stringdata)
    {
        String resultdecod = "";

        String decouptempsjours=stringdata.substring(0,2);
        String decouptempsmois=stringdata.substring(2,4);
        String decouptempsheure=stringdata.substring(4,6);
        String decouptempsminute=stringdata.substring(6);

        String decouptempsmoistrad = TradMois(decouptempsmois);

        resultdecod = decouptempsjours+ " " +decouptempsmoistrad+ " " +decouptempsheure+ "h" +decouptempsminute+"UTC";

        return resultdecod;
    }


    private String TradC(String stringdata)
    {
        String resultdecod;

        try{
            intmorceau2 = Integer.parseInt(stringdata);
        }catch (NumberFormatException e){
        }

        if ( intmorceau2 == 88)
        {
            resultdecod = "ALL RUNWAYS";
        }
        else
        {
            if ( intmorceau2 <= 50)
            {
                resultdecod ="RUNWAY "+intmorceau2+"L";
            }
            else {
                resultdecod ="RUNWAY "+intmorceau2+"R";
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



    private String TradG(String stringdata)
    {
        String resultdecod="";

        if (stringdata.equals(""))
        {
            resultdecod = stringdata;
        }
        else
        {
            if (stringdata.equals("/"))
            {
                resultdecod = stringdata;
            }
            else {
                if (stringdata.equals("XX"))
                {
                    resultdecod = "NON SIGNIFICATIVE";
                }
                else {
                    resultdecod = stringdata+"mm";
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

            default:
                resultdecod = stringdata;
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
        if (resultdecod.equals(""))
        {
            resultdecod = stringdata;
        }

        return resultdecod;
    }


    ////////// Get Set

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

