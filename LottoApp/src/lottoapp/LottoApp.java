/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luke
 */
public class LottoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lotto losowanie = new Lotto();
        List<Integer> userNumbers = new ArrayList<>();
        
        System.out.println("Podaj kolejno 6 liczb z przedziału 1-49.");
        userNumbers.add(sc.nextInt());
        sc.nextLine();
        userNumbers.add(sc.nextInt());
        sc.nextLine();
        userNumbers.add(sc.nextInt());
        sc.nextLine();
        userNumbers.add(sc.nextInt());
        sc.nextLine();
        userNumbers.add(sc.nextInt());
        sc.nextLine();
        userNumbers.add(sc.nextInt());
        sc.nextLine();
        System.out.println("Rozpoczęto losowanie.");
        losowanie.generate();
        System.out.println("Wylosowana 6-tka to: ");
        losowanie.randomize();
        System.out.println("Miałeś " + losowanie.checkResult(userNumbers) + " trafień.");
        
    }
    
}
