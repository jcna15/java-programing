package clase5;

public class Empleado extends Persona{
    private String idEmpleado;
    private String cargo;

    //public Empleado() {
    //    super("Nix");
    //    System.out.println("Este mensaje se muestra en la clase EMPLEADO");
    //}

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
