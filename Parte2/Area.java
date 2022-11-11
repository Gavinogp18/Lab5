package Parte2;

import Parte1.Figura;

public class Area extends Figura {
    public Area(int lado, int apotema, int altura) {
        super(lado, apotema, altura);
    }

    public static void main(String[] args) {

        System.out.println("El area del triangulo de base "+lado+" y altura "+altura+" es "+areaT);
        System.out.println("El area del cuadrado de lado "+lado+" es "+areaC);
        System.out.println("El area del pentagono de lado "+lado+" y apotema "+apotema+" es "+areaP);
        System.out.println("El area del hexagono de lado "+lado+" y apotema "+apotema+" es "+areaHx);
        System.out.println("El area del heptagono de lado "+lado+" y apotema "+apotema+" es "+areaHp);

        Area fig = new Area(20,5,7);
        fig.mostrarResultados();
    }
}