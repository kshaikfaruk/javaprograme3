package Programe;

public class Febnoiceseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=0;
      int n1=1;
      int n2=0;
      System.out.println(n+"   "+n1);
      for(int i=1;i<=10;i++){
    	  n=n1;
    	  n1=n2;
    	  n2=n+n1;
    	  System.out.println(n2);
      }
	}

}
