package am.therapy.dbhelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context?) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table " + TABLE_CONTACTS + "(" + KEY_ID
                + " integer primary key," + DOZE_TER_AMOXI + " text," + DOZE_MAX_AMOXI + " text," +
                DOZE_TER_CLARI + " text," + DOZE_MAX_CLARI + " text," +
                DOZE_TER_AZI + " text," + DOZE_MAX_AZI + " text," +
                DOZE_TER_CEFUR + " text," + DOZE_MAX_CEFUR + " text," +
                DOZE_TER_CEFDINIR + " text," + DOZE_MAX_CEFDINIR + " text," +
                DOZE_TER_CEFIXIME + " text," + DOZE_MAX_CEFIXIME + " text," +
                DOZE_TER_AMOXICLAV + " text," + DOZE_MAX_AMOXICLAV + " text" + ")")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("drop table if exists $TABLE_CONTACTS")
        onCreate(db)
    }

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "contactDb"
        const val TABLE_CONTACTS = "contacts"
        const val KEY_ID = "_id"
        const val DOZE_TER_AMOXI = "ter_amoxi"
        const val DOZE_MAX_AMOXI = "max_amoxi"
        const val DOZE_TER_CLARI = "ter_clari"
        const val DOZE_MAX_CLARI = "max_clari"
        const val DOZE_TER_AZI = "ter_azi"
        const val DOZE_MAX_AZI = "max_azi"
        const val DOZE_TER_CEFUR = "ter_cefur"
        const val DOZE_MAX_CEFUR = "max_cefur"
        const val DOZE_TER_CEFDINIR = "ter_cefdinir"
        const val DOZE_MAX_CEFDINIR = "max_cefdinir"
        const val DOZE_TER_CEFIXIME = "ter_cefixime"
        const val DOZE_MAX_CEFIXIME = "max_cefixime"
        const val DOZE_TER_AMOXICLAV = "ter_amoxiclav"
        const val DOZE_MAX_AMOXICLAV = "max_amoxiclav"
    }
}