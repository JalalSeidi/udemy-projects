package com.jalal.employee;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String peopleText = """
                Flintstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flintstone2, Fred, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
                Flintstone3, Fred, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
                Flintstone4, Fred, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
                Flintstone5, Fred, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
                Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
                Rubble2, Barney, 2/2/1905, Manager, {orgSize=100,dr=4}
                Rubble3, Barney, 2/2/1905, Manager, {orgSize=200,dr=2}
                Rubble4, Barney, 2/2/1905, Manager, {orgSize=500,dr=8}
                Rubble5, Barney, 2/2/1905, Manager, {orgSize=175,dr=20}
                Flintstone, Wilme, 3/3/1910, Analyst, {projectCount=3}
                Flintstone2, Wilme, 3/3/1910, Analyst, {projectCount=4}
                Flintstone3, Wilme, 3/3/1910, Analyst, {projectCount=5}
                Flintstone4, Wilme, 3/3/1910, Analyst, {projectCount=6}
                Flintstone5, Wilme, 3/3/1910, Analyst, {projectCount=9}
                Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
                """;

    String peopleRegex = "(?<LastName>\\w+),\\s*(?<FirstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}), \\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
    Pattern peoplePat = Pattern.compile(peopleRegex);
    Matcher peopleMat = peoplePat.matcher(peopleText);

    String progRegex = "\\w+=(?<locpd>\\w),\\w+=(?<yoe>\\w),\\w+=(?<iq>\\w)";
    Pattern coderPat = Pattern.compile(progRegex);

    int totalSalaries = 0;
    while ( peopleMat.find()) {
      totalSalaries+= switch (peopleMat.group("role")) {
        case "Programmer" -> {
          String details = peopleMat.group("details");
          Matcher coderMat = coderPat.matcher(details);
          if (coderMat.find()) {
                System.out.printf("programmer loc: %s yoe: %s iq: %s%n", coderMat.group("locpd"), coderMat.group("yoe"), coderMat.group("iq"));
          }
          yield 3000;
        }
        case "Manger" ->  {
          yield 3500;
        }
        case "Analyst" -> {
          yield 2500;
        }
        case "CEO" -> {
          yield 5000;
        }
        default -> 0;
      };
    }
    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
    System.out.printf("The total payout should be %s%n", currencyInstance.format(totalSalaries));
  }
}
