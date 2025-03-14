public class formatadorCepExemplo {
    public static void main(String[] args) {
    try {
        String cepFormt = formatarCep("2375064");
        System.out.println(cepFormt);
    } catch (CepInvalidException e) {
        // TODO Auto-generated catch block
      //  e.printStackTrace();
      System.out.println("cep invalido");
    }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() !=8) 
            throw new CepInvalidException();

            return "23.765-064";
        
    }
}
