package com.example.eternalreturntracker.models.UserGameInfo;

import com.example.eternalreturntracker.fragments.CharacterFragment;

enum Characters{
    Jackie,
    Aya,
    Fiora,
    Magnus,
    Zahir,
    Nadine,
    Hyunwoo,
    Hart,
    Isol,
    LiDailin,
    Yuki,
    Hyejin,
    Xiukai,
    Chiara,
    Sissela,
    Silvia,
    Adriana,
    Shoichi,
    Emma,
    Lenox,
    Rozzi,
    Luke,
    Cathy,
    Adela,
    Bernice,
    Barbara,
    Alex,
    Sua,
    Leon
}
// Driver class that contains an object of "day" and
// main().
public class Test
{
    Characters day;
    int number;

    // Constructor
    public Test(String character)
    {
        this.day = day.valueOf(character);
        number = 0;
    }
    public int getNumber()
    {
        return number;
    }

    public void setNumber(int code)
    {
        number = code;
    }


    // Prints a line about Day using switch
    public void characterFun()
    {
        switch(day)
        {
            case Jackie:
                setNumber(1);
                break;
            case Aya:
                setNumber(2);
                break;
            case Fiora:
                setNumber(3);
                break;
            case Magnus:
                setNumber(4);
                break;
            case Zahir:
                setNumber(5);
                break;
            case Nadine:
                setNumber(6);
                break;
            case Hyunwoo:
                setNumber(7);
                break;
            case Hart:
                setNumber(8);
                break;
            case Isol:
                setNumber(9);
                break;
            case LiDailin:
                setNumber(10);
                break;
            case Yuki:
                setNumber(11);
                break;
            case Hyejin:
                setNumber(12);
                break;
            case Xiukai:
                setNumber(13);
                break;
            case Chiara:
                setNumber(14);
                break;
            case Sissela:
                setNumber(15);
                break;
            case Silvia:
                setNumber(16);
                break;
            case Adriana:
                setNumber(17);
                break;
            case Shoichi:
                setNumber(18);
                break;
            case Emma:
                setNumber(19);
                break;
            case Lenox:
                setNumber(20);
                break;
            case Rozzi:
                setNumber(21);
                break;
            case Luke:
                setNumber(22);
                break;
            case Cathy:
                setNumber(23);
                break;
            case Adela:
                setNumber(24);
                break;
            case Bernice:
                setNumber(25);
                break;
            case Barbara:
                setNumber(26);
                break;
            case Alex:
                setNumber(27);
                break;
            case Sua:
                setNumber(28);
                break;
            case Leon:
                setNumber(29);
                break;
        }
    }
}
