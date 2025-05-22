public class Estudiante_Virtual extends Estudiante{
    public String plataforma;
    public String tutor_virtual;

    public Estudiante_Virtual(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, String plataforma, String tutor_virtual){
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.plataforma = plataforma;
        this.tutor_virtual = tutor_virtual;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Tutor virtual: " + tutor_virtual);
    }

    @Override
    public int calcularEdad(int anioNacimiento, int anioActual) {
        return super.calcularEdad(anioNacimiento, anioActual);
    }
}
