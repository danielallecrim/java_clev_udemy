// Declara o pacote onde esta classe está localizada
// Pacotes são usados para organizar classes relacionadas grupos lógicos.
// Aqui, estamos dizendo que esta classe pertence ao pacote chamado "lógica"
package logica;

//Declaração da classe pública chamada "HelloWorld".
//Em Java, todo programa é construído em torno de classes.
//A palavra-chave "public" significa que esta classe pode ser
//			acessada por qualquer outra classe.
//O nome da classe devve ser o mesmo nome do arquivo ("HelloWorld.java)
// 			com a primeira letra maiúscula por convenção.

public class HelloWorld {
	// Este é o método principal (main) do programa, o ponto de entrada da aplicação Java
	// Quando você executa um programa Java, o método main é o primeiro a ser chamado.
	// "public" significa que esse método pode ser chamado por qualquer parte do programa
	// "static" significa que ele pode ser chamado sem criar um objeto da classe.
	//	"void" significa que este método não retorna nenhum valor.
	//	"main" é o nome especial reconhecido pela JVM como ponto de partida do programa.
	//	"String[] args" é um parâmetro que representa uma lista (vetor) de Strings,
	//				que pode ser usado para receber argumentos da linha de
	//				comando, se desejado.
	public static void main(String[] args) {
		// Comando que imprime uma linha de texto no console (terminal)
		// "System" é uma classe da biblioteca padrão do Java.
		// "out"é um objeto de saída (output) da classe System, que
		// 			representa o console.
		// "println" é um método que imprime a mensagem e pula uma linha ao final.
		// A mensagem "Olá, Mundo !" está entre aspas duplas porque é uma String (texto).
		System.out.println("Hello, World!");
	}
	
	/* O que você aprendeu com esse código:
	 * 	- Como declarar um pacote.
	 * 	- Como declarar uma classe pública.
	 * 	- Como escrever o método principal main.
	 * 	- Como usar System.out.println para imprimir algo na tela.
	 * 	- A estrutura básica de um programa Java.
	 */
	
}
