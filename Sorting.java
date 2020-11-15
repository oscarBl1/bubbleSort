package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

    static ArrayList<Integer> number = new ArrayList<Integer>();

    public static void getNums() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any amount of numbers between 0 and 100. \"-1\" to stop: ");
        boolean keepGoing = true;
        while (keepGoing) {
            int numEnt = scan.nextInt();
            if (numEnt > 100 || numEnt < 0 && numEnt != -1) {
                System.out.println("Invalid number");
            } else if (numEnt == -1) {
                System.out.println("Stopping");
                keepGoing = false;
            } else {
                number.add(numEnt);
            }
        }
    }

    public static void sort() {
        for (int i = 0; i < number.size() - 1; i++) {
            for (int j = 0; j < number.size() - 1; j++) {
                if (number.get(j) > number.get(j + 1)) {
                    int k = number.get(j);
                    number.set(j, number.get(j + 1));
                    number.set(j + 1, k);
                }
            }
        }
    }

    public static void print() {
        System.out.println("\n\n\n");
        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }
    }
    
    public static void avg(){
        int average = 0;
        for(int i = 0; i < number.size(); i++){
            average = average + number.get(i);
        }
        int finAverage = average / number.size();
        int min = number.get(0);
        int max = number.get(number.size()-1);
        
        System.out.println("Average is: " + finAverage + ", Minimum is: " + min + ", Maximum is: " + max);
    }

    public static void main(String[] args) {
        getNums();
        sort();
        print();
        avg();

    }

}
