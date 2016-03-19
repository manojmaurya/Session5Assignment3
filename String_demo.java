package project1;

public class String_demo {
	
	public static void main(String[] args){
		String sline;
		
		sline = "Hadoop is open source frame work ,Hadoop is good framework for handling big data";
		String[] parts = sline.split(" ");
		
		for(int i=0; i<=parts.length; i++){
			
			System.out.println(parts[i].replace(",",""));
			
		}
	}

}
