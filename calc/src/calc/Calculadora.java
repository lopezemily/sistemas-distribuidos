package calc;

public class Calculadora {
    
    public static float somar(float x, float y){
        return x + y;
    }
    
    public static float subtrair(float x, float y){
        return x - y;
    }
    
    public static float multiplicar(float x, float y){
        return x * y;
    }
    
    public static float dividir(float x, float y){
        if(y == 0){
            throw new IllegalArgumentException("Nao eh possivel fazer divisao por zero!");
        }
        return x / y;
    }
}
