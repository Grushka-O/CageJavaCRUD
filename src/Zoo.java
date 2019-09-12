import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import java.awt.print.Pageable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {


        class Penguin {
            String name;
            int age;
            public Penguin(String name, int age) {
                this.name = name;
                this.age = age;
            }}




         Penguin[]Cage = new Penguin[5];
            Cage[0] = new Penguin("Molly",1);
            Cage[1] = new Penguin("Alice",6);
            Cage[2] = new Penguin("Jack",2);
            Cage[3] = new Penguin("Mary",1);
            Cage[4] = new Penguin("Oliver",4);





                  //READ
        for (int i = 0; i < 5; i++) {
            System.out.println(Cage[i].name);
            System.out.println(Cage[i].age);
        }
//        System.out.println(Cage[2].name);



 int ArrayLenght = Cage.length;





      //CREATE
            Penguin[] Cage1 = Arrays.copyOf(Cage, ArrayLenght+1);
            Cage1[5] = new Penguin("PATRIK",3);
            System.out.println(Cage1[5].name);
            System.out.println(Cage1[5].age);




       //UPDATE

        Cage1[1].name = "Tina";
        System.out.println(Cage1[1].name);





                 //        DELETE
              Cage1[2] = Cage1[Cage1.length-1];
              Penguin[]Cage2 = Arrays.copyOf(Cage1, Cage1.length-1);

        for (int i = 0; i < Cage2.length; i++) {
            Cage2[i] = Cage1[i];
            System.out.println(Cage2[i].name);
        }

    }
}

