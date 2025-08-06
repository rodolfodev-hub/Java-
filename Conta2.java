import java.util.Scanner;

public  class Conta2{
 public static void main(String [] args){

Scanner input = new Scanner(System.in);

Conta myConta = new Conta();

System.out.printf("nome inicial e:%s%n%n", myConta.getNome());
System.out.println("ditgite o seu nome:");
  String oNome= input.nextLine();

myConta.setNome(oNome);


System.out.println();

System.out.printf("o nome dado ao objeto e :%n%s%n", myConta.getNome());






}


}