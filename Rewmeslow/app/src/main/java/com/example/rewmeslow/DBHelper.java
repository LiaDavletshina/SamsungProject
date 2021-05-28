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


}