public class encapsulaciónTarea {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Aqui la diferencia es que el metodo es String y no int.
        persona.setNombre("David");
        // Utilizamos el set para darle valor
        System.out.println("Su nombre es " + persona.getNombre());
        // y el get para mostrar valor en este caso.

        // Utilizamos el set para darle valor
        persona.setEdad(22);
        // y el get para mostrar valor en este caso.
        System.out.println("su edad es de "+ persona.getEdad() + " años");

        // Se repite lo mismo que el caso anterior.
        persona.setTelefono(123456789);

        System.out.println("y su celular es " + persona.getTelefono()+".");

    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}

// Para practicar la encapsulación:

// Crear clase Persona.

// Crear variables las privadas edad, nombre y telefono de la clase Persona.

// Crear gets y sets de cada propiedad.

// Crear un objeto persona en el main.

// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
// telefono, por último muéstralas por consola.