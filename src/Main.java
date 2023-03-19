import java.io.IOException;
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
        String dirPartidos = sc.nextLine();
        System.out.println("Introducir la ruta del archivo \"pronósticos\"");
        String dirPronosticos = sc.nextLine();
        ArrayList<Partido> arrPartidos = new ArrayList<>();
        try {
            for (String linea : Files.readAllLines(Paths.get(dirPartidos))) {
               Arrays.asList(linea.split(",", 0);

                //var necesarias
                int golesEq1 = Integer.parseInt(String.valueOf(arrPartidos.get(1)));
                int golesEq2 = Integer.parseInt(String.valueOf(arrPartidos.get(4)));

                //inciar objetos de clases
                Equipo equipo1 = new Equipo(arrPartidos.get(0).toString());
                Equipo equipo2 = new Equipo(arrPartidos.get(3).toString());

                String nombreRonda = "Nombre de la ronda"; // Asignar un nombre a la ronda

                Partido partido = new Partido(equipo1, equipo2, golesEq1, golesEq2);
                partidos.add(partido);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Partido partido : partidos) {
            System.out.println(partido);  //probar si funciona la lista de partidos como debería
        }
    }
}