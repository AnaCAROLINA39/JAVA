public class Usuario {
    public static void main(String[] args) throws Exception {
      SmartTv smartTv = new SmartTv();

      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();

      smartTv.aumentarVolume();
      System.out.println(smartTv.canal);
      smartTv.mudarCanal(13);
      System.out.println(smartTv.canal);
      System.out.println(smartTv.volume);


      System.out.println(smartTv.ligada);
      System.out.println(smartTv.canal);
      System.out.println(smartTv.volume);

      smartTv.ligar();
      System.out.println(smartTv.ligada);
    }
}
