package itjava.example;

public class Mythreadone extends Thread {

    table t;
    int num;

    public Mythreadone(table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printtable(num);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
package itjava.example;

public class Mythreadtwo extends Thread {

    table t;
    int num;

    public Mythreadtwo(table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printtable(num);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
  package itjava.example;

public class Mainthread {

    public static void main(String[] args) {

        table obj = new table();

        Mythreadone t1 = new Mythreadone(obj, 2);
        Mythreadtwo t2 = new Mythreadtwo(obj, 4);

        t1.start();
        t2.start();
    }
}
