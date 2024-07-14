class Rectangle{
    int length;
    int breadth;

    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    void Display()
    {
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}




public class ThisAndSuper {

    public static void main(String[] args){
        Rectangle r = new Rectangle(56, 560);
        r.Display();       
    }
    
}
