package com.company;

import com.company.exrecise47.ISaveable;
import com.company.exrecise47.Monster;
import com.company.exrecise47.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());


        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        List<String> list = Arrays.asList("food", "60", "80");
        werewolf.read(list);
        System.out.println(werewolf.toString());

    }


    }

