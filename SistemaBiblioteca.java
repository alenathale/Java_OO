import java.util.Scanner;
public class SistemaBiblioteca{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Biblioteca l1,l2,l3;
        l1 = new Biblioteca("LIVRO1","Eu",1998,"Romance","A1",4,false);
        l2 = new Biblioteca("LIVRO2","Eu",1999,"Suspense","B2",2,true);
        l3 = new Biblioteca("LIVRO3","Eu",2000,"Ficcao","C3",1,false);
        System.out.println(l1.printInfo());
        System.out.println(l2.printInfo());
        System.out.println(l3.printInfo());
    }
}