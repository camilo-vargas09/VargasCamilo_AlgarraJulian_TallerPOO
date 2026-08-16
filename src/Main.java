//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo V1=new Automovil();

        V1.mostrarFicha();
        V1.calcularPrecioFinal();

        Vehiculo V2=new Motocicleta();
        V2.mostrarFicha();

        Vehiculo V3=new CamionCarga();
        V3.mostrarFicha();
    }
}