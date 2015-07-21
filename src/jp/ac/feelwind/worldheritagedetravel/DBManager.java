/**
 *
 */
package jp.ac.feelwind.worldheritagedetravel;

import android.content.ContentValues;
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
		//db.beginTransaction();

		try {
			//テーブル作成
			//ユーザテーブル
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "user(user_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, total_point INTEGER)");

			//世界遺産テーブル
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "world_heritage(world_heritage_id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "world_heritage_name TEXT, explanation TEXT, world_heritage_image_path TEXT, "
					+ "area TEXT, location TEXT, climate TEXT, clothes TEXT)");

			//リストテーブル
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "list(list_id INTEGER PRIMARY KEY AUTOINCREMENT, world_heritage_id INTEGER, "
					+ "have_been_to TEXT, want_to_go TEXT)");

			//ランキングテーブル
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "ranking(ranking_id INTEGER PRIMARY KEY AUTOINCREMENT, ranking INTEGER, "
					+ "world_heritage_id INTEGER, explanation TEXT)");

			//クイズテーブル
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "quiz(quiz_id INTEGER PRIMARY KEY AUTOINCREMENT, problem TEXT, selection_one TEXT, "
					+ "selection_two TEXT, selection_three TEXT, selection_four TEXT, answer TEXT, "
					+ "explanation TEXT, world_heritage_image_path TEXT, area TEXT)");

			//キャラクターテーブル
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "character(character_id INTEGER PRIMARY KEY AUTOINCREMENT, character_image BLOB, "
					+ "character_name TEXT)");

			//キャラ進化テーブル
			db.execSQL("CREATE TABLE IF NOT EXISTS "
					+ "evolution_state(evolution_state_id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "character_id INTEGER)");

			ContentValues values1 = new ContentValues();
			values1.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values1.put("selection_one", "ヴェルサイユの宮殿");
			values1.put("selection_two", "ダラム城と大聖堂");
			values1.put("selection_three", "ブレナム宮殿");
			values1.put("selection_four", "レオン大聖堂");
			values1.put("answer", "ヴェルサイユの宮殿");
			values1.put("explanation", "ヴェルサイユ宮殿は、ルイ14世が建造した宮殿である。そのため、フランス絶対"
					+ "王政の象徴的建造物ともいわれる。ルイ14世をはじめとした王族と、その臣下が共に住むヴェルサ"
					+ "イユ宮殿においては、生活のすべてが絶対王政の実現のために利用され、その結果さまざまなルー"
					+ "ル、エチケット、マナーが生まれた。");
			values1.put("world_heritage_image_path", "@drawable/isan_europe1_verusaiyu");
			values1.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values1);

			ContentValues values2 = new ContentValues();
			values2.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values2.put("selection_one", "ノートルダム大聖堂");
			values2.put("selection_two", "アボメイの王宮群");
			values2.put("selection_three", "ロレンツ国立公園");
			values2.put("selection_four", "上都（ザナドゥ）の遺跡");
			values2.put("answer", "ノートルダム大聖堂");
			values2.put("explanation", "パリのノートルダム大聖堂（Cathédrale Notre-Dame de Paris、ノートルダム寺"
					+ "院とも） はゴシック建築を代表する建物であり、フランス、パリのシテ島にあるローマ・カトリッ"
					+ "ク教会の大聖堂。「パリのセーヌ河岸」という名称で、周辺の文化遺産とともに1991年にユネスコ"
					+ "の世界遺産に登録された。現在もノートルダム大聖堂は、パリ大司教座聖堂として使用されている"
					+ "。ノートルダムとはフランス語で「我らが貴婦人」すなわち聖母マリアを指す。");
			values2.put("world_heritage_image_path", "画像のパス");
			values2.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values2);

			ContentValues values3 = new ContentValues();
			values3.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values3.put("selection_one", "ノートルダム大聖堂");
			values3.put("selection_two", "アボメイの王宮群");
			values3.put("selection_three", "ロレンツ国立公園");
			values3.put("selection_four", "上都（ザナドゥ）の遺跡");
			values3.put("answer", "ノートルダム大聖堂");
			values3.put("explanation", "パリのノートルダム大聖堂（Cathédrale Notre-Dame de Paris、ノートルダム寺"
					+ "院とも） はゴシック建築を代表する建物であり、フランス、パリのシテ島にあるローマ・カトリッ"
					+ "ク教会の大聖堂。「パリのセーヌ河岸」という名称で、周辺の文化遺産とともに1991年にユネスコ"
					+ "の世界遺産に登録された。現在もノートルダム大聖堂は、パリ大司教座聖堂として使用されている"
					+ "。ノートルダムとはフランス語で「我らが貴婦人」すなわち聖母マリアを指す。");
			values3.put("world_heritage_image_path", "画像のパス");
			values3.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values3);

			ContentValues values4 = new ContentValues();
			values4.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values4.put("selection_one", "");
			values4.put("selection_two", "");
			values4.put("selection_three", "");
			values4.put("selection_four", "");
			values4.put("answer", "");
			values4.put("explanation", "");
			values4.put("world_heritage_image_path", "");
			values4.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values4);

			ContentValues values5 = new ContentValues();
			values5.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values5.put("selection_one", "");
			values5.put("selection_two", "");
			values5.put("selection_three", "");
			values5.put("selection_four", "");
			values5.put("answer", "");
			values5.put("explanation", "");
			values5.put("world_heritage_image_path", "");
			values5.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values5);

			ContentValues values6 = new ContentValues();
			values6.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values6.put("selection_one", "");
			values6.put("selection_two", "");
			values6.put("selection_three", "");
			values6.put("selection_four", "");
			values6.put("answer", "");
			values6.put("explanation", "");
			values6.put("world_heritage_image_path", "");
			values6.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values6);

			ContentValues values7 = new ContentValues();
			values7.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values7.put("selection_one", "");
			values7.put("selection_two", "");
			values7.put("selection_three", "");
			values7.put("selection_four", "");
			values7.put("answer", "");
			values7.put("explanation", "");
			values7.put("world_heritage_image_path", "");
			values7.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values7);

			ContentValues values8 = new ContentValues();
			values8.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values8.put("selection_one", "");
			values8.put("selection_two", "");
			values8.put("selection_three", "");
			values8.put("selection_four", "");
			values8.put("answer", "");
			values8.put("explanation", "");
			values8.put("world_heritage_image_path", "");
			values8.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values8);

			ContentValues values9 = new ContentValues();
			values9.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values9.put("selection_one", "");
			values9.put("selection_two", "");
			values9.put("selection_three", "");
			values9.put("selection_four", "");
			values9.put("answer", "");
			values9.put("explanation", "");
			values9.put("world_heritage_image_path", "");
			values9.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values9);

			ContentValues values10 = new ContentValues();
			values10.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values10.put("selection_one", "");
			values10.put("selection_two", "");
			values10.put("selection_three", "");
			values10.put("selection_four", "");
			values10.put("answer", "");
			values10.put("explanation", "");
			values10.put("world_heritage_image_path", "");
			values10.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values10);

			ContentValues values11 = new ContentValues();
			values11.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values11.put("selection_one", "");
			values11.put("selection_two", "");
			values11.put("selection_three", "");
			values11.put("selection_four", "");
			values11.put("answer", "");
			values11.put("explanation", "");
			values11.put("world_heritage_image_path", "");
			values11.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values11);

			ContentValues values12 = new ContentValues();
			values12.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values12.put("selection_one", "");
			values12.put("selection_two", "");
			values12.put("selection_three", "");
			values12.put("selection_four", "");
			values12.put("answer", "");
			values12.put("explanation", "");
			values12.put("world_heritage_image_path", "");
			values12.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values12);

			ContentValues values13 = new ContentValues();
			values13.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values13.put("selection_one", "");
			values13.put("selection_two", "");
			values13.put("selection_three", "");
			values13.put("selection_four", "");
			values13.put("answer", "");
			values13.put("explanation", "");
			values13.put("world_heritage_image_path", "");
			values13.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values13);

			ContentValues values14 = new ContentValues();
			values14.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values14.put("selection_one", "");
			values14.put("selection_two", "");
			values14.put("selection_three", "");
			values14.put("selection_four", "");
			values14.put("answer", "");
			values14.put("explanation", "");
			values14.put("world_heritage_image_path", "");
			values14.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values14);

			ContentValues values15 = new ContentValues();
			values15.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values15.put("selection_one", "");
			values15.put("selection_two", "");
			values15.put("selection_three", "");
			values15.put("selection_four", "");
			values15.put("answer", "");
			values15.put("explanation", "");
			values15.put("world_heritage_image_path", "");
			values15.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values15);

			ContentValues values16 = new ContentValues();
			values16.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values16.put("selection_one", "");
			values16.put("selection_two", "");
			values16.put("selection_three", "");
			values16.put("selection_four", "");
			values16.put("answer", "");
			values16.put("explanation", "");
			values16.put("world_heritage_image_path", "");
			values16.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values16);

			ContentValues values17 = new ContentValues();
			values17.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values17.put("selection_one", "");
			values17.put("selection_two", "");
			values17.put("selection_three", "");
			values17.put("selection_four", "");
			values17.put("answer", "");
			values17.put("explanation", "");
			values17.put("world_heritage_image_path", "");
			values17.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values17);

			ContentValues values18 = new ContentValues();
			values18.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values18.put("selection_one", "");
			values18.put("selection_two", "");
			values18.put("selection_three", "");
			values18.put("selection_four", "");
			values18.put("answer", "");
			values18.put("explanation", "");
			values18.put("world_heritage_image_path", "");
			values18.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values18);

			ContentValues values19 = new ContentValues();
			values19.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values19.put("selection_one", "");
			values19.put("selection_two", "");
			values19.put("selection_three", "");
			values19.put("selection_four", "");
			values19.put("answer", "");
			values19.put("explanation", "");
			values19.put("world_heritage_image_path", "");
			values19.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values19);

			ContentValues values20 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values20);

			ContentValues values21 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values21);

			ContentValues values22 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values22);

			ContentValues values23 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values23);

			ContentValues values24 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values24);

			ContentValues values25 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values25);

			ContentValues values26 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values26);

			ContentValues values27 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values27);

			ContentValues values28 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values28);

			ContentValues values29 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values29);

			ContentValues values30 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アジア・中東");
			db.insert("quiz", null, values30);

			ContentValues values31 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values31);

			ContentValues values32 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values32);

			ContentValues values33 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values33);

			ContentValues values34 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values34);

			ContentValues values35 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values35);

			ContentValues values36 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values36);

			ContentValues values37 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values37);

			ContentValues values38 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values38);

			ContentValues values39 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values39);

			ContentValues values40 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "オセアニア");
			db.insert("quiz", null, values40);

			ContentValues values41 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values41);

			ContentValues values42 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values42);

			ContentValues values43 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values43);

			ContentValues values44 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values44);

			ContentValues values45 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values45);

			ContentValues values46 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values46);

			ContentValues values47 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values47);

			ContentValues values48 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values48);

			ContentValues values49 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values49);

			ContentValues values50 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "アフリカ");
			db.insert("quiz", null, values50);

			ContentValues values51 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values51);

			ContentValues values52 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values52);

			ContentValues values53 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values53);

			ContentValues values54 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values54);

			ContentValues values55 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values55);

			ContentValues values56 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values56);

			ContentValues values57 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values57);

			ContentValues values58 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values58);

			ContentValues values59 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values59);

			ContentValues values60 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "");
			values20.put("selection_two", "");
			values20.put("selection_three", "");
			values20.put("selection_four", "");
			values20.put("answer", "");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "北米・南米");
			db.insert("quiz", null, values60);
			//db.setTransactionSuccessful();
		} catch (Exception e) {
			// TODO: handle exception

		} finally{
			//db.endTransaction();
		}
	}

	/* (非 Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int)
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自動生成されたメソッド・スタブ
		//db.beginTransaction();

		try {
			db.execSQL("DROP TABLE user");
			db.execSQL("DROP TABLE world_heritage");
			db.execSQL("DROP TABLE list");
			db.execSQL("DROP TABLE ranking");
			db.execSQL("DROP TABLE quiz");
			db.execSQL("DROP TABLE character");
			db.execSQL("DROP TABLE evolution_state");

			//db.setTransactionSuccessful();

			onCreate(db);
		} catch (Exception e) {
			// TODO: handle exception

		} finally {
			//db.endTransaction();
		}

	}


}
