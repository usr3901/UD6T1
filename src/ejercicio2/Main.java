package ejercicio2;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Participante> participantes = new HashSet<>();

        int intentados = 7;

        participantes.add(new Participante("J001","Adrián","Junior"));
        participantes.add(new Participante("J002","Paula","Junior"));
        participantes.add(new Participante("J003","Samuel","Senior"));
        participantes.add(new Participante("J001","Adrián repetido","Senior"));
        participantes.add(new Participante("J004","Claudia","Senior"));
        participantes.add(new Participante("J005","Diego","Junior"));
        participantes.add(new Participante("J006","Alba","Experto"));

        System.out.println("PARTICIPANTES");

        for(Participante p : participantes){
            System.out.println(p);
        }

        System.out.println("\nIntentados añadir: " + intentados);
        System.out.println("Añadidos realmente: " + participantes.size());

        HashMap<String,Integer> categorias = new HashMap<>();

        for(Participante p : participantes){

            String categoria = p.getCategoria();

            categorias.put(
                    categoria,
                    categorias.getOrDefault(categoria,0)+1
            );
        }

        System.out.println("\nMapa:");
        System.out.println(categorias);

        System.out.println("\nJunior:");
        System.out.println(categorias.get("Junior"));

        System.out.println("\nExiste Experto:");
        System.out.println(categorias.containsKey("Experto"));

        categorias.remove("Experto");

        System.out.println("\nClaves:");
        System.out.println(categorias.keySet());
    }
}