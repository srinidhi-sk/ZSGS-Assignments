import java.util.Arrays; 
import java.util.Scanner;
public class SearchYear{
	public static void binarySearchYear(int [] years , int year){
		int left = 0;
        	int right = years.length-1;
        	while(left<=right){
	            	int mid = left + ((right-left)/2);
        	    	if(years[mid]==year){
                		System.out.println("Record exists.");
						return;
            		}
            		else if(years[mid]<year){
                		left = mid+1;
            		}
            		else{
                		right = mid-1;
            		}
        	}
       		System.out.println("Record does not exist.");
    	}

    	public static void main(String[] args) {
        	int[] years = {1982, 1987, 1993, 1996, 1999, 2002 , 2003, 2006, 2007, 2009, 2010, 2016};

	        Scanner sc = new Scanner(System.in);
        	System.out.print("Enter graduation year to search: ");
      		int year = sc.nextInt();
		
		binarySearchYear(years,year); 
		sc.close();     	
	}
}