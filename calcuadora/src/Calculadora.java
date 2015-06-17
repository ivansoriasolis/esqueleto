public class Calculadora {
    private float num1;
    private float num2;
    public float suma(float var1,float var2){
        float suma = var1 + var2;
        return suma;
    }
    public float resta(float var1,float var2){
        return var1-var2;
    }
    public float multiplicacion(float var1,float var2){
        return var1*var2;
    }
    public float division(float var1,float var2){
        float divicion=0;
        if(var2>0){
            divicion=var1/var2;
        }
        return divicion;
    }
}
