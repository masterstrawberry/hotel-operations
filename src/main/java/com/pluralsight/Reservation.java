package com.pluralsight;

public class Reservation {

    String roomType;
    Double price;
    int numberOfNights;
    boolean isWeekend;
    double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        }else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        if (isWeekend) {
            reservationTotal = price*numberOfNights*1.10;

        }else {
            reservationTotal = price*numberOfNights;
        }
        return reservationTotal;
    }

}
