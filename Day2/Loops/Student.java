public class Student{
	
	public void calculateGradeUsingIf(int m1, int m2 , int m3){
		if ((m1 < 0 || m1 > 100) || (m2 < 0 || m2 > 100) || (m3 < 0 || m3 > 100)) {
            System.out.println("Invalid Input");
            return;
        }

        int total = m1 + m2 + m3;
        float percent = total / 3f;
		int grade = 0;

        // Using if statement
        System.out.print("Grade using if: ");
        if (percent >= 85 && percent <= 100) {
            System.out.println("A");
			grade = 1;
        }
		else if (percent >= 70) {
            System.out.println("B");
			grade = 2;
        } 
		else if (percent >= 50) {
            System.out.println("C");
			grade = 3;
        } 
		else {
            System.out.println("Fail");
			grade = 4;
        }

        // Using switch statement
        System.out.print("Grade using switch: ");

    	switch (grade) {
        	case 1:
            	System.out.println("Grade: A");
            	break;
        	case 2:
            	System.out.println("Grade: B");
            	break;
        	case 3:
            	System.out.println("Grade: C");
            	break;
        	case 4:
            	System.out.println("Fail");
            	break;
        	default:
            	System.out.println("Invalid grade code");
    	}
	}

	public static void main(String[]args){
		Student s = new Student();
		int m1 = 76;
		int m2 = 87;
		int m3 = 94;
		System.out.println("Grade of the student ");	
		s.calculateGradeUsingIf(m1,m2,m3);	
	}
}		