
public class TrianguloRectangulo {
    int base;
    int altura;


    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


    double calcularArea() {
        return (base * altura / 2);
    }


    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }


    double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero"); /* Todos sus
lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno"); /* Todos sus
lados son diferentes */
        else
            System.out.println("Es un triángulo isósceles"); /* De otra
manera, es isósceles */
    }
}

