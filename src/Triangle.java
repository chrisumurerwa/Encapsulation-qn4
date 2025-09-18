class Triangle extends Shape {
    private  double base,
    private height;
    Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double calculatorArea(){
        return 0.5 * base * height;
    }
}
