
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author agasya
 */
public class BHAKTIALAM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Hotel Bhakti Alam");
        System.out.println("Masukkan kamar : ");
        String kamar = input.next();
        System.out.println("Masukkan hari : ");
        String hari = input.next();
        System.out.println("Berapa orang : ");
        int orang = input.nextInt();
        int harga = 0;

        if (!kamar.equalsIgnoreCase("Barrack")) {
            if (kamar.equalsIgnoreCase("Duku")) {
                if (orang > 2) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 915000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 1025000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 1225000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Jeruk")) {
                if (orang > 2) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 915000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 1025000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 1225000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Alpukat")) {
                if (orang > 1) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 575000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 695000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 895000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Jambu Air")) {
                if (orang > 1) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 575000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 695000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 895000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Durian")) {
                if (orang > 2) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 595000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 715000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 915000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Melon")) {
                if (orang > 2) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 595000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 715000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 915000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Belimbing")) {
                if (orang > 2) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 495000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 715000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 755000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Mangga")) {
                if (orang > 2) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 495000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 715000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 755000;
                } else {
                    harga = 0;
                }
            }
            if (kamar.equalsIgnoreCase("Kedondong")) {
                if (orang > 2) {
                    System.out.println("Tidak bisa");
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    harga = 495000;
                } else if (hari.equalsIgnoreCase("Weekend")) {
                    harga = 715000;
                } else if (hari.equalsIgnoreCase("Holiday")) {
                    harga = 755000;
                } else {
                    harga = 0;
                }
            }
            System.out.println("Harga kamar " + kamar + " pada " + hari + " dengan " + orang + " orang = " + harga);
        } else {
            if (hari.equalsIgnoreCase("Weekday")) {
                harga = 25000;
            } else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 25000;
            } else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 35000;
            } else {
                harga = 0;
            }
            System.out.println("Harga kamar Barrack pada " + hari + " dengan " + orang + " orang = " + harga * orang);
        }

    }

}
