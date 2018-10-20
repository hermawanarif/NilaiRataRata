/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5array;

/**
 *
 * @author Lk09Nu26Uty
 */
public class Bab5Array {

    public static void elementArray(){
    int[] ages = new int[100];
    for (int i = 0; i < 100; i++) {
            System.out.print(ages[i]);
        }
    }
    
    public static void panjangArray1(){
    int[] ages= new int[100];
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]);
        }
    }
    
    public static void panjangArray2(){
    //Elemen 512 x 128 dari integer array
    int[][] twoD =  new int [512][128];
    // karakter array 8 x 6 x 24
    char[][][] threeD = new char [8][6][24];
    //String array 4 baris x 2 kolom
    String[][] dogs = {{"terry", "brown"},
                        {"Kristin","white"},
                        {"toby","gray"},
                        {"fido","black"}};
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs[j].length; j++) {
                System.out.print(dogs[i][j]+"\t ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        //elementArray();
        //panjangArray1();
        panjangArray2();
    }
    
}
