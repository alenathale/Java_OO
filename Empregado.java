public class Empregado{

    private String nome;
    private String cargo;
    private double salario;
    private double aumento;



    String getNome(){
        return nome;
    }
    void setNome(String novoNome){
        nome = novoNome;
    }
    String getCargo(){
        return cargo;
    }
    void setCargo(String novoCargo){
        cargo = novoCargo;
    }
    double getSalario(){
        return salario;
    }
    void setSalario(double novoSalario){
        salario = novoSalario;
    }
    void imprimirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.printf("Salario: R$ %.2f\n ",salario);
    }
    void aumentoSalario (double aumento){
        salario = (aumento/100)*salario + salario;
    }
}