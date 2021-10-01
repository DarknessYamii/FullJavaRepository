package arrays;

import java.util.Arrays;
import java.util.Random;

public class act1 {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		int array[] = new int[100]; 
		int arrayp[] = new int[100];
		int arrayip[] = new int[100];
		int i,p=0,ip=0;
		for (i=0; i <=array.length-1;i++) {
			array[i] = r.nextInt(1000)+1;
			System.out.println(array[i]);
			if (array[i]%2 ==0){
				arrayp[p] = array[i];
				p++;
			}else {
				arrayip[ip] = array[i];
				ip++;
			}
		}
		arrayp = Arrays.copyOf(arrayp, p);
		arrayip = Arrays.copyOf(arrayip, ip);
		System.out.println("Lista par: "+Arrays.toString(arrayp)+"\nLista impar: "+Arrays.toString(arrayip));
	}

}
