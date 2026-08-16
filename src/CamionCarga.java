public class CamionCarga extends Vehiculo{

    double capacidadToneladas;

    public CamionCarga() {
    }

    public CamionCarga(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    public CamionCarga(String placa, String marca, String modelo, int anno, double precioBase, double capacidadToneladas) {
        super(placa, marca, modelo, anno, precioBase);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public String toString() {
        return "CamionCarga{" +
                "capacidadToneladas=" + capacidadToneladas +
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
        System.out.println("Metodo mostrar Camion Carga");

    }
}
