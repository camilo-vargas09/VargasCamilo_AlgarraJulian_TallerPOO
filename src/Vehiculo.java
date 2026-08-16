public abstract class Vehiculo {

    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anno;
    protected double precioBase;


    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, int anno, double precioBase) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.precioBase = precioBase;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnno() {
        return anno;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anno=" + anno +
                ", precioBase=" + precioBase +
                '}';
    }
//metodos abstractos
    public abstract double calcularPrecioFinal();

    public abstract void mostrarFicha();
}
