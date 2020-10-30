package retratos;

import java.util.Scanner;

public class RetratosRobot {

	private static String reinicio;

	public static void main(String[] args) {
		/*
		  Programa para crear retratos robot con cadenas de caracteres. Una vez ejecutado el programa, 
		  el usuario puede crear tantos retratos como desee antes de finalizar. Los retratos se crean 
		  eligiendo los rasgos de cada facción.
		  
		   PELO                    OJOS                    NARIZ
	  1. WWWWWWWWW           1. | O   O |             1. @   J   @    
	  2. \\\ /////           2. |-{. .}-|             2. {   "   }
	  3. |"""""""|           3. |-{o o}-|             3. [   j   ]
	  4. |||||||||           4. | \   / |             4. <   -   >
	  
	  	   BOCA                    BARBILLA
	  1. |  ===  |            1. \_______/
	  2. |   -   |            2. \,,,,,,,/
	  3. |  ___  |
	  4. |  ---  |
		 
		 Una vez elegidos los rasgos de cada facción, se mostrará el retrato por pantalla. 
		 Por ejemplo, las opciones 3, 2, 1, 4 y 2 para pelo, ojos, nariz, boca y barbilla respectivamente, 
		 muestran el siguiente retrato robot:
		 
		 |"""""""|
		 |-{. .}-|
		 @   J   @
		 |  ---  |
		 \,,,,,,,/
		 */
		int pelo,ojos,nariz,boca,barbilla;
		String tipoPelo,tipoOjos,tipoNariz,tipoBoca,tipoBarbilla;
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Vamos a crear un retrato Robot");
			
			do {
				tipoPelo = null;
				tipoOjos = null;
				tipoNariz = null;
				tipoBoca = null;
				tipoBarbilla = null;
				reinicio = null;

					System.out.println("Lo primero será escoger el tipo de pelo, estas son las opciones:");
					do {
						System.out.println("1. WWWWWWWWW");
						System.out.println("2. \\\\\\ /////");
						System.out.println("3. |\"\"\"\"\"\"\"|");
						System.out.println("4. |||||||||");
						pelo=teclado.nextInt();
						if (pelo < 1 | pelo > 4) {
							System.out.println("Error!!!!");
							System.out.println("Elija entre las opciones posibles");
						}
					}
					while (pelo < 1 | pelo > 4);
					
					System.out.println("¿En que tipo de ojos estas pensando?, estas son las opciones:");
					do {
						System.out.println("1. | O   O |");
						System.out.println("2. |-{. .}-|");
						System.out.println("3. |-{o o}-|");
						System.out.println("4. | \\   / |");
						ojos=teclado.nextInt();
						if (ojos < 1 | ojos > 4) {
							System.out.println("Error!!!!");
							System.out.println("Elija entre las opciones posibles");
						}
					}
					while (ojos < 1 | ojos > 4);

					System.out.println("Ahora la nariz y las orejas, estas son las opciones:");
					do{
						System.out.println("1. @   J   @");
						System.out.println("2. {   \"   }");
						System.out.println("3. [   j   ]");
						System.out.println("4. <   -   >");
						nariz=teclado.nextInt();
						if (nariz < 1 | nariz > 4) {
							System.out.println("Error!!!!");
							System.out.println("Elija entre las opciones posibles");
						}
					}
					while (nariz < 1 | nariz > 4);

					System.out.println("La boca, estas son las opciones:");
					do{
						System.out.println("1. |  ===  |");
						System.out.println("2. |   -   |");
						System.out.println("3. |  ___  |");
						System.out.println("4. |  ---  |");
						boca=teclado.nextInt();
						if (boca < 1 | boca > 4) {
							System.out.println("Error!!!!");
							System.out.println("Elija entre las opciones posibles");
						}
					}
					while (boca < 1 | boca > 4);
					
					System.out.println("Y por último la barbilla, estas son las opciones:");
					do{
						System.out.println("1. \\_______/");
						System.out.println("2. \\,,,,,,,/");
						barbilla=teclado.nextInt();
						if (barbilla < 1 | barbilla > 2) {
							System.out.println("Error!!!!");
							System.out.println("Elija entre las opciones posibles");
						}
					}
					while (barbilla < 1 | barbilla > 2);
					
					switch(pelo) {

				 		case 1:
				 			tipoPelo="WWWWWWWWW";
				 			break;
				 		case 2:
				 			tipoPelo="\\\\\\//////";
				 			break;
				 		case 3:
				 			tipoPelo="|\"\"\"\"\"\"\"|";
				 			break;
				 		case 4:
				 			tipoPelo="|||||||||";
				 			break;
				 	}
					switch(ojos) {

			 			case 1:
			 				tipoOjos="| O   O |";
			 				break;
			 			case 2:
			 				tipoOjos="|-{. .}-|";
			 				break;
			 			case 3:
			 				tipoOjos="|-{o o}-|";
			 				break;
			 			case 4:
			 				tipoOjos="| \\   / |";
			 				break;
					}
					switch(nariz) {

			 			case 1:
			 				tipoNariz="@   J   @";
			 				break;
			 			case 2:
			 				tipoNariz="{   \"   }";
			 				break;
			 			case 3:
			 				tipoNariz="[   j   ]";
			 				break;
			 			case 4:
			 			tipoNariz="<   -   >";
			 			break;
					}
					switch(boca) {

			 			case 1:
			 				tipoBoca="|  ===  |";
			 				break;
			 			case 2:
			 				tipoBoca="|   -   |";
			 				break;
			 			case 3:
			 				tipoBoca="|  ___  |";
			 				break;
			 			case 4:
			 				tipoBoca="|  ---  |";
			 				break;
					}
					switch(barbilla) {

			 			case 1:
			 				tipoBarbilla="\\_______/";
			 				break;
			 			case 2:
			 				tipoBarbilla="\\,,,,,,,/";
			 				break;
					}
					
					System.out.println("Este es su retrato Robot...");
					System.out.println(tipoPelo);
					System.out.println(tipoOjos);
					System.out.println(tipoNariz);
					System.out.println(tipoBoca);
					System.out.println(tipoBarbilla);

					System.out.println("Pulse R para Repetir o cualquier tecla para Salir");
					reinicio=teclado.next();
				
			}
			while(reinicio.equalsIgnoreCase("R"));
		}
		
		
		{
			System.out.println("Hasta la proxima");
		}
	}
}
