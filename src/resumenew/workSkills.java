
package resumenew;

public class workSkills {
   
    String skills;
   
    
    workSkills (){
    this.skills = "writing and reading";
    
    }

    workSkills(String m){
        
        this.skills = m;
    }
    
    public void workSkills(){
        System.out.print("Working skills is ");
        workSkills obj1 = new workSkills();
        workSkills obj2 = new workSkills("writing and reading");
    
    
       System.out.println(obj1.skills);

 
  }
}
