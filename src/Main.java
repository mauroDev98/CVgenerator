import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona mauro = new Persona("Mauro Rivero Franco", "mauro_riverof@hotmail.com", "614-374-5789");

        mauro.idiomas.add(new Idioma("English", "Advanced", "C1"));
        mauro.idiomas.add(new Idioma("French", "Intermediate", "B1"));
        mauro.idiomas.add(new Idioma("Mandarin", "Basic", "HSK2"));

        mauro.experiencia.add(new Experiencia("FIBERHOME", "Problem Solution Assistant", 2025));
        mauro.experiencia.add(new Experiencia("UTCH BIS", "API Development", 2025));
        mauro.experiencia.add(new Experiencia("UTCH BIS", "BVA Interactive applications", 2025));
        mauro.experiencia.add(new Experiencia("UTCH BIS", "Arduino UNO implementation", 2025));

        mauro.educacion.add(new Educacion("UTCH BIS", "Software Engineer", "2023 - Present"));
        mauro.educacion.add(new Educacion("Universidad del Valle de México", "Architect", "2016 - 2021"));

        mauro.imprimirCV();

    }
}

class Idioma{
    String nombre;
    String nivel;
    String certificacion;

    Idioma(String nombre, String nivel, String certificacion) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.certificacion = certificacion;
    }

    String describir() {
        return nombre + " - " + nivel + " - " + certificacion;
    }
}

class Experiencia{
    String empresa;
    String puesto;
    Integer anio;

    Experiencia(String empresa, String puesto, Integer anio) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.anio = anio;
    }

    String describir() {return empresa + " - " + puesto + " - " + anio; }
}

class Educacion{
    String escuela;
    String titulo;
    String anio;

    Educacion(String escuela, String titulo, String anio){
        this.escuela = escuela;
        this.titulo = titulo;
        this.anio = anio;
    }

    String describir() {return escuela + " - " + titulo + " - " + anio; }
}

class Persona{
    String nombre;
    String correo;
    String telefono;
    ArrayList<Idioma> idiomas;
    ArrayList<Experiencia> experiencia;
    ArrayList<Educacion> educacion;

    Persona(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.idiomas = new ArrayList<>();
        this.experiencia = new ArrayList<>();
        this.educacion = new ArrayList<>();
    }

    String describir() {return nombre + " - " + correo + " - " + telefono; }

    void imprimirCV() {
        for (Idioma i : idiomas) {
            System.out.println(i.describir());
        }

        System.out.println();

        for (Experiencia i : experiencia) {
            System.out.println(i.describir());
        }

        System.out.println();

        for (Educacion i : educacion) {
            System.out.println(i.describir());
        }
    }
}
