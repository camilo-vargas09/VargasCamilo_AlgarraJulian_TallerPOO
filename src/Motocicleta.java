public class Motocicleta extends Vehiculo{

    int cilindaje;

    public Motocicleta() {
    }

    public Motocicleta(int cilindaje) {
        this.cilindaje = cilindaje;
    }

    public Motocicleta(String placa, String marca, String modelo, int anno, double precioBase, int cilindaje) {
        super(placa, marca, modelo, anno, precioBase);
        this.cilindaje = cilindaje;
    }

    public int getCilindaje() {
        return cilindaje;
    }

    public void setCilindaje(int cilindaje) {
        this.cilindaje = cilindaje;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindaje=" + cilindaje +
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
        System.out.println("Metodo mostrar ficha Motocicleta");

    }
}
