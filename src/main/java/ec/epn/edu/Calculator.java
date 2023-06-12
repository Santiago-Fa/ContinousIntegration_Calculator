package ec.epn.edu;

public class Calculator {
    public Calculator() {
    }

    public void displayMenu() {

        int op1 = 9;
        int op2 = 3;

        System.out.println("\t****Calculadora****");
        System.out.println("Se ha de probar la cacluladora con los números " + op1 + " y " + op2);

        //Suma
        System.out.println(op1 + " + " + op2 + " = " + addition(op1, op2));
        //Resta
        System.out.println(op1 + " - " + op2 + " = " + substract(op1, op2));
        //Multiplicación
        System.out.println(op1 + " * " + op2 + " = " + multiplication(op1, op2));
        //División
        System.out.println(op1 + " / " + op2 + " = " + split(op1, op2));
        //Potenciación
        System.out.println(op1 + " ^ " + op2 + " = " + power(op1, op2));
        //Radicación
        System.out.println(op1 + " root " + op2 + " = " + root(op1, op2));

    }


    //Potenciacion
    public int power(int op1, int op2) {
        return (int) Math.pow(op1, op2);
    }

    //Raiz
    public double root(double op1, int op2) {
        return Math.pow(op1, (1.0 / op2));
    }

    public int substract(int op1, int op2) {
        return op1 - op2;
    }

    public int split(int op1, int op2) {
//        if(op2 == 0){
//            throw new IllegalArgumentException("Division por cero no es valida");
//        }
        return op1 / op2;
    }

    //Suma
    public double addition(int op1, int op2) {
        return op1 + op2;
    }

    //Multiplicacion
    public double multiplication(int op1, int op2) {
        return op1 * op2;
    }

}
