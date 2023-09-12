import java.util.Scanner;

class RoomAvailability{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter total num of rooms");
        String totalRooms = s.nextLine();
        int totalRoomsInt = Integer.parseInt(totalRooms);
        
        
        System.out.println("Enter num of rooms needed");
        String numofRoomNeed = s.nextLine();
        int numOfRoomInt = Integer.parseInt(numofRoomNeed);
        
        roomsAvailable(totalRoomsInt,numOfRoomInt);
    }
    
static void roomsAvailable(int totalRoomsInt,int numOfRoomInt){
       int currentAvail = totalRoomsInt-numOfRoomInt;
        System.out.println("Current Room Availability"+currentAvail);
    }
}