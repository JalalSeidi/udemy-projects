package com.jalal.employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyst extends Employee{
  private int projectCount = 0;


  private final String analystRegex = "\\w+=(?<projectCount>\\w+)";
  private final Pattern analystPat = Pattern.compile(analystRegex);
  private final String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}), \\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
  private final Pattern peoplePat = Pattern.compile(peopleRegex);


  public Analyst(String personText) {
    super(personText);
      Matcher analystMat = analystPat.matcher(peopleMat.group("details"));
      if (analystMat.find()) {
        this.projectCount = Integer.parseInt(analystMat.group("projectCount"));

      }
  }
  public int getSalary() {
    return 2500 + projectCount * 2;
  }

}
