package com.example.rewmeslow;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE bilde(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "year INTEGER," +
                "author TEXT," +
                "link TEXT);");

        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Прибытие поезда»', 1931, 'М.В.Куприянов', 'https://tramvaiiskusstv.ru/media/k2/galleries/198/2.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Беспощадно разгромим и уничтожим врага!»', 1941, 'Кукрыниксы', 'https://upload.wikimedia.org/wikipedia/ru/0/0c/Беспощадно_разгромим_и_уничтожим_врага.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Тихо»', 1941, 'П.Н.Крылов', 'http://www.art-auction.ru/files/services_pictures/244.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Лермонтовские места»', 1964, 'Н.А.Соколов', 'https://sun9-59.userapi.com/impf/3cTpxdWo2QoSKeE1LgNUkz5Gx6xdw6d9qXxoLw/K4XEVGB5LA0.jpg?size=1136x800&quality=96&proxy=1&sign=897a05dfea8a151b51c8d97026dd7ab0&type=album')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Провинциалки»', 1920, 'К.Ф.Юон', 'http://www.artcyclopedia.ru/img/big/008810131.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Первая конная армия»', 1935, 'А.М.Герасимов', 'https://upload.wikimedia.org/wikipedia/ru/7/7d/%D0%9F%D0%B5%D1%80%D0%B2%D0%B0%D1%8F_%D0%BA%D0%BE%D0%BD%D0%BD%D0%B0%D1%8F_%D0%B0%D1%80%D0%BC%D0%B8%D1%8F_%28%D0%BA%D0%B0%D1%80%D1%82%D0%B8%D0%BD%D0%B0_%D0%93%D0%B5%D1%80%D0%B0%D1%81%D0%B8%D0%BC%D0%BE%D0%B2%D0%B0%29.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Колхозный праздник»', 1937, 'С.В.Герасимов', 'https://www.tretyakovgallery.ru/upload/iblock/9c0/9c08afbc0351c527cd4d6ddb4a3603cc.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Женский портрет»', 1920, 'А.А.Дейнека', 'https://www.deineka.ru/images/works/jenski_portret.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Открытие II конгресса Коминтерна»', 1924, 'И.И.Бродский', 'https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Второй_конгресс_Коминтерна.jpg/1920px-Второй_конгресс_Коминтерна.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Девушка в саду»', 1946, 'Е.П.Антипова', 'http://www.leningradschool.com/ant38b.jpg')");





    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }


    public void UpdateWithUserData(SQLiteDatabase db, String name, int year, String author, String link){

        //                     :(((((((((((((((((

    }
    public void nessUpdate(SQLiteDatabase db){
        db.execSQL("UPDATE bilde SET name = '«Открытие II конгресса Коминтерна»' WHERE author = 'И.И.Бродский'");
        db.execSQL("UPDATE bilde SET link = 'https://sun9-45.userapi.com/impg/zcGVvzfxECQGkFs4K0GEqjiKqG5jLfiM1LGooA/kuBKmRtq_48.jpg?size=604x453&quality=96&sign=93ce8b8b695b8c09c4a07e80398f544d&type=album' WHERE name = 'Тихо'");
        db.execSQL("DELETE FROM bilde WHERE name = '«Тихо»'");
        db.execSQL("DELETE FROM bilde WHERE name = '«Провинциалки»'");
        db.execSQL("DELETE FROM bilde WHERE name = '«Девушка в саду»'");

        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«На станции»', 1933, 'М.В.Куприянов', 'https://tramvaiiskusstv.ru/media/k2/galleries/198/3.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Паровоз»', 1957, 'М.В.Куприянов', 'https://tramvaiiskusstv.ru/media/k2/galleries/198/4.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Светает»', 1957, 'М.В.Куприянов', 'https://sun9-56.userapi.com/impf/Cz3G8F3L3bX9pD13Bb7YDJq2Bn7gJFCCuq_iWA/mZ_UBRk4Gwk.jpg?size=1132x822&quality=96&proxy=1&sign=450b1c175e88c82bc8e62c1c5d5bab01&type=album')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Пейзаж с рекой»', 1968, 'М.В.Куприянов', 'https://bidspirit-images.global.ssl.fastly.net/vnikitskom/cloned-images/84911/1/a_ignore_q_80_w_1000_c_limit_1.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Коктебель. Пляж»', 1958, 'М.В.Куприянов', 'https://rusmuseumvrm.ru/data/collections/museums/muzey_izobrazitelnih_iskusstv_komsomolsk-na-amure/kupriyanov_m.v._koktebel._plyazh._1958._komsomolsk-na-amure/14745_mainfoto_03.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Абрамцево»', 1948, 'М.В.Куприянов', 'https://sun9-36.userapi.com/impf/RY8sNdfsFFob-iyFtbIWQa8qnGfU2WyyjfmHMA/gRpibt5U4J0.jpg?size=1230x900&quality=96&proxy=1&sign=c88c08fd3672a175923aa4c4a1be749b&type=album')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Абрамцево»', 1948, 'М.В.Куприянов', 'https://sovcom.ru/pics/auctions/20613_45.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Плес»', 1947, 'М.В.Куприянов', 'https://sovcom.ru/pics/auctions/4_59ba74c748660.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Лунный вечер. Геническ»', 1956, 'М.В.Куприянов', 'https://sovcom.ru/pics/auctions/75055_57.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Геническ»', 1977, 'М.В.Куприянов', 'https://sovcom.ru/pics/auctions/27148_140.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Геническ»', 1952, 'М.В.Куприянов', 'https://sovcom.ru/pics/auctions/25334_47.jpg')");
        db.execSQL("DELETE FROM bilde WHERE name = '«На станции»'");

        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Таня»', 1947, 'Кукрыниксы', 'https://paintingplanet.ru/pictures/image1087_0.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Бегство немцев из Новгорода»', 1946, 'Кукрыниксы', 'https://rusmuseumvrm.ru/data/collections/painting/19_20/kukriniksi_begstvo_fashistov_iz_novgoroda_1944_1946_zh_5565/5971_mainfoto_03.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Конец»', 1948, 'Кукрыниксы', 'http://f.rodon.org/p/16/080815123619.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Обвинение. Нюрнбергский процесс»', 1967, 'Кукрыниксы', 'https://rusmuseumvrm.ru/data/collections/painting/19_20/kukriniksi._obvinenie._nyurenbergskiy_process._1967._zh-8928/24425_mainfoto_01.jpg')");




        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Зимнее поле»', 1983, 'П.Н.Крылов', 'http://data14.gallery.ru/albums/gallery/37059-55017-60384760-m750x740-ue4871.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Венеция»', 1957, 'П.Н.Крылов', 'http://www.ratingtour.ru/i/photogallery/50/2391.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«На веранде»', 1973, 'П.Н.Крылов', 'https://live.staticflickr.com/823/41646136372_b094e1b191_b.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Утро на Оке»', 1946, 'П.Н.Крылов', 'http://4.bp.blogspot.com/-idht4UX_XhA/UokjltLRBYI/AAAAAAAAr6A/6zzT6ARM1d4/s1600/П.Н.+Крылов+Утро+на+Оке.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Коктебельское утро»', 1965, 'П.Н.Крылов', 'https://tmii-tula.ru/foto/z-krylov-raboti12big.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Карадаг — вечер»', 1965, 'П.Н.Крылов',  'https://rusmuseumvrm.ru/data/collections/museums/istoriko-kraevedcheskiy_i_hudozhestvenniy_muzey_tula/krilov_p.n._karadag__vecher._1950._tula/14838_mainfoto_03.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Коктебель. Карадаг»', 1965, 'П.Н.Крылов',  'https://rusmuseumvrm.ru/data/collections/museums/istoriko-kraevedcheskiy_i_hudozhestvenniy_muzey_tula/krilov_p.n._karadag__vecher._1950._tula/14838_mainfoto_03.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Коктебель. Полдень»', 1965, 'П.Н.Крылов', 'https://cs12.pikabu.ru/post_img/2020/12/02/2/1606868378196245072.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Ненюфары»', 1955, 'П.Н.Крылов', 'https://lh3.googleusercontent.com/proxy/qaqGb15a_qws8C-E_PFti89WyRt7heBOQb3D-uPCfvCTiAeQn0KgtkgCt-w3tJRLv-KDB_sWxRlQ5IY')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Розы и синие сливы»', 1962, 'П.Н.Крылов', 'http://4.bp.blogspot.com/-RLDumfPfQV4/Uf4O_TXp90I/AAAAAAAArMM/Px3LrX2yBO8/s640/тульский+музей4.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Алёнушка»', 1985, 'П.Н.Крылов', 'https://sovcom.ru/pics/auctions/32576_97.jpg')");
        db.execSQL("INSERT INTO bilde(name, year, author, link) VALUES('«Оттепель»', 1957, 'П.Н.Крылов', 'https://i.pinimg.com/originals/9e/ee/8e/9eee8e09d9d3e5cab5853f785ee19157.png')");



    }

}