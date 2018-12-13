package com.itschool.Task1;

import java.util.Date;

public class ExcellentPupil extends Pupil
{
    public int getDiplomasQuantity()
    {
        return diplomasQuantity;
    }

    public ExcellentPupil(String phoneNumber, String name, Date birthday, int diplomasQuantity)
    {
        super(phoneNumber, name, birthday);
        this.diplomasQuantity = diplomasQuantity;
    }

    public void setDiplomasQuantity(int diplomasQuantity)
    {
        this.diplomasQuantity = diplomasQuantity;
    }

    protected int diplomasQuantity;

    public ExcellentPupil(String name, Date birthday)
    {
        super(name, birthday);
    }

    public ExcellentPupil(String phoneNumber, String name, Date birthday)
    {
        super(phoneNumber, name, birthday);
    }

    @Override
    public String toString()
    {
        return "I'm excellent pupil. " + super.toString();
    }
}
