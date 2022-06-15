/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;

/**
 *
 * @author jesus
 */
public class Digimon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        List<String> digimon=new ArrayList<String>();
        String nombre="";
        while(scanner.hasNext()){
            nombre=scanner.nextLine();
            digimon.add(nombre);
        }
        for(int i=0;i<digimon.size();i++){
            System.out.print("\""+digimon.get(i)+"\",");
	}
    }
    
}
