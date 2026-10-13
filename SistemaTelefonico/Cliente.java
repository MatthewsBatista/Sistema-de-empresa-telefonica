package empresaTelefonia;

public class Cliente {

    private String nombre;
    private String numeroTelefonico;
    private Plan plan; // Un Cliente tiene un Plan

    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}