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
					+ "world_heritage(world_heritage_id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "world_heritage_name TEXT, explanation TEXT, world_heritage_image_id INTEGER, "
					+ "area TEXT, location TEXT, climate TEXT, clothes TEXT)");

			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "list(list_id INTEGER PRIMARY KEY AUTOINCREMENT, world_heritage_id INTEGER, "
					+ "have_been_to TEXT, want_to_go TEXT)");

			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "ranking(ranking_id INTEGER PRIMARY KEY AUTOINCREMENT, ranking INTEGER, "
					+ "world_heritage_id INTEGER, explanation TEXT)");

			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "world_heritage_image(world_heritage_image_id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "world_heritage_image BLOB)");

			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "quiz(quiz_id INTEGER PRIMARY KEY AUTOINCREMENT, problem TEXT, selection_one TEXT, "
					+ "selection_two TEXT, selection_three TEXT, selection_four TEXT, answer TEXT, "
					+ "explanation TEXT, world_heritage_image_id INTEGER)");

			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "character(character_id INTEGER PRIMARY KEY AUTOINCREMENT, character_image BLOB, "
					+ "character_name TEXT)");

			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "evolution_state(evolution_state_id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "character_id INTEGER)");

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
		db.beginTransaction();

		try {
			db.execSQL("DROP TABLE user");
			db.execSQL("DROP TABLE world_heritage");
			db.execSQL("DROP TABLE list");
			db.execSQL("DROP TABLE ranking");
			db.execSQL("DROP TABLE world_heritage_image");
			db.execSQL("DROP TABLE quiz");
			db.execSQL("DROP TABLE character");
			db.execSQL("DROP TABLE evolution_state");
			onCreate(db);
		} catch (Exception e) {
			// TODO: handle exception

		} finally {
			db.endTransaction();
		}

	}

}
