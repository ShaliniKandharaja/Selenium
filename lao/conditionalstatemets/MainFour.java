package lao.conditionalstatemets;

public class MainFour {
	
	public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Apples are red or green.");
                break;
            case "Banana":
                System.out.println("Bananas are yellow.");
                break;
            case "Orange":
                System.out.println("Oranges are orange.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }
        
        String Veg="Carrot";
        
        switch(Veg){
        case "Peas":
        	System.out.println("Green Peas");
        	break;
        case "Carrot":
        	System.out.println("It is carrot");
        	break;
        	
        default:
        	System.out.println("Unknown Veg");
        }
        
    }
	
	

}
