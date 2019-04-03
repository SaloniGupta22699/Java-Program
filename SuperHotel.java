class Hotel {
    public int bookings;
    public void book(int i) {
        bookings++;
    }
}

public class SuperHotel extends Hotel {
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book(size);
        bookings += size;
    }
    
    public static void main(String args[]) {
        Hotel hotel = new SuperHotel();
        hotel.book(2);
        System.out.print(hotel.bookings);
    }
}