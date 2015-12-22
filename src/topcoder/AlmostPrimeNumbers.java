package topcoder;

public class AlmostPrimeNumbers {
	public static int getNext(int m){
		//suurenev muutuja m
		//While tsükkel, mis suurendab m'i ja kontrollib kas m on true
		//For, mis kontrollib, kas m jaguv arvudega 11 kuni sqrt m. Saab muuta true'ks.
		//For. vaja teha kindlaks, et m ei jagu 10st väiksemate arvudega. Saab muuta false'iks
		int x = m;
		boolean isTheNumber = false;
		while(!isTheNumber){
			x = x + 1;
			for(int i = 11;i < (int)Math.ceil(Math.sqrt(x))+1;i++){
				if(x%i==0){
					isTheNumber = true;
				}
			}
			for(int i = 2;i<11;i++){
				if(x%i==0){
					isTheNumber = false;
				}
			}
		}
		Log(""+x+"");
		return x;
	}

	private static void Log (String log){
		System.out.println(log);
	}
	private static void LogInt (int log){
		System.out.println(log);
	}
}
