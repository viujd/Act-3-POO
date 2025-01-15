package Part2;
public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public void determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        
        if (base == altura && base == hipotenusa) {
            System.out.println("Es un triángulo equilátero");
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            System.out.println("Es un triángulo isósceles");
        } else {
            System.out.println("Es un triángulo escaleno");
        }
    }
}
