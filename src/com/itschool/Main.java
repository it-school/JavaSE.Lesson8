package com.itschool;

import com.itschool.Task1.ClassRoom;
import com.itschool.Task1.ExcellentPupil;
import com.itschool.Task1.Pupil;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Peter", new Date("2000/12/2"));
        System.out.println(pupil1);
        ExcellentPupil pupil2 = new ExcellentPupil("John", new Date("2001/2/23"));
        System.out.println(pupil2);

        ClassRoom classRoom = new ClassRoom(3);
        classRoom.getPupils()[0].setName("Alex");
        classRoom.getPupils()[1].setBirthday(new Date("1999/3/3"));
        classRoom.getPupils()[2]=pupil1;

        System.out.println("\n-------------------\n");
        System.out.println(classRoom);

        pupil1.setName("NoPeter");
        System.out.println(classRoom);

        classRoom.getPupils()[2]=pupil2;
        System.out.println(classRoom);

        pupil2 = (ExcellentPupil) pupil1;
        pupil2.setDiplomasQuantity(2);
        
        System.out.println(pupil2);

    }
}
