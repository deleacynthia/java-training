package clean.code.design_patterns.requirements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CasaDeMarcat lapte = new Lapte();
        CasaDeMarcat ciocolata = new Ciocolata();
        CasaDeMarcat branza = new Branza();
        CasaDeMarcat oua = new Oua();
        CasaDeMarcat cereale = new Cereale();

        Scanare scanare = new Scanare();

        PretTotal pretTotal = PretTotal.getInstance();
        System.out.println("Bine ai venit!");
        String raft;

        label:

        while (true) {
            System.out.println("Alege din produsele disponibile pe raft(branza, cereale, ciocolata, lapte, oua)");
            System.out.println("Daca doresti sa termini cumparaturile, introdu exit");
            raft = scanner.nextLine();

                switch (raft) {
                    case "lapte":
                        scanare.adaugare(lapte);
                        System.out.println("Produs adaugat cu succes!\n");
                        break;
                    case "ciocolata":
                        scanare.adaugare(ciocolata);
                        System.out.println("Produs adaugat cu succes!\n");
                        break;
                    case "branza":
                        scanare.adaugare(branza);
                        System.out.println("Produs adaugat cu succes!\n");
                        break;
                    case "oua":
                        scanare.adaugare(oua);
                        System.out.println("Produs adaugat cu succes!\n");
                        break;
                    case "cereale":
                        scanare.adaugare(cereale);
                        System.out.println("Produs adaugat cu succes!\n");
                        break;
                    case "exit":
                        break label;
                    default:
                        System.out.println("Produs indisponibil pe raft!");
                        break ;
                }
            }

            scanare.scaneaza();
            System.out.println("TOTAL: " + pretTotal.getTotal() + " LEI");
        }
    }

