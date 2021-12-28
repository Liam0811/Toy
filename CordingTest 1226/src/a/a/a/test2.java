package a.a.a;

import java.util.Arrays;

public class test2 {
	public static void main(String[] args) {
		//배열안에 있는 무작위로 있는 숫자를 오름차순으로 짝수 홀수 단위로 출력하시오
	int [] list = {1,32,4,5,2,3,7};
	
	Arrays.sort(list);
	for(int i=0; i <list.length; i++) {			
			if(list[i]%2 ==0) {
				System.out.println(list[i]+"짝수");
			}else if(list[i]%2 ==1) {
				System.out.println(list[i]+"홀수");				
			}
		}
}
}
