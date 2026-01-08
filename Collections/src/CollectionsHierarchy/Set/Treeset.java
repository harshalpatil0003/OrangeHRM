package CollectionsHierarchy.Set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
			
		Comparator<FaceWash> cVol=(o1,o2)->o1.vol>o2.vol?1:o1.vol<o2.vol?-1:0 ;
		Comparator<FaceWash> cPrice=(o1,o2)->o1.price>o2.price?1:o1.price<o2.price?-1:0;
		Comparator<FaceWash> cColor=(o1,o2)->o1.color.compareTo(o2.color);
		Comparator<FaceWash> cBrand=(o1,o2)->o1.brand.compareTo(o2.brand);
	
		TreeSet<FaceWash> f= new TreeSet<FaceWash>(cBrand);
		f.add(new FaceWash("Citaphil", 200, 100, "white"));
		f.add(new FaceWash("Natures", 100 ,120, "yellow"));
		f.add(new FaceWash("Garniar", 110, 200, "black"));
		f.add(new FaceWash("Citaphil", 200.0, 100, "white"));
		System.out.println(f);
	
// 		TreeSet<String > t= new TreeSet<String>();
//		// Strings are Stored Lexicographically.
// 		t.add("harshal");
// 		t.add("ramesh");
// 		t.add("patil");
// 		t.add("andrew");
// 		System.out.println(t);
		
//		TreeSet<Integer> b= new TreeSet<Integer>();	
//		b.add(23);
//		b.add(24);
//		b.add(3);
//		b.add(3);
//		b.add(2);
//		b.add(66);
//		b.add(96);
//		b.add(33);
//		b.add(32);
//		b.add(33);
//		
//		System.out.println(b);
//		System.out.println(b.reversed());
//		System.out.println(b.contains(66));
//	
		
		
	}
}

class FaceWash implements Comparable<FaceWash> {
	 String brand;
	 double price;
	 int vol;
	 String color;
	 
	 public FaceWash() {
		// TODO Auto-generated constructor stub
	}
	 public FaceWash(String brand,double price,int vol, String color) {
			this.brand=brand;
			this.price=price;
			this.vol=vol;
			this.color=color;
		}
	 
	 public String toString() {
		 return "["+brand+", "+price+", "+vol+", "+color+"]";
	 }
	 
	 public int compareTo(FaceWash o) {
		//return this.brand.compareTo(o.brand);
		 return (this.vol>o.vol)?1:(this.vol<o.vol?-1:0);
	}
	

}
