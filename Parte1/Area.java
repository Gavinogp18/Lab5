package Parte1;

public class Area extends Figura {
    public Area(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }

    public static void main(String[] args) {

        Area fig = new Area(20,5,7);
        fig.mostrarResultados();
    }
}