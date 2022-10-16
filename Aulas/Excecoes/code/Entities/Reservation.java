package Excecoes.code.Entities;


import Excecoes.code.Exception.InvalidDateException;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;


    public int duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date CheckOut){
        Date now = new Date();
        if(checkOut.before(now) || checkIn.before(now)){
            throw new InvalidDateException("CheckOut is smaller than checkIn");
        }
        if( checkIn.after(checkOut) ){
            throw new InvalidDateException("some 1 night");
        }else{
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }

    }

}
