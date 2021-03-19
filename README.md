# MultiplicacaoMatrizes
Um Exemplo de algoritmo de multiplicação de matrizes paralela/distribuída para acelerar o tempo resposta.

### Tecnologia Utilizada

- [Java](https://docs.oracle.com/en/java/)

## Funcionamento do exemplo
Na entrada do programa terá dois arquivos de texto que serão passados como parâmetros na chamada do programa.
O arquivo tem a seguinte estrutura. Primeira linha contém o tamanho da matriz linha x coluna da segunda linha em diante os valores da matriz.
O metódo Main realiza a chamada para execução do programa, nele também se encontra a chamada para leitura do arquivo, assim como a lógica para a leitura do mesmo. 
Também contém a inicialização de ambas as matrizes e o calculo de ambas.

Enquanto que método retornaResultadoMAtriz representado pelo trecho de código abaixo, realiza a soma das matrizes e retorna a variável que as recebe.

```java
public static int retornaResultadoMatriz(int m1[][],int m2[][], int linha, int coluna){
		
		int soma=0;
		
		for(int i=0;i<m1.length;i++){
			soma += m1[linha][i]*m2[i][coluna];
		}
		
		
		return soma;
	}
```



