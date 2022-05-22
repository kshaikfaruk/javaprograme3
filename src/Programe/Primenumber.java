package Programe;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=13;
     int m=n/2;
     boolean flag=false;
     for(int i=2;i<=m;i++){
    	 if(n%i==0){
    		 flag= true;
    		 break;
    		 
    	 }
     }
     if(!flag){
    	 System.out.println("is aprime");
     }else{
    	 System.out.println("is not prime");
    	 
     }
	}

}
