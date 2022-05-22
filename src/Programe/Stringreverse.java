package Programe;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="sameera";
      char c;
      String rev="  ";
      for(int i=0;i<s.length();i++){
    	  c=s.charAt(i);
    	  rev=c+rev;
    	  
      }
      System.out.println(rev);
	}

}
