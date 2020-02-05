import java.util.Scanner;

public class Metronome {
    double bpm;
    int measure, counter;

    public Metronome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bpm: ");
        bpm = scanner.nextDouble();
        System.out.print("Enter measure: ");
        measure = scanner.nextInt();
    }

    public void start (){
        while (true) {
            try {
                Thread.sleep((long) (1000 * (60.0 / bpm)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
            if (counter % measure == 0) {
                System.out.println("TICK");
            } else {
                System.out.println("TOCK");
            }
        }
    }
}

class test {
    public static void main(String[] args) {

        Metronome metronome = new Metronome();
        metronome.start();
    }
}
