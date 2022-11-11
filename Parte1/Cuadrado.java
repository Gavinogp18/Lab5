package Parte1;

public class Cuadrado extends Figura {


    public Cuadrado(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }

    public int areaCuadrado(){
        int areaC = lado * lado;
        return areaC;
    }
}
