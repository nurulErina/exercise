
package resumenew;

public class talent {
    
    String cooking,bakingCake,makingVideo;
    
    talent(){
    this.cooking = "Nasi Ayam";
    this.bakingCake = "Chocolate Moist";
    this.makingVideo = "Video like vlog";
    
    }

    talent(String r,String e,String h ){
        
        this.cooking = r;
        this.bakingCake = e;
        this.makingVideo = h;
    }
    
    public void talent(){
        System.out.print("My talent is: ");
        talent obj1 = new talent();
        talent obj2 = new talent("\n1.Cooking","2.Baking cake","3.Making video");
        
    
       System.out.println(obj2.cooking);
       System.out.println(obj2.bakingCake);
       System.out.println(obj2.makingVideo);

    
 }
    
}


