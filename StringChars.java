package javapgms;

public class StringChars {
	public static void main(String args[]) {
		String S="Sinhduja Sindhuja Sanjay ";
		String S1=S.replaceAll(" ","");
		System.out.println(S1);
				char c[]=S1.toCharArray();
				System.out.println(c.length);
				System.out.println(c[0]);
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					c[j]='0';
				}	
			}
			if(count>=1 && c[i]!='0') {
				System.out.println(c[i]+ " repeated "+ count);
				count=1;
			}
			
		}

	}

}
