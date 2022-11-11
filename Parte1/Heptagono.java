package Parte1;

public class Heptagono extends Figura {

    int apotema;

    public Heptagono(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }


    public int areaHeptagono(){
        int areaHp = (7*lado) * apotema / 2;
        return areaHp;
    }
}
