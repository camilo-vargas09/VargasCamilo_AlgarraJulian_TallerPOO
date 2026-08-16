public class Automovil extends Vehiculo{


    int numeroPuertas;
    String tipoCombustible;

    public Automovil() {
    }

    public Automovil(int numeroPuertas, String tipoCombustible) {
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public Automovil(String placa, String marca, String modelo, int anno, double precioBase, int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, anno, precioBase);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anno=" + anno +
                ", precioBase=" + precioBase +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        return 0;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("es el metodo mostrar ficha");
    }
}
