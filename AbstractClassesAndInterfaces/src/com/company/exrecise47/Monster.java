package com.company.exrecise47;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
  private String name;
  private int hitPoints;
  private int strength;

  public Monster(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
  }

  public String getName() {
    return name;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public int getStrength() {
    return strength;
  }

  @Override
  public List<String> write() {
    ArrayList<String> values = new ArrayList<String>();
    values.add(0, this.name);
    values.add(1, "" + this.hitPoints);
    values.add(2, "" + this.strength);
    return values;
  }

  @Override
  public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0) {
      if (savedValues.size() < 3) {
        this.name = savedValues.get(0);
      } else {
        this.hitPoints = Integer.parseInt(savedValues.get(1));
        this.strength = Integer.parseInt(savedValues.get(2));
      }
//            how to change read method to change the values of list by typing in main.
//            how to change read method to maintain the default values when nothing is given in the list(when list size is less than three.
    }

  }

  @Override
  public String toString() {
    return "Monster{" +
            "name='" + name + '\'' +
            ", hitPoints=" + hitPoints +
            ", strength=" + strength +
            '}';
  }
}
