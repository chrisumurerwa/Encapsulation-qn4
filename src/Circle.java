

class Circle extends Shape {
    private double radius;
    double Circle (double radius){
        this.radius = radius;


        double calculateArea(){
            return Math.PI * radius * radius;
        }
    }
