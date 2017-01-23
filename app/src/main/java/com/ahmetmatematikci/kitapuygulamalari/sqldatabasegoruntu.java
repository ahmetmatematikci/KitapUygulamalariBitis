package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by a on 1/23/17.
 */

public class sqldatabasegoruntu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqldatabasegoruntu);

        DatabaseClass db = new DatabaseClass(sqldatabasegoruntu.this);
        db.open();
         String sonuc = db.databasedencek();
        db.close();

        TextView tv = (TextView)findViewById(R.id.textView22);
        tv.setText(sonuc);

    }
}
