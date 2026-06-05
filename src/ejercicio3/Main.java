package ejercicio3;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pelicula> peliculas = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("peliculas.csv"));

            br.readLine();

            String linea;

            while((linea = br.readLine()) != null){

                String[] datos = linea.split(",");

                peliculas.add(
                        new Pelicula(
                                datos[0],
                                datos[1],
                                Integer.parseInt(datos[2])
                        )
                );
            }

            br.close();

            int totalPeliculas = peliculas.size();
            int duracionTotal = 0;

            Pelicula mayor = peliculas.get(0);

            for(Pelicula p : peliculas){

                duracionTotal += p.getDuracionMinutos();

                if(p.getDuracionMinutos() > mayor.getDuracionMinutos()){
                    mayor = p;
                }
            }

            double media =
                    (double) duracionTotal / totalPeliculas;

            PrintWriter resumen =
                    new PrintWriter("resumen_peliculas.txt");

            resumen.println("TOTAL: " + totalPeliculas);
            resumen.println("DURACION TOTAL: " + duracionTotal);
            resumen.println("MEDIA: " + media);
            resumen.println("MAS LARGA: " + mayor);

            resumen.close();

            FileWriter log =
                    new FileWriter(
                            "log_peliculas.txt",
                            true);

            log.write("Programa ejecutado correctamente\n");

            log.close();

            System.out.println("Archivos generados");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}