package Parte2;

import Parte1.Figura;

public class Triangulo extends Figura {

    public Triangulo(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }


    public int areaTriangulo(){
        int areaT = lado*altura;
        return areaT;
    }
}
