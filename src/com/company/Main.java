package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1.10​. Sukurti skaičiuotuvo klasę, kurioje realizuoti statinius metodus sumai, skirtumui,
        // sandaugai. Per parametrus bus naudojami sveiko tipo skaičiai.
        // 1.11.​ Papildyti 1.10.​ programą, panaudojant metodų perkrovimą (overloading), sukurti
        // papildomus metodus, kad operacijos veiktų tiek su sveiko tipo skaičiais, tiek su skaičiais
        // po kablelio.

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite pirmaji skaiciu: ");
        float sk1 = sc.nextFloat();
        System.out.println("Iveskite antraji skaiciu: ");
        float sk2 = sc.nextFloat();
        Veiksmai.suma(sk1, sk2);
        Veiksmai.skirtumas(sk1, sk2);
        Veiksmai.sandauga(sk1, sk2);
    }
}
