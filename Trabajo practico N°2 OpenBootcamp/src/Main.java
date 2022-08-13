public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es cero");
        }
        int numeroWhile = 0;

        while (numeroWhile < 3) {

            numeroWhile++;
            System.out.println(numeroWhile);

    }
        int numeroDoWhile = 0;
        do {numeroDoWhile++;
        System.out.println(numeroDoWhile);}
        while (numeroDoWhile < 1);


for (int numeroFor = 0; numeroFor<= 3; numeroFor++) {
    System.out.println(numeroFor);
}
var estacion = "verano";
switch (estacion){
    case "invierno":
        System.out.println("estamos en " + estacion);
        break;
    case  "otoño":
        System.out.println("estamos en " + estacion);
        break;
    case  "primavera":
        System.out.println("estamos en " + estacion);
                break;
    case "verano":
        System.out.println("estamos en " + estacion);
                break;
    default:
        System.out.println("el valor ingresado no es una estacion del año");
}

    }
}