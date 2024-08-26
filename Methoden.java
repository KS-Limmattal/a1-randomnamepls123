 
public class Methoden {

    public static int round(int x){
        // TODO: implementiere hier deine Lösung für a)
        if (x >= 0){
            if ((x % 100) < 50) {
                return x / 100 * 100;
            } else {
            return x / 100 * 100 + 100;
            }
        } else {
            if ((x % 100) > -50) {
                return x / 100 * 100;
            } else {
                return x / 100 * 100 - 100;
            }
        }
    }

    public static void hours(int x){
        // TODO: implementiere hier deine Lösung für b)
        int h = x / 3600;
        int min = x % 3600 / 60;
        int sec = x % 60;
        System.out.printf("%02d:%02d:%02d%n", h, min, sec);
    }
    
    // TODO: Schreibe hier eine Methode für die Aufgabe c)
public static void sort(int a, int b, int c){
    if (a > b){
        int temp = a;
        a = b;
        b = temp;
    } if (a > c) {
        int temp = a;
        a = c;
        c = temp;
    } if (b > c) {
        int temp = b;
        b = c;
        c = temp;
    }
    System.out.println(a + ", " + b + ", " + c);
}

    
    public static int distance(double x1, double y1, double x2, double y2){
        // TODO: implementiere hier deine Lösung für d)
        double dx = x2 - x1; 
        double dy = y2 - y1;
        double di = Math.sqrt((dx * dx + dy * dy)); //euclidean
        return (int) Math.round(di);

    }

        public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(round(149));
        System.out.println(round(150));
        System.out.println(round(-50));
        System.out.println(round(-49));
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        hours(69420);;

        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        // Test-Code ent-kommentieren, sobald die Funktion programmiert ist
        sort(1, 2, 3);
        sort(1, 3, 2);
        sort(2, 1, 3);
        sort(2, 3, 1);
        sort(3, 1, 2);
        sort(3, 2, 1);
        sort(1, 3, 3);
        sort(-1, -1, -1);
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println(distance(1, 3, 5, 0));
    }
    
}
