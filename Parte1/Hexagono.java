package Parte1;

public class Hexagono extends Figura {

    int apotema;

    public Hexagono(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }


    public int areaHexagono(){
        int areaHx = (6*lado) * apotema / 2;
        return areaHx;
    }
}
