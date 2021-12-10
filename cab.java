import java.util.Scanner;
class Cab {
    int fare;
    
    public int Cab() {
        fare = 40;
     
    }
    
    
    
    void showFare() {
        System.out.println("Total Fare: " + fare);
    }
}

class RideCab {
    public static void main(String[] args) {
        Cab ob = new Cab(); 
        Scanner sc = new Scanner(System.in);
        int d = 0;
        
        
        System.out.print("Enter the distance travelled by user: ");
        d = sc.nextInt();
        
        
        
        ob.fare = ob.fare + 10 * d;
        
        ob.showFare();
        
    } 
}