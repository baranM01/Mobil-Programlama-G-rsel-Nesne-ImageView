package com.example.gorselnesneler5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

// ImageView Nesnesi Ve Kullanımı :
/*
ImageView belirli bir kaynak'tan alınan resimleri gösteren görsel nesne'dir.
Üzerinde resimleri görüntüleyebilen bir nesne 'dir.
Bu görsel nesne'ye erişmenin 2 yolu vardır :

1.yol ->  imageView.setImageResources(R.drawable.resim1)
       - ".setImageResources()" metod'u ile.
       - R -> Resource,  .drawable -> drawable kalsörü,  .resim1 -> ilgili görselin adı.

2.yol -> Dosya adı ile erişim'dir.
 */

class MainActivity : AppCompatActivity() {

    lateinit var butonresimilk:Button//------> ilk resim butonu için olan tanımlama
    lateinit var butonresimson:Button
    lateinit var ImageView:ImageView
    lateinit var butonileri:Button
    lateinit var butongeri:Button
    lateinit var butonresim2:Button
    lateinit var butonresim3:Button

    var sayac = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butonresimilk = findViewById(R.id.butonresimilk)//----> ilk resim için olan bağlama
        butonresimson = findViewById(R.id.butonresimson)
        ImageView = findViewById(R.id.imageView)//--------> Bu bağlama kısımları çok önemli'dir UNUTULMAMALI'DIR !
        butonileri = findViewById(R.id.butonileri)
        butongeri = findViewById(R.id.butongeri)
        butonresim2 = findViewById(R.id.resim2)
        butonresim3 = findViewById(R.id.resim3)

        // İlk resim butonuna tıklanırsa :

        butonresimilk.setOnClickListener {

            ImageView.setImageResource(R.drawable.resim1)//----> ilk resim
            Toast.makeText(this,"İlk resim görüntülendi",Toast.LENGTH_SHORT).show()
        }

        // Son resim butonuna tıklanırsa :

        butonresimson.setOnClickListener {

            ImageView.setImageResource(R.drawable.resim)//---> son resim
            Toast.makeText(this,"Son resim görüntülendi",Toast.LENGTH_SHORT).show()
        }

        // resim2 butonuna tıklanırsa :

        butonresim2.setOnClickListener {

            ImageView.setImageResource(R.drawable.resim2)//---> son resim
            Toast.makeText(this,"2.resim görüntülendi",Toast.LENGTH_SHORT).show()
        }

        // resim3 butonuna tıklanırsa :

        butonresim3.setOnClickListener {

            ImageView.setImageResource(R.drawable.resim3)//---> son resim
            Toast.makeText(this,"3.resim görüntülendi",Toast.LENGTH_SHORT).show()
        }

        // İleri Butonu :

        butonileri.setOnClickListener {

           sayac++ //----------------> "butonileri" butonuna her tıklandığında sayacı 1 arttır.
           if(sayac>5) sayac=1 //---> Eğer sayac 5'ten büyük ise (6.tıklama'da) sayac'ı 1 yap. (başa döner)
               when(sayac){ //-------> switch-case mantığı sayac 'ın 1'den 5'e kadar değeri kaç ise çalıştırılacak kod'lar.

                   1->{ ImageView.setImageResource(R.drawable.resim1) //----> sayac = 1 ise bu kod bloğu çalışır.
                   Toast.makeText(this,"resim 1 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                   }
                   2->{ ImageView.setImageResource(R.drawable.resim2)
                       Toast.makeText(this,"resim 2 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                   }
                   3->{ ImageView.setImageResource(R.drawable.resim3)
                       Toast.makeText(this,"resim 3 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                   }
                   4->{ ImageView.setImageResource(R.drawable.resim4)
                       Toast.makeText(this,"resim 4 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                   }
                   5->{ ImageView.setImageResource(R.drawable.resim)
                       Toast.makeText(this,"resim 5 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                   }
               }

            // Geri Butonu :

            butongeri.setOnClickListener {

                sayac--
                if(sayac<1) sayac=5
                when(sayac){

                    1->{ ImageView.setImageResource(R.drawable.resim1)
                        Toast.makeText(this,"resim 1 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                    }
                    2->{ ImageView.setImageResource(R.drawable.resim2)
                        Toast.makeText(this,"resim 2 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                    }
                    3->{ ImageView.setImageResource(R.drawable.resim3)
                        Toast.makeText(this,"resim 3 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                    }
                    4->{ ImageView.setImageResource(R.drawable.resim4)
                        Toast.makeText(this,"resim 4 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                    }
                    5->{ ImageView.setImageResource(R.drawable.resim)
                        Toast.makeText(this,"resim 5 görüntülenmektedir.",Toast.LENGTH_SHORT).show()
                    }
                }


            }










    }
}
}