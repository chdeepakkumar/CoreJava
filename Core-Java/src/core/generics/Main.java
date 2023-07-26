package core.generics;

public class Main {
	
	public static <T> void genericMethod1(T t) {
		System.out.println(t.getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGeneric1 ng11 = new NonGeneric1();
		System.out.println(ng11);
		
		Generic1<String> g11 = new Generic1<>();
		g11.setId("Test");
		System.out.println(g11.method1());
		
		Generic1<Integer> g12 = new Generic1<>();
		g12.setId(100);
		System.out.println(g12.method1());
		
		Generic1<NonGeneric1> g13 = new Generic1<>();
		g13.setId(ng11);
		System.out.println(g13.method1());
		
		Generic2<Integer, String, String> g21 = new Generic2<>();
		
		genericMethod1("Test");
		
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(15);
		list1.add(12);
		list1.add(1);
		System.out.println(list1.getSize());
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("abcd");
		list2.add("xyz");
		list2.add("pqrs");
		System.out.println(list2.getSize());
		System.out.println(list2);
		
		LinkedList<NonGeneric1> list3 = new LinkedList<>();
		list3.add(new NonGeneric1());
		
		// Generic3<Integer> g31 = new Generic3<>(); // Error as Integer is not of type NonGeneric
		Generic3<NonGeneric2> g31 = new Generic3<>();
	}

}
