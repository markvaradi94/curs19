package ro.fasttrackit.curs19;

public class Main {
    public static void main(String[] args) {
        usingOperations(new Increment());
        usingOperations(new Multiply2());

        usingOperations(new MyLambda() {
            @Override
            public int intOperation(int a) {
                return a + 5;
            }
        });

        usingOperations(x -> x / 2);
        usingOperations(elem -> elem * 5);

        usingOperations((x) -> x / 2);

//        usingOperations((String x) -> x + 2);     // compilation error
//        usingOperations(x -> "");     // compilation error

        usingOperations(x -> {
            int a = 3;
            return x + a;
        });


    }

    public static void usingOperations(MyLambda myLambda) {
        System.out.println(myLambda.intOperation(3));
    }
}

class Increment implements MyLambda {

    @Override
    public int intOperation(int a) {
        return a + 1;
    }
}

class Multiply2 implements MyLambda {

    @Override
    public int intOperation(int a) {
        return a * 2;
    }
}