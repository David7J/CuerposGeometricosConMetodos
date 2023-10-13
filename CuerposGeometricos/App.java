import java.util.Scanner;

public class App {

    static Scanner lector = new Scanner(System.in);

    static int intentos;
    static double areaLateral, areaTotal, volumen, base, altura, apotema, perimetroBase, longitud, cantidadLados, resultado, areaBaseMayor, areaBaseMenor, Pixal, perimetroBaseMayor, perimetroBaseMenor;
    static double alfa, areaBase, radio, lados, apotemaPiramideCuadrado, apotemaPiramide, generatriz, generatrizCuadrada, area, angulo, radiosCuadrados, radxrad, totalVol;
    static double radioMayor, radioMenor, porcionSuperficie, porcionEsfera, grados, profundidad, diagonal, cDiag, arista, lado, areaPent, cantidadLados1, lado1, lado2;

    public static void main(String[] args) throws Exception {
        
        System.out.println("Seleccione un cuerpo geometrico: ");
        System.out.println("1) Prisma: ");
        System.out.println("2) cilindro: ");
        System.out.println("3) Piramide: ");
        System.out.println("4) Cono: ");
        System.out.println("5) Esfera: ");
        System.out.println("6) Zona Esferica: ");
        System.out.println("7) Casquete Esferico: ");
        System.out.println("8) Huso esferico y Cuña Esferica: ");
        System.out.println("9) Ortoedro: ");
        System.out.println("10) Tetraedro: ");
        System.out.println("11) Hexaedro: ");
        System.out.println("12) Octaedro: ");
        System.out.println("13) Dodecaedro: ");
        System.out.println("14) Icosaedro: ");
        System.out.println("15) Tronco de Cono: ");
        System.out.println("16) Tronco de piramide: ");
        System.out.println("17) Salir");
        int opc = lector.nextInt();

        switch(opc){
            case 1:
                resolverPrisma();
                if (cantidadLados > 0 && altura > 0 && longitud > 0) {
                System.out.println(" ");
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: "+areaLateral);
                System.out.println("Area Total: " +areaTotal);
                System.out.println("Volumen: " +volumen);
                } else {
                System.out.println("Intentos gastados. Programa terminado.");
                }
            break;

            case 2:
                resolverCilindro();
                if (altura > 0 && radio > 0 ) {
                System.out.println(" ");
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: "+areaLateral);
                System.out.println("Area Total: " +areaTotal);
                System.out.println("Volumen: " +volumen);

            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }

            break;

            case 3:
                resolverPiramide();
                if (altura > 0 && lados > 0 && apotema > 0 ) {
                System.out.println(" ");
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: "+areaLateral);
                System.out.println("Area Total: " +areaTotal);
                System.out.println("Volumen: " +volumen);
                } else {
                System.out.println("Intentos gastados. Programa terminado.");
                }

            break;

            case 4:
                resolverCono();
                if (radio > 0 && altura > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Area Lateral: "+areaLateral);
                    System.out.println("Area Total: " +areaTotal);
                    System.out.println("Volumen: " +volumen);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 5:
                resolverEsfera();
                if (radio > 0 ) {
                    System.out.println(" " );
                    System.out.println("Resultados: ");
                    System.out.println("Area: " +area);
                    System.out.println("Volumen: " +volumen);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }    
            break;

            case 6:
                resolverZonaEsferica();
                if (radio > 0 && altura > 0 && radioMayor > 0 && radioMenor > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Porcion de la superficie: " +porcionSuperficie);
                    System.out.println("Porcion de la esfera: " +porcionEsfera);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 7:
            resolverCasqueteEsferico();
            if (altura > 0 && radioMayor > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Porcion de la superficie: " +porcionSuperficie);
                    System.out.println("Porcion de la esfera: " +porcionEsfera);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 8:
            resolverHusoEsfericoYcuñaEsferica();
            if (radio > 0 && grados > 0 ) {
                System.out.println(" ");
                System.out.println("Resultados: ");
                System.out.println("Area: " +area);
                System.out.println("Volumen: " +volumen);
                } else {
                System.out.println("Intentos gastados. Programa terminado.");
                }        
            break;

            case 9:
                resolverOrtoEdro();
                if (longitud > 0 && altura > 0 && profundidad > 0) {
                    System.out.println(" " );
                    System.out.println("Resultados: ");
                    System.out.println("Area: " +area);
                    System.out.println("Volumen: " +volumen);
                    System.out.println("Diagonal: " +diagonal);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 10:
                resolverTetraEdro();
                if (arista > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Area: " +area);
                    System.out.println("Volumen: " +volumen);
                    System.out.println("Altura: " + altura);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 11:
                resolverHexaedro();
                if (arista > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Area: " +area);
                    System.out.println("Volumen: " +volumen);
                    System.out.println("Altura: " + altura);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 12:
                resolverOctaedro();
                if (arista > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Area: " +area);
                    System.out.println("Volumen: " +volumen);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 13:
                resolverDodecaedro();
                if (arista > 0 && cantidadLados1 > 0 && lado > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                     System.out.println("Area Pentagonal: " +areaPent);
                    System.out.println("Area: " +area);
                    System.out.println("Volumen: " +volumen);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 14:
                resolverIcosaedro();
                if (arista > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Area: " +area);
                    System.out.println("Volumen: " +volumen);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 15:
                resolverTroncoCono();
                if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Area Lateral: " +areaLateral);
                    System.out.println("Area Total: " +areaTotal);
                    System.out.println("Volumen: " +totalVol);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 16:
                resolverTroncoPiramide();
                if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0 ) {
                    System.out.println(" ");
                    System.out.println("Resultados: ");
                    System.out.println("Area Lateral: " +areaLateral);
                    System.out.println("Area Total: " +areaTotal);
                    System.out.println("Volumen: " +volumen);
                    } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                    }
            break;

            case 17:
                System.out.println("Saliendo del programa. ");
            break;
            default:
            System.out.println("Opcion invalida");
        }
        lector.close();
    }    

    public static double resolverPrisma(){

        for(intentos = 0; intentos < 3; intentos++){
        System.out.println("Digite la altura: ");
        altura = lector.nextDouble();

        System.out.println("Digite la cantidad de lados: ");
        cantidadLados = lector.nextDouble();

        System.out.println("Digite la longitud de los lados: ");
        longitud = lector.nextDouble();
        
        if (cantidadLados > 0 && altura > 0 && longitud > 0){
        perimetroBase = longitud*cantidadLados;
        areaLateral = altura*perimetroBase;
        alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitud / (2 * Math.tan((alfa)/2));
        areaBase = (perimetroBase * apotema)/2;
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;
        break;
        }else{
            System.out.println("No se permiten negativos ni cero");
        }
    }
        return areaLateral;
    }

    public static double resolverCilindro(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("Altura");
            altura = lector.nextDouble();
            System.out.println("Radio");
            radio = lector.nextDouble();        

            if (altura > 0 && radio > 0 ) {
                perimetroBase = radio * (Math.PI*2);
                areaLateral = altura * perimetroBase;
                areaBase = (Math.PI) * Math.pow(radio,2);
                areaTotal = areaLateral + 2*areaBase;
                volumen = areaBase * altura;
                break;
            }else{
                System.out.println("No se permiten valores negativos ni cero");
            }
         }    
        return areaLateral;
    }

    public static double resolverPiramide(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("apotema: ");
            apotema = lector.nextDouble();
            System.out.println("Lados: ");
            lados = lector.nextDouble();
            System.out.println("Altura");
            altura = lector.nextDouble();

            if (apotema > 0 && lados > 0 && altura > 0 ) {
                perimetroBase = apotema * lados;
                apotemaPiramideCuadrado = Math.pow(apotema,2) + Math.pow(altura,2);
           
                apotemaPiramide = Math.sqrt (apotemaPiramideCuadrado);
                areaLateral = perimetroBase * apotemaPiramide/2;
           
                areaBase = perimetroBase * apotema/2;
                areaTotal = areaLateral + areaBase;
           
                volumen = areaBase * altura/3;
                break;
            }else{
                System.out.println("No se permiten valores negativos ni cero");
            }
         }
        return areaLateral;
    }

    public static double resolverCono(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("altura: ");
            altura = lector.nextDouble();
            System.out.println("radio: ");
            radio = lector.nextDouble();

            if (radio > 0 && altura > 0 ) {
                generatrizCuadrada = Math.pow(altura,2) + Math.pow(radio,2);
                generatriz = Math.sqrt (generatrizCuadrada);
                areaLateral = (Math.PI *radio) * generatriz;
                areaBase = Math.PI * Math.pow(radio,2);
                areaTotal = areaLateral + areaBase;
                volumen = areaBase * altura/3;
                break;
            }else{
                System.out.println("No se permiten valores negativos ni cero");
            }
        }
        return areaLateral;
    } 

    public static double resolverEsfera(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("Radio");
            radio = lector.nextDouble();

            if (radio > 0 ) {
                area = (4*Math.PI) * Math.pow(radio,2);
                volumen = 4/3 * (Math.PI* Math.pow(radio,3));
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverZonaEsferica(){
    for(intentos = 0; intentos < 3; intentos++){
        System.out.println("radio: ");
        radio = lector.nextDouble();
        System.out.println("altura: ");
        altura = lector.nextDouble();
        System.out.println("radio mayor: ");
        radioMayor = lector.nextDouble();
        System.out.println("radio menor: ");
        radioMenor = lector.nextDouble();

        if (radio > 0 && altura > 0 && radioMayor > 0 && radioMenor > 0) {
            porcionSuperficie = (2*Math.PI) * radioMayor * altura;
            porcionEsfera = (Math.PI*altura) * (Math.pow(altura,2) + 3*(Math.pow(radio,2)) + 3*(Math.pow(radioMenor,2))/6 );
            break;
        }else{
            System.out.println("No se permiten negativos ni cero");
        }
     }
        return areaLateral;
    }

    public static double resolverCasqueteEsferico(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("radio mayor: ");
            radioMayor = lector.nextDouble();
            System.out.println("altura: ");
            altura = lector.nextDouble();

            if (altura > 0 && radioMayor > 0 ) {
                porcionSuperficie = (2*Math.PI) * radioMayor * altura;
                porcionEsfera = (Math.PI*altura) * (3*radioMayor-altura)/3;
                break;
              }else{
                System.out.println("No se permiten negativos ni cero");
              }
            }
        return areaLateral;
    }

    public static double resolverHusoEsfericoYcuñaEsferica(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("grados: ");
            grados = lector.nextDouble();
            System.out.println("radio: ");
            radio = lector.nextDouble();

            if (radio > 0 && grados > 0 ) {
                area = (4*Math.PI) * (Math.pow(radio,2)) * grados/360;
                volumen = 4/3* (Math.PI) * (Math.pow(radio,3)) * radio/360;
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverOrtoEdro(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("longitud: ");
            longitud = lector.nextDouble();
            System.out.println("profundidad: ");
            profundidad = lector.nextDouble();
            System.out.println("altura: " );
            altura = lector.nextDouble();

            if (longitud > 0 && altura > 0 && profundidad > 0 ) {
                area = 2* ((altura*longitud) + (altura*profundidad) + (longitud*profundidad));
                volumen = altura*longitud*profundidad;
                cDiag = Math.pow(altura,2) + Math.pow(longitud,2) + Math.pow(profundidad,2);
                diagonal = Math.sqrt(cDiag);
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }
    
    public static double resolverTetraEdro(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("Arista: ");
            arista = lector.nextDouble();

            if (arista > 0 ) {
                area = Math.pow(arista,2) * Math.sqrt(3);
                volumen = Math.sqrt(2)/12 * Math.pow((area),3);
                altura = arista * Math.sqrt(6)/3;
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverHexaedro(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("Arista: ");
            arista = lector.nextDouble();

            if (arista > 0 ) {
                area = 6 * Math.pow(arista,2);
                volumen = Math.pow(arista,3);
                diagonal = arista * Math.sqrt(3);
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverOctaedro(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("Arista: ");
            arista = lector.nextDouble();

            if (arista > 0 ) {
                area = 2* Math.pow(arista,2) * Math.sqrt(3);
                volumen = Math.sqrt(2)/3 * Math.pow(arista,3);
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverDodecaedro(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("Arista: ");
            arista = lector.nextDouble();
            System.out.println("Cantidad de lados: ");
            cantidadLados1 = lector.nextDouble();
            System.out.println("Lado: ");
            lado = lector.nextDouble();

            if (arista > 0 && cantidadLados1 > 0 && lado > 0 ) {
                angulo = 360/ (2*cantidadLados);
                apotema = lado/ 2* (Math.tan(angulo));
                areaPent = 5/2 * (arista * apotema);
                area = 3* Math.pow(arista,2) * (Math.sqrt(25 + 10* Math.sqrt (5)));
                volumen = 1/4 * (15 + 7*Math.sqrt(5) * Math.pow(arista,3));
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverIcosaedro(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("Arista: ");
            arista = lector.nextDouble();

            if (arista > 0 ) {
                area = 5* Math.pow(arista,2) * Math.sqrt(3);
                volumen = 5/12 * (3 + Math.sqrt(5)) * Math.pow(arista,3);
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverTroncoCono(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("radio: ");
            radio = lector.nextDouble();
            System.out.println("altura: ");
            altura = lector.nextDouble();
            System.out.println("radio Mayor: ");
            radioMayor = lector.nextDouble();
            System.out.println("generatriz: ");
            generatriz = lector.nextDouble();

            if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0 ) {
                areaLateral = (Math.PI*generatriz) *(radioMayor + radio);

                areaBaseMayor = Math.PI* Math.pow(radioMayor,2);
                areaBaseMenor = Math.PI* Math.pow(radio,2);
                areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;

                Pixal = (Math.PI * altura); 
                radiosCuadrados = ((Math.pow(radioMayor,2)) + (Math.pow(radio,2)));
                radxrad = radioMayor * radio;
                volumen = Pixal * (radiosCuadrados + radxrad);
                totalVol = volumen/3;
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }

    public static double resolverTroncoPiramide(){
        for(intentos = 0; intentos < 3; intentos++){
            System.out.println("lado 1:");
            lado1 = lector.nextDouble();
            System.out.println("lado 2:");
            lado2 = lector.nextDouble();
            System.out.println("apotema: ");
            apotema = lector.nextDouble();
            System.out.println("altura: ");
            altura = lector.nextDouble();
            if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0 ) {
                perimetroBaseMayor = lado1 * 4;
                perimetroBaseMenor = lado2 * 4;
                areaLateral = (perimetroBaseMayor + perimetroBaseMenor) * apotema/2;
                areaBaseMayor = lado1 * lado1;
                areaBaseMenor = lado2 * lado2;
                areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
                volumen = (areaBaseMayor + areaBaseMenor) + (lado1*lado2) *altura/3;
                break;
            }else{
                System.out.println("No se permiten negativos ni cero");
            }
        }
        return areaLateral;
    }
}