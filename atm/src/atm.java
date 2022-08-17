import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username,password;
        boolean enter = false;
        int balance = 1500;


        for (int i =3;i>=0;i--){
            System.out.println("Kullanici adi:");
            username = input.nextLine();
            System.out.println("Sifrenizi girin:");
            password = input.nextLine();
            if (username.equals("Tolga") && password.equals("123")){
                System.out.println("Giris yapildi...");
                enter = true;
                break;
            } else {
                System.out.println("Bilgileriniz yanlıs..." + i + "deneme hakkiniz kaldi...");
            }
        }
        while (enter){
            System.out.println("Yapıcaginiz islemi secin:");
            System.out.println("1.Para yatırma\n" + "2.Para Cekme\n" + "3.Bakiye Sorgulama\n" + "4.Cıkıs");
            int selection = input.nextInt();
            switch (selection){
                case 1:
                    System.out.println("yatırcagınız miktar:");
                    int x = input.nextInt();
                    balance += x;
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.println("Cekeceginiz miktar:");
                    int price = input.nextInt();
                    if (price > balance){
                        System.out.println("İsleminiz yapılamamaktadır...");
                    } else {
                        balance -= price;
                        System.out.println(balance);
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz:"+balance);
                    break;
                case 4:
                    enter = false;
                    break;
            }
        }
    }
}
