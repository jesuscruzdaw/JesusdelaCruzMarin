package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	public static int cont1=0;
	public static int cont2=0;
	public static int cont3=0;
	public static int cont4=0;
	public static int cont5=0;
	public static int cont6=0;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0};

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) +1;
		return cara;
	}

	public int realizarTest(){
		if(cara==1)
			cont1++;
		else if(cara==2)
			cont2++;
		else if(cara==3)
			cont3++;
		else if (cara==4)
			cont4++;
		else if (cara==5)
			cont5++;
		else if(cara==6)
			cont6++;
		return cara;
			
	}
}
