
public class switchTarea {

    public static void main(String[] args) {
        String estacion = "Invierno";
        switch (estacion) {
        case "Verano":
            System.out.println("Estamos en verano");
            break;
        case "Invierno":
            System.out.println("Estamos en invierno");
            break;
        case "Otoño":
            System.out.println("Estamos en otoño");
            break;
        case "Primavera":
            System.out.println("Estamos en primavera");
            break;
        default:
            System.out.println("Lo ingresado no corresponde a ninguna estación del año");
            break;
    }        
    }
    
}
// Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.