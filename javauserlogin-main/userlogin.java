package yasa;

import java.util.Scanner;

public class kullanıcı_girisi {
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("******************************\n"+
                "Kullanıcı adı ve parola giriş ekranına hoş geldiniz...\n"+
                "******************************");
        String sys_kullanici="yasadiye";
        String sys_parola="123456";
        int giris_hakki=3;

        while(true){
            System.out.print("Kullanıcı adınızı giriniz :");
            String kullanici=scan.nextLine();
            System.out.print("Parolanızı giriniz :");
            String parola=scan.nextLine();
            // not : String==String yapamıyoruz String.equals(String) ile veya !String.equals(String) olarak yapmalıyız.
            if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)){
                System.out.println("Sisteme başarılı bir şekilde giriş yapabildiniz...");
                break;
            }
            else if(kullanici.equals(sys_kullanici) && !parola.equals(sys_parola)){
                if(giris_hakki==0){
                    System.out.println("");
                }
                else{
                    System.out.println("Parolanızı yanlış girdiniz lütfen tekrar deneyiniz...");
                    giris_hakki -= 1;
                    System.out.println("giriş hakkınız : "+giris_hakki);
                }
            }
            else if(!kullanici.equals(sys_kullanici) && parola.equals(sys_parola)){
                if(giris_hakki == 0){
                    System.out.println("");
                }
                else{
                    System.out.println("Kullanıcı adınızı yanlış girdiniz...");
                    giris_hakki -= 1;
                    System.out.println("giriş hakkı : "+giris_hakki);
                }
            }
            else{
                if(giris_hakki == 0){
                    System.out.println("");
                }
                else{
                    System.out.println("kullanıcı adınızı ve parolanızı yanlış girdiniz lütfen tekrar deneyiniz...");
                    giris_hakki -= 1;
                    System.out.println("giriş hakkınız : "+giris_hakki);
                }
            }
            if(giris_hakki == 0){
                System.out.println("Üzgünüm giriş hakkınızı tamamladınız lütfen başka bir sefer tekrar deneyiniz.
                \nŞifrenizi yenilemek için şifremi unuttuma basınız. ");
                break;
            }
        }
    }
}
