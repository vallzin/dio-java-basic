public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Valmilson";
        String ultimoNome = "lucena";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "\nResultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
