package Parte2;

import Parte1.Figura;

public class Hexagono extends Figura {


    public Hexagono(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }


    public int areaHexagono(){
        int areaHx = (6*lado) * apotema / 2;
        return areaHx;
    }
}
