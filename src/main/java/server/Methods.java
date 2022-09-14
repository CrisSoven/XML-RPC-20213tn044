//Cristopher Soto Ventura - 4B
package server;

import java.util.Arrays;

public class Methods {
    public double addition(double num1, double num2){
        return num1+num2;
    }

    public String IMC(String name, double peso, double altura){
        double imc = peso/(altura*altura);

        return "Hola "+name+", tu imc es de: "+imc;
    }

    public String operations(double num1, double num2, double num3, double num4){
        Double[] nums = {num1, num2, num3, num4};
        double mult = 1, sum = 0, prom = 0;

        for (int i = 0; i < nums.length; i++) {
            mult *= nums[i];
            sum += nums[i];
            prom = sum/nums.length;
        }

        return "Hola, el producto de los valores es "+mult+", la suma "+sum+" y el promedio "+prom;
    }

    public String sum(int num1, int num2){
        int numMayor = (num1 < num2) ? (numMayor = num2) : (numMayor = num1);
        int numMenor = (num1 < num2) ? (numMenor = num1) : (numMenor = num2);
        int count = 0;
        while (numMayor != (numMenor+1)){
            numMayor--;
            count += numMayor;

            System.out.print(numMayor);
        }

        return "La suma entre los numeros es igual a "+count;
    }

    public String sortArray(Object[] nums){
        String arr = "| ";
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            arr +=nums[i]+" | ";
        }
        return arr;
    }
}
