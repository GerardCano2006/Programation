package AEA3.Reserves_Carlos;

import AEA3.Funcions.LectorDatosTerminal;
import AEA3.Reserves_Carlos.CasaRural_Carlos;
import AEA3.Reserves_Carlos.Allotjament_Carlos;
import AEA3.Reserves_Carlos.Habitacio_Carlos;
import AEA3.Reserves_Carlos.Apartament_Carlos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_Carlos{
    public static void main(String[] args) {
        LectorDatosTerminal lector = new LectorDatosTerminal();

        System.out.println("Quants allotjaments vols afegir? (Cuants més, més divertit)");
        int numAllotjaments = lector.leerInt();
        Allotjament_Carlos[] allotjaments = new Allotjament_Carlos[numAllotjaments];

        int index = 0; //Porta el comptador de posicións del vector (per que no es desquarajingue)

        for (int i = 0; i < numAllotjaments; i++) {
            System.out.println("Selecciona quin allotjament vol: 1. Habitació, 2. Apartament, 3. Casa Rural");

            int eleccio = lector.leerInt();

            System.out.println("Nom de l'allotjament:");
            String nom = lector.leerString();
            System.out.println("Capacitat de l'allotjament:");
            int capacitat = lector.leerInt();
            boolean disponible = true;

            switch (eleccio) {
                case 1:  // Habitació
                    System.out.println("Número de llits:");
                    int llits = lector.leerInt();
                    allotjaments[index++] = new Habitacio_Carlos(nom, capacitat, disponible, llits);        //Pasa a la seguent posició
                    break;

                case 2:  // Apartament
                    System.out.println("Número d'habitacions:");
                    int habitacions = lector.leerInt();
                    System.out.println("Té cuina? (true/false)");
                    boolean teCuina = lector.leerBoolean();
                    allotjaments[index++] = new Apartament_Carlos(nom, capacitat, disponible, habitacions, teCuina);        //Pasa a la seguent posició
                    break;

                case 3:  // Casa Rural
                    System.out.println("Té jardí? (true/false)");
                    boolean teJardi = lector.leerBoolean();
                    System.out.println("Té piscina? (true/false)");
                    boolean tePiscina = lector.leerBoolean();
                    allotjaments[index++] = new CasaRural_Carlos(nom, capacitat, disponible, teJardi, tePiscina);       //Pasa a la seguent posició
                    break;

                default:
                    System.out.println("ERROR, no has introduït una de les opcións disponibles, torna a intentar-ho");
                    i--;  // Retrocedim casella (per no deixar una casella buida i que se lie parda)
                    break;
            }
        }

        // Menú per gestionar reserves
        boolean mostrar_menu = true;
        while (mostrar_menu) {
            System.out.println();
            System.out.println("Benvingut al menú!");
            System.out.println("1. Mostrar Allotjaments Disponibles");
            System.out.println("2. Reservar Allotjament");
            System.out.println("3. Alliberar Allotjament");
            System.out.println("4. Cerca Personalitzada");
            System.out.println("5. Sortir");

            int resposta = lector.leerInt();

            switch (resposta) {
                case 1:
                    System.out.println("Aquí té els Allotjaments Disponibles:");
                    for (int i = 0; i < index; i++) {
                        if (allotjaments[i].isDisponible()) {
                            System.out.println(allotjaments[i].mostrarInformacio());
                        }
                    }
                    break;

                case 2:     // Reservar Allotjament
                    System.out.println("Quin Allotjament vol reservar?:");
                    String nomReserva = lector.leerString();
                    boolean reservat = false;

                    for (int i = 0; i < index; i++) {
                        if (allotjaments[i].getNom().equalsIgnoreCase(nomReserva) && allotjaments[i].isDisponible()) {
                            System.out.println("Per quants dies vols reservar?");
                            int dies = lector.leerInt();

                            System.out.println("Quantes persones?");
                            int persones = lector.leerInt();

                            int extraPersones = 0;
                            if (persones > allotjaments[i].getCapacitat()) {
                                extraPersones = persones - allotjaments[i].getCapacitat();
                                System.out.println("La capacitat màxima és " + allotjaments[i].getCapacitat() + ", osigui que afegirem " + extraPersones + " llits extres.");
                            }

                            double preuTotal = allotjaments[i].calcularPreuTotal(dies, persones);
                            System.out.println("El preu total per " + dies + " dies serà: " + preuTotal + " euros");
                            System.out.println("Confirma amb true porfa");

                            if (lector.leerBoolean()) {
                                allotjaments[i].setDisponible(false);
                                System.out.println("Allotjament reservat amb èxit!");
                                reservat = true;
                            } else {
                                System.out.println("Reserva cancel·lada.");
                            }
                            break;
                        }
                    }

                    if (!reservat) {
                        System.out.println("No s'ha pogut reservar, l'allotjament està ocupat o no existeix.");
                    }
                    break;

                case 3:     //Alliberar Allotjament
                    System.out.println("Quin Allotjament vol alliberar?:");
                    String nomAlliberar = lector.leerString();
                    boolean alliberat = false;
                    for (int i = 0; i < index; i++) {
                        if (allotjaments[i].getNom().equalsIgnoreCase(nomAlliberar) && !allotjaments[i].isDisponible()) {       // Recorrem les posicións amb allotjaments NO disponibles
                            allotjaments[i].setDisponible(true);
                            System.out.println("Allotjament alliberat!");
                            alliberat = true;
                            break;
                        }
                    }
                    if (!alliberat) {
                        System.out.println("No s'ha trobat la reserva.");
                    }
                    break;

                case 4:     //Cerca Personalitzada
                    System.out.println("Introdueix el preu màxim per nit:");
                    double preuMax = lector.leerDouble();

                    //Preguntem les nits que volen reservar
                    System.out.println("Quantes nits vols reservar?");
                    int num_Nits = lector.leerInt();

                    while (num_Nits <= 0) {
                        System.out.println("El número de nits ha de ser positiu. Torna a introduir-lo:");
                        num_Nits = lector.leerInt();
                    }

                    //Preguntem les persones que volen reservar
                    System.out.println("Quantes persones seríeu?");
                    int num_Persones = lector.leerInt();

                    while (num_Persones <= 0) {
                        System.out.println("El número de persones ha de ser positiu. Torna a introduir-lo:");
                        num_Persones = lector.leerInt();
                    }

                    // Mira si hi ha allotjaments que pugin tenir jardí/piscina/cuina (osigui Apartaments o Cases Rurals), perque no pregunti si només hi han Habitacións
                    boolean hihaCasaRural = false;
                    boolean hihaApartament = false;

                    for (int i = 0; i < index; i++) {
                        String info = allotjaments[i].mostrarInformacio();      //Comprova si "mostrarInformacio" té "Jardí" o "Piscina"
                        if (info.contains("Jardí") || info.contains("Piscina")) {
                            hihaCasaRural = true;
                        }
                        if (info.contains("Cuina")) {                           //Comprova si "mostrarInformacio" té "Cuina"
                            hihaApartament = true;
                        }
                    }

                    boolean volFiltre = false;

                    boolean filtreJardi = false;
                    boolean filtrePiscina = false;
                    boolean filtreCuina = false;

                    // Si teinim una Casa Rural o un Apartament en el vector (registrat)
                    if (hihaCasaRural || hihaApartament) {
                        System.out.println("Vol filtrar per alguna característica? (true/false)");
                        volFiltre = lector.leerBoolean();

                        if (volFiltre) {
                            if (hihaCasaRural) {
                                System.out.println("Vol jardí? (true/false)");
                                filtreJardi = lector.leerBoolean();
                                System.out.println("Vol piscina? (true/false)");
                                filtrePiscina = lector.leerBoolean();
                            }
                            if (hihaApartament) {
                                System.out.println("Vol cuina? (true/false)");
                                filtreCuina = lector.leerBoolean();
                            }
                        }
                    }

                    System.out.println("Allotjaments dins el preu màxim:");
                    boolean trobat = false;

                    // Llista d'allotjaments filtrats
                    ArrayList<Allotjament_Carlos> allotjamentsFiltrats = new ArrayList<>();

                    for (int i = 0; i < index; i++) {
                        if (allotjaments[i].getPreuPerNit() <= preuMax) {  // Filtrem per preu

                            // Si NO vol filtrar per característiques, només per preu
                            if (!volFiltre) {
                                allotjamentsFiltrats.add(allotjaments[i]);
                            } else {
                                String info = allotjaments[i].mostrarInformacio(); //Obtenim la info

                                boolean conteJardi = info.contains("Jardí: Sí");
                                boolean contePiscina = info.contains("Piscina: Sí");
                                boolean conteCuina = info.contains("Cuina: Sí");

                                boolean compleixFiltre = true;
                                if (filtreJardi && !conteJardi) compleixFiltre = false;
                                if (filtrePiscina && !contePiscina) compleixFiltre = false;
                                if (filtreCuina && !conteCuina) compleixFiltre = false;

                                if (compleixFiltre) {
                                    allotjamentsFiltrats.add(allotjaments[i]);
                                }
                            }
                        }
                    }

                    // Si no hi ha allotjaments que compleixin amb el filtre
                    if (allotjamentsFiltrats.isEmpty()) {
                        System.out.println("No hi ha allotjaments per aquest preu o característiques.");
                    } else {
                        // Preguntar si quiere ordenar los resultados
                        System.out.println("Vol ordenar els resultats? (true/false)");
                        boolean volOrdenar = lector.leerBoolean();

                        if (volOrdenar) {
                            System.out.println("Com vols ordenar-los?");
                            System.out.println("1. Per preu");
                            System.out.println("2. Per característiques (Jardí, Piscina, Cuina)");

                            int tipusOrdenacio = lector.leerInt();

                            if (tipusOrdenacio == 1) { // Ordenar per preu
                                System.out.println("Vols ordenar per preu ascendent (true) o descendent (false)?");
                                boolean ascendent = lector.leerBoolean();

                                if (ascendent) {    //(Buscat)
                                    Collections.sort(allotjamentsFiltrats, Comparator.comparingDouble(Allotjament_Carlos::getPreuPerNit));  //Ordenats de manera ascendent
                                } else {
                                    Collections.sort(allotjamentsFiltrats, Comparator.comparingDouble(Allotjament_Carlos::getPreuPerNit).reversed());   //Ordenats de manera descendent
                                }

                            } else if (tipusOrdenacio == 2) { // Ordenar per característiques
                                System.out.println("Per quina característica vols ordenar?");
                                System.out.println("1. Jardí");
                                System.out.println("2. Piscina");
                                System.out.println("3. Cuina");

                                int caracteristica = lector.leerInt();
                                Comparator<Allotjament_Carlos> comparatorCaracteristica = null;

                                switch (caracteristica) {
                                    case 1: // Ordenar per Jardí
                                        comparatorCaracteristica = Comparator.comparing(a -> a instanceof CasaRural_Carlos && ((CasaRural_Carlos) a).isTeJardi() ? 1 : 0);
                                        break;
                                    case 2: // Ordenar per Piscina
                                        comparatorCaracteristica = Comparator.comparing(a -> a instanceof CasaRural_Carlos && ((CasaRural_Carlos) a).isTePiscina() ? 1 : 0);
                                        break;
                                    case 3: // Ordenar per Cuina
                                        comparatorCaracteristica = Comparator.comparing(a -> a instanceof Apartament_Carlos && ((Apartament_Carlos) a).isTeCuina() ? 1 : 0);
                                        break;
                                    default:
                                        System.out.println("Opció no vàlida. No s'ordenaran per característiques.");
                                }

                                if (comparatorCaracteristica != null) {
                                    Collections.sort(allotjamentsFiltrats, comparatorCaracteristica.reversed()); // Mostrem primer els que tenen la característica
                                }
                            } else {
                                System.out.println("Opció no vàlida. No s'ordenaran els resultats.");
                            }
                        }

                        // Mostrar resultats ordenats
                        System.out.println("Allotjaments trobats:");
                        for (Allotjament_Carlos a : allotjamentsFiltrats) {
                            System.out.println(a.mostrarInformacio());
                        }
                    }
                    break;

                case 5:     //Exit
                    System.out.println("Espero que hagis disfrutat del nostre servei...");
                    System.out.println("Adéu bb");
                    mostrar_menu = false;
                    break;

                default:
                    System.out.println("ERROR, opció no vàlida!");
            }
        }
    }
}
