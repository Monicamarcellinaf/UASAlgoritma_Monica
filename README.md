# 1. Deskripsi Program
Program ini adalah sistem pemesanan (booking) Makeup Artist (MUA) berbasis Java yang memungkinkan pelanggan untuk memilih layanan MUA, menentukan tanggal booking, dan memilih metode pembayaran.
# 2.Fitur dalam Program
2.1. Menampilkan Daftar MUA
- Program akan menampilkan daftar MUA yang tersedia beserta harga layanan.
- Data ini disimpan dalam array untuk memudahkan pengelolaan.
  
2.2. Proses Pemesanan (Booking)
- Pengguna memilih MUA (1-3).
- Pengguna memasukkan nama pelanggan.
- Pengguna memasukkan tanggal booking dalam format DD/MM/YYYY.
- Pengguna memilih metode pembayaran dari opsi berikut:
  a.Transfer Bank
  b.E-Wallet
  c.Tunai
  
2.3. Konfirmasi Booking

Setelah input selesai, program akan menampilkan ringkasan booking, termasuk:
- Nama pelanggan
- MUA yang dipilih
- Tanggal booking
- Metode pembayaran
- Total biaya
  
2.4. Opsi Booking Ulang
- Program akan menanyakan apakah pengguna ingin melakukan booking lagi.
- Jika "ya", pengguna dapat memesan layanan lain tanpa perlu memulai ulang program.
- Jika "tidak", program menampilkan pesan terima kasih dan berhenti.

# 3.Cara Kerja Program (Alur

1.Menampilkan daftar MUA beserta harga layanan.

2.Pengguna memilih MUA (1-3).

- Jika salah → tampilkan pesan error, minta input ulang.

3.Pengguna memasukkan nama pelanggan.

4.Pengguna memasukkan tanggal booking (DD/MM/YYYY).

5.Pengguna memilih metode pembayaran (1-3).

- Jika salah → metode dianggap tidak valid.

6.Program menampilkan detail booking.

7.Program menanyakan apakah pengguna ingin booking lagi.

- Jika "ya", kembali ke awal.
- Jika "tidak", tampilkan pesan terima kasih dan program berhenti.

# 4.Konsep Pemrograman yang Digunakan

Konsep	Penjelasan dalam Program

- Pencabangan (if) = Mengecek validasi input menu dan metode pembayaran.

- Perulangan (while) = Memungkinkan pengguna melakukan booking lebih dari satu kali.

- Fungsi/Prosedur	tampilkanMenu() dan bookingMUA() = untuk modularisasi kode.

- Array	= Menyimpan daftar MUA dan harga layanan agar lebih terorganisir.

