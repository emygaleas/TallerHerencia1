public class Docente extends Persona{
    public String facultadPertenece;
    public int horasAsignadasClases;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String facultadPertenece, int horasAsignadasClases){
        super(cedula, nombre, direccion, correo, telefono);
        this.facultadPertenece = facultadPertenece;
        this.horasAsignadasClases = horasAsignadasClases;
    }

    public Docente(String cedula, String nombre, String direccion, String correo, String facultadPertenece, int horasAsignadasClases){
        super(cedula, nombre, direccion, correo);
        this.facultadPertenece = facultadPertenece;
        this.horasAsignadasClases = horasAsignadasClases;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Facultad a la que pertenece: " + facultadPertenece);
        System.out.println("Horas Asignadas: " + horasAsignadasClases);
    }

    @Override
    public void mostrarInformacionSinTelefono() {
        super.mostrarInformacionSinTelefono();
    }

}
