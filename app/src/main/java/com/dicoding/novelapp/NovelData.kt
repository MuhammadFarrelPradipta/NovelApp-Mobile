package com.dicoding.novelapp

object NovelData {
    private val novelNames = arrayOf(
        "Tensei shitara Slime Datta Ken",
        "Solo Leveling",
        "Player Who Cant Level Up",
        "Overlord",
        "The New Gate",
        "Mushoku Tensei : Jobless Reincarnation",
        "Return of The Frozen Player",
        "86",
        "Classroom Of Elite",
        "Berserk Of Gluttonny"
    )
    private val  novelDetails = arrayOf(
        "Seorang pria tertusuk oleh pencuri yang sedang lari saat dia mendorong teman kerjanya, diapun terkapar dan sedang menunggu ajalnya. Tiba-tiba dia mendengar sebuah suara aneh. Suara ini mengatakan beberapa penyesalan yang dimiliki sang pria, salah satunya adalah mengenai keperjakaannya yang membuatnya mendapatkan skill unik [Pertapa Agung].",
        "10 tahun yang lalu, setelah “Gerbang” yang menghubungkan dunia nyata dengan dunia monster terbuka, beberapa orang biasa, setiap hari menerima kekuatan untuk berburu monster di dalam Gerbang. Mereka dikenal sebagai “Pemburu”. Namun, tidak semua Pemburu kuat. Nama saya Sung Jin-Woo, seorang Pemburu peringkat-E. Saya seseorang yang harus mempertaruhkan nyawanya di ruang bawah tanah paling rendah, “Terlemah di Dunia”. Tidak memiliki keterampilan apa pun untuk ditampilkan, saya hampir tidak mendapatkan uang yang dibutuhkan dengan bertarung di ruang bawah tanah berlevel rendah… setidaknya sampai saya menemukan ruang bawah tanah tersembunyi dengan kesulitan tersulit dalam ruang bawah tanah peringkat-D! Pada akhirnya, saat aku menerima kematian, tiba-tiba aku menerima kekuatan aneh, log pencarian yang hanya bisa kulihat, rahasia untuk naik level yang hanya aku yang tahu! Jika saya berlatih sesuai dengan pencarian saya dan monster yang diburu, level saya akan naik.",
        "Undangan tower hanya untuk orang yang memenuhi syarat untuk menjadi player, yang mendapatkan undangan akan mendapat kemampuan unik yang disebut hak istimewa bagi player yang terpilih, aku mendapat undangan dari tower pada usia 18 tahun, dan ini sudah lima tahun, levelku masih 1.",
        "Sebuah game online terkenal yang pada akhirnya ditutup. Sang Protagonist, Momonga memutuskan untuk tinggal di game tercintanya itu hingga detik terakhir dan menunggu logout paksa. Tidak disangka, server game tersebut tidak mati dan Momonga terjebak dalam tubuh tengkorak serta dikirim ke dunia lain. “The powerful Overlord” kini menjelajahi dunia baru dan terus menghadapi tantangan.",
        "Sebuah game online yang telah berubah menjadi permainan kematian, kini melepaskan puluhan ribu pemain yang telah diseret ke dalamnya, berkat upaya dari Shin, salah satu pemain tertua. Tapi setelah ia mengalahkan bos terakhir dan membebaskan semua orang, ia ditelan oleh cahaya aneh dan menemukan dirinya dalam dunia game 500 tahun di masa depan.",
        "Seorang NEET (Pengangguran) yang terlahir kembali menjadi bayi di dunia yang berbeda dengan kehidupan sebelumnya dimana di dunia itu ada sihir, dan si tokoh utama dengan membawa semua memori dari kehidupan sebelumnya. Tidak mau penyesalan masa lalu terulang dia bersumpah dikehihupan ke-2nya ini dia akan menjadi manusia yang berguna dan hidup bahagia. Kedua orantua sang bayi (Paolo dan Zenith) menamakan bayi mereka yg baru lahir itu, Rudeus Greirad.",
        "5 tahun setelah dunia berubah, bos terakhir muncul, Frost Queen dari area bumi. Jika kami bisa mengalahkannya, hidup kami akan kembali normal! Lima top player di dunia, termasuk Specter Seo Junho, akhirnya mengalahkan Frost Queen… Tapi setelahnya, mereka justru jatuh dalam tidur yang panjang. 25 tahun berlalu. “Lantai kedua? Itu tidak berakhir saat Frost Queen mati? Specter terbangun dari tidur panjangnya.",
        "Perjuangan manusia buangan yang di jadikan alat berperang. Republik San Magnolia sudah lama mengalami tekanan dari kekaisaran Giadian yang menyerang dengan kekuatan Robot Legiun. Robot tersebut merupakan Drone Tanpa Awak yang menyerbu dan mengepung negri tersebut.",
        "Siswa bernama Kiyotaka yang masuk sebuah sekolah elit dan prestisius. Namun, sialnya dia masuk ke kelas D, di mana isinya adalah anak-anak nakal dan berandal. Kiyotaka tidak menyukai teman-teman kelasnya, hingga dia bertemu dengan Suzune Horikita dan Kikyo Kushida.",
        "Fate Graffith hidup di dunia dimana skill merupakan pemberian dari para Dewa dimana takdir jadi pahlawan atau pecundang tergantung dari skill yang didapat dan fate ditakdirkan jadi pecundang"
    )
    private val novelImages = intArrayOf(
        R.drawable.tenseislime,
        R.drawable.sololeveling,
        R.drawable.playercantlevelup,
        R.drawable.overlord,
        R.drawable.newgate,
        R.drawable.mushokutensei,
        R.drawable.frozenplayer,
        R.drawable.delapanenam,
        R.drawable.classromofelite,
        R.drawable.berserkofgluttony
    )
    val listNovel : ArrayList<Novel>
    get() {
        val list = arrayListOf<Novel>()
        for (position in novelNames.indices){
            val novel = Novel()
            novel.name = novelNames[position]
            novel.detail = novelDetails[position]
            novel.photo = novelImages[position]
            list.add(novel)
        }
        return list
    }
}