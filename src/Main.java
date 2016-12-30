import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		//boy.txt and girl.txt default to current directory
		String path = "";

		String namegender = "boy";
		int length = 0;

		while (!namegender.equals("stop")) {

			Scanner in = new Scanner(System.in);
			System.out.println("Boy or Girl? ");
			namegender = in.nextLine();

			System.out.println("How long should the name be? ");
			length = in.nextInt();


			NameList namelist = new NameList(namegender, path);
			HashMap<String, Integer> nameHM = namelist.getHM(namegender);

			NameGenerator namegen = new NameGenerator();
			namegen.setParameters(nameHM, length);

			String name = namegen.generate();
			System.out.println(name);
			System.out.println("");
		}

	}


}
