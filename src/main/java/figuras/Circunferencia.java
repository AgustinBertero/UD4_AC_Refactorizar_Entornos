package figuras;

public class Circunferencia {
    private double radio;
    private String color;
    private static final double PI = 3.1416; 
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRad() {
        return radio;
    }

    public void setRad(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        color = "rojo";
        double d = 2 * radio; 
        System.out.println("Diámetro: " + d);
        System.out.println("Color: " + color);
        
    }

    public boolean esIgual(Circunferencia otro, boolean conDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRad();
        if (conDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
    private double calcularArea(){
        double area = 2 * PI * radio * radio;
        return area;
    }
}
