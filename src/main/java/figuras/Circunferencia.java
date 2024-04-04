package figuras;

public class Circunferencia {
    private double radio;
    

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
        double d = 2 * radio; 
        System.out.println("Diámetro: " + d);
        System.out.println("Color: " + "rojo");
        
    }

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRad();
        if (considerarDecimales) {
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
        double area = 2 * 3.1416 * radio * radio;
        return area;
    }
}
