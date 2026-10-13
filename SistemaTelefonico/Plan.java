package empresaTelefonia;

public class Plan {

    private int minutosIncluidos;
    private double datosGB;
    private double precioMensual;

    public Plan(int minutosIncluidos, double datosGB, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }

    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public double getDatosGB() {
        return datosGB;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    @Override
    public String toString() {
        return minutosIncluidos + " min, " + datosGB + " GB, $" + precioMensual + "/mes";
    }
}