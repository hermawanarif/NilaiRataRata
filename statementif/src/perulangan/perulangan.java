/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author Lk09Nu26Uty
 */
public class perulangan {

   public static void statemnetIf(){
   double grade = 92.0;
       if (grade >= 90) {
           System.out.println("Excellent!!");
       } else if( (grade < 90 ) && (grade >= 80)){
           System.out.println("Good Job!!");
       } else if((grade < 80) && (grade >= 60)){
           System.out.println("Study Hard!!");
       } else {
           System.out.println("Sorry, you failed");
       }
   }
   
   public static void statementSwitch(){
   int grade = 92 ;
       switch (grade) {
           case 100:
           case 92:
               System.out.println("Excellent!!");
               break;
           case 90:
               System.out.println("Good Job!!");
               break;
           case 80:
               System.out.println("Study Hard");
               break;
           default:
               System.out.println("Sorry, you failed");
       }
   }
   
   public static void statementBreak(){
   String names[] = {"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
   String searchName = "Yza";
   boolean foundName = false;
       for (int i = 0; i < names.length; i++) {
           if (names[i].equals(searchName)) {
               foundName = true;
               break;  
           }
       }
       if (foundName) {
           System.out.println(searchName + " found! ");
       }else{
           System.out.println(searchName+ " not found ");
       }
   }
   
   public static void labeledBreakStatement(){
   String names[]={"Beah","Bianca","Lance","Beah"};
   int count = 0;
   searchLabel:
   for (int i = 0; i < names.length; i++) {
       if (!names[i].equals("Beah")) {
           break searchLabel;
       }
       count++;
   }
       System.out.println("There are "+ count + " Beahs in the list");
   }
   
   public static void labeledContinueStatement(){
   String names[] = {"Beah","Bianca","Lance","Beah"};
   int count = 0;
       for (int i = 0; i < names.length; i++) {
           if (!names[i].equals("Beah")) {
               continue;  
           }
           count++;
       }
       System.out.println("There are " + count + " Beahs in the list");
   }
   
   public static void labeledStatementContinue(){
       outerLoop:
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.println("Inside for(j) loop");
               if (j == 2 ) continue outerLoop;
           }
           System.out.println("Inside for(i) loop");
        }
   }
   
      public static void infinityloop(){
       for (;;) {
           System.out.println("qwerty");
       }
   //String names[] = {"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
   //String searchName = "Yza";
   //boolean foundName = false;
       //for (int i = 0; i <= names.length; i++) {
           //if (names[i].equals(searchName)) {
              // foundName = true;
              // break;  
          // }
      // }
      // if (foundName) {
      //     System.out.println(searchName + " found! ");
      // }else{
        //   System.out.println(searchName+ " not found ");
     //  }
   }
   
    public static void main(String[] args) {
        //statemnetIf();
        //statementSwitch();
        statementBreak();
        //labeledBreakStatement();
        //labeledContinueStatement();
        //labeledStatementContinue();
        //infinityloop();
        //Pemrograman Java
        //qweqwhkhfjsjs
    }
    
}