package Parte2;

import Parte1.Figura;

public class Heptagono extends Figura {


    public Heptagono(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }


    public int areaHeptagono(){
        int areaHp = (7*lado) * apotema / 2;
        return areaHp;
    }
}
