package Example5_Complex;

public class Complex {
    private double real;
    private double imaginary;

    Complex (double realCo, double imagCo) {
        real = realCo;
        imaginary = imagCo;
    }

    Complex (double realCo) {
        real = realCo;
        imaginary = 0;
    }

    public String toString() {
        if (imaginary == 0) {
            return String.valueOf(real);
        } else if (real == 0 && imaginary == 1) {
            return "i";
        } else if (real == 0 && imaginary == -1) {
            return "-i";
        } else if (real == 0) {
            return String.valueOf(imaginary + "i");
        } else if (imaginary == 1){
            return String.valueOf(real + " + "  + "i");
        } else if (imaginary == -1){
            return String.valueOf(real + " - "  + "i");
        } else if (imaginary < 0){
            return String.valueOf(real + " - " + (-imaginary) + "i");
        } else {
            return String.valueOf(real + " + " + imaginary + "i");
        }
    }
    
    public void changeValue(double newRealCo, double newImagCo) {
        real = newRealCo;
        imaginary = newImagCo;
    }
    
    public double getReal() {
        return real;
    }
    
    public double getImaginary() {
        return imaginary;
    }
    
    public Complex add(Complex operand) {
        return new Complex(this.getReal() + operand.getReal(), this.getImaginary() + operand.getImaginary());
    }
    
    public Complex sub(Complex operand) {
        return new Complex(this.getReal() - operand.getReal(), this.getImaginary() - operand.getImaginary());
    }
    
    public Complex multiply(Complex operand) {
        double a = this.getReal();
        double b = this.getImaginary();
        double c = operand.getReal();
        double d = operand.getImaginary();
        
        return new Complex(
                a*c - b*d,
                a*d + b*c);
    }
    
    public Complex divide(Complex operand) {
        double a = this.getReal();
        double b = this.getImaginary();
        double c = operand.getReal();
        double d = operand.getImaginary();
        
        return new Complex(
                (a*c + b*d) / (c*c + d*d),
                (b*c - a*d) / (c*c + d*d));
    }
    
    public Complex Conjugate() {
        return new Complex(this.real, -this.imaginary);
    }
}
