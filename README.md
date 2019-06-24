# primitiveEqualityTest
Tests how equal certain unit types are in Java, including int[], object, string, and boolean


		int[] a = {1,2,3};
		System.out.println(a);
   
output: [I@3cd1a2f1]
This is printing the memory address of the int array int[]a
		
		Object o = "123";
		System.out.println(o);
    
output: 123
This prints out the object 123 which is also a String, but at a higher level it is an object
		
		String t = "12";
		System.out.println(t);
    
output: 12
This prints out the String 12
		
		String w = t + "3";
		System.out.println(w);
    
output: 123
This prints out the String 123. This shows that when you add one numeric string to another, it concatonates them or appends them
		
		boolean b = o.equals(a);
		System.out.println(b);
    
output: false
The object o which equals string "123" does not equal object a which is an int array {1,2,3}
		
		boolean b2 = o.equals(t);
		System.out.println(b2);
    
output: false
The object o which is string "123" does not equal string t which is "12"
		
		boolean b3 = o.equals(w);
		System.out.println(b3);
    
output: true
Object o which equals string "123" is equal to object w which is string "12" plus string "3" which is "123"
		
		boolean b4 = (o == w);
		System.out.println(b4);

output: false
Object o which is string "123" is not logically equal to string w which also equals "123". This is because the == logic operator in Java compares locations in physical memory. So unless they are literally the same object in memory, == will give back false. However if we compare them as objects using higher level coding and not using the primitive equality test, they will come back as equal:

		boolean b5 = o.equals(w);
		System.out.println(b5);
    
output: true
Here o.equals(w) is comparing objects, while the (o == w) is comparing primitive data types. This is a good example of why higher level and object oriented programming languages & techniques are gaining popularity.
