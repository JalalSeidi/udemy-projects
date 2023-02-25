package com.jalal.employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager extends Employee {

  private int orgSize = 0;
  private int directReports = 0;


  private final String mgrRegex = "\\w+=(?<orgSize>\\w),\\w+=(?<dr>\\w+)";
  private final Pattern mgrPat = Pattern.compile(mgrRegex);
  private final String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}), \\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
  private final Pattern peoplePat = Pattern.compile(peopleRegex);

  public Manager(String personText) {
    super(personText);
      Matcher mgrMat = mgrPat.matcher(peopleMat.group("details"));
      if (mgrMat.find()) {
        this.orgSize = Integer.parseInt(mgrMat.group("locpd"));
        this.directReports = Integer.parseInt(mgrMat.group("yoe"));

      }
  }
  public int getSalary() {
    return 3500 + orgSize * directReports;
  }

  @Override
  public String toString() {
    return String.format("%s, %s: %s", lastName, firstName, moneyFormat.format(getSalary()));
  }
}
