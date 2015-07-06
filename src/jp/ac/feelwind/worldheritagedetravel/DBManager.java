/**
 *
 */
package jp.ac.feelwind.worldheritagedetravel;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author student
 *
 */
public class DBManager extends SQLiteOpenHelper {
/*
 * @param context
 * @param name
 * @param factory
 * @param version
 */
	public DBManager(Context context) {
		super(context, "travelq.sqlite3", null, 1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/* (非 Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO 自動生成されたメソッド・スタブ
		db.beginTransaction();

		try {
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "user(user_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, total_point INTEGER)");
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "world_heritage(world_heritage_id INTEGER PRIMARY KEY AUTOINCREMENT, )");

			db.setTransactionSuccessful();
		} catch (Exception e) {
			// TODO: handle exception

		} finally{
			db.endTransaction();
		}
	}

	/* (非 Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int)
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自動生成されたメソッド・スタブ
		db.execSQL("DROP TABLE user");
		onCreate(db);
	}

}
