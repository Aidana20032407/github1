public class Main {
    public static void main(String[] args) {
        //System.out.println(var(4,5,7,9,8));
       // method(new int []{18,19,20},"Aidai", "Dilnaz", "Dasha");
       String soz = "  I like java!!!";
        System.out.println(soz.charAt(soz.length()-1));
        System.out.println(soz.startsWith("I like"));
        System.out.println(soz.contains("java"));
        System.out.println(soz.replace("a",  "o"));
        System.out.println(soz.substring(9,13).toUpperCase());
        System.out.println(soz.substring(9,13).toLowerCase());
        System.out.println(soz.length());
        System.out.println(soz.trim());


        //System.out.println(method("да"));
    }
    static int aidana (int[] a){
      int max = a [0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    static int var( int...a){
        int result = 0;
        for (int i = 0; i <a.length ; i++) {
           result +=   a[i];
        }
            return result;
    }
    static void  mass (){
        String [] mass = new String[]{"brat","Мунара", "Айдана", "Мама"};
        for (String s : mass) {
            System.out.println("Я вас всех люблю " + s);
        }
    }
    static int method(String soz) {
        int index = 0;
        String[] massive = new String[]{"да", "нет", "да"};
        for (int i = 0; i < massive.length; i++) {
            if(massive[i] == soz){
                index =i;
            }
        }
        return index;
    }
        static void method (int[] a, String... b){
            for (int i = 0; i < a.length; i++) {
                System.out.println(b[i] + " "+ a[i]);
            }


            }



    }

























