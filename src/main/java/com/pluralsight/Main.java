package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {

            // --- Testing Employee Class ---
            System.out.println("--- Employee Details ---");
            Employee emp = new Employee(101, "Alice Smith", "Housekeeping", 20.0, 40, 5);
            System.out.println("Employee: " + emp.getName());
            System.out.println("Regular Hours: " + emp.getRegularHours());
            System.out.println("Total Pay: $" + emp.getTotalPay());
            System.out.println();

            // --- Testing Room Class ---
            System.out.println("--- Room Status ---");
            // Creating a room that is not occupied but is dirty
            Room room1 = new Room(2, 150.0, false, true, false);
            System.out.println("Room Price: $" + room1.getPrice());
            System.out.println("Is Dirty? " + room1.isDirty());
            System.out.println("Is Available? " + room1.isAvailable());
            System.out.println();

            // --- Testing Reservation Class ---
            System.out.println("--- Reservation Summary ---");
            Reservation res = new Reservation("king", 3, true);
            // Note: getPrice() must be called to set the internal price field based on roomType
            double nightlyPrice = res.getPrice();
            double total = res.getReservationTotal();

            System.out.println("Room Type: " + res.getRoomType());
            System.out.println("Nightly Rate: $" + nightlyPrice);
            System.out.println("Weekend Stay: " + res.isWeekend());
            System.out.println("Total Cost (including weekend surcharge if applicable): $" + total);
        }
}


