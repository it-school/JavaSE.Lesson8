package com.itschool.Task1;

import java.util.Date;

public class Pupil
{
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    protected String phoneNumber;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    protected String name;

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    protected Date birthday;

    public Pupil(String phoneNumber, String name, Date birthday)
    {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.birthday = birthday;
    }

    public Pupil(String name, Date birthday)
    {
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = "";
    }

    public Pupil()
    {
        this.name = "";
        this.birthday = new Date();
        this.phoneNumber = "";
    }

    @Override
    public String toString()
    {
        return "Pupil: " + this.name + "\t" + this.birthday.toGMTString() + "\t" + (this.phoneNumber.length() > 0 ? this.phoneNumber : "No phone");
    }
}
