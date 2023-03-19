
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
                    lineaResultados ++;

                    arrPartidos = linea.split(";");



                //var necesarias
                int golesEq1 = Integer.parseInt(arrPartidos[1]);
                int golesEq2 = Integer.parseInt(arrPartidos[2]);

                //inciar objetos de clases
                Equipo equipo1 = new Equipo(arrPartidos[0]);
                Equipo equipo2 = new Equipo(arrPartidos[3]);

                String nombreRonda = "Nombre de la ronda"; // Asignar un nombre a la ronda

                Partido partido = new Partido(equipo1, equipo2, golesEq1, golesEq2);
                System.out.println(partido.resultado(equipo1));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
