/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.exceptions.DomainException;

/**
 *
 * @author debora
 */
public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if(!checkOut.after(checkIn)){
           throw new DomainException("Checkout must be after checkin date");
        }      
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.DAYS.MILLISECONDS);
    }
    
    public void updateDate(Date checkIn, Date checkOut){        
        Date now = new Date();
        if(checkIn.before(now) || checkIn.before(now)){
           throw new DomainException("tha dates must be future") ;
        }
        if(!checkOut.after(checkIn)){
           throw new DomainException("Checkout must be after checkin date");
        }              
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    @Override
    public String toString(){
        return "room "
                + roomNumber 
                + ", checkin: "
                + sdf.format(checkIn)
                + ", checkout: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + "nights";
    }
}
