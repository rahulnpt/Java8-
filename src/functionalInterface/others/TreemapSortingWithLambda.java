package functionalInterface.others;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class TreemapSortingWithLambda {
	public static void main(String[] args) {
		Map<Integer,Integer> intMap= new TreeMap<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		Random rand = new Random();
		for(int i=0;i<10;i++){
			int randomNum = rand.nextInt((10 - 0) + 1) + 0;
			intMap.put(i,randomNum);
		}
		System.out.println(intMap);
		
	}
}
