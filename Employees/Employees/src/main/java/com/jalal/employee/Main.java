package com.jalal.employee;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String peopleText = """
                Flintstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flintstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
                Flintstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
                Flintstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
                Flintstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
                Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
                Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
                Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
                Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
                Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
                Flintstone, Wilme, 3/3/1910, Analyst, {projectCount=3}
                Flintstone2, Wilme2, 3/3/1910, Analyst, {projectCount=4}
                Flintstone3, Wilme3, 3/3/1910, Analyst, {projectCount=5}
                Flintstone4, Wilme4, 3/3/1910, Analyst, {projectCount=6}
                Flintstone5, Wilme5, 3/3/1910, Analyst, {projectCount=9}
                Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
                """;

    String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}), \\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
    Pattern peoplePat = Pattern.compile(peopleRegex);
    Matcher peopleMat = peoplePat.matcher(peopleText);

    int totalSalaries = 0;
    Employee employee = null;
    while ( peopleMat.find()) {

      employee = switch (peopleMat.group("role")) {
        case "Programmer" -> new Programmer(peopleMat.group());
        case "Manger" ->  new Manager(peopleMat.group());
        case "Analyst" -> new Analyst(peopleMat.group());
        case "CEO" -> new CEO(peopleMat.group());
        default -> null;
      };
      System.out.println(employee.toString());
      totalSalaries+= employee.getSalary();
    }
    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
    System.out.printf("The total payout should be %s%n", currencyInstance.format(totalSalaries));
  }
}
