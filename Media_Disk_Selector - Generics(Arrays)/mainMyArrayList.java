/** This the main class for running the myArrayList class*/

public class mainMyArrayList
{
    public static void main(String[] args) {
    
    MyArrayList<MediaDisk> myList = new MyArrayList<>();
    
    DVD d1 = new DVD(3, 76.50, "John Wick: C1", 94, 199.00);
    DVD d2 = new DVD(3, 76.50, "John Wick: C2", 105, 199.90);
    DVD d3 = new DVD(12, 76.50, "Daredevil", 75, 150.09);
    
    Audio a1 = new Audio(25, 55.50, "Off Season: J Cole", 49, 99.00);
    Audio a2 = new Audio(14, 55.50, "Scorpion: Drake", 62, 75.01);
    Audio a3 = new Audio(33, 55.50, "Isina Muva: Sjava ", 66, 102.59);
    
    /** Populating and Manipulating the array of objects.*/
    myList.add(0,d1);
    myList.add(1,a1);
    myList.add(2,d2);
    myList.add(3,a2); 
    myList.add(4,d3);
    myList.add(5,a3);
    
    System.out.println("Original list");
    for(int i=0;i<myList.getSize();i++){
        System.out.println((myList.get(i)).toString());
    }
    
    System.out.println("\n" + "Sorted list");
    for(int i=0;i<myList.getSize();i++){
        if (myList.sortList())
            System.out.println((myList.get(i)).toString());
    }
    
    System.out.println("\n" + "Removed from the list");
    for(int i=0;i<myList.getSize();i++){
        myList.remove(1);
        System.out.println((myList.get(i)).toString());
    }
  }
}
