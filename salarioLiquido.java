import java.util.Scanner;

public class salarioLiquido{
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        float horas, depen, salarioHora, salarioBruto, inss=0, ir=0, salarioLiquido;
        
        System.out.println("\n******Inicio do programa.******\n");
        System.out.println("Quantas horas trabalha por mês? ");
        horas = salario.nextFloat();

        System.out.println("Quanto ganha por hora? ");
        salarioHora = salario.nextFloat();

        System.out.println("Quantos dependentes possui? ");
        depen = salario.nextFloat();

        salarioBruto = horas*salarioHora+(50*depen);
        
        System.out.println("\nSalário Bruto: "+salarioBruto);

        if(salarioBruto <= 1000){
            inss = (float) ((salarioBruto*8.5)/100);
            System.out.println("INSS= " +inss);
        }
        else if(salarioBruto > 1000){
            inss = (float) ((salarioBruto*9)/100);
            System.out.println("INSS= " +inss);
        }
        
        if(salarioBruto <= 500){
            System.out.println("IR= R$0");
        }

        else if(salarioBruto > 500 && salarioBruto <=1000){
            ir = (salarioBruto*5)/100;
            System.out.println("IR= " +ir);
        }

        else if(salarioBruto > 1000){
            ir = (salarioBruto*7)/100;
            System.out.println("IR= " +ir);
        }

        salarioLiquido = salarioBruto - inss - ir;
        System.out.println("Salário Líquido: " +salarioLiquido);

        System.out.println("\n******Fim do programa.******\n");
    }
}