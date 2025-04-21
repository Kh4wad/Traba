import java.lang.reflect.Array;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private String fantasia;
    private String razão_social;
    private String cpnj;
    private String cidade;
    private String bairro;
    private String rua;
    public static ArrayList<Vendedor> vende = new ArrayList<>();
    public static ArrayList<Cliente> Clie = new ArrayList<>();

    public Loja(String nome, String fantasia, String razão_social, String cpnj, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.fantasia = fantasia;
        this.razão_social = razão_social;
        this.cpnj = cpnj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public String getNome() {
        return nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public String getRazão_social() {
        return razão_social;
    }

    public String getCpnj() {
        return cpnj;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public void AddCliente(Cliente c){
        Clie.add(c);
    }
    public void AddVendedor(Vendedor v){
       vende.add(v);
    }
    public void contarClientes(){
        int p = 0;
        for(Cliente e : Clie){
           p++;
        }
        System.out.println("A quantidade de clientes é:"+p);
    }
    public void contarVendedores(){
        int v = 0;
        for(Vendedor t : vende){
            v++;
        }
        System.out.println("A quantidade de vendedores é:"+v);
    }
    public void apresentarse(){
      System.out.println("Nome:"+this.nome +"," +"Fantasia:" +this.fantasia +","
              +"Endereço:" +this.cpnj +"," +this.cidade +"," +this.bairro +this.razão_social +"," +this.rua);
    }
}

