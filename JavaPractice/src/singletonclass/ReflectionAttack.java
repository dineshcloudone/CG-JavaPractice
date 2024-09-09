package singletonclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAttack {
	
	public static void main(String[] args) {
		
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=null;
		
		try {
			Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			
			instance2=constructor.newInstance();
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
