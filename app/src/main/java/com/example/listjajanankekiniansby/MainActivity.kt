package com.example.listjajanankekiniansby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = createListJajan()
        RecycleView.layoutManager = LinearLayoutManager(this)
        RecycleView.setHasFixedSize(true)
        RecycleView.adapter = Adapter(data, {onItem: DataJajanan -> onItemClicked(onItem)})
    }

    private fun onItemClicked(onItem: DataJajanan) {
        val ShowDetailIntent = Intent(this, DetailJajanan::class.java)
        ShowDetailIntent.putExtra(Intent.EXTRA_TEXT, onItem.gmbrjajan)
        ShowDetailIntent.putExtra(Intent.EXTRA_TITLE, onItem.namajajan)
        ShowDetailIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.desjajan)
        startActivity(ShowDetailIntent)
    }

    private fun createListJajan() : List<DataJajanan> {
        val list = ArrayList<DataJajanan>()
        list.add(
            DataJajanan(
                R.drawable.cincaustation,
                    "Cincau Station",
                    "Merek minuman satu ini mengangkat rasa otentik Indonesia. Dari namanya gerai Cincau Station menawarkan cincau minuman khas Indonesia. Cincau Station memberi varian rasa yang berbeda, seperti cincau kelapa yang dicampur dengan daging kelapa, cincau sirup, cincau sari kedelai dan masih banyak lagi. Harga yang ditawarkan sangat terjangkau, yaitu mulai dari Rp 10.000. \n"
            )
        )
        list.add(
                DataJajanan(
                        R.drawable.pentolspesial,
                        "Pentol Spesial Rasa",
                        "Jika pentol biasanya berukuran kecil, di Surabaya ada pentol dengan ukuran jumbo. Uniknya terdapat beragam jenis pentol, mulai dari pentol jumbo, pentol cabe, pentol jamur, pentol keju, pentol puyuh, dna pentol urat. Harganya mulai Rp 500 hingga Rp 2.000.\n"
                )
        )
        list.add(
                DataJajanan(
                        R.drawable.satecumi,
                        "Sate Cumi Bakar",
                        "Di Surabaya lagi ramai tentang Sate Cumi Bakar ala Thailand. Cumi ini dibuat seperti jajanan yang ada di Thailand. Cumi-cumi yang digoreng tepung dan dimasak dengan saus asam manis memang sudah biasa. Dengan Rp 15 ribu, anda bisa mencicipi sate cumi bakar di Surabaya.\n"
                )
        )
        list.add(
                DataJajanan(
                        R.drawable.donativy,
                        "Donat Ivy",
                        "Donat Ivy merupakan sebuah donat kentang rumahan yang terkenal di Surabaya. Donat kentang satu ini memiliki tekstur yang sangat empuk dan lembut. Kentang dalam donat masing sangat terasa dan gurih. Donat ini dihargai sesuai dengan toping yang dipilih. Satu buah donat dihargai Rp 6.000 dan untuk 6 buah donat dihargai dengan harga Rp 31.000. Jika 12 buah donat dihargai Rp 54.000.\n"
                )
        )
        list.add(
                DataJajanan(
                        R.drawable.shinlin,
                        "Shihlin Taiwan Snacks",
                        "Sebagai salah satu family mall  di Surabaya, Tunjungan Plaza memang menawarkan banyak tempat makan yang nyaman untuk keluarga. Tak hanya itu, jajanan enak yang pas untuk cemal-cemil juga banyak. Salah satunya Shihlin Taiwan Snack yang menawarkan sajian dada ayam tanpa tulang yang digoreng dengan tepung khas Taiwan. Harga mulai Rp. 23.000.\n"
                )
        )
        list.add(
                DataJajanan(
                        R.drawable.changtea,
                        "Chang Tea",
                        "Chang Tea adalah minuman yang menawarkan minuman asyik dengan campuran cream cheese. Rasanya manis gurih asin yang tak bikin enek. Nah, kamu pun bisa memesan berbagai varian cheese, dari teh vanila, cokelat, serta green tea. Harga yang ditawarkan mulai dari Rp. 7.000.\n"
                )
        )
        return list
    }
}