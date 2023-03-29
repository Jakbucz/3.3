import java.until.Random;

class Main {
  public static void main(String[] args) {
    int [][] tablica = new int[10][10];
    Random losowaLiczba = new Random();
    int zakres = 101;
    for (int i = 0; i < 10; i++) {
      for (int j =0; j < 10; j++) {
        tablica[i][j] = losowaLiczba.nextInt
      }
    }
  }
}