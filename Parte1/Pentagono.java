package Parte1;

public class Pentagono extends Figura {
    int apotema;

    public Pentagono(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }


    public int areaPentagono(){
        int areaP = (5*lado) * apotema / 2;
        return areaP;
    }
}
