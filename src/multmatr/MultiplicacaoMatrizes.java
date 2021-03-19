package multmatr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
 
        System.out.printf("Insira o arquivo de texto:\n");
        String nome = ler.nextLine();
        List l = new ArrayList<>();
        
        
        try {
            FileReader arquivo = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arquivo);
 
            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                System.out.printf("%s\n", linha);
                l.add(linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arquivo.close();
        } catch (IOException e) {
                System.err.printf("Erro no arquivo: %s.\n",
                e.getMessage());
            }
        
        int temp = Integer.parseInt((String) l.get(0));
        
            int m1[][]=new int[temp][temp];
            
            int m2[][]=new int[temp][temp];                    
                                
            int i,j,k;                    
            /* Inicializa primeira matriz. */
            int z=1;
            for(i=0;i<temp;i++){
                    for(j=0;j<temp;j++){
                        int w = Integer.parseInt((String) l.get(z));
                    	m1[i][j] =w; 
                    }    
                    z++;
            }
            /* Inicializa a segunda */
            for(i=0;i<temp;i++){
                for(j=0;j<temp;j++){
                    int p = Integer.parseInt((String) l.get(z));
                	m2[i][j] =p;
                }      
                z++;
            }
            /*  */
            int mr[][]=new int[m1.length][m2[0].length];
            
            
            /* Produto da primeira matriz (m1) com a segunda(m2) 
             * Resultando em uma matriz 2x2(mr)
             * Calculo : mr[0][0] = m1[0][0]*m2[0][0] + m1[1][0]*m[0][1] */
            for(i=0;i<temp;i++){
                for(j=0;j<temp;j++){
                	mr[i][j] =retornaResultadoMatriz(m1,m2,i,j);
                }                
            }
            
            for(i=0;i<temp;i++){
                for(j=0;j<temp;j++){
                	System.out.print(mr[i][j] +"|");;
                }
                System.out.print("\n-------------\n");
            }
            
    	}
    

	public static int retornaResultadoMatriz(int m1[][],int m2[][], int linha, int coluna){
		
		int soma=0;
		
		for(int i=0;i<m1.length;i++){
			soma += m1[linha][i]*m2[i][coluna];
		}
		
		
		return soma;
	}
}

