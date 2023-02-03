package com.jalal.employee;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmer {

  private String lastName;
  private String firstName;
  private LocalDate dob;


  String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}), \\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
  Pattern peoplePat = Pattern.compile(peopleRegex);
  public Programmer(String personText) {
    Matcher peopleMat = peoplePat.matcher(personText);
    if (peopleMat.find()) {
      this.lastName = peopleMat.group("lastName");
      this.firstName = peopleMat.group("firstName");
    }

  }

}
