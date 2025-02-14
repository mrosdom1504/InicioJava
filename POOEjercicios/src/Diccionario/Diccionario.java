package Diccionario;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    static Scanner sc = new Scanner(System.in);
    HashMap<String, String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void nuevoPar() {
        System.out.println("Escriba la palabra en español: ");
        String espaniol = sc.nextLine();
        System.out.println("Escriba la palabra en inglés: ");
        String ingles = sc.nextLine();
        diccionario.put(espaniol, ingles);
    }

    public void traduce(String palabra) {
        System.out.println(diccionario.get(palabra));
    }

    public void palabraAleatoria() {
        Random r = new Random();
        HashMap<Integer, String> palabras = new HashMap<>();
        int contador = 0;
        for (String i : diccionario.keySet()) {
            palabras.put(contador++, i);
        }
        System.out.println(palabras.get(r.nextInt(0, palabras.size())));
    }

    public void primeraLetraTraduccion(String palabra) {
        System.out.println(diccionario.get(palabra).charAt(0));
    }

    public void formulario() {
        String palabra;
        int nPreguntas = 0;
        int aciertos = 0;
        int fallos = 0;
        for (String i : diccionario.keySet()) {
            nPreguntas++;
            System.out.println(diccionario.get(i) + ": " + i.charAt(0) + "...");
            System.out.println("Indique la respuesta: ");
            palabra = sc.nextLine();
            if (palabra.equals("fin")) {
                break;
            } else if(palabra.equals(diccionario.get(i))) {
                aciertos++;
            }else{
                fallos++;
            }
        }
        System.out.println("Preguntas: " + nPreguntas);
        System.out.println("Correctas: " + aciertos);
        System.out.println("Errores :" + fallos);
        System.out.println("Aciertos: " + aciertos / fallos * 100 + "%");
    }
}
