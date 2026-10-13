package empresaTelefonia;

public class EmpresaTelefonia {

    public static void main(String[] args) {
        Plan planBasico = new Plan(300, 5, 25.00);
        Plan planPremium = new Plan(1000, 20, 60.00);

        Cliente c1 = new Cliente("Matthews Batista", "809-555-0101", planBasico);
        Cliente c2 = new Cliente("Ana Pérez", "829-555-0202", planPremium);

        // c1 se pasa del plan en minutos y datos
        Factura f1 = new Factura(c1, 350, 6.5);
        f1.generarFactura();

        System.out.println();

        // c2 no se pasa
        Factura f2 = new Factura(c2, 800, 15);
        f2.generarFactura();
    }
}