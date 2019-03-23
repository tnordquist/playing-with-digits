package edu.cnm.deepdive;

public class DigPow {

  public static long digPow(int n, int p) {

    int k = 0;
    int sum = 0;

    String num = String.valueOf(n);
    for (int i = 0; i < num.length(); i++) {
      int j = Character.digit(num.charAt(i), 10);
      sum += Math.pow(j, p++);
    }
    k = sum / n;
    if (sum == n * k) {
      return k;
    } else {
      return -1;
    }
  }
}
