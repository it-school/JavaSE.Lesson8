package com.itschool.Task1;

public class ClassRoom
{
    public Pupil[] getPupils()
    {
        return pupils;
    }

    public void setPupils(Pupil[] pupils)
    {
        this.pupils = pupils;
    }

    private Pupil[] pupils;

    public int getSIZE()
    {
        return SIZE;
    }

    final int SIZE = 4;

    public ClassRoom(int number)
    {
        this.pupils = new Pupil[number];
        this.initPupils();
    }

    public ClassRoom()
    {
        this.pupils = new Pupil[SIZE];
        this.initPupils();
    }

    private void initPupils()
    {
        for (int i = 0; i < pupils.length; i++)
        {
            pupils[i] = new Pupil();
        }

    }

    @Override
    public String toString()
    {
        String result = "";

        for (Pupil pupil : pupils )
        {
            result += pupil + "\n";
        }

        return result;
    }
}
