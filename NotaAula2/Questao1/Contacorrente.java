class Contacorrente extends Conta {
    private final double CHEQUE_ESPECIAL = 1000.00;

    public Contacorrente(String titular) {
        super(titular);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + CHEQUE_ESPECIAL) {
            saldo -= valor;
            System.out.println("Sacudo: " + valor);
        } else {
            System.out.println("Pobre! Você só pode usar  " + CHEQUE_ESPECIAL + " do cheque.");
        }
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= CHEQUE_ESPECIAL) {
            saldo -= valor;
            System.out.println("Usado do cheque: " + valor);
        } else {
            System.out.println("Valor passou o limite do cheque.");
        }
    }
}