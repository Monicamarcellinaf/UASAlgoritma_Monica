/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookingmua;

import java.util.Scanner;
/**
 *
 * @author monicamarcellinaf
 */
public class BookingMUA {

    static Scanner input = new Scanner(System.in);
    
    static String[] daftarMUA = {"Makeup Wedding", "Makeup Engagement", "Makeup Wisuda"};
    static int[] hargaMUA = {12000000, 5000000, 1000000};
    
    public static void main(String[] args) {
        boolean ulang = true;
        while (ulang) {
            tampilkanMenu();
            System.out.print("Pilih MUA (1-3): ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            if (pilihan >= 1 && pilihan <= 3) {
                bookingMUA(pilihan - 1);
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Apakah ingin booking lagi? (ya/tidak): ");
            String jawab = input.nextLine();
            ulang = jawab.equalsIgnoreCase("ya");
        }

        System.out.println("Terima kasih telah menggunakan layanan kami!");
    }

    static void tampilkanMenu() {
        System.out.println("=== Daftar MUA ===");
        for (int i = 0; i < daftarMUA.length; i++) {
            System.out.println((i + 1) + ". " + daftarMUA[i] + " - Rp" + hargaMUA[i]);
        }
    }

    static void bookingMUA(int index) {
        System.out.println("Anda memilih " + daftarMUA[index]);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan tanggal booking (DD/MM/YYYY): ");
        String tanggal = input.nextLine();
        
        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Transfer Bank");
        System.out.println("2. E-Wallet");
        System.out.println("3. Tunai");
        System.out.print("Masukkan pilihan (1-3): ");
        int metode = input.nextInt();
        input.nextLine(); // Membersihkan buffer
        
        String metodePembayaran = "";
        switch (metode) {
            case 1: metodePembayaran = "Transfer Bank"; break;
            case 2: metodePembayaran = "E-Wallet"; break;
            case 3: metodePembayaran = "Tunai"; break;
            default: metodePembayaran = "Tidak valid";
        }
        
        System.out.println("\nBooking Berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("MUA: " + daftarMUA[index]);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("Total Biaya: Rp" + hargaMUA[index]);
    }
} 

    

