import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double ort;
        int mat,fizik,turkce,kimya,muzik;
        System.out.print("Matematik notunuzu giriniz(0 ve 100 arası): ");
        mat=inp.nextInt();
        System.out.print("\nFizik notunuzu giriniz(0 ve 100 arası): ");
        fizik=inp.nextInt();
        System.out.print("\nTürkçe notunuzu giriniz(0 ve 100 arası): ");
        turkce=inp.nextInt();
        System.out.print("\nKimya notunuzu giriniz(0 ve 100 arası): ");
        kimya=inp.nextInt();
        System.out.print("\nMüzik notunuzu giriniz(0 ve 100 arası): ");
        muzik=inp.nextInt();
        ort=(mat+turkce+muzik+fizik+kimya)/5;


        if ((mat>101 || mat<-1) || (muzik>101 || muzik<-1) || (fizik>101 || fizik<-1) || (kimya>101 || kimya<-1) || (turkce>101 || turkce<-1)){
            System.out.println("Geçersiz not girdiniz!");
        } else if (ort>=55){
            System.out.println("Sınıfı "+ort+" ortalama ile geçtiniz. Tebrikler!");
        }else {
            System.out.println("Sınıfta kaldınız");
        }
    }
}