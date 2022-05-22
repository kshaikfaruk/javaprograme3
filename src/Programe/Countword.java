package Programe;

public class Countword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s=" welcome  you count the each note";
   int count=0;
   for(int i=0;i<=s.length()-1;i++){
	   if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
		   count++;
		   
	   }
   }
   System.out.println(count);
	}

}
