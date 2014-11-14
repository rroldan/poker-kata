package org.rrh.katas.pokerkata;

import java.util.*;

/**
 * Created by rroldan on 18/10/14.
 */
public class PokerGame {

    private List <String> valorList = new ArrayList <String>();
    private List <String> paloLIst  = new ArrayList <String>();

    public String play(String cartas) {
        trataCartas(cartas);
        if (onePair()){
            return "ONE PAIR";
        }
    return null;

    }

    private void trataCartas(String cartas){
        StringTokenizer st = new StringTokenizer(cartas,":");
        String carta,valor,palo;
        while (st.hasMoreTokens()) {
            carta = st.nextToken();
            valor = carta.substring(0, 1);
            palo =  carta.substring(2, 3);
            valorList.add(valor);
            paloLIst.add(palo);
        }
    }

    private Boolean onePair(){
        HashMap<String,String> list = new HashMap<String,String>();
        for(String valor : valorList){
                if (list.containsValue(valor)) {
                    return true;
                }
                list.put(null, valor);
        }
        return false;
    }


}
