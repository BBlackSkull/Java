package com.company;

public class TryCatchMian {
    public static void main(String[] args){

        try {

            int result = 0/5;

        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");

    }
}
