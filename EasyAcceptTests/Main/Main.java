package Main;

import easyaccept.EasyAccept;

public class Main {

	public static void main(String[] args) {
	    args = new String[] {"projeto.Facade", "TestesEasy/usecase_1.txt" , "TestesEasy/usecase_2.txt", "TestesEasy/usecase_4.txt"}; //separe cada script de teste por virgula.
	    EasyAccept.main(args);
	}

}