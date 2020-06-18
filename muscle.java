package Four;

import java.util.Random;

public class muscle implements Runnable {
	
	
	public void run() {
		if(newstart.musclethread==false) {
	while(!Thread.currentThread().isInterrupted()) {
		Random rn = new Random();
	int muscletoong=0;

	try {
		  Thread.sleep(3000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();

		}
			muscletoong=rn.nextInt(5);
			if (muscletoong==0) {
	System.out.println("      .                                          \n" + 
			"        . ..    .....                             \n" + 
			"        ,.-~-.   .-,..                            \n" + 
			"        .,!;   .--~~~-,.                          \n" + 
			"        .--....-,   -:~-,..                       \n" + 
			"        -- .,-       .:-,--,                      \n" + 
			"         -,-          .~~-,,,.. .                 \n" + 
			"         .,            .~~-,,,...                 \n" + 
			"                        ,~~-,......               \n" + 
			"                         ~--,,......              \n" + 
			"                         .~-,-.......             \n" + 
			"                    ...   :~--,.......            \n" + 
			"              .   ..    .. :~~--,,....            \n" + 
			"                          .,:~----,,,.            \n" + 
			"                           ..::~--,,,.. .         \n" + 
			"                           ...,:~-,,,,....        \n" + 
			"                      .    ..----~~---,,-.        \n" + 
			"                     ..    ...,~::~~-,.-~         \n" + 
			"                ..  ...   .......,--~~-~          \n" + 
			"              ......,,.  .....,,,-~:~~~           \n" + 
			"       ..........,,--,.....,,,,-~~~~-.            \n" + 
			"      ..,.....,,,----,,,,------~:~-               \n" + 
			"............,,--~~--,,,----~~:::,                 \n" + 
			",,........,---~~~-,,,,,,---~~~                    \n" + 
			".......,,,-~~~~~-------~~-..                      \n" + 
			"......,,--~---.                                   \n" + 
			"");
	        System.out.println();
			System.out.println(" 근육통이 발생했습니다!!!");
			System.out.println();
			System.out.println(" 행동이 느려집니다.");
			System.out.println(" 파스를 이용해 치료할 수 있습니다.");
			System.out.println();
			
			
			newstart.musclethread=true;
			newstart.bigmusclethread=true;
			newstart.musclestart=Date.count;
			newstart.muscleend=newstart.musclestart+2;
			try {
				  Thread.sleep(60000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();

				}
			System.out.println(" 근육통에 어느정도 적응했습니다!!!");
			newstart.musclethread=false;
			  Thread.currentThread().interrupt();
	}
	}
	}
	}
}
