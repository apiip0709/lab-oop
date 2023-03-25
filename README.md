# Lab OOP
Repository tempat pengumpulan tugas untuk Lab OOp

## Aturan Pengumpulan
**Note:**  
_Untuk perintah yang dibungkus < > maka perintah tersebut diganti sesuai instruksi yang ada dalam tanda < > tersebut. Contohnya `mkdir <NIM>` menjadi `mkdir H071191049`_
- Silahkan fork repositori ini
- Lakukan clone terhadap hasil fork repository ini ke komputer kalian
  ```
  git clone <url-repositori-hasil-fork>
  ```
- Pindah ke repositori hasil clone dengan perintah berikut
  ```
  cd lab-oop/src/
  ```
- Buat branch baru berdasarkan NIM kalian serta gunakan branch tersebut untuk menyimpan kode dari soal yang dikerjakan
  ```
  git checkout -b <NIM>
  ```
- Buat folder baru berdasarkan NIM kalian
  ```
  mkdir <NIM>
  ```
- Di dalam folder NIM kalian buat folder dengan nama "Pertemuan_<_no_pertemuan_>" tanpa tanda kutip. contoh: Pertemuan_01
- Di dalam folder pertemuan tersebut, kalian menambahkan file tugas praktikum yang telah kalian kerjakan dengan format nama file "assignment_<_no pertemuan_>_<_no_soal_>.java" tanpa tanda kutip
- Setelah semua file tugas telah diselesaikan dan telah diasistensikan lakukan perintah berikut
  ```
  git add .
  git commit -m "<pesan commit>"
  git push origin <NIM>
  ```
  Note:
  Pesan commit yang dibuat diharapkan sesuai dengan hal yang dilakukan. Seperti "menambah tugas praktikum ..." atau "memperbaiki type di file ..."
- Setiap file wajib menggunakan package, dengan format misal nim anda H071191049 dan Tugasnya merupakan tugas Pertemuan_02, maka packagenya
  ```package H071191049.Pertemuan02```
- Setelah perintah tersebut berhasil, silahkan membuka repository hasil fork kalian di github dan lakukan pull request ke repository ini. 
- Apabila terdapat kesulitan, silahkan menghubungi asistennya
