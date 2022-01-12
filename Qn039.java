//39. Write a suitable class with using this, and super keyword.
//this keyword
/*
class Bike{
	int bikeNo;
    String bikeName;
    float bikePrice;
   Bike(int bikeNo,String bikeName, float bikePrice){
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
        this.bikePrice = bikePrice;
    }
    void display()
    {
        System.out.println(bikeNo + " " + bikeName + " Rs." + bikePrice);
    }
}

public class Qn039 {
    public static void main(String[] args){
        Bike b = new Bike(4262, "FZS", 260000f);
        b.display();
    }
}
*/

//super keyword
class Animal{
    String color= "red";
}

class Rabbit extends Animal{
    String color = "White";
    void printColor(){
        System.out.println("Rabbit color: " + color); // prints color of Rabbit
        System.out.println("Animal color: " + super.color); //prints color of animal
    }
}


public class Qn039{
    public static void main(String[] args){
        Rabbit r = new Rabbit();
        r.printColor();
    }
}