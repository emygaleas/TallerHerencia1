public class Main {
    public static void main(String[] args) {
        // no se usa la CLASE PERSONA, se usa la subclase para crear el objeto, solo se usa Persona para 'iniciar' el objeto
        Persona estudiante1 = new Estudiante("17544440640","Emily","Av.Mariscal Sucre", "emygaleas@gmail.com","0996315923", "Software","3er Semestre");
        // llamar al metodo mostrar información personal
        //estudiante1.mostrarInformacionPersonal();

        Persona docente1 = new Docente("1777777777","Maria", "Shyris","maria@gmail.com","0999999999", "ESFOT",20);
        //docente1.mostrarInformacionPersonal();

        //estudiante_presencial -> estudiante -> persona
        Persona estudiante_presencial1 = new Estudiante_Presencial("17544440640","Emily","Av.Mariscal Sucre", "emygaleas@gmail.com","0996315923", "Software","3er Semestre", 3,"Jueves: 7am - 10 am");
        estudiante_presencial1.mostrarInformacionPersonal();
        System.out.println("Edad estudiante: ");
        System.out.println(((Estudiante_Presencial) estudiante_presencial1).calcularEdad(2005,2025));

        //estudiante_virtual -> estudiante -> persona
        System.out.println("\n");
        Persona estudiante_virtual1 = new Estudiante_Virtual("1777777777","Alicia","La Armenia", "alicia@gmail.com","0998877665", "Mecánica","7mo Semestre", "Microsoft Teams", "Loretta");
        estudiante_virtual1.mostrarInformacionPersonal();

        //METODO PROPIO DE ESTUDIANTE: CLASE - OBJETO CREADO - METODO

        //Mostrar información docente en linea
        System.out.println("\n");
        Persona docente2 = new Docente_linea("1777777777","Maria", "Shyris","maria@gmail.com","ESFOT", 10,"Definitivo");
        docente2.mostrarInformacionSinTelefono();
    }
}