package empresaTelefonia;

public class Factura {

    // Tarifas por exceso
    private static final double COSTO_MINUTO_EXTRA = 0.50;
    private static final double COSTO_GB_EXTRA = 10.00;

    private Cliente cliente; // La Factura usa un Cliente (y, a través de él, su Plan)
    private int minutosUsados;
    private double datosUsadosGB;

    public Factura(Cliente cliente, int minutosUsados, double datosUsadosGB) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsadosGB = datosUsadosGB;
    }

    public double calcularCargoMinutosExtra() {
        int exceso = minutosUsados - cliente.getPlan().getMinutosIncluidos();
        return exceso > 0 ? exceso * COSTO_MINUTO_EXTRA : 0;
    }

    public double calcularCargoDatosExtra() {
        double exceso = datosUsadosGB - cliente.getPlan().getDatosGB();
        return exceso > 0 ? exceso * COSTO_GB_EXTRA : 0;
    }

    public double calcularCargosExtras() {
        return calcularCargoMinutosExtra() + calcularCargoDatosExtra();
    }

    public double calcularTotal() {
        return cliente.getPlan().getPrecioMensual() + calcularCargosExtras();
    }

    public void generarFactura() {
        Plan plan = cliente.getPlan();

        System.out.println("========== FACTURA ==========");
        System.out.println("Cliente:  " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getNumeroTelefonico());
        System.out.println("Plan:     " + plan);
        System.out.println("-----------------------------");
        System.out.println("Consumo real:");
        System.out.println("  Minutos: " + minutosUsados + " de " + plan.getMinutosIncluidos());
        System.out.println("  Datos:   " + datosUsadosGB + " GB de " + plan.getDatosGB() + " GB");
        System.out.println("-----------------------------");
        System.out.printf("Precio base:          $%.2f%n", plan.getPrecioMensual());
        System.out.printf("Cargo minutos extra:  $%.2f%n", calcularCargoMinutosExtra());
        System.out.printf("Cargo datos extra:    $%.2f%n", calcularCargoDatosExtra());
        System.out.println("-----------------------------");
        System.out.printf("TOTAL A PAGAR:        $%.2f%n", calcularTotal());
        System.out.println("=============================");
    }
}