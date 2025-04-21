public class Vendedor extends Cliente {
    private final String loja;
    private final Double salarioBase;
    private final Double[] salarioRecebido = new Double[]{3000.0,4000.0,5000.0};

    public Vendedor(String nome, int idade, String cidade, String bairro, String rua, String loja, Double salarioBase) {
        super(nome, idade, cidade, bairro, rua);
        this.loja = loja;
        this.salarioBase = salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Double getSalarioRecebido() {
        return salarioRecebido[0];
    }


   public void apresentarse() {
System.out.println("Nome:"+getNome() +"," +"idade:"+getIdade() +"," +"Loja:"+this.loja);
   }
   public double calcularMedia() {
Double soma = 0.0;
Double e = 0.0;
for (Double p :  salarioRecebido) {
    soma += p;
    e++;
}
return soma/e;

   }
   public double calcularBonus() {
  return salarioBase * 0.2;
   }
}
