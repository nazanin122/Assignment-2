/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2.pkg1;
import java.util.Scanner; 

public class Task21 {


    public static void main(String[] args) {
    

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world population calculator");
        
        System.out.print("Enter the current world population: ");
        long population = input.nextLong();
        
        System.out.print("Enter the current growth rate: (e.g, 1.14% would be .0114): ");
        double growth = input.nextDouble();
        double total;
        
        System.out.println("Year Estimated Population Change from prior Year");
        
        int count = 1; 
        while (count <= 75) {
            total = population * growth;
            population += total;
            System.out.printf("%-10d%-10d%20.0f\n", count, population, total);
            count++;


    }
    
  }

}
