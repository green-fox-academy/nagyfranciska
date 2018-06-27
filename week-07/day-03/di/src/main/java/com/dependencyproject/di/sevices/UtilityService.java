package com.dependencyproject.di.sevices;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;
  boolean isValid;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean validateEmail(String emailAddress) {
    isValid = false;
    if (emailAddress.contains("@") && emailAddress.contains(".")) {
      isValid = true;
    }
    return isValid;
  }

  public String caesar(String text, int number) {
    String result = "";
    for(int i = 0; i < text.length(); i++) {
      result += (char)((int)text.charAt(i) + number);
    }
    return result;
  }
}
