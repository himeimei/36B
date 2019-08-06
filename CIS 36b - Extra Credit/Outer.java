/*
 * Huimei Wu
 * CIS 36B
 * Extra Credit
 * Date Submitted: June 22
 */

public class Outer {
    abstract class GeometricObject {
    	    protected String color;
    		protected boolean filled;
    		
    		protected double area;
    		protected double perimeter;
    		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isFilled() {
			return filled;
		}
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area = area;
		}
		public double getPerimeter() {
			return perimeter;
		}
		public void setPerimeter(double perimeter) {
			this.perimeter = perimeter;
		}
		
		public void print() {
			System.out.println("color = " + color + "; filled = " + filled + 
					"; area = " + area + "; perimeter = " + perimeter);
		}
    }
    
    class Triangle extends GeometricObject {
    		private double side1;
    		private double side2;
    		private double side3;
    		private String type;
    		
    		Triangle(String c, boolean f, double s1, double s2, double s3) {
    			if (s1 + s2 <= s3 || s1 + s3 <= s3 || s2 + s3 <= s1) {
    				System.out.println("ERROR: Please input correct sides");
    				return;
    			}
    			
    			side1 = s1;
    			side2 = s2;
    			side3 = s3;
    			color = c;
    			filled = f;
    			
			perimeter = side1 + side2 + side3; 
			
			area = Math.sqrt(0.5 * perimeter * (0.5 * perimeter - side1) * (0.5 * perimeter - side2) * (0.5 * perimeter - side3)); 

    			if (side1 == side2 && side2 == side3) {
    				type = "Equilateral";
    			}
    			else if (side1 == side2 || side1 == side3) {
    				type = "Isosceles";    				
    			}
    			else {
    				type = "Scalene";
    			}
    		}

		public double getSide1() {
			return side1;
		}

		public void setSide1(double side1) {
			this.side1 = side1;
		}

		public double getSide2() {
			return side2;
		}

		public void setSide2(double side2) {
			this.side2 = side2;
		}

		public double getSide3() {
			return side3;
		}

		public void setSide3(double side3) {
			this.side3 = side3;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		public void print() {
			System.out.printf("color = %s\nfilled = %s\nside1 = %.2f\nside2 = %.2f\nside3 = %.2f\n"
					+ "area = %.2f\nperimeter = %.2f\ntype = %s\n",
					color,filled,side1,side2,side3,area,perimeter,type);			
			}
    }
}
