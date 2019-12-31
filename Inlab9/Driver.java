
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String [] args)
    {
//         Dog watson = new Dog("Basset Hound", 6);
//         Dog frieda = new Dog("Dachshund");
//         Dog humperdink = watson;
// 
//         watson = watson.methodB(humperdink, frieda, new Dog("Lab", 2));
// 
//         System.out.println(watson.getBreed()); 		
//         System.out.println(frieda.getBreed()); 	
//         System.out.println(humperdink.getBreed()); 		
//         System.out.println(humperdink.num); 
        
        
        
//  
//         Restaurant r1 = new Restaurant("r1", 4);
//         Restaurant veracruz = new Restaurant("Veracruz");
//         
//         r1 = veracruz.method(r1, veracruz);
//         
//         System.out.println(r1.getName());
//         System.out.println(veracruz.getName());
//         System.out.println(r1.count);
//         System.out.println(Restaurant.count);
//         
        
        
        
        
//         Car c1 = new Car("KIA");
//         Garage g1 = new Garage(new Car("Chevy"));
//         Car explorer = new Car();
// 
//         System.out.println(c1.getMake());       	
//         System.out.println(g1.getMake());      
//         System.out.println(explorer.getMake());	
// 
//         g1.setCar(c1.testMethod(g1, new Garage(new Car("Subaru")), explorer));
// 
//         System.out.println(c1.getMake());	
//         System.out.println(g1.getMake());	
//         System.out.println(explorer.getMake());	
//         
        
        
        
        
          Band frampton = new Band("Alive", 6000);
        RecordCompany warner = new RecordCompany(new Band("Devo", 1000));
        Band startUp = new Band(30);
        RecordCompany rca = new RecordCompany(warner.getBand());

        System.out.println(frampton.getAlbum());       	
        System.out.println(warner.getAlbum());      	
        System.out.println(startUp.getAlbum());	            
        
        rca = frampton.testQuestion(warner, new RecordCompany(new Band(9)), rca.getBand());

        System.out.println(frampton.getAlbum());		    
        System.out.println(warner.getAlbum());	 
        System.out.println(startUp.getAlbum());	   
        System.out.println(warner.getBand().count); 

    }
}
