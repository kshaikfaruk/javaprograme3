package Programe;

public class countduplicatenumber {

	public static void main(String[] args) {
		 String s="hello madam how are you everything is good";
		 int count=0;
		   char c[]=s.toCharArray();
		  for(int i=0;i<=s.length()-1;i++){
			  count=1;
			   for( int j=i+1;j<=s.length()-1;j++){
				    if(c[i]==c[j]&& c[i]!=' '){
				    	 count++;
				    	c[j]='O';
				    }
				    
			   }
			    if(count>1 && c[i]!='O'){
			    	System.out.println(c[i]+" "+count);
			    }
		  }
		 }
		}
