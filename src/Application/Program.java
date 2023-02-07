package Application;

 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

 

 

public class Program {

 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o nome de um arquivo ou diretório:\n");
	    String arq1 = ler.nextLine();

	     File objFile = new File(arq1);
	     
	    try {
	   
	     BufferedReader lerArq = new BufferedReader(new FileReader(arq1));
	   
	    if (objFile.exists() ) {
	       if (objFile.isFile()) {
	          System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n",
	            objFile.getName(),  objFile.length());
	          		while (arq1 != null) {
	          			 arq1 = lerArq.readLine();
		                 System.out.println(arq1);
					}
	          }
	       }
	       else {
	    	   System.out.printf("Erro: arquivo ou diretório informado não existe!\n");
	         }
	      ler.close();
	    
	}catch (IOException e) {
		System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	}
  }
}
