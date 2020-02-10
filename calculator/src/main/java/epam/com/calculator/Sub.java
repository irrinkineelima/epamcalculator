package epam.com.calculator;

class Sub{
    double a;
    double b;
    public Sub(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double sub(){
        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }
    }
}