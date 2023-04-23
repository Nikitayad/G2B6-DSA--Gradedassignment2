package skyscraper;
import java.util.Scanner;
public class SkyscraperConstruction {
	    
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the total number of floors in the building: ");
	        int n = sc.nextInt();
	        
	        int[] floorSizes = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter the floor size given on day " + (i+1) + ": ");
	            floorSizes[i] = sc.nextInt();
	        }
	        
	        int[] assembledFloors = new int[n];
	        int index = -1;
	        
	        for (int i = 0; i < n; i++) {
	            if (i == 0) {
	                assembledFloors[++index] = floorSizes[i];
	                System.out.println("Day: " + (i+1));
	                System.out.println(floorSizes[i]);
	            } else {
	                int j = index;
	                while (j >= 0 && assembledFloors[j] > floorSizes[i]) {
	                    j--;
	                }
	                if (j < index) {
	                    assembledFloors[++j] = floorSizes[i];
	                    index = j;
	                    System.out.println("Day: " + (i+1));
	                    for (int k = 0; k <= index; k++) {
	                        System.out.print(assembledFloors[k] + " ");
	                    }
	                    System.out.println();
	                } else {
	                    System.out.println("Day: " + (i+1));
	                    System.out.println();
	                }
	            }
	        }
	    }
	}

