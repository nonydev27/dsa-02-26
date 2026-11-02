import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
// printing a list of schools from an array
// initialisation at compile time

        String[] tertiarySchools = new String[5];

        tertiarySchools[0] = "UG";
        tertiarySchools[1] = "KNUST";
        tertiarySchools[2] = "UEW";
        tertiarySchools[3] = "UCC";
        tertiarySchools[4] = "FHU";
//        tertiarySchools[5] = "CU";

//        for(int i=0; i<tertiarySchools.length; i++){
//            System.out.println("Rank "+ i+ " : " + tertiarySchools[i]);
//        }

        //initialisation at runtime
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of friends you have: ");
        int arraysize = scanner.nextInt();
        String[] friends = new String[arraysize];

        for(int i=0; i<friends.length; i++){
            System.out.println("Enter your friend's name: "+(i+1)+ ":");
            friends[i] = scanner.nextLine();
        }

        System.out.println("Your friends are: ");
        for(int i =0; i < friends.length; i++){
            System.out.println("Friend "+(i+1)+" is "+friends[i]);
        }
    }
}