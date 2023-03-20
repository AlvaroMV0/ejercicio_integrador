
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
//D:\Descargas\resultados.csv
//D:\Descargas\pronosticos.csv
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

        try {
                for (String linea : Files.readAllLines(dirPartidos)) {

                    arrPartidos = linea.split(";");



                //var necesarias
                int golesEq1 = Integer.parseInt(arrPartidos[1]);
                int golesEq2 = Integer.parseInt(arrPartidos[2]);

                //inciar objetos de clases
                Equipo equipo1 = new Equipo(arrPartidos[0]);
                Equipo equipo2 = new Equipo(arrPartidos[3]);

                String nombreRonda = "Nombre de la ronda"; // Asignar un nombre a la ronda

                    Partido partido = new Partido(equipo1, equipo2, golesEq1, golesEq2);
                    for (String lin : Files.readAllLines(dirPronosticos)) {

                        if (lineaResultados != lineaPronosticos){
                            lineaResultados++;
                            continue;
                        }

                        arrPronosticos = lin.split(";");

                        Equipo equipo = new Equipo(arrPronosticos[0]);

                        ResultadoEnum res = null;

                        if (arrPronosticos[1].equals("X")) {
                            res = ResultadoEnum.GANAEQUIPO1;
                        }

                        else if (arrPronosticos[2].equals("X")) {
                            res = ResultadoEnum.EMPATE;
                        }
                        else if (arrPronosticos[3].equals("X")) {
                            res = ResultadoEnum.GANAEQUIPO2;
                        }

                        Pronostico pronostico = new Pronostico(equipo, res);
                        if (partido.resultado(equipo) == pronostico.getResultado()) {
                            System.out.println("suma punto");
                        } else {
                            System.out.println("no suma");
                        }



                        if(lineaResultados == lineaPronosticos){
                            lineaPronosticos ++;
                            break;
                        }


                    }

                }

        } catch (IOException e){

            }
        }



    }
