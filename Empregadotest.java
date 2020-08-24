
public class Empregadotest{
    public static void main(String args[]){
       
        Empregado empregado1;
        Empregado empregado2;
        
        empregado1 = new Empregado();
        empregado2 = new Empregado();

        empregado1.setNome("Fulano1");
        empregado1.setCargo("Peao");
        empregado1.setSalario(1000);

        empregado2.setNome("Fulano2");
        empregado2.setCargo("Chefe");
        empregado2.setSalario(5000);

        empregado1.imprimirInfo();
        empregado2.imprimirInfo();

        empregado1.aumentoSalario(5.5);
        empregado2.aumentoSalario(5.5);
        
        System.out.println("");
        System.out.println("Informacao com novo salario");
        
        empregado1.imprimirInfo();
        empregado2.imprimirInfo();


    }
}