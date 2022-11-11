package Parte1;

public class Triangulo extends Figura {
    int altura;

    public Triangulo(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }


    public int areaTriangulo(){
        int areaT = lado*altura;
        return areaT;
    }
}
