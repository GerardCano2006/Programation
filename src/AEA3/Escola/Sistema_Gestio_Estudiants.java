package AEA3.Escola;

import AEA3.Funcions.LectorDatosTerminal;

import java.util.Scanner;

public class Sistema_Gestio_Estudiants {
    private int[] Estudiants = new int[5];

    public Sistema_Gestio_Estudiants(int[] Estudiants) {
        this.Estudiants = Estudiants;
    }

    public int[] getEstudiants() {
        return Estudiants;
    }

    public void setEstudiants(int[] estudiants) {
        Estudiants = estudiants;
    }

    public int Mostrar_notes() {
        return getEstudiants()[5];
    }


    public static void Menu() {
        LectorDatosTerminal lector = new LectorDatosTerminal();
        boolean mostra = true;

        while (mostra) {
            System.out.println("--Aquí tens les opcións disponibles:--");
            System.out.println("1 Ver las calificaciones y el promedio de un estudiante.\n" + "2 Modificar las calificaciones de un estudiante.\n" + "3 Ver si un estudiante ha aprobado o no.\n" + "4 Ver el promedio general de todos los estudiantes.");
            int eleccio = lector.leerInt();

            if (eleccio == 1) {

            }
        }
    }
}
