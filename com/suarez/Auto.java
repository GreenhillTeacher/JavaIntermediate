package com.suarez;

public class Auto
{
    private String model;
    private int milesDriven;
    private double gallonsOfGas;
    public Auto()
    {
        model ="unknown";
    }
    public Auto(String name, double gallons)
    {
        model = name;
        SetGallons(gallons);
    }
    public Auto(String name, int miles, double gallons)
    {
        model = name;
        SetMiles(miles);
        SetGallons(gallons);
    }
    public void SetGallons(double gallons)
    {
        if (gallons < 0)
        {
            gallonsOfGas = 0;
        }
        else
        {
            gallonsOfGas =  gallons;
        }
    }
    public void SetMiles(int miles)
    {
        if (miles < 0 )
        {
            milesDriven = 0;
        }
        else
            milesDriven = miles;
    }
    public String GetModel()
    {
        return model;
    }
    public int GetMiles()
    {
        return milesDriven;
    }
    public double GetGallons()
    {
        return gallonsOfGas;
    }

}

