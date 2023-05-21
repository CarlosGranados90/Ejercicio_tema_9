public class Main {

    public static void main(String[] args) {
    // Objeto Cliente
    Cliente cliente = new Cliente();
    cliente.nombre = "Cliente 1";
    cliente.edad = 27;
    cliente.telefono = "123456";
    cliente.credito = "125 millones";

    // Pint datos Cliente
    System.out.println("Los datos del cliente son:");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

    // Objeto Trabajador
    Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Trabajador 1";
        trabajador.edad = 33;
        trabajador.telefono = "45679";
        trabajador.salario = "Minimo";

        // Pint datos Cliente
        System.out.println("Los datos del trabajador son:");
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);

    }
}

class Persona {
    // Atributos
     String nombre;
     int edad;
     String telefono;

}

// Herencia clase persona
class Cliente extends Persona {
    // atributo unico Cliente
    String credito;

    // Get y Set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(){
        this.edad = edad;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(){
        this.telefono = telefono;
    }

}

// Herencia clase persona
class Trabajador extends Persona {
    // Atributo unico Trabajador
    String  salario;
}


