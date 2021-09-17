package javapgms;

public class Duplicate_string {

	public static void main(String[] args) {
		/*public class Exercise13 {
			public static void main(String[] args) */
			    
			        String[] my_array = {"Sanjay","Sai","Sanjay","Sai","manasa","Sharada"};
			 
			        for (int i = 0; i < my_array.length; i++)
			        {
			            for (int j = i+1; j < my_array.length; j++)
			            {
			                if( (my_array[i].equals(my_array[j])))
			                {
			                    System.out.println("Duplicate Element is : "+my_array[j]);
			                }
			            }
			        }
			    }    

}
