package itjava.example;

public interface shape1 {
public static final double pi=3.14;
public abstract void calculate_area();
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------

package itjava.example;

public interface shape2 {
  
	public abstract void calculate_volume();
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
package itjava.example;

public class sphere implements shape1, shape2 {
	double radius = 5.6;
	public void calculate_volume() {
		double result = ((4/3)*pi*radius*radius*radius);
		System.out.println("Volume of Sphere=" + result);
	}
	@Override
	public void calculate_area() {
		double result = (4*pi*radius*radius);
		System.out.println("Surface area of Sphere=" + result);
		
	}
  
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
package itjava.example;

public class mainmethod {
    public static void main(String[] args) {

        squaree sq = new squaree();
        System.out.println("Area of Square:");
        sq.calculate_area();

        sphere sp = new sphere();
        sp.calculate_area();
        sp.calculate_volume();
    }
}
