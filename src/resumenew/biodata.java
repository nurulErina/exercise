
package resumenew;


public class biodata {
    
 String name;
        String age;
        String MaritalStatus;
        String Citizenship;
        String HomeAddress;
        String birthday;
        

    biodata() {
        
        this.name = "Nurul Erina Mohammed Din";
        this.age = "21 Years old";
        this.MaritalStatus = "Single";
        this.Citizenship = "Malaysia";
        this.HomeAddress = "A-05-28 Pangsapuri Sri Penara, Bandar Sri Permaisuri, 56000, Cheras, Kuala Lumpur";
        this.birthday = "22 september 1999";
        
    }
    
    biodata(String n,String a,String m,String c,String h,String e){
    this.name = n;
    this.age = a;
    this.MaritalStatus = m;
    this.Citizenship = c;
    this.HomeAddress = h;
    this.birthday = e;
    }

    void printName() {
        System.out.println("Name: " +name); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Age: " +age);
        System.out.println("Marital Status: " +MaritalStatus);
        System.out.println("Home Address: " +HomeAddress);
        System.out.println("Birthday: " +birthday);
    }
    
}

