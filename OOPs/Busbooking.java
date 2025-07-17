package OOPs;
import java.util.*;
public class Busbooking {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
       int seatNo;
       
       bus obj =new bus("Konduskar",786);

        while(true){
            System.out.println("Enter the Option : \n1.Book Seat \n2.Display Available seats");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                        System.out.print("Enter Seat No. To Book in Koduskar Travelers : ");
                        seatNo = sc.nextInt();
                        obj.bookseat(seatNo);
                        break;

                case 2: 
                        System.out.println(" Available Seats in Bus : ");
                        obj.display();
                        break;
                default:
                break;
            }
        }
    }
}

class bus {
    boolean[] seats = new boolean[41];
    String[] Destination = {"Sangli","Solapur", "Kolhapur","Pune","Pakistan"};
    String busName;
    int Busno;

    bus(String name,int no) {
        this.busName = name;
        this.Busno = no;
    }

    public void bookseat(int seatNo){
        if(seats[seatNo]==true){
            System.out.println( "Seat no. " + seatNo + " is Already booked pls Choose Another Seat No. ");
        }else{
            seats[seatNo] = true;
            System.out.println(" Seat No. " + seatNo + " is booked successfully in bus " + busName);
        }
    }

    public void display(){
        for(int i=1;i<seats.length;i++){
            if(seats[i]==false){
                System.out.print(" " + i);
            }
        }
    }

    public void destinaton(){
        
    }
}
