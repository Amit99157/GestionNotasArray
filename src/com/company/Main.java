package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,
        float promedio, mayor, menor, sum = 0.0f;
        float[] numero1 = new float[5];
        System.out.println("MENU DE OPCIONS:");
        System.out.println("========================");
        do {
            System.out.println("1.- (Re)Cargar.");
            System.out.println("2.- Mostrar.");
            System.out.println("3.- Sumar.");
            System.out.println("4.- promedio.");
            System.out.println("5.- Maxima y minimo.");
            System.out.println("0.- Salir.");
            System.out.print("Elige una opcion: ");
            numero = entrada.nextInt();
            System.out.println(" ");
            System.out.println(" ");

            if (numero == 1) {
                for (int i = 0; i < numero1.length; i++) {
                    System.out.print("Nota" + (i + 1) + " : ");
                    numero1[i] = entrada.nextFloat();
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("------------------------");
                System.out.println("continuar :-------------");
                System.out.println("------------------------");
            }else if (numero == 2) {
                for (int i = 0; i < numero1.length; i++) {
                    System.out.println("Nota" + (i + 1) + " : " + numero1[i]);
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("------------------------");
                System.out.println("continuar :-------------");
                System.out.println("------------------------");
            } else if (numero == 3) {
                for (int i = 0; i < numero1.length; i++) {
                    sum = sum + numero1[i];

                }
                System.out.println("Suma de las notas: " + sum);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("------------------------");
                System.out.println("continuar :-------------");
                System.out.println("------------------------");
            } else if (numero == 4) {
                for (int i = 0; i < numero1.length; i++) {
                    sum = sum+numero1[i];
                }
                promedio = sum/5;
                System.out.println("El promedio de notas: " + promedio);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("------------------------");
                System.out.println("continuar :-------------");
                System.out.println("------------------------");
            } else if (numero == 5) {
                mayor = numero1[0];
                menor = numero1[0];
                for (int i = 1; i < numero1.length; i++) {
                    if (numero1[i] > mayor) {
                        mayor = numero1[i];
                    }
                    if (numero1[i] < menor) {
                        menor = numero1[i];
                    }
                }
                System.out.println("Mayor: " + mayor);
                System.out.println("Menor: " + menor);

                System.out.println(" ");
                System.out.println(" ");
                System.out.println("------------------------");
                System.out.println("continuar :-------------");
                System.out.println("------------------------");
            } else if(numero == 0){
                System.out.print("");
            } else{System.out.println("La opción no es válida: ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("------------------------");
                System.out.println("continuar :-------------");
                System.out.println("------------------------");
            }

            entrada.nextLine();
            entrada.nextLine();
        } while (numero != 0);
        entrada.close();
    }
}



