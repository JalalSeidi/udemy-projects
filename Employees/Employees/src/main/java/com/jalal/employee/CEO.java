package com.jalal.employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEO extends Employee{
  private int avgStockPrice = 0;


  private final String ceoRegex = "\\w+=(?<avgStockPrice>\\w+)";
  private final Pattern ceoPat = Pattern.compile(ceoRegex);
  private final String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}), \\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
  private final Pattern peoplePat = Pattern.compile(peopleRegex);


  public CEO(String personText) {
    super(personText);
      Matcher ceoMat = ceoPat.matcher(peopleMat.group("details"));
      if (ceoMat.find()) {
        this.avgStockPrice = Integer.parseInt(ceoMat.group("avgStockPrice"));
      }
  }
  public int getSalary() {
    return 5000 * avgStockPrice;
  }
}
