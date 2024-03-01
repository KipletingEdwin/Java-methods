//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //method = a block of code that is executed wherever it is called upon
        String name = "Bro";
        int age = 21;
        int x = 3;
        int y = 4;
        hello(name, age);
        int z = add(x,y);
        System.out.println(z);

    }

    static void  hello(String name, int age){
        System.out.println("Hello "+ name);
        System.out.println("Your age is: "+age);
    }

    static int add(int x, int y){
        int z = x + y;
        return  z;
    }
}