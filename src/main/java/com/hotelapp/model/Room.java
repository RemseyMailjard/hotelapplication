package com.hotelapp.model;


public class Room {
	private int roomNumber;
	private RoomType roomType;
	private double pricePerNight;
	private boolean isAvailable;

	public Room(int roomNumber, RoomType roomType, double pricePerNight, boolean isAvailable) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.isAvailable = isAvailable;
	}

	public boolean checkAvailability() {
		return isAvailable;
	}

	public void markAsOccupied() {
		isAvailable = false;
	}

	public void markAsAvailable() {
		isAvailable = true;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void displayRoomInfo() {
		System.out.println("Room number: " + roomNumber);
		System.out.println("Room type: " + roomType);
		System.out.println("Price per night: " + pricePerNight);
		System.out.println("Available: " + isAvailable);
	}
}