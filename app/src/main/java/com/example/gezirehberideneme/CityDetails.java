package com.example.gezirehberideneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gezirehberideneme.AllTourAttractions.TourAttractionsList;
import com.example.gezirehberideneme.AllTourAttractions.TourAttractionsList_Model;
import com.google.android.material.imageview.ShapeableImageView;

public class CityDetails extends AppCompatActivity {

    ShapeableImageView mainimage, attr1img, attr2img, food1img, food2img;
    TextView city, description, duration, timetovisit, attr1name, attr1des, attr2name, attr2des, food1name, food1des, food2name, food2des;
    Button locationbtn;
    String location;
    TextView getCityName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);

        getCityName = findViewById(R.id.city_name);
        mainimage = findViewById(R.id.citydetails_image);
        attr1img = findViewById(R.id.citydetails_place1image);
        attr2img = findViewById(R.id.citydetails_place2image);
        food1img = findViewById(R.id.citydetails_food1image);
        food2img = findViewById(R.id.citydetails_food2image);
        city = findViewById(R.id.citydetails_name);
        description = findViewById(R.id.citydetails_description);
        duration = findViewById(R.id.citydetails_tripduration);
        timetovisit = findViewById(R.id.citydetails_besttime);
        attr1name = findViewById(R.id.citydetails_place1name);
        attr2name = findViewById(R.id.citydetails_place2name);
        food1name = findViewById(R.id.citydetails_food1name);
        food2name = findViewById(R.id.citydetails_food2name);
        attr1des = findViewById(R.id.citydetails_place1description);
        attr2des = findViewById(R.id.citydetails_place2description);
        food1des = findViewById(R.id.citydetails_food1description);
        food2des = findViewById(R.id.citydetails_food2description);
        locationbtn = findViewById(R.id.citydetails_getlocationbtn);


        String city_str = getIntent().getStringExtra("putextra_city");

        //1.yer için
        if (city_str.equals("Kız Kulesi")) { //paranteze TourAttractionsList'in içindeki Kısımları Yazıyoruz.
            city.setText("Kız Kulesi"); // Buraya yazdıklarımız da o yerin ismi olucak şekilde yer alıcak.
            attr1name.setText("Rumeli Hisarı");
            attr2name.setText("Sumela Manastırı");
            attr1des.setText("Hisarlar Müzesi; Rumelihisarı, Yedikulehisarı Ve Anadoluhisarı’nı Bünyesinde Toplamaktadır.");
            attr2des.setText("1204 Tarihinde Trabzonda kurulan önemli bir Manastır");
            attr1img.setImageResource(R.drawable.rumelihisari);
            attr2img.setImageResource(R.drawable.sumelamanastiri);
            food1name.setText("Fava");
            food2name.setText("Tarhana Corbasi");
            food1img.setImageResource(R.drawable.fava);
            food2img.setImageResource(R.drawable.gorba);
            food1des.setText("Bakladan yapılan fava İstanbul’a özgü yerel lezzetlerden biridir. İçinde bakla, havuç, soğan, sarımsak, zeytinyağı, dereotu ve limon bulunur. ");
            food2des.setText("Biber, soğan, domates, maydanoz gibi sebzelerin karışım haline getirilip kuruduktan sonra ufalanmasıyla elde edilen tarhana lezzetli olduğu kadar sağlıklı ve besleyici gıdalardan biridir.");
            description.setText("Boğaz Manzarasının Vazgeçilmez Yerlerinden Biri de Kuşkusuz Kız Kulesi’dir. Salacak Açıklarındaki Küçücük Bir Adanın Üzerine İnşa Edilmiş Olan Kule, Pek Çok Efsaneye Konu Olmaktadır. Bunlardan Biri Ve En Bilineni, Kuleye Adını da Vermiş Olan (Leander’s Tower) Leandros Efsanesi’dir.");
            location = "https://www.google.co.in/maps/place/K%C4%B1z+Kulesi/@41.0211454,29.001556,17z/data=!3m1!4b1!4m6!3m5!1s0x14cab83955555555:0xcd003c8d8ae4d72e!8m2!3d41.0211414!4d29.0041309!16s%2Fg%2F1ptyvyzcl?entry=ttu";
            timetovisit.setText("Hazirandan Ekime");
            duration.setText("Toplu Taşıma ile 30 Dakika");
            mainimage.setImageResource(R.drawable.maidentower);
        }
        //2.yer için
        if (city_str.equals("Rumeli Hisarı")) {
            city.setText("Rumeli Hisarı");
            attr1name.setText("Galata Kulesi");
            attr2name.setText("Tuz Mağrası");
            attr1des.setText("İstabulun en ilgi çekici yerlerinden birileri.");
            attr2des.setText("Çankırının doğal tuz madeni.");
            attr1img.setImageResource(R.drawable.galatatower);
            attr2img.setImageResource(R.drawable.tuzmagrasi);
            food1name.setText("Erikli Kuzu Gerdan");
            food2name.setText("Sariyer Böreği");
            food1des.setText("Osmanlı saray mutfağı lezzetlerinin geçmişten bugüne gelerek oluşturduğu kültürel yemek çeşitliliği İstanbul’u cazip kılan yerel ögelerden biridir. Kuzu etinin en güzel hallerinden biri olan erikli kuzu gerdan ise bir kebap türüdür. İçinde kuzu incik, arpacık soğan, sarımsak, kuru erik, tarçın, biberiye ve kekik kullanılır. ");
            food2des.setText("İstanbul sokaklarında denenmesi gereken bin bir çeşit lezzetten biri de kuşkusuz Sarıyer böreğidir. Diğer böreklerden farklı olarak yapımında baklavalık yufka, kuş üzümü ve çam fıstığı kullanılır.");
            food1img.setImageResource(R.drawable.eriklikuzugerdan);
            food2img.setImageResource(R.drawable.sariyerboregi);
            description.setText("Hisarlar Müzesi; Rumelihisarı, Yedikulehisarı Ve Anadoluhisarı’nı Bünyesinde Toplamaktadır. İstanbul Sarıyer İlçesi Sınırları İçinde Bulunan Rumeli Hisarı, Fatih Sultan Mehmet Tarafından 1452 Yılında İnşa Ettirilmiştir. Hisarın İnşa Amacı İstanbul’u Kuşatınca Şehre Boğazın Kuzeyinden Gelebilecek Yardımları Engellemek Ve Olası Saldırılara Engel Olmaktır");
            location = "https://www.google.co.in/maps/place/Rumeli+Hisar%C4%B1/@41.0848264,29.054123,17z/data=!3m1!4b1!4m6!3m5!1s0x14caca0297bf7ef9:0x4657aaa4291ac6fa!8m2!3d41.0848224!4d29.0566979!16zL20vMDJtY3c5?entry=ttu";
            timetovisit.setText("Kasımdan Marta");
            duration.setText("Toplu taşıma ile 40 Dakika");
            mainimage.setImageResource(R.drawable.rumelihisari);
        }

        //3.yer için
        if (city_str.equals("Sümela Manastırı")) {
            city.setText("Sümela Manastırı");
            attr1name.setText("Nemrut Dağı");
            attr2name.setText("Balıklı Göl");
            attr1des.setText("Eski çağlarda kommagene olarak bilinen, bu alanda bulunan arkeolojik kalıntılara ev sahipliği yapmaktadır.");
            attr2des.setText("Hz. ibrahim 'in doğduğu yer ve rivayete göre Nemrut tarafından ateşe atıldığı, ateşin su, odunların ise balık olduğu yerdir. ");
            attr1img.setImageResource(R.drawable.nemrutdagi);
            attr2img.setImageResource(R.drawable.balikligol);
            food1name.setText("Kuymak");
            food1des.setText("Kahvaltıların vazgeçilmezi olan fakat yöre halkı tarafından öğle ve akşam yemeklerinde de tercih edilen ve yemek olarak değerlendirilen kuymak, yöresel bir lezzet. Karadeniz’in farklı illerinde muhlama ya da mıhlama isimleri ile de anıldığını görebilirsiniz. ");
            food2name.setText("Hamsiköy Sütlacı");
            food2des.setText("Trabzon’un Maçka ilçesine bağlı bir mahalle olan Hamsiköy, güzelliği ile filmlerden çıkmış bir yeri andırıyor. Görenlerin uzun süre unutamayacağı kadar güzel bir lokasyon olan Hamsiköy’ün en önemli eseri ise Hamsiköy sütlacı! ");
            food1img.setImageResource(R.drawable.kuymak);
            food2img.setImageResource(R.drawable.hamsikoysutlaci);
            description.setText("Rivayete Göre Bizans İmparatoru 1. Theodosius Zamanında (375-395) Atina’dan Gelen Barnabas Ve Sophranios İsimli İki Rahip Tarafından Kurulmuş Olan Manastır, 6’ıncı Yüzyılda İmparator Justinianus’un Manastırın Onarılarak Genişletilmesini İstemesi Üzerine Generallerinden Belisarios Tarafından Tamir Edilmiştir. Sümela Manastırı’nın Şimdiki Durumuyla Varlığını 13’üncü Yüzyıldan İtibaren Sürdürdüğü Bilinmektedir. 1204 Tarihinde Kurulan Trabzon Kommenosları Persliği’’nden 3. Alexios (1349-1390) Zamanında Manastırın Önemi Artmış Ve Fermanlarda Gelir Sağlanmıştır. ");
            location = "https://www.google.co.in/maps/place/S%C3%BCmela+Manast%C4%B1r%C4%B1/@40.6901266,39.65582,17z/data=!3m1!4b1!4m6!3m5!1s0x40645498cdbf568b:0x399f2299e21b4d07!8m2!3d40.6901226!4d39.6583949!16zL20vMDZkd19k?entry=ttu";
            timetovisit.setText("Kasımdan Mayısa");
            duration.setText("1 Gün");
            mainimage.setImageResource(R.drawable.sumelamanastiri);
        }

        //4. yer için
        if (city_str.equals("Galata Kulesi")) {
            city.setText("Galata Kulesi");
            attr1name.setText("Dolmabahçe Sarayı");
            attr2name.setText("Saat Kulesi");
            attr1des.setText("Cumhuriyetin İlanından Sonra Atatürk’ün İstanbul’daki Cumhurbaşkanlığı Konutu Olan Dolmabahçe Sarayı, 10 Kasım 1938 Tarihinde Atatürk’ün Öldüğü Yer Olması Münasebetiyle Cumhuriyet Tarihinde Ayrı Bir Öneme Sahiptir.");
            attr2des.setText("Tarihi bir saat kulesi gidip görmeye değer ayrıca yanında ufak bir cami var. Keşke büyük bir cami olsaydı. Ayrıca çarşıda kumrunuzu yedikten sonra İzmir bombası yiyip güzel güzel vakit geçirebilirsiniz.");
            attr1img.setImageResource(R.drawable.dolmabahcesarayi);
            attr2img.setImageResource(R.drawable.saatkulesi);
            food1name.setText("");
            food1des.setText("");
            food2name.setText("");
            food2des.setText("");
            food1img.setImageResource(R.drawable.whitescreen);
            food2img.setImageResource(R.drawable.whitescreen);
            description.setText("Terasından İstanbul’un muhteşem manzarasını panoramik olarak seyredebileceğiniz, içerisinde hediyelik eşyalar satan müze mağazasının da bulunduğu, yerli ve yabancı misafirler tarafından ilgi gören tarihi kule. Hezarfen Ahmet Çelebinin, 17. Yüzyılda uçuş denemeleri yaptığı, tahtadan yapılan kanatları sırtına bağlayarak gerçekleştirdiği uçuşunu Üsküdar’da tamamladıktan sonra ünlenen kule");
            location = "https://www.google.co.in/maps/place/Galata+Kulesi/@41.025573,28.9715537,17z/data=!3m1!4b1!4m6!3m5!1s0x14cab9e7a7777c43:0x4c76cf3dcc8b330b!8m2!3d41.025569!4d28.9741286!16zL20vMDFmaHhi?entry=ttu";
            timetovisit.setText("Pazartesiden pazara her gün");
            duration.setText("Toplu taşıma ile 35 dakika");
            mainimage.setImageResource(R.drawable.galatatower);
        }

        //5. yer için
        if (city_str.equals("Tuz Mağrası")) {
            city.setText("Tuz Mağrası");
            attr1name.setText("Kız Kulesi");
            attr2name.setText("Balıklı Göl");
            attr1des.setText("Boğaz Manzarasının Vazgeçilmez Yerlerinden Biri de Kuşkusuz Kız Kulesi’dir.");
            attr2des.setText("Hz. ibrahim 'in doğduğu yer ve rivayete göre Nemrut tarafından ateşe atıldığı, ateşin su, odunların ise balık olduğu yerdir.");
            attr1img.setImageResource(R.drawable.maidentower);
            attr2img.setImageResource(R.drawable.balikligol);
            food1name.setText("Yaren Güveci");
            food2name.setText("Mıkla");
            food1des.setText("Çankırı’nın sevilen yemeklerinden biri olan ve Çankırı sofralarında sıklıkla yerini alan bu yemeğin yapımı biraz zahmetlidir ancak piştikten sonra kokusu ile bile zahmetine değdiğini kanıtlar.");
            food2des.setText("Sabah Kahvaltılarının vaz geçilmezi yumurtanın en güzel hali");
            food1img.setImageResource(R.drawable.guveci);
            food2img.setImageResource(R.drawable.mikla);
            description.setText("Çankırı Tuz Şehri'nde yaklaşık 5.000 yıldan beri tuz üretilen dünyanın en eski ve en büyük tuz madenlerinden. Gezilebilen alan 1.500 metre ve mağara içinde tuzdan yapılan hayvan figürleri var.Sıcaklık ise 13 °C ve oldukça serin. Yelek tarzı bir şeyler giyilebilir. 300 yıllık çürümeyen eşek ve tavşan cesedi de yer alıyor. Çankırı’ya 15 km civarı uzaklıktaki Balıbağı Köyü sınırları içerisinde yer alıyor. Gezilesi ve görülesi bir yer.");
            location = "https://www.google.co.in/maps/place/%C3%87ank%C4%B1r%C4%B1+tuz+ma%C4%9Faras%C4%B1/@40.5442327,33.7565707,17z/data=!3m1!4b1!4m6!3m5!1s0x4083df0876852c4f:0x2ac747740ce3a4db!8m2!3d40.5442287!4d33.7591456!16s%2Fg%2F11fmncywz4?entry=ttu";
            timetovisit.setText("Ocaktan Aralığa her ay");
            duration.setText("8 Saat");
            mainimage.setImageResource(R.drawable.tuzmagrasi);
        }

        //6. yer için
        if (city_str.equals("Ilgaz Dağı Kayak Merkezi")) {
            city.setText("Ilgaz Dağı Kayak Merkezi");
            attr1name.setText("Dolmabahçe Sarayı");
            attr2name.setText("Sümela Manastırı");
            attr1des.setText("Cumhuriyetin İlanından Sonra Atatürk’ün İstanbul’daki Cumhurbaşkanlığı Konutu Olan Dolmabahçe Sarayı, 10 Kasım 1938 Tarihinde Atatürk’ün Öldüğü Yer Olması Münasebetiyle Cumhuriyet Tarihinde Ayrı Bir Öneme Sahiptir.");
            attr2des.setText("1204 Tarihinde Trabzonda kurulan önemli bir Manastır");
            attr1img.setImageResource(R.drawable.dolmabahcesarayi);
            attr2img.setImageResource(R.drawable.sumelamanastiri);
            food1name.setText("İnce Ekmek Muskasi");
            food2name.setText("Höşmerim Tatlısı");
            food1des.setText("Çankırı mutfağının ana yemekleri, tatlıları, çorbaları olduğu kadar hamur işleriyle de meşhurdur. Hem yapımı kolay olan hem az malzeme ile yapılabilen hem de oldukça lezzetli olan İnce Ekmek Muskası da Çankırı’nın en çok sevilen hamur işlerinde birisi.");
            food2des.setText("Birçok yörenin geleneksel lezzetleri arasında olan ve herkes tarafından sevilerek tüketilen Höşmerim Çankırı’nın da yöresel tatlıları arasında yer alıyor. Un, tereyağı ve tuz üçlüsüyle yapılan bu tatlının orijinalinde peynir de vardır. Çankırı usulü höşmerimin özelliği ise peynirsiz yapılıyor olmasıdır.");
            food1img.setImageResource(R.drawable.inceekmekmuskasi);
            food2img.setImageResource(R.drawable.hosmerim);
            description.setText("Ilgaz Dağı'nda olan kayak merkezi telesiyejde yukarıya çıkıp kayak yapilir, profesyonel için uygun pisti vardır. Kayak takımı kiralayabilirsiniz fiyatları diğer yerlere göre uygundur. Ayrıca uygulama otelleri ve diğer otellerde rahat ve temizdir.");
            location = "https://www.google.co.in/maps/dir//K%C4%B1ssenir,+Y%C4%B1ld%C4%B1ztepe+Kayak+Merkezi,+Ilgaz+%C3%87ank%C4%B1r%C4%B1+TR,+18400/@41.0345317,33.5029793,11z/data=!4m8!4m7!1m0!1m5!1m1!1s0x408470ff0b4354eb:0x6f98e9bc0fb4571e!2m2!1d33.7913894!2d41.0345382?entry=ttu";
            timetovisit.setText("Kasımdan Şubata");
            duration.setText("9 Saat");
            mainimage.setImageResource(R.drawable.ilgaz);
        }

        //7. yer için
        if (city_str.equals("Nemrut Dağı")) {
            city.setText("Nemrut Dağı");
            attr1name.setText("Saat Kulesi");
            attr2name.setText("Rumeli Hisarı");
            attr1des.setText("Tarihi bir saat kulesi gidip görmeye değer ayrıca yanında ufak bir cami var. Keşke büyük bir cami olsaydı. Ayrıca çarşıda kumrunuzu yedikten sonra İzmir bombası yiyip güzel güzel vakit geçirebilirsiniz.");
            attr2des.setText("Hisarlar Müzesi; Rumelihisarı, Yedikulehisarı Ve Anadoluhisarı’nı Bünyesinde Toplamaktadır.");
            attr1img.setImageResource(R.drawable.saatkulesi);
            attr2img.setImageResource(R.drawable.rumelihisari);
            food1name.setText("Şıllık Tatlısı");
            food2name.setText("Besni Tava");
            food1des.setText("Ana malzemeleri süt ve un olan şıllık tatlısının hamuru ince bir şekilde açılır. İç harcı ceviz veya fıstık ile doldurulan şıllık tatlısı, şerbetle tatlandırılarak servis edilir.");
            food2des.setText("Bol sebze ve bol etten oluşan besni tava, Adıyaman'ın Besni ilçesinin hemen her yerinde yapılmaktadır. Mahalle fırınlarında pişirilen bu yemek, kişi sayısına göre hazırlanır.");
            food1img.setImageResource(R.drawable.silliktatlisi);
            food2img.setImageResource(R.drawable.besnitava);
            description.setText("eski çağlarda \"Kommagene\" olarak bilinen, bu alanda bulunan arkeolojik kalıntılara ev sahipliği yapmaktadır. Antiochos tümülüsü ve buradaki dev heykeller, Eskikale, Yenikale, Karakuş Tepe ve Cendere Köprüsü millî park içinde kalan kültürel değerlerdir. Doğu ve batı teraslarında Antiochos ile tanrı-tanrıça heykellerinin yanı sıra aslan ve kartal heykelleri bulunmaktadır. Batı terasında eşsiz bir aslanlı horoskop yer almaktadır. Aslanın üzerinde 16 ışından oluşan 3 adet yıldız vardır ve bunların Mars, Merkür ve Jüpiter gezegenlerini temsil etmekte olduğu sanılmaktadır. Tarihte bilinen en eski horoskoptur.");
            location = "https://www.google.co.in/maps/place/Nemrut+Da%C4%9F%C4%B1/@37.9806768,38.7383091,17z/data=!3m1!4b1!4m6!3m5!1s0x4075ff1780b7aec9:0x31abab7733e1fa45!8m2!3d37.9807788!4d38.7407995!16s%2Fm%2F0v0j6bx?entry=ttu";
            timetovisit.setText("Hazirandan Kasıma");
            duration.setText("1.5 Gün");
            mainimage.setImageResource(R.drawable.nemrutdagi);
        }

        //8. yer için
        if (city_str.equals("Balıklı Göl")) {
            city.setText("Balıklı Göl");
            attr1name.setText("Galata Kulesi");
            attr2name.setText("Tuz Madeni");
            attr1des.setText("İstabulun en ilgi çekici yerlerinden birileri.");
            attr2des.setText("Çankırının Doğal Tuz Madeni");
            attr1img.setImageResource(R.drawable.galatatower);
            attr2img.setImageResource(R.drawable.tuzmagrasi);
            food1name.setText("Borani");
            food2name.setText("Patlıcan Kebabı");
            food1des.setText("İçerisinde börülce, nohut ve tereyağı gibi malzemeler bulunan borani yöresel lezzetlerin başında yer alıyor. Yöresel olarak hazırlanan doğal tereyağı ile muhteşem bir dokunuş yapılan bu lezzetin farklı damak tatlarına başarılı şekilde hitap ettiğini söylemek gerekiyor.");
            food2des.setText("Yöre halkı tarafından balcan kebabı olarak da adlandırılan patlıcan kebabı Urfa’ya özgü yöresel lezzetlerden bir diğeri. Şişe geçirilen patlıcan ve köfteler ile hazırlanan patlıcan kebabının yapımı için kuzu eti kullanılıyor. ");
            food1img.setImageResource(R.drawable.borani);
            food2img.setImageResource(R.drawable.patlicankebabi);
            description.setText("Urfanın Merkezi konumudur. Hz. ibrahim 'in doğduğu yer ve rivayete göre Nemrut tarafından ateşe atıldığı, ateşin su, odunların ise balık olduğu yerdir. Peygamberler şehrinin tarihi ve turizm açısından önemli ve gezilmesi gerekilen bir yerdir. Urfayı gezmek demek balıklı göle gitmek demektir. Baştan sona doğru gezin.");
            location = "https://www.google.co.in/maps/place/Bal%C4%B1kl%C4%B1g%C3%B6l/@37.1477344,38.7816438,17z/data=!3m1!4b1!4m6!3m5!1s0x1534716d7b742117:0xa81f8dbd3d120293!8m2!3d37.1477302!4d38.7842187!16s%2Fm%2F0v0j692?entry=ttu";
            timetovisit.setText("Ocaktan Aralığa");
            duration.setText("1.5 Gün");
            mainimage.setImageResource(R.drawable.balikligol);
        }

        //9. yer için
        if (city_str.equals("Dolmabahçe Sarayı")) {
            city.setText("Dolmabahçe Sarayı");
            attr1name.setText("Nemrut Dağı");
            attr2name.setText("Sümela Manastırı");
            attr1des.setText("Eski çağlarda kommagene olarak bilinen, bu alanda bulunan arkeolojik kalıntılara ev sahipliği yapmaktadır.");
            attr2des.setText("1204 Tarihinde Trabzonda kurulan önemli bir Manastır");
            attr1img.setImageResource(R.drawable.nemrutdagi);
            attr2img.setImageResource(R.drawable.sumelamanastiri);
            food1name.setText("");
            food1des.setText("");
            food2name.setText("");
            food2des.setText("");
            food1img.setImageResource(R.drawable.whitescreen);
            food2img.setImageResource(R.drawable.whitescreen);
            description.setText("Evliya Çelebi, Dolmabahçe Sarayı’nın Bugünkü Yerinde Yavuz Sultan Selim’in Bir Köşk Yaptırdığını Yazar. 1. Ahmet Zamanında, Mekan Taşla Doldurulur Ve Köşk Büyütülür. Sarayın Ve Yerleşimin Adı Buradan Gelir. 19. Yüzyılda 2. Mahmut Aynı Yerde Yeni Bir Saray İnşa Ettirir. Bugünkü Yapı İse 1842 Yılında 1. Abdülmecit Tarafından Karabet Balyan’a İnşa Ettirilir. Yapımı 1853 Senesine Kadar Devam Eden Saray Abdülmecit’in İkamet Ettiği Yer Olmasının Yanı Sıra Resmî İşleri de Gördüğü Mekandır. Abdülmecit’ten Sonra Kardeşi Abdülaziz’de Bu Sarayda Yaşamıştır. Cumhuriyetin İlanından Sonra Atatürk’ün İstanbul’daki Cumhurbaşkanlığı Konutu Olan Dolmabahçe Sarayı, 10 Kasım 1938 Tarihinde Atatürk’ün Öldüğü Yer Olması Münasebetiyle Cumhuriyet Tarihinde Ayrı Bir Öneme Sahiptir.");
            location = "https://www.google.co.in/maps/place/Dolmabah%C3%A7e+Saray%C4%B1/@41.0391683,28.9978845,17z/data=!3m1!4b1!4m6!3m5!1s0x14cab7761a3b7de3:0xdcd33e38cf3b830b!8m2!3d41.0391643!4d29.0004594!16zL20vMDJxYmZt?entry=ttu";
            timetovisit.setText("Pazartesiden cumaya her gün açık");
            duration.setText("Toplu taşıma ile 20 dakika");
            mainimage.setImageResource(R.drawable.dolmabahcesarayi);
        }

        //10. yer için
        if (city_str.equals("Saat Kulesi")) {
            city.setText("Saat Kulesi");
            attr1name.setText("Balıklı Göl");
            attr2name.setText("Kız Kulesi");
            attr1des.setText("Hz. ibrahim 'in doğduğu yer ve rivayete göre Nemrut tarafından ateşe atıldığı, ateşin su, odunların ise balık olduğu yerdir.");
            attr2des.setText("Boğaz Manzarasının Vazgeçilmez Yerlerinden Biri de Kuşkusuz Kız Kulesi’dir.");
            attr1img.setImageResource(R.drawable.balikligol);
            attr2img.setImageResource(R.drawable.maidentower);
            food1name.setText("İzmir Bombası");
            food2name.setText("Kumru");
            food1des.setText("İzmir Bombası bir tatlı olsa da içerisinde bulunan çikolata dolgusu sebebiyle kesinlikle oldukça yoğun. Dolayısıyla akşam saatlerinde tüketirken çok fazla tok olmamanızda yarar var. İnce bir hamur ile açıldığı için ustalık gerektiren İzmir Bombası, akışkan bir krema dolgusuna sahip.");
            food2des.setText("Salam, sosis ve sucuk ile hazırlanan ve son olarak tulum peyniri ilave edilerek servis edilen kumru, İzmir’in ve Çeşme bölgesinin en sevilen yiyeceklerinden biri. Sabah kahvaltılarında ya da akşam saatlerinde tüketilebilecek dolayısıyla keyifli bir alternatif olan kumru, Türkiye’de en çok dikkat çeken atıştırmalıklardan biri.");
            food1img.setImageResource(R.drawable.izmirbombasi);
            food2img.setImageResource(R.drawable.kumru);
            description.setText("Tarihi bir saat kulesi gidip görmeye değer ayrıca yanında ufak bir cami var. Keşke büyük bir cami olsaydı. Ayrıca çarşıda kumrunuzu yedikten sonra İzmir bombası yiyip güzel güzel vakit geçirebilirsiniz.");
            location = "https://www.google.co.in/maps/place/Kemeralt%C4%B1+%C3%87ar%C5%9F%C4%B1s%C4%B1,+%C4%B0zmir+Saat+Kulesi,+35360+Konak%2F%C4%B0zmir/@38.4189042,27.1261251,17z/data=!3m1!4b1!4m6!3m5!1s0x14bbd8e22ff7592d:0xc3bdd7b1feef0b7a!8m2!3d38.4189!4d27.1287!16s%2Fm%2F03qj5zj?entry=ttu";
            timetovisit.setText("Hazirandan Eylüle");
            duration.setText("10 Saat");
            mainimage.setImageResource(R.drawable.saatkulesi);
        }



        locationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
            }
        });

        //resime basınca ilgili sayfaya atması denemesi
        attr1img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CityDetails.this, TourAttractionsList.class));
            }
        });

        attr2img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CityDetails.this, TourAttractionsList.class));
            }
        });


    }
}



