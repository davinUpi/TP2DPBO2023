# TP2DPBO2023
## "TP2DPBO2023"
Saya Davin mengerjakan evaluasi TP2DPBO2023 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Wow?! Recoding?! Why?<br>
pengetikkan ulang dilakukan karena rassa kurang puas. Selain itu, kode pertama adalah hasil sambil belajar. Untuk yang ini, saya sudah mempelajari dasar-dasarnya + ditambah materi package.

Untuk penjelasan, akan dijelaskan berdasarkan package yang ada. Yaitu, database; objects; gui; dan img. Hanya package img yang tidak akan dijelaskan karena saya asumsikan semua orang sudah tahu apa itu img.

## Package database<br>
Package ini mengandung file2 yang berhubungan dengan database, seperti connector dan model tabel.
<ul>
<li>
<p>DbConnector (parent class) ((mungkin sebaiknya abstract class?))</p>
<p>Merupakan kelas yang bertanggung jawab untuk membangun koneksi dengan database. Memiliki method untuk mengambil dan memanipulasi data</p>
</li>
<li>
<p>modelUser (extend DbConnector)</p>
<p>Merupakan kelas untuk memodelkan tabel users. Berisikan methode2 untuk mengambil dan memanipulasi data dengan berbagai param</p>
<p>Pengambilan data akan mengembalikan object User atau ArrayList object User</p>
</li>
<li>
<p>modelFigure (extend DbConnector)</p>
<p>Merupakan kelas untuk memodelkan tabel figures. Berisikan methode2 untuk mengambil dan memanipulasi data dengan berbagai param</p>
<p>Pengambilan data akan mengembalikan object Figure atau ArrayList object Figure</p>
</li>
<li>
<p>modelManuf (extend DbConnector)</p>
<p>Merupakan kelas untuk memodelkan tabel manufacturers (disingkat manuf). Berisikan methode2 untuk mengambil dan memanipulasi data dengan berbagai param</p>
<p>Pengambilan data akan mengembalikan object Manuf atau ArrayList object Manuf</p>
<p>Terdapat metode tambahan untuk mengambil data berdasarkan view manufacturer_info</p>
</li>
</ul>

## Package objects<br>
Package ini mengandung kelas dari objek2 yang digunakan. Termasuk sebuah enum.
<ul>
<li>
<p>User</p>
<p>Sebuah kelas untuk menampung data2 dari tabel users. Metode hanya berupa get dan set</p>
</li>
<li>
<p>Manuf</p>
<p>Sebuah kelas untuk menampung data2 dari tabel manufacturers. Metode hanya berupa get dan set</p>
</li>
<li>
<p>Figure</p>
<p>Sebuah kelas untuk menampung data2 dari tabel figures. Metode hanya berupa get dan set</p>
</li>
<li>
<p>FigureType</p>
<p>Sebuah kelas enum untuk tipe2 figure. Memiliki metode untuk mengubah value-nya menjadi string sesuai enum di db</p>
</li>
</ul>

## Package GUI
Daging utama proyek ini. mengandung kelas2 GUI untuk CRUD
<ul>
<li>
<p>startFrame</p>
<p>Sebuah JFrame untuk menampung Login dan Register. Memiliki attribute int state untuk mengendalikan tampilan</p>
</li>
<li>
<p>Login</p>
<p>Sebuah JPanel berupa form yang muncul ketika state = 0. Terdiri dari dua field: nama dan password. Keduanya menggunakan textField (ik, salah). Terdapat tombol untuk masuk (pak eko) dan registerasi (kasir).</p>
</li>
<li>
<p>Register</p>
<p>Sebuah JPanel berupa form yang muncul ketika state = 1. Terdiri dari tiga field: nama, password, dan konfirmasi password. Ketiganya menggunakan textField (ik, salah). Terdapat tombol untuk cancel (kembali ke login) dan pak Eko (masuk).</p>
</li>
<li>
<p>Listing</p>
<p>Sebuah JFrame berupa form yang muncul ketika state = 2. Terdiri dari JTabbedPane yang mengandung tab Figure dan Manufacturer. Figure menampilkan sebuah search bar, tombol untuk menambah figure, dan cardList figure2 yang ada. Manufacturer menampilkan card list manufacturer2 yang ada.</p>
<p>Terdapat beberapa metode inernal seperti refresh() untuk menampilkan ulang yang dapat diakses dengan memencet tombol refresh. Tombol add akan menampilkan JDialog EditFrame</p>
</li>
<li>
<p>figureCard(? lupa lagi namanya)</p>
<p>Sebuah JPanel untuk menampilkan data2 sebuah figure. Memiliki dua tombol: edit dan delete. Edit akan memunculkan JDialog EditFrame dan delete akan menghapus figure tsb</p>
</li>
<li>
<p>manufCard(? lupa lagi namanya)</p>
<p>Sebuah JPanel untuk menampilkan data2 sebuah manufacturer. Data yang ditampilkan adalah data berdasarkan view manufacturer_info</p>
</li>
<li>
<p>EditForm(? lupa lagi namanya)</p>
<p>Sebuah JFrame yang nantinya dimasukkan ke JDialog, berupa form untuk menambahkan/ mengubah data figure. Penambahan gambar menggunakan JFileChooser yang dapat diakses dengan menekan tombol ganti gambar(?). Tombol cancel untuk nggak jadi dan tombol add/update untuk memasukkan / mengubah data figure</p>
</li>
</ul>
