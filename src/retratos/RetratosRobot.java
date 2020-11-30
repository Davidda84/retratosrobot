package retratos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetratosRobot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		  Programa para crear retratos robot con cadenas de caracteres. Una vez ejecutado el programa, 
		  el usuario puede crear tantos retratos como desee antes de finalizar. Los retratos se crean 
		  eligiendo los rasgos de cada facción
		  
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
		int eleccion;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] retratoRobot = new String [5];
		String [] menuOpciones = {"el pelo","los ojos","la nariz","la boca","la barbilla","ver su retrato","reiniciar","salir"};
			System.out.println("Vamos a crear un retrato Robot");
			System.out.println("¿Por donde quiere empezar?");
			do {
				for (int i = 0; i < menuOpciones.length; i++) {
					if (menuOpciones[i] != "ver su retrato" && menuOpciones[i] != "reiniciar" && menuOpciones[i] != "salir") {
						System.out.println("Pulse " + (i+1) + ", para seleccionar " + menuOpciones[i] + ".");
					}
					else {
						System.out.println("Pulse " + (i+1) + ", para " + menuOpciones[i] + ".");
					}
				}
				eleccion = Integer.parseInt(reader.readLine());
				switch(eleccion) {
				case 1:
					retratoRobot[0] = TipoPelo();
		 			break;
		 		case 2:
		 			retratoRobot[1] = TipoOjos();
		 			break;
		 		case 3:
		 			retratoRobot[2] = TipoNariz();
		 			break;
		 		case 4:
		 			retratoRobot[3] = TipoBoca();
		 			break;
				case 5:
					retratoRobot[4] = TipoBarbilla();
					break;
				case 6:
					boolean donePelo = false;
					boolean doneOjos = false;
					boolean doneNariz = false;
					boolean doneBoca = false;
					boolean doneBarbilla = false;
					String [] errorRetrato = new String [5];
					if (retratoRobot[0] != null) {
						donePelo = true;
					}
					else {
						errorRetrato[0] = "   - Pelo";
					}
					if (retratoRobot[1] != null) {
						doneOjos = true;
					}
					else {
						errorRetrato[1] = "   - Ojos";
					}
					if (retratoRobot[2] != null) {
						doneNariz = true;
					}
					else {
						errorRetrato[2] = "   - Nariz";
					}
					if (retratoRobot[3] != null) {
						doneBoca = true;
					}
					else {
						errorRetrato[3] = "   - Boca";
					}
					if (retratoRobot[4] != null) {
						doneBarbilla = true;
					}
					else {
						errorRetrato[4] = "   - Barbilla";
					}
					if (donePelo && doneOjos && doneNariz && doneBoca && doneBarbilla) {
						Retrato(retratoRobot);
					}
					else {
						System.out.println("*******************ERROR*******************");
						System.out.println("Su retrato esta incompleto, revise los siguientes campos: ");
						for (int i = 0; i < errorRetrato.length; i++) {
							if (errorRetrato[i] != null) {
								System.out.println(errorRetrato[i]);								
							}
						}
						System.out.println("*******************ERROR*******************");
					}
					break;
				case 7:
					retratoRobot = new String [5];
					System.out.println("********************************************");
					System.out.println("******************REINICIO******************");
					System.out.println("********************************************");
					break;
				}	
				if (eleccion < 1 || eleccion > 8) {
					System.out.println("Ciñase a las opciones disponibles");
				}
			}			
			while (eleccion != 8);
			System.out.println("Hasta la proxima");
	}
	static String TipoPelo () throws NumberFormatException, IOException {
		System.out.println("Elija el tipo de pelo");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] pelo = {"WWWWWWWWW", "\\\\\\ /////","|\"\"\"\"\"\"\"|","|||||||||"};
		for (int i = 0; i < pelo.length; i++) {
			System.out.println((i+1) + ".    " + pelo[i]);
		}
			int nPelo = Integer.parseInt(reader.readLine());
			String tPelo = pelo[(nPelo-1)];
			return tPelo;	
	}
	static String TipoOjos () throws NumberFormatException, IOException {
		System.out.println("Elija el tipo de ojos");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] ojos = {"| O   O |", "|-{. .}-|", "|-{o o}-|", "| \\   / |"};
		for (int i = 0; i < ojos.length; i++) {
			System.out.println((i+1) + ".    " + ojos[i]);
		}
			int nOjos = Integer.parseInt(reader.readLine());
			String tOjos = ojos[(nOjos-1)];
			return tOjos;
	}
	static String TipoNariz () throws NumberFormatException, IOException {
		System.out.println("Elija el tipo de nariz");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] nariz = {"@   J   @", "{   \\\"   }", "[   j   ]", "<   -   >"};
		for (int i = 0; i < nariz.length; i++) {
			System.out.println((i+1) + ".    " + nariz[i]);
		}
			int nNariz = Integer.parseInt(reader.readLine());
			String tNariz = nariz[(nNariz-1)];
			return tNariz;
	}
	static String TipoBoca () throws NumberFormatException, IOException {
		System.out.println("Elija el tipo de boca");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] boca = {"|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"};
		for (int i = 0; i < boca.length; i++) {
			System.out.println((i+1) + ".    " + boca[i]);
		}
			int nBoca = Integer.parseInt(reader.readLine());
			String tBoca = boca[(nBoca-1)];
			return tBoca;
	}
	static String TipoBarbilla () throws NumberFormatException, IOException {
		System.out.println("Elija el tipo de barbilla");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] barbilla = {"\\_______/", "\\,,,,,,,/"};
		for (int i = 0; i < barbilla.length; i++) {
			System.out.println((i+1) + ".    " + barbilla[i]);
		}
			int nBarbilla = Integer.parseInt(reader.readLine());
			//teclado.nextLine();
			String tBarbilla = barbilla[(nBarbilla-1)];
			return tBarbilla;
	}
	static void Retrato (String [] retratoRobot) {
		for (int i = 0; i < retratoRobot.length;i++) {
				System.out.println(retratoRobot[i]);
		}
	}
}
