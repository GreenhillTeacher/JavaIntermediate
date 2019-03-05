package com.suarez;

public class AutoClient {
    public static void main(String [] args)
    {
        Auto car1= new Auto("Ford", 9, 7.8);
        System.out.println("The model is "+ car1.GetModel()+"  with "+ car1.GetMiles()+ "  miles  and "+ car1.GetGallons()+" gallons of gas");
    }
}
