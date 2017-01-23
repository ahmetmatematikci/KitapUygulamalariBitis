package com.ahmetmatematikci.kitapuygulamalari;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a on 1/23/17.
 */
public class DatabaseClass {

    private  static  final String DATABASNAME = "ArabaDatabase";
    private static final String TABLENAME = "arabalarTablo";
    private static final int DATABASEVERSİON=1;


    private static final String ROWID="_id";
    private static final String ARABALAR = "araba";
    private static final String MODELLER = "model";
    private static final String DEGERLER = "deger";

    Context context;
    private  DbHelper dbhelper;
    private SQLiteDatabase sqlitedatabaseobjesi;





    public DatabaseClass(Context context) {
        this.context = context;


    }

    public DatabaseClass open() {
        dbhelper = new DbHelper(context);
        sqlitedatabaseobjesi = dbhelper.getWritableDatabase();
        return this;

    }

    public long olustur(String araba, String model, String deger) {
        ContentValues cV = new ContentValues();
        cV.put(ARABALAR, araba);
        cV.put(MODELLER, model);
        cV.put(DEGERLER, deger);
       return sqlitedatabaseobjesi.insert(TABLENAME, null, cV);
    }

    public void close() {
        sqlitedatabaseobjesi.close();
    }

    public String databasedencek() {
        String[] kolonlar = new String[]{ROWID, ARABALAR, MODELLER,DEGERLER};
        Cursor c = sqlitedatabaseobjesi.query(TABLENAME, kolonlar, null, null,null,null,null);
        String sonuc = "";
        int idindexi = c.getColumnIndex(ROWID);
        int arabaindexi = c.getColumnIndex(ARABALAR);
        int modelindexi = c.getColumnIndex(MODELLER);
        int degerindexi = c.getColumnIndex(DEGERLER);

        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            sonuc = sonuc + c.getString(idindexi) + "   " + c.getString(arabaindexi) + " " + c.getString(modelindexi)
            + "  " + c.getString(degerindexi);
        }
        return sonuc ;

    }


    private static class DbHelper extends SQLiteOpenHelper {


        public DbHelper(Context context) {
            super(context, DATABASNAME, null, DATABASEVERSİON);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE " + TABLENAME + "(" + ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
             ARABALAR + " TEXT NOT NULL,  " + MODELLER + " TEXT NOT NULL, " + DEGERLER + " TEXT NOT NULL);" );

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {

            db.execSQL("DROP TABLE IF EXITS  " + TABLENAME);
            onCreate(db);

        }
    }
}
