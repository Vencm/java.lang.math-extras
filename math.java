package test;
public class math{
    public static double pow(double num, double x){
        double i = x % 1 == 0 ? (x == 0 ? 1 : num) : 0;
        if(x % 1 == 0){
            if(x > 0){
                for(double j = 1; j < x; j++){
                    i *= num;
                }
            }else if(x < 0){
                i = 1 / pow(num, -x);
            }
        }else{
            double maxi = 20;
            double puffer = x * Math.log(num);
            for(double j = 0; j < maxi; j++){
                i += pow(puffer, j) / fak(j);
            }
        }
        return i;// + 0.0000000000001;
    }
    public static double root(double n, double num){
        double i = pow(num, 1 / n);
        return i;
    }
    public static double logx(int base, double num){
        double i = Math.log(num) / Math.log(base);
        return base <= 0 || num <= 0 ? 0 : i;
    }
    public static double fak(double x){
        double end = 1;
        for(double i = 1; i <= x; i++){
            end *= i;
        }
        return x == 0 ? 1 : end;
    }
}