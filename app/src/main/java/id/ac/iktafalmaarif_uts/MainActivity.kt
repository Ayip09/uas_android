package id.ac.iktafalmaarif_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.tk,"Pendidikan Anak-anak","TK","Taman Kanak-Kanak" +
                "adalah jenjang pendidikan anak usia dini (usia 6 tahun atau di bawahnya) dalam bentuk pendidikan formal. Kurikulum TK ditekankan pada pemberian rangsangan pendidikan untuk membantu pertumbuhan dan perkembangan jasmani dan rohani agar anak memiliki kesiapan dalam memasuki pendidikan lebih lanjut." +
                "Secara umum untuk lulus dari tingkat program di TK selama 2 (dua) tahun."))

        data?.add(DataModel(R.drawable.sd,"Pendidikan","SD", "Sekolah Dasar" +
                "adalah jenjang paling dasar pada pendidikan formal di Indonesia. Sekolah dasar ditempuh dalam waktu 6 tahun, mulai dari kelas 1 sampai kelas 6. Saat ini murid kelas 6 diwajibkan mengikuti Ujian Nasional (EBTANAS) yang mempengaruhi kelulusan siswa." +
                "Pelajar sekolah dasar umumnya berusia 6-12 tahun.,"))

        data?.add(DataModel(R.drawable.smp,"Pendidikan","SMP", "Sekolah Menengah Pertama" +
                "adalah jenjang pendidikan dasar pada pendidikan formal di Indonesia yang ditempuh setelah lulus sekolah dasar (atau sederajat). Sekolah menengah pertama ditempuh dalam waktu 3 tahun" +
                "mulai dari kelas 7 sampai kelas 9"))

        data?.add(DataModel(R.drawable.sma,"Pendidikan","SMA", "Sekolah Menengah Atas" +
                "adalah jenjang pendidikan menengah pada pendidikan formal di Indonesia setelah lulus Sekolah Menengah Pertama (atau sederajat). Sekolah menengah atas ditempuh dalam waktu 3 tahun, mulai dari kelas 10 sampai kelas 12. " +
                "Pelajar SMA umumnya berusia 16-18 tahun."))

        data?.add(DataModel(R.drawable.kuliah,"Pendidikan","Kuliah", "enjang pendidikan tinggi" +
                "adalah Pendidikan ke jenjang lebih tinggi biasa di sebut meniti karir" +
                "lama perkuliahan 4-5 tahun"))

        data?.add(DataModel(R.drawable.mda,"Pendidikan Islam","Madrasah", "Madarsah Atau Pendidikan Islam" +
                "adalah madrasah dikhususkan sebagai sekolah (umum) yang kurikulumnya terdapat pelajaran-pelajaran tentang keislaman. Madrasah Ibtidaiyah (MI) setara dengan Sekolah Dasar (SD), Madrasah Tsanawiyah (MTs) setara dengan Sekolah Menengah Pertama (SMP), dan Madrasah Aliyah (MA) setara dengan Sekolah Menengah Atas (SMA)." +
                "ada MI,MTS dan MA"))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("jenis", item?.jenis)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}