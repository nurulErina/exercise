
package resumenew;

public class workExperiences {
    
     String work;
    
    workExperiences(){
    this.work = "cashier Mr Diy";
    
    }

    workExperiences(String k){
        
        this.work = k;
    }
    
    public void workExperiences(){
        System.out.print("Work experiences is ");
        workExperiences obj1 = new workExperiences();
        workExperiences obj2 = new workExperiences("cashier Mr Diy");
    
    
       System.out.println(obj1.work);

    
 }
}
