package calc;

public class Controler {

    private static final String MSG_SUCESSO = "operacao realizada com sucesso.";

    public static Resultado processa(Requisicao req) {
        char operacao = req.getOperacao();
        float result = 0;

        try {
            switch (operacao) {
                case '+':
                    result = Calculadora.somar(req.getX(), req.getY());
                    break;

                case '-':
                    result = Calculadora.subtrair(req.getX(), req.getY());
                    break;

                case '*':
                    result = Calculadora.multiplicar(req.getX(), req.getY());
                    break;

                case '/':
                    result = Calculadora.dividir(req.getX(), req.getY());
                    break;
                    
                default:
                    throw new Exception("operacao nao suportada.");
            }
            return new Resultado(result, true, MSG_SUCESSO);
            
        } catch (Exception ex) {
            return new Resultado(result, false, ex.getMessage());
        }

    }
}
