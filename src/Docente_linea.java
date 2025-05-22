public class Docente_linea extends Docente{
    public String tipo_contrato;

    public Docente_linea(String cedula, String nombre, String direccion, String correo, String facultadPertenece, int horasAsignadasClases, String tipo_contrato) {
        super(cedula, nombre, direccion, correo, facultadPertenece, horasAsignadasClases);
        this.tipo_contrato = tipo_contrato;
    }

    @Override
    public void mostrarInformacionSinTelefono() {
        super.mostrarInformacionSinTelefono();
        System.out.println("Tipo de Contrato: " + tipo_contrato);
    }
}
