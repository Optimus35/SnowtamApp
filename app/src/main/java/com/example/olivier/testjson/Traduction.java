package com.example.olivier.testjson;

import java.util.ArrayList;

/**
 * Created by Olivier on 01/12/2016.
 */
public class Traduction {


    //Snowtam sn =new Snowtam();

    String tabmorceausnow[] = null;
    String stringmorceaucoupesnow;
    ArrayList arrayListmorceausnow = new ArrayList();



    public void TradAll(String stringdata)
    {
        tabmorceausnow = stringdata.split(" ");

        for (int u = 0; u < tabmorceausnow.length; u++) {

            switch (tabmorceausnow[u]) {

                case "A)":
                    TradA(tabmorceausnow);
                    break;


                case "B)":
                    TradB(tabmorceausnow);
                    break;


                case "C)":
                    String result = TradC(tabmorceausnow);
                    tabmorceausnow[u+1]=result;
                    break;


                case "F)":
                    Tradf(tabmorceausnow);
                    break;


                case "G)":
                    TradG(tabmorceausnow);
                    break;


                case "H)":
                    TradH(tabmorceausnow);
                    break;


                case "N)":
                    TradN(tabmorceausnow);
                    break;


                case "R)":
                    TradR(tabmorceausnow);
                    break;


                case "T)":
                    TradT(tabmorceausnow);
                    break;

            }
        }
    }



    private String TradC(String[] stringdata)
    {
        int intmorceau2 = Integer.parseInt(stringdata[1]);
        String resultdecod;

        if ( intmorceau2 == 88)
        {
            resultdecod = "ALL RUNWAYS";
        }
        else
        {
            if ( intmorceau2 <= 50)
            {
                resultdecod ="RUNWAY "+stringdata[1]+"L";
            }
            else {
                resultdecod ="RUNWAY "+stringdata[1]+"R";
            }
        }
        return resultdecod;
    }



    private String TradF(String[] stringdata)
    {
        int intlenghtmorceausnow = tabmorceausnow.length;
        String resultdecod;

        switch (intlenghtmorceausnow) {

            case 2:

                break;

            case 2:
                
                break;

        }




        if ( intmorceau2 == 88)
        {
            resultdecod = "ALL RUNWAYS";
        }
        else
        {
            if ( intmorceau2 <= 50)
            {
                resultdecod ="RUNWAY "+stringdata[1]+"L";
            }
            else {
                resultdecod ="RUNWAY "+stringdata[1]+"R";
            }
        }
        return resultdecod;
    }




}
