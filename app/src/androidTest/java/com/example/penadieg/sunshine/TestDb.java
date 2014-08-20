package com.example.penadieg.sunshine;

import android.test.AndroidTestCase;
import android.database.sqlite.SQLiteDatabase;
import com.example.penadieg.sunshine.data.WeatherDbHelper;

/**
 * Created by Diego on 19/08/2014.
 */
public class TestDb extends AndroidTestCase {
    public static final String LOG_TAG = TestDb.class.getSimpleName();

    public void testCreateDb() throws Throwable {
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db = new WeatherDbHelper(mContext,WeatherDbHelper.DATABASE_NAME,null,1).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
    }
}

