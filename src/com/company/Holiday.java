package com.company;
import java.util.List;

public class Holiday {

    String desc;
    String countr;
    String hot;
    String ter;
    String fd;
    int pr;

    public Holiday(){

    }

    public Holiday(String description, String Country, String Hotel, String term, String food, int price ) {
        desc = description;
        countr = Country;
        hot = Hotel;
        ter = term;
        fd = food;
        pr = price;
    }
    public int getPrice(List<Holiday> holidays,String room, String term)
    {
        for (Holiday holiday : holidays){
            if(holiday.getRoom() == room && holiday.getDate() == term){
                return holiday.pr;
            }else{
                return 0;
            }
        }
        return 0;
    }

    public String getDate(){
        return ter;
    }

    public String getRoom(){
        return hot;
    }

    public void getAllInformation(){
        System.out.println("Opis: " + desc);
        System.out.println("Kraj: " + countr);
        System.out.println("Hotel: " + hot);
        System.out.println("Termin: " + ter);
        System.out.println("Wyżywienie: " + fd);
        System.out.println("Cena: " + pr);

    }
}
