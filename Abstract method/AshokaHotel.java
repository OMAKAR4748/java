package com.xworkz.Abstraction;

public class AshokaHotel extends Hotel{
    @Override
    public void portableRoom() {
        System.out.println("portable Rooms");
    }

    @Override
    public void service() {
        super.service();
    }

    @Override
    public void advanceBooking() {
        super.advanceBooking();
    }
}
