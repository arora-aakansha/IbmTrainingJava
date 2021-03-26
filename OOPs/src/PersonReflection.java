import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Person p =new Person("abc",21);
		Class pc = Class.forName("Person");
		System.out.println(pc.getName());
		
		Constructor[] c =pc.getConstructors();
		for(Constructor cn:c) {
			System.out.println(cn);
		}
		
		Method[] m =pc.getMethods();
		for(Method mn:m) {
			System.out.println(mn);
		}
		//same for declare methods
		Field[] f = pc.getFields();
		for(Field ff:f)
			System.out.println(ff);

	}

}
