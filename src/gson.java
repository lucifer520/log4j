import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;


public class gson {

   
   public static void main(String[] args) throws JsonSyntaxException, ClassNotFoundException{
	   
	   Gson g=new Gson();
	   System.out.print(Class.forName("Persion"));
	   Object o=g.fromJson("{\"name\":\"name0\",\"age\":0}", Class.forName("Persion"));
	   System.out.print(Persion.class.getClass());
	   
   }
}
