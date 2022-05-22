package Programe;

public class Countduplictaenumbercharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="how are you fine ";
     int count=0;
     char c[]=s.toCharArray();
     for(int i=0;i<=s.length()-1;i++){
    	 count=1;
    	 
    	 for(int j=i+1;j<=s.length()-1;j++){
    		 if(c[i]==c[j]&& c[i]!=' '){
    			 count++;
    			 c[j]='0';
    			 
    			 
    		 }
    	 }
    	 if(count>1&&c[i]!='0'){
    		 System.out.println(c[i]+"  "+count);
    		 
    	 }
     }
	}

}
