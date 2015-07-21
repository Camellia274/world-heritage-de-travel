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
			values21.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values21.put("selection_one", "");
			values21.put("selection_two", "");
			values21.put("selection_three", "");
			values21.put("selection_four", "");
			values21.put("answer", "");
			values21.put("explanation", "");
			values21.put("world_heritage_image_path", "");
			values21.put("area", "アジア・中東");
			db.insert("quiz", null, values21);

			ContentValues values22 = new ContentValues();
			values22.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values22.put("selection_one", "");
			values22.put("selection_two", "");
			values22.put("selection_three", "");
			values22.put("selection_four", "");
			values22.put("answer", "");
			values22.put("explanation", "");
			values22.put("world_heritage_image_path", "");
			values22.put("area", "アジア・中東");
			db.insert("quiz", null, values22);

			ContentValues values23 = new ContentValues();
			values23.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values23.put("selection_one", "");
			values23.put("selection_two", "");
			values23.put("selection_three", "");
			values23.put("selection_four", "");
			values23.put("answer", "");
			values23.put("explanation", "");
			values23.put("world_heritage_image_path", "");
			values23.put("area", "アジア・中東");
			db.insert("quiz", null, values23);

			ContentValues values24 = new ContentValues();
			values24.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values24.put("selection_one", "");
			values24.put("selection_two", "");
			values24.put("selection_three", "");
			values24.put("selection_four", "");
			values24.put("answer", "");
			values24.put("explanation", "");
			values24.put("world_heritage_image_path", "");
			values24.put("area", "アジア・中東");
			db.insert("quiz", null, values24);

			ContentValues values25 = new ContentValues();
			values25.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values25.put("selection_one", "");
			values25.put("selection_two", "");
			values25.put("selection_three", "");
			values25.put("selection_four", "");
			values25.put("answer", "");
			values25.put("explanation", "");
			values25.put("world_heritage_image_path", "");
			values25.put("area", "アジア・中東");
			db.insert("quiz", null, values25);

			ContentValues values26 = new ContentValues();
			values26.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values26.put("selection_one", "");
			values26.put("selection_two", "");
			values26.put("selection_three", "");
			values26.put("selection_four", "");
			values26.put("answer", "");
			values26.put("explanation", "");
			values26.put("world_heritage_image_path", "");
			values26.put("area", "アジア・中東");
			db.insert("quiz", null, values26);

			ContentValues values27 = new ContentValues();
			values27.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values27.put("selection_one", "");
			values27.put("selection_two", "");
			values27.put("selection_three", "");
			values27.put("selection_four", "");
			values27.put("answer", "");
			values27.put("explanation", "");
			values27.put("world_heritage_image_path", "");
			values27.put("area", "アジア・中東");
			db.insert("quiz", null, values27);

			ContentValues values28 = new ContentValues();
			values28.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values28.put("selection_one", "");
			values28.put("selection_two", "");
			values28.put("selection_three", "");
			values28.put("selection_four", "");
			values28.put("answer", "");
			values28.put("explanation", "");
			values28.put("world_heritage_image_path", "");
			values28.put("area", "アジア・中東");
			db.insert("quiz", null, values28);

			ContentValues values29 = new ContentValues();
			values29.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values29.put("selection_one", "");
			values29.put("selection_two", "");
			values29.put("selection_three", "");
			values29.put("selection_four", "");
			values29.put("answer", "");
			values29.put("explanation", "");
			values29.put("world_heritage_image_path", "");
			values29.put("area", "アジア・中東");
			db.insert("quiz", null, values29);

			ContentValues values30 = new ContentValues();
			values30.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values30.put("selection_one", "");
			values30.put("selection_two", "");
			values30.put("selection_three", "");
			values30.put("selection_four", "");
			values30.put("answer", "");
			values30.put("explanation", "");
			values30.put("world_heritage_image_path", "");
			values30.put("area", "アジア・中東");
			db.insert("quiz", null, values30);

			ContentValues values31 = new ContentValues();
			values31.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values31.put("selection_one", "");
			values31.put("selection_two", "");
			values31.put("selection_three", "");
			values31.put("selection_four", "");
			values31.put("answer", "");
			values31.put("explanation", "");
			values31.put("world_heritage_image_path", "");
			values31.put("area", "オセアニア");
			db.insert("quiz", null, values31);

			ContentValues values32 = new ContentValues();
			values32.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values32.put("selection_one", "");
			values32.put("selection_two", "");
			values32.put("selection_three", "");
			values32.put("selection_four", "");
			values32.put("answer", "");
			values32.put("explanation", "");
			values32.put("world_heritage_image_path", "");
			values32.put("area", "オセアニア");
			db.insert("quiz", null, values32);

			ContentValues values33 = new ContentValues();
			values33.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values33.put("selection_one", "");
			values33.put("selection_two", "");
			values33.put("selection_three", "");
			values33.put("selection_four", "");
			values33.put("answer", "");
			values33.put("explanation", "");
			values33.put("world_heritage_image_path", "");
			values33.put("area", "オセアニア");
			db.insert("quiz", null, values33);

			ContentValues values34 = new ContentValues();
			values34.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values34.put("selection_one", "");
			values34.put("selection_two", "");
			values34.put("selection_three", "");
			values34.put("selection_four", "");
			values34.put("answer", "");
			values34.put("explanation", "");
			values34.put("world_heritage_image_path", "");
			values34.put("area", "オセアニア");
			db.insert("quiz", null, values34);

			ContentValues values35 = new ContentValues();
			values35.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values35.put("selection_one", "");
			values35.put("selection_two", "");
			values35.put("selection_three", "");
			values35.put("selection_four", "");
			values35.put("answer", "");
			values35.put("explanation", "");
			values35.put("world_heritage_image_path", "");
			values35.put("area", "オセアニア");
			db.insert("quiz", null, values35);

			ContentValues values36 = new ContentValues();
			values36.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values36.put("selection_one", "");
			values36.put("selection_two", "");
			values36.put("selection_three", "");
			values36.put("selection_four", "");
			values36.put("answer", "");
			values36.put("explanation", "");
			values36.put("world_heritage_image_path", "");
			values36.put("area", "オセアニア");
			db.insert("quiz", null, values36);

			ContentValues values37 = new ContentValues();
			values37.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values37.put("selection_one", "");
			values37.put("selection_two", "");
			values37.put("selection_three", "");
			values37.put("selection_four", "");
			values37.put("answer", "");
			values37.put("explanation", "");
			values37.put("world_heritage_image_path", "");
			values37.put("area", "オセアニア");
			db.insert("quiz", null, values37);

			ContentValues values38 = new ContentValues();
			values38.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values38.put("selection_one", "");
			values20.put("selection_two", "");
			values38.put("selection_three", "");
			values38.put("selection_four", "");
			values38.put("answer", "");
			values38.put("explanation", "");
			values38.put("world_heritage_image_path", "");
			values38.put("area", "オセアニア");
			db.insert("quiz", null, values38);

			ContentValues values39 = new ContentValues();
			values39.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values39.put("selection_one", "");
			values39.put("selection_two", "");
			values39.put("selection_three", "");
			values39.put("selection_four", "");
			values39.put("answer", "");
			values39.put("explanation", "");
			values39.put("world_heritage_image_path", "");
			values39.put("area", "オセアニア");
			db.insert("quiz", null, values39);

			ContentValues values40 = new ContentValues();
			values40.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values40.put("selection_one", "");
			values40.put("selection_two", "");
			values40.put("selection_three", "");
			values40.put("selection_four", "");
			values40.put("answer", "");
			values40.put("explanation", "");
			values40.put("world_heritage_image_path", "");
			values40.put("area", "オセアニア");
			db.insert("quiz", null, values40);

			ContentValues values41 = new ContentValues();
			values41.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values41.put("selection_one", "");
			values41.put("selection_two", "");
			values41.put("selection_three", "");
			values41.put("selection_four", "");
			values41.put("answer", "");
			values41.put("explanation", "");
			values41.put("world_heritage_image_path", "");
			values41.put("area", "アフリカ");
			db.insert("quiz", null, values41);

			ContentValues values42 = new ContentValues();
			values42.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values42.put("selection_one", "");
			values42.put("selection_two", "");
			values42.put("selection_three", "");
			values42.put("selection_four", "");
			values42.put("answer", "");
			values42.put("explanation", "");
			values42.put("world_heritage_image_path", "");
			values42.put("area", "アフリカ");
			db.insert("quiz", null, values42);

			ContentValues values43 = new ContentValues();
			values43.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values43.put("selection_one", "");
			values43.put("selection_two", "");
			values43.put("selection_three", "");
			values43.put("selection_four", "");
			values43.put("answer", "");
			values43.put("explanation", "");
			values43.put("world_heritage_image_path", "");
			values43.put("area", "アフリカ");
			db.insert("quiz", null, values43);

			ContentValues values44 = new ContentValues();
			values44.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values44.put("selection_one", "");
			values44.put("selection_two", "");
			values44.put("selection_three", "");
			values44.put("selection_four", "");
			values44.put("answer", "");
			values44.put("explanation", "");
			values44.put("world_heritage_image_path", "");
			values44.put("area", "アフリカ");
			db.insert("quiz", null, values44);

			ContentValues values45 = new ContentValues();
			values45.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values45.put("selection_one", "");
			values45.put("selection_two", "");
			values45.put("selection_three", "");
			values45.put("selection_four", "");
			values45.put("answer", "");
			values45.put("explanation", "");
			values45.put("world_heritage_image_path", "");
			values45.put("area", "アフリカ");
			db.insert("quiz", null, values45);

			ContentValues values46 = new ContentValues();
			values46.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values46.put("selection_one", "");
			values46.put("selection_two", "");
			values46.put("selection_three", "");
			values46.put("selection_four", "");
			values46.put("answer", "");
			values46.put("explanation", "");
			values46.put("world_heritage_image_path", "");
			values46.put("area", "アフリカ");
			db.insert("quiz", null, values46);

			ContentValues values47 = new ContentValues();
			values47.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values47.put("selection_one", "");
			values47.put("selection_two", "");
			values47.put("selection_three", "");
			values47.put("selection_four", "");
			values47.put("answer", "");
			values47.put("explanation", "");
			values47.put("world_heritage_image_path", "");
			values47.put("area", "アフリカ");
			db.insert("quiz", null, values47);

			ContentValues values48 = new ContentValues();
			values48.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values48.put("selection_one", "");
			values48.put("selection_two", "");
			values48.put("selection_three", "");
			values48.put("selection_four", "");
			values48.put("answer", "");
			values48.put("explanation", "");
			values48.put("world_heritage_image_path", "");
			values48.put("area", "アフリカ");
			db.insert("quiz", null, values48);

			ContentValues values49 = new ContentValues();
			values49.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values49.put("selection_one", "");
			values49.put("selection_two", "");
			values49.put("selection_three", "");
			values49.put("selection_four", "");
			values49.put("answer", "");
			values49.put("explanation", "");
			values49.put("world_heritage_image_path", "");
			values49.put("area", "アフリカ");
			db.insert("quiz", null, values49);

			ContentValues values50 = new ContentValues();
			values50.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values50.put("selection_one", "");
			values50.put("selection_two", "");
			values50.put("selection_three", "");
			values50.put("selection_four", "");
			values50.put("answer", "");
			values50.put("explanation", "");
			values50.put("world_heritage_image_path", "");
			values50.put("area", "アフリカ");
			db.insert("quiz", null, values50);

			ContentValues values51 = new ContentValues();
			values51.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values51.put("selection_one", "");
			values51.put("selection_two", "");
			values51.put("selection_three", "");
			values51.put("selection_four", "");
			values51.put("answer", "");
			values51.put("explanation", "");
			values51.put("world_heritage_image_path", "");
			values51.put("area", "北米・南米");
			db.insert("quiz", null, values51);

			ContentValues values52 = new ContentValues();
			values52.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values52.put("selection_one", "");
			values52.put("selection_two", "");
			values52.put("selection_three", "");
			values52.put("selection_four", "");
			values52.put("answer", "");
			values52.put("explanation", "");
			values52.put("world_heritage_image_path", "");
			values52.put("area", "北米・南米");
			db.insert("quiz", null, values52);

			ContentValues values53 = new ContentValues();
			values53.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values53.put("selection_one", "");
			values53.put("selection_two", "");
			values53.put("selection_three", "");
			values53.put("selection_four", "");
			values53.put("answer", "");
			values53.put("explanation", "");
			values53.put("world_heritage_image_path", "");
			values53.put("area", "北米・南米");
			db.insert("quiz", null, values53);

			ContentValues values54 = new ContentValues();
			values54.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values54.put("selection_one", "");
			values54.put("selection_two", "");
			values54.put("selection_three", "");
			values54.put("selection_four", "");
			values54.put("answer", "");
			values54.put("explanation", "");
			values54.put("world_heritage_image_path", "");
			values54.put("area", "北米・南米");
			db.insert("quiz", null, values54);

			ContentValues values55 = new ContentValues();
			values55.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values55.put("selection_one", "");
			values55.put("selection_two", "");
			values55.put("selection_three", "");
			values55.put("selection_four", "");
			values55.put("answer", "");
			values55.put("explanation", "");
			values55.put("world_heritage_image_path", "");
			values55.put("area", "北米・南米");
			db.insert("quiz", null, values55);

			ContentValues values56 = new ContentValues();
			values56.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values56.put("selection_one", "");
			values56.put("selection_two", "");
			values56.put("selection_three", "");
			values56.put("selection_four", "");
			values56.put("answer", "");
			values56.put("explanation", "");
			values56.put("world_heritage_image_path", "");
			values56.put("area", "北米・南米");
			db.insert("quiz", null, values56);

			ContentValues values57 = new ContentValues();
			values57.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values57.put("selection_one", "");
			values57.put("selection_two", "");
			values57.put("selection_three", "");
			values57.put("selection_four", "");
			values57.put("answer", "");
			values57.put("explanation", "");
			values57.put("world_heritage_image_path", "");
			values57.put("area", "北米・南米");
			db.insert("quiz", null, values57);

			ContentValues values58 = new ContentValues();
			values58.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values58.put("selection_one", "");
			values58.put("selection_two", "");
			values58.put("selection_three", "");
			values58.put("selection_four", "");
			values58.put("answer", "");
			values58.put("explanation", "");
			values58.put("world_heritage_image_path", "");
			values58.put("area", "北米・南米");
			db.insert("quiz", null, values58);

			ContentValues values59 = new ContentValues();
			values59.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values59.put("selection_one", "");
			values59.put("selection_two", "");
			values59.put("selection_three", "");
			values59.put("selection_four", "");
			values59.put("answer", "");
			values59.put("explanation", "");
			values59.put("world_heritage_image_path", "");
			values59.put("area", "北米・南米");
			db.insert("quiz", null, values59);

			ContentValues values60 = new ContentValues();
			values60.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values60.put("selection_one", "");
			values60.put("selection_two", "");
			values60.put("selection_three", "");
			values60.put("selection_four", "");
			values60.put("answer", "");
			values60.put("explanation", "");
			values60.put("world_heritage_image_path", "");
			values60.put("area", "北米・南米");
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
