
package resumenew;


public class cgpa {
    
    double cgpa1 = 3.40;
    double gpa [] = new double[3];
    double sum = 0;
    double finalcgpa = 0;
    
    
    cgpa(){
        
        
        this.gpa[0] = 3.35;
        this.gpa[1] = 3.42;
        this.gpa[2] = 3.60;
        
    }
    
    cgpa(double a,double b, double c){
    gpa[0] = a;
    gpa[1] = b;
    gpa[2] = c;
    
    }
    
     public void printCGPA() {
	cgpa obj1= new cgpa();
	cgpa obj2= new cgpa ();
	   
    System.out.println("Default Constructor");
    double sum=0, finalcgpa=0;
    for(int i=0; i<obj1.gpa.length; i++) {
        sum+= obj1.gpa[i];
        System.out.println("GPA Semester "+i+ " : " +obj1.gpa[i]);
     }
    
    finalcgpa= sum/obj1.gpa.length;
    System.out.println("Average of GPA "+finalcgpa);
    System.out.println("CGPA : "+obj1.cgpa1);

    System.out.println("Constructor With Parameter");
    double sum2=0, finalcgpa2=0;
    for(int i=0; i<obj2.gpa.length; i++) {
       sum2= obj2.gpa[i]+sum2;	
       System.out.println("GPA Semester "+i+ " : "+obj2.gpa[i]);
    }
    finalcgpa2=(sum2/obj1.gpa.length);
    System.out.println("Average of GPA : "+finalcgpa2);
    System.out.println("CGPA : "+ obj2.cgpa1);
 	
 	
 	
 }

}
