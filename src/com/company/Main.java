package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    
/*
  Wypisaæ na ekran sumê ci¹gu arytmetycznego o N elemntach, rozpoczynaj¹cego siê od elemetu A1 i
   rosn¹cego o losow¹ wartoœæ
 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int A1 = 0;
        Boolean parseResult = false;
        System.out.print("Podaj N:");
        try{
            n = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Zly format!");

        }
        System.out.print("Podaj A1:");
        try{
            A1 = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Zly format!");
        }
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            A1 += rand.nextInt(1000);
            System.out.println(A1);
        }


        //LAB 3-4 B)
        Holiday filtering = new Holiday();

        List<Holiday> holidayList = new ArrayList<Holiday>(){
            {
                add(new Holiday("Wakacje w Grecji", "Grecja", "Hotel 1", "23-03-2016", "Banan", 2000));
                add(new Holiday("Wakacje w Hiszpanii", "Hiszpania", "Hotel 2", "24-03-2016", "Bigos", 3000));
                add(new Holiday("Wakacje we Wloszech", "Wlochy", "Hotel 3", "25-03-2016", "Pizza", 4000));
            }
        };

        int result = filtering.getPrice(holidayList,"Hotel 1", "23-03-2016");
        System.out.println("Cena takiego hotelu wynosi: " + result);

        for (Holiday holidays : holidayList){
            holidays.getAllInformation();
        }

        //oblsuga stworzonego wyjatku

        String word;
        System.out.println("Podaj pusty znak w celu wywolania wyjatku");
        word = br.readLine();

        try{
            if(word.contains(" ")){
                throw new WordContainsException();
            }
        }
        catch(WordContainsException ex)
        {
            ex.printStackTrace();
            System.out.println("Obsluga wyjatku uruchomiona Kod Bledu:" + ex.hashCode() + ex.getMessage() );
        }
        finally {
            System.out.println("Instrukcja finally ktora sie wykona pomimo wyjatku");
        }
    }

}

