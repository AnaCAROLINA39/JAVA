public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "B";
   
        if (sigla == "P") 
            System.out.println("PEQUENO");
            else if( sigla == "M")
            System.out.println("MEDIO");
            else if( sigla == "G")

            System.out.println("GRANDE");
            else
            System.out.println("INDEFIMIDO");



            String sigla2 = "P";
            switch (sigla2) {
                case "P":{
                    System.out.println("pequeno");
                    break;
                }

                case "M":{
                    System.out.println("MEDIO");
                    break;
                }

                case "G":{
                    System.out.println("GRANDE");
                    break;
                }
            
                default:
                System.out.println("indefinido");
                    break;
            }


            
        }

    

}
