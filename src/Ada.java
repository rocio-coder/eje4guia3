import java.util.Scanner;
public class Ada {
    public static void main(String[] args) {



        int [] stock =  new int[10];
        int orders;
        Scanner keyboard= new Scanner(System.in);

        System.out.println("ingresar la cantidad de productos que desea ordenar:");
        orders = keyboard.nextInt();

        int [] neworders = new int [orders];
        int [] request = new int [orders];

        for (int i=0; i< stock.length; i++){
            System.out.println("ingresar cantidad en stock de " + 1+ "producto:");
            stock[1] = keyboard.nextInt();
            System.out.println("ingrese pedido a realizar de " +1+ "producto: ");
            neworders[i]= keyboard.nextInt();

            for (int i=0; i<stock.length; i++){
                if (stock [i]== neworders [i]){
                    request [i]= (neworders[i] - stock[i]*2};
                }else{
            request[i]= neworders [i];
            System.out.println("se requiere comprar: "+ request[i] + "de"+ i);
        }



}

    } }