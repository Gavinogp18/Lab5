package Parte1;

public abstract class Figura {
    protected static int lado;
    protected static int apotema;
    protected static int altura;
    protected static int areaT;
    protected static int areaC;
    protected static int areaP;
    protected static int areaHx;
    protected static int areaHp;


    public Figura(int lado,int apotema,int altura) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void mostrarResultados(){
        System.out.println("El area del triangulo de base "+lado+" y altura "+altura+" es "+areaT);
        System.out.println("El area del cuadrado de lado "+lado+" es "+areaC);
        System.out.println("El area del pentagono de lado "+lado+" y apotema "+apotema+" es "+areaP);
        System.out.println("El area del hexagono de lado "+lado+" y apotema "+apotema+" es "+areaHx);
        System.out.println("El area del heptagono de lado "+lado+" y apotema "+apotema+" es "+areaHp);
    }
}
