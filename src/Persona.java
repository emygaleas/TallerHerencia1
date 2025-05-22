public class Persona {
    public String cedula;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;

    public Persona(String cedula, String nombre, String direccion, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Persona(String cedula, String nombre, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }

    public void mostrarInformacionPersonal(){
        System.out.println("---------- Información Personal ----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Teléfono: " + telefono);
    }

    public void mostrarInformacionSinTelefono(){
        System.out.println("---------- Información Personal ----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo electrónico: " + correo);
    }

}
