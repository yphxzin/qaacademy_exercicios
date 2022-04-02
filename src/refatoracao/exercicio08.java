package refatoracao;

public class exercicio08 {
    public double calcularsalarioliquido(double salario) {
        double ir =1045;
        if (salario > 0 && salario <= 1903.98) {
        }

        if (salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.075) - 142.80;
        }

        if (salario >= 2826.66 && salario <= 3751.05) {
            ir = (salario * 0.15) - 354.80;
        }

        if (salario >= 3751.06 && salario <= 4664.68) {
            ir = (salario * 0.225) - 636.13;
        }

        if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;
        }
        return ir;

    }

}
