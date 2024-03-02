/*1.write a program in java  to create  a class for room with data members, length, breadth and height and method cal_area to calculate the area of the room and display it. Derive two subclasses from this class having the names bedroom and drawing room  where bedroom will hava attached bathroom, study table and night lamp and a display method to display all these features. Drawing room will have sofa and wall cabinet and  a display method  to do the same. Also display the areas of both bedroom and drawing room.*/

class Room {
    double length;
    double breadth;
    double height;

    Room(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double cal_area() {
        return length * breadth;
    }
}

class Bedroom extends Room {
    String attachedBathroom;
    String studyTable;
    String nightLamp;

    Bedroom(double l, double b, double h, String ab, String st, String nl) {
        super(l, b, h);
        attachedBathroom = ab;
        studyTable = st;
        nightLamp = nl;
    }

    void display() {
        System.out.println("Bedroom Area: " + cal_area());
        System.out.println("Attached Bathroom: " + attachedBathroom);
        System.out.println("Study Table: " + studyTable);
        System.out.println("Night Lamp: " + nightLamp);
    }
}

class DrawingRoom extends Room {
    String sofa;
    String wallCabinet;

    DrawingRoom(double l, double b, double h, String s, String wc) {
        super(l, b, h);
        sofa = s;
        wallCabinet = wc;
    }

    void display() {
        System.out.println("Drawing Room Area: " + cal_area());
        System.out.println("Sofa: " + sofa);
        System.out.println("Wall Cabinet: " + wallCabinet);
    }
}

public class Main {
    public static void main(String[] args) {
        Bedroom bd = new Bedroom(10.0, 20.0, 30.0, "Yes", "Yes", "Yes");
        DrawingRoom dr = new DrawingRoom(20.0, 30.0, 40.0, "Yes", "Yes");

        bd.display();
        dr.display();
    }
}
