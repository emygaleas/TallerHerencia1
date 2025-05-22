public class Estudiante extends Persona{
    // atributos propios
    public String carrera;
    public String nivel;

    // metodo constructor
    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel) {
        super(cedula, nombre, direccion, correo, telefono); // atributos que hereda
        this.carrera = carrera;
        this.nivel = nivel;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
    }

    public int calcularEdad(int anioNacimiento, int anioActual){
        return anioActual - anioNacimiento;
    }

}