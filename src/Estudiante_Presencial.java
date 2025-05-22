public class Estudiante_Presencial extends Estudiante{
    public int hora_presenciales;
    public String horario;

    public Estudiante_Presencial(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, int hora_presenciales, String horario){
        super(cedula, nombre, direccion, correo, telefono, carrera,nivel);
        this.hora_presenciales = hora_presenciales;
        this.horario = horario;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Horas Presenciales: " + hora_presenciales);
        System.out.printf("Horario: " + horario);
    }

    @Override
    public int calcularEdad(int anioNacimiento, int anioActual) {
        return super.calcularEdad(anioNacimiento, anioActual);
    }
}
