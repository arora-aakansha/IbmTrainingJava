
public interface Event {
	void doSomething();
}

class EventImpl implements Event{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("first task");
	}
	
	static class InnerEvent implements Event{

		@Override
		public void doSomething() {
			// TODO Auto-generated method stub
			System.out.println("second task");
		}
		
	}
	
	public void oneMoreImpl(){
		class Nestedimpl implements Event{

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("third task");
			}
			
		}
		new Nestedimpl().doSomething();
	}
	
	public void oneLastImpl(){
	       Event e =new Event() {

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("fourth task");
				
			}//annonymous class
	    	   
	       };
	       e.doSomething();
	       
	      
	}
	
	 public void finalLastImpl() {
		 Event e = () -> System.out.println("fift task");  //lambda  function
		 e.doSomething();
  	   
     }
	
	public static void main(String[] args) {
		EventImpl e1 = new EventImpl();
		e1.doSomething();
		EventImpl.InnerEvent in =new  EventImpl.InnerEvent();
		in.doSomething();
		e1.oneMoreImpl();
		e1.oneLastImpl();
		e1.finalLastImpl();
	}
	
}