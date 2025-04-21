import java.util.Scanner;

class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static Loja lojinha;
    public static Vendedor vendu;
    public static Cliente clienta;
    public static void main(String[] args) {
        System.out.println("/---- Cadastrar loja ----/");
        Criar_Loja();
        while(true){
            System.out.println("1 - Adicionar Cliente," + " 2 - Salarios, 3 - Mostrar_vendedor, " +
                    "4 - contar vendedor e cliente 5 - mostrar_cliente 6 - mostrar loja, 7 - sair,  8 - Adicionar vendedor ");
            System.out.println("Qual das opções você quer escolher?");
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1 :
                    Cliente(lojinha);
                    break;
                case 2:
                    salario(vendu);
                    break;
                case 3:
                    mostrar_vendedor(vendu);
                    break;
                case 4:
                    Contar_cliente_vendedor(lojinha);
                    break;
                case 5:
                    mostrar_cliente(clienta);
                    break;
                case 6:
                    Mostrar_loja(lojinha);
                    break;
                case 7:
                    System.out.println("Você saiu");
                    return;
                case 8:
                    Vendedo(lojinha);
                    break;
            }
        }

    }
    public static void Vendedo(Loja lojinha){
        System.out.println("Nome do Vendedor");
        String nome = scanner.next();

        System.out.println("Idade do Vendedor");
        int idade = scanner.nextInt();

        System.out.println("Nome da cidade");
        String cidade = scanner.next();

        System.out.println("Nome do Bairro");
        String bairro = scanner.next();

        System.out.println("Nome da rua");
        String rua = scanner.next();

        System.out.println("Valor do Salario base");
        Double salario_base = scanner.nextDouble();

        String loj = "Bairro da loja:" +lojinha.getBairro() +"," +
                "Cidade da loja:" +lojinha.getCidade() +"," +
                "Cpnj:"+lojinha.getCpnj() + "," +
                "Rua:" + lojinha.getRua() +"," +
                "Razão social:" + lojinha.getRazão_social() +"," +
                "Nome:" + lojinha.getNome() +"," +
                "Fantasia:" + lojinha.getFantasia();

                 vendu = new Vendedor(nome,idade,loj,cidade,bairro,rua,salario_base);
                lojinha.AddVendedor(vendu);
    }
    public static void Cliente(Loja lojinha) {
        System.out.println("Nome do Cliente");
        String nomo = scanner.next();

        System.out.println("Idade do Cliente");
        int idad = scanner.nextInt();

        System.out.println("Nome da cidade");
        String cidad = scanner.next();

        System.out.println("Nome do Bairro");
        String bairr = scanner.next();

        System.out.println("Nome da rua");
        String ru = scanner.next();

        clienta = new Cliente(nomo,idad,cidad,bairr,ru);
        lojinha.AddCliente(clienta);
    }
    public static void Criar_Loja(){
        System.out.println("Nome da Loja");
        String noma = scanner.next();

        System.out.println("Nome da fantasia");
        String fantasia = scanner.next();

        System.out.println("razão social da loja");
        String razao_social = scanner.next();

        System.out.println("O cpnj");
        String cpnj = scanner.next();

        System.out.println("A cidade");
        String cidado = scanner.next();

        System.out.println("Nome do Bairro");
        String bairre = scanner.next();

        System.out.println("Nome da rua");
        String rue = scanner.next();

        lojinha = new Loja(noma,fantasia,razao_social,cpnj,cidado,bairre,rue);

    }
    public static void Mostrar_loja(Loja lojinha){
        lojinha.apresentarse();
    }
    public static void Contar_cliente_vendedor(Loja lojinha){
        System.out.println("Quantidade de clientes");
        lojinha.contarClientes();
        System.out.println("Quantidade de vendedores");
        lojinha.contarVendedores();
    }
public static void salario(Vendedor vendu){
        System.out.println("Salario_Bonus:"+vendu.getSalarioBase());
        System.out.println("Salario_Recebido:"+vendu.getSalarioRecebido());
}
public static void mostrar_vendedor(Vendedor vendu){
        vendu.apresentarse();
}
    public static void mostrar_cliente(Cliente clienta){
        clienta.Apresentar();
    }

}
