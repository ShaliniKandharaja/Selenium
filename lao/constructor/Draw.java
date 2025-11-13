package lao.constructor;

public class Draw {

	String draw;
	
	//No Argument Constructor
	Draw(){
		System.out.println("Draw object created");
	}
	
	//Parameterized Constructor
	Draw(String toDraw){
		draw=toDraw;
		System.out.println("Students drawing "+ draw);
	}
	
	
	public static void main(String[] args) {

		Draw d1=new Draw();
		Draw d2=new Draw("Circle");

	}

}
