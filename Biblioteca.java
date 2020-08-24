public class Biblioteca{
    
    private String titulo;
    private String autor;
    private int ano;
    private String categoria;
    private String estante;
    private int prateleira;
    private boolean emprestado;



public Biblioteca(String novoTitulo, String novoAutor, int novoAno, String novoCategoria, String novoEstante, int novoPrateleira, boolean novoEmprestado){
    titulo = novoTitulo;
    autor = novoAutor;
    ano = novoAno;
    categoria = novoCategoria;
    estante = novoEstante;
    prateleira = novoPrateleira;
    emprestado = novoEmprestado;
}
public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
public int getAno(){
    return ano;
}
public String getCategoria(){
    return categoria;
}
public String getEstante(){
    return estante;
}
public int getPrateleira(){
    return prateleira;
}
public boolean isEmprestado(){
    return emprestado;
}
public String printInfo(){
   String info = "Info Livro:"+titulo+" / "+autor+" / "+ano+" / "+categoria;
   if (emprestado){
       info = info + " Emprestado";
   }
   else {
       info = info + " Disponivel";
   }
    return info;
}
    
    /*
    System.out.println(titulo);
    System.out.println(autor);
    System.out.println(ano);
    System.out.println(categoria);
    System.out.println(estante);
    System.out.println(prateleira);
    System.out.println(emprestado);
    */
    
}