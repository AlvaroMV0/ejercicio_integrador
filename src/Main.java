import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //tomar la ruta de los archivos
        System.out.println("Introducir la ruta del archivo \"partidos\"");
        Path dirPartidos = Paths.get(sc.nextLine());
        System.out.println("Introducir la ruta del archivo \"pronósticos\"");
        Path dirPronosticos = Paths.get(sc.nextLine());
        String[] arrPartidos;
        String[] arrPronosticos;
        int lineaResultados = 0;
        int lineaPronosticos = 0;
        int cantDeRondas = 1;
        int puntos = 0;

        try {
            for (int i = 1; i <= cantDeRondas; i++) {
                for (String linea : Files.readAllLines(dirPartidos)) {

                    arrPartidos = linea.split(";");

                    //var necesarias
                    int golesEq1 = Integer.parseInt(arrPartidos[1]);
                    int golesEq2 = Integer.parseInt(arrPartidos[2]);

                    //inciar objetos de clases
                    Equipo equipo1 = new Equipo(arrPartidos[0]);
                    Equipo equipo2 = new Equipo(arrPartidos[3]);


                    Partido partido = new Partido(equipo1, equipo2, golesEq1, golesEq2);

                    for (String lin : Files.readAllLines(dirPronosticos)) {

                        if (lineaResultados != lineaPronosticos) {
                            lineaResultados++;
                            continue;
                        }

                        arrPronosticos = lin.split(";");

                        Equipo equipo = new Equipo(arrPronosticos[0]);

                        ResultadoEnum resultado = null;

                        if (arrPronosticos[1].equals("X")) {
                            resultado = ResultadoEnum.GANAEQUIPO1;
                        } else if (arrPronosticos[2].equals("X")) {
                            resultado = ResultadoEnum.EMPATE;
                        } else if (arrPronosticos[3].equals("X")) {
                            resultado = ResultadoEnum.GANAEQUIPO2;
                        }

                        Pronostico pronostico = new Pronostico(equipo, resultado, partido);

                        puntos = pronostico.puntos(partido.resultado(equipo), pronostico.getResultado(), puntos);

                        if (lineaResultados == lineaPronosticos) {
                            lineaPronosticos++;
                            break;
                        }


                    }

                }
            }
        } catch (IOException e) {

        }
        System.out.println("Puntaje = " + puntos);

    }
}