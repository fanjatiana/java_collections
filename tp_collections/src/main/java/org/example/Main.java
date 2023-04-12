package org.example;


import java.awt.desktop.UserSessionEvent;
import java.text.Collator;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        //collection : les  Listes
        // a)
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Japon"));
        countries.add(new Country("Espagne"));
        countries.add(new Country("Suède"));
        countries.add(new Country("France"));
        System.out.println("La collection créée contient: " + countries.size() + " pays");

        // b) afficher chaque pays de la collection
        for (Country c : countries) {
            System.out.println(c.getName());
        }

        // c)  vider la collection
        countries.clear();
        boolean isEmpty = true;

        if (isEmpty) {
            System.out.println("votre liste est vide");
        } else {
            // recherche de données: afficher la liste de pays si il y a
            for (Country c : countries) {
                System.out.println(c.getName());
            }
        }

        // d)
        countries.add(new Country("Japon"));
        countries.add(new Country("Espagne"));
        countries.add(new Country("Angleterre"));
        countries.add(new Country("France"));
        System.out.println("La collection créée contient: " + countries.size() + " pays");
        // afficher chaque pays de la collection
        for (Country c : countries) {
            System.out.println(c.getName());
        }

        // modifier un pays avec la méthode set();
        countries.set(1, new Country("Chine"));
        for (Country c : countries) {
            System.out.println(c.getName());
        }

        // trier la collection avec la méthode sort() et compareTo() : par orde alphabétique
        // asc
        CountryComparator countrySortedAsc = new CountryComparator(true);
        Collections.sort(countries, countrySortedAsc);
        for (Country country : countries) {
            System.out.println(country.getName());
        }

        //dsc
        CountryComparator countrySortedDsc = new CountryComparator(false);
        Collections.sort(countries, countrySortedDsc);
        for (Country country : countries) {
            System.out.println(country.getName());
        }

        // tri du plus grand au plus petit mot (boucle imbriqué ?)


        // suppression des pays qui ont plus de 5 caractères
        countries.removeIf(country -> country.getName().length() > 5); // suppression de la France + Angleterre
        for (Country country : countries) {
            System.out.println(country.getName());
        }

        // Exercices Set
        // a)
        Set<String> colors = new HashSet<>();
        colors.add("Rouge");
        colors.add("Cyan");
        colors.add("Bleu");
        colors.add("Vert");

        // b)
        colors.remove("Rouge");
        System.out.println(colors);
        // c)
        Set<String> others = new HashSet<>();
        others.add("Jaune");
        others.add("Magenta");

        // d) Fusionner 2 sets
        colors.addAll(others);
        System.out.println(colors);

        // e)
        colors.removeIf(color -> color.equals("Vert"));
        System.out.println(colors);

        // f)
        colors.removeAll(others);
        System.out.println(colors);

        // g)
        colors.clear();
        others.clear();
        System.out.println(colors);
        System.out.println(others);

        // Exercices Map
        Map<String, String> contact = new HashMap<>();
        contact.put("Boris", "0660000010");
        contact.put("Arthur", "0607070606");
        contact.put("Thibaul", "0605000005");
        contact.put("Estelle", "0700000700");

        // b) afficher infos Arthur
        for (Map.Entry infos : contact.entrySet()) {
            if (infos.getKey().equals("Arthur")) {
                System.out.println("Prénom:" + infos.getKey() + ", Tel:" + infos.getValue());
            }
        }
        // c) afficher tout le carnet
        for (Map.Entry infos : contact.entrySet()) {
            System.out.println(infos.getKey() + ":" + infos.getValue());
        }

        // d) modifier numero de Boris
        for (Map.Entry infos : contact.entrySet()) {
            if (infos.getKey().equals("Boris")) {
                contact.replace("Boris", "0660000010", "0799999907");
                System.out.println("Prénom:" + infos.getKey() + ", Tel:" + infos.getValue());
            }
        }

        // e) ajouter les . aux numéros
        for (Map.Entry infos : contact.entrySet()) {
            String number = (String) infos.getValue();
            //Format String to ‘##.##.##.##.##‘ (Pattern) -> 06.05.00.00.05
            number = number.replaceFirst("(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "$1.$2.$3.$4.$5");
            System.out.println(number);
        }

        // f) Enum regions

        HashMap<String, User> contacts = new HashMap<>();
        contacts.put("1", new User("Boris", "07.99.99.99.99", Region.FRANCE));
        contacts.put("2", new User("Arthur", "06.07.07.06.06", Region.SUISSE));
        contacts.put("3", new User("Thibault", "06.05.00.00.05", Region.POLYNESIE));
        contacts.put("4", new User("Estelle", "07.00.00.07.00", Region.MARTINIQUE));

        for (Map.Entry entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}