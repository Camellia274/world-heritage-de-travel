/**
 *
 */
package jp.ac.feelwind.worldheritagedetravel;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteCursor;
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
			values3.put("selection_one", "サンタ・マリア教会");
			values3.put("selection_two", "日光の社寺");
			values3.put("selection_three", "古都ビガン");
			values3.put("selection_four", "デル・モンテ城");
			values3.put("answer", "サンタ・マリア教会");
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
			values4.put("selection_one", "ヴェネツィアとその潟");
			values4.put("selection_two", "コルフ旧市街");
			values4.put("selection_three", "パラマリボ市街歴史地区");
			values4.put("selection_four", "ウィーン歴史地区");
			values4.put("answer", "ヴェネツィアとその潟");
			values4.put("explanation", "");
			values4.put("world_heritage_image_path", "");
			values4.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values4);

			ContentValues values5 = new ContentValues();
			values5.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values5.put("selection_one", "アムステルダムの運河");
			values5.put("selection_two", "フレーザー島");
			values5.put("selection_three", "チャン・チャン遺跡地帯");
			values5.put("selection_four", "カピバラ山地国立公園");
			values5.put("answer", "アムステルダムの運河");
			values5.put("explanation", "");
			values5.put("world_heritage_image_path", "");
			values5.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values5);

			ContentValues values6 = new ContentValues();
			values6.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values6.put("selection_one", "アテナイのアクロポリス");
			values6.put("selection_two", "スクーグシュルコゴーデン");
			values6.put("selection_three", "ヴルコリニェツ");
			values6.put("selection_four", "リトミシュル城");
			values6.put("answer", "アテナイのアクロポリス");
			values6.put("explanation", "");
			values6.put("world_heritage_image_path", "");
			values6.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values6);

			ContentValues values7 = new ContentValues();
			values7.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values7.put("selection_one", "サグラダ・ファミリア");
			values7.put("selection_two", "昌徳宮");
			values7.put("selection_three", "古都ビガン");
			values7.put("selection_four", "クロンボー城");
			values7.put("answer", "サグラダ・ファミリア");
			values7.put("explanation", "");
			values7.put("world_heritage_image_path", "");
			values7.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values7);

			ContentValues values8 = new ContentValues();
			values8.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values8.put("selection_one", "ケルン大聖堂");
			values8.put("selection_two", "アシャンティの建築物群");
			values8.put("selection_three", "エルビル城塞");
			values8.put("selection_four", "凱旋門");
			values8.put("answer", "ケルン大聖堂");
			values8.put("explanation", "");
			values8.put("world_heritage_image_path", "");
			values8.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values8);

			ContentValues values9 = new ContentValues();
			values9.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values9.put("selection_one", "アルタのロックアート");
			values9.put("selection_two", "ブルー・マウンテンズ");
			values9.put("selection_three", "グラン・プレの景観");
			values9.put("selection_four", "ビソトゥーン");
			values9.put("answer", "アルタのロックアート");
			values9.put("explanation", "");
			values9.put("world_heritage_image_path", "");
			values9.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values9);

			ContentValues values10 = new ContentValues();
			values10.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values10.put("selection_one", "ウェストミンスター宮殿");
			values10.put("selection_two", "チャコ文化");
			values10.put("selection_three", "セント・キルダ");
			values10.put("selection_four", "レブカ歴史的港町");
			values10.put("answer", "ウェストミンスター宮殿");
			values10.put("explanation", "");
			values10.put("world_heritage_image_path", "");
			values10.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values10);

			ContentValues values11 = new ContentValues();
			values11.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values11.put("selection_one", "ストーンヘンジ");
			values11.put("selection_two", "モンバサのジーザス要塞");
			values11.put("selection_three", "マルペロの動植物保護区");
			values11.put("selection_four", "スカン・グアイ");
			values11.put("answer", "ストーンヘンジ");
			values11.put("explanation", "");
			values11.put("world_heritage_image_path", "");
			values11.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values11);

			ContentValues values12 = new ContentValues();
			values12.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values12.put("selection_one", "古都セントジョージ");
			values12.put("selection_two", "ローマ帝国の国境線");
			values12.put("selection_three", "タスマニア原生地域");
			values12.put("selection_four", "アッコ旧市街");
			values12.put("answer", "古都セントジョージ");
			values12.put("explanation", "");
			values12.put("world_heritage_image_path", "");
			values12.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values12);

			ContentValues values13 = new ContentValues();
			values13.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values13.put("selection_one", "コルドバ歴史地区");
			values13.put("selection_two", "パンタナル保全地域");
			values13.put("selection_three", "承徳の避暑山荘と外八廟");
			values13.put("selection_four", "ガンメルスタードの教会街 ");
			values13.put("answer", "コルドバ歴史地区");
			values13.put("explanation", "");
			values13.put("world_heritage_image_path", "");
			values13.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values13);

			ContentValues values14 = new ContentValues();
			values14.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values14.put("selection_one", "メテオラ");
			values14.put("selection_two", "コインブラ大学－アルタとソフィア");
			values14.put("selection_three", "インドの山岳鉄道群");
			values14.put("selection_four", "ヴェズレーの教会と丘");
			values14.put("answer", "メテオラ");
			values14.put("explanation", "");
			values14.put("world_heritage_image_path", "");
			values14.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values14);

			ContentValues values15 = new ContentValues();
			values15.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values15.put("selection_one", "ヘラクレスの塔");
			values15.put("selection_two", "ティヴォリのエステ家別荘");
			values15.put("selection_three", "カホキア墳丘群州立史跡");
			values15.put("selection_four", "イルリサット・アイスフィヨルド");
			values15.put("answer", "ヘラクレスの塔");
			values15.put("explanation", "");
			values15.put("world_heritage_image_path", "");
			values15.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values15);

			ContentValues values16 = new ContentValues();
			values16.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values16.put("selection_one", "モン・サン＝ミシェル");
			values16.put("selection_two", "ブリッゲン");
			values16.put("selection_three", "イビサ、生物多様性と文化");
			values16.put("selection_four", "東デヴォン海岸");
			values16.put("answer", "モン・サン＝ミシェル");
			values16.put("explanation", "");
			values16.put("world_heritage_image_path", "");
			values16.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values16);

			ContentValues values17 = new ContentValues();
			values17.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values17.put("selection_one", "ポンペイ");
			values17.put("selection_two", "セビージャの大聖堂");
			values17.put("selection_three", "リヨン歴史地区");
			values17.put("selection_four", "スルツエイ");
			values17.put("answer", "ポンペイ");
			values17.put("explanation", "");
			values17.put("world_heritage_image_path", "");
			values17.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values17);

			ContentValues values18 = new ContentValues();
			values18.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values18.put("selection_one", "アマルフィ海岸");
			values18.put("selection_two", "プリトヴィッチェ湖群国立公園");
			values18.put("selection_three", "ワッデン海");
			values18.put("selection_four", "ヘッド-スマッシュト-イン・バッファロー・ジャンプ");
			values18.put("answer", "アマルフィ海岸");
			values18.put("explanation", "");
			values18.put("world_heritage_image_path", "");
			values18.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values18);

			ContentValues values19 = new ContentValues();
			values19.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values19.put("selection_one", "ラポニアン・エリア");
			values19.put("selection_two", "高句麗古墳群");
			values19.put("selection_three", "峨眉山と楽山大仏");
			values19.put("selection_four", "サン・クリストバル・デ・ラ・ラグナ");
			values19.put("answer", "ラポニアン・エリア");
			values19.put("explanation", "");
			values19.put("world_heritage_image_path", "");
			values19.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values19);

			ContentValues values20 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "バチカン市国");
			values20.put("selection_two", "オカピ野生生物保護区");
			values20.put("selection_three", "頤和園、北京の皇帝の庭園");
			values20.put("selection_four", "Ir.D.F.ヴァウダヘマール");
			values20.put("answer", "バチカン市国");
			values20.put("explanation", "");
			values20.put("world_heritage_image_path", "");
			values20.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values20);

			ContentValues values21 = new ContentValues();
			values21.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values21.put("selection_one", "タージ・マハル");
			values21.put("selection_two", "クックの初期農耕遺跡");
			values21.put("selection_three", "バリ州の文化的景観");
			values21.put("selection_four", "アイアンブリッジ峡谷");
			values21.put("answer", "タージ・マハル");
			values21.put("explanation", "");
			values21.put("world_heritage_image_path", "");
			values21.put("area", "アジア・中東");
			db.insert("quiz", null, values21);

			ContentValues values22 = new ContentValues();
			values22.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values22.put("selection_one", "イスタンブルの歴史地区");
			values22.put("selection_two", "ゴフ島及びインアクセシブル島");
			values22.put("selection_three", "ドニャーナ国立公園");
			values22.put("selection_four", "カールズバッド洞窟群国立公園");
			values22.put("answer", "イスタンブルの歴史地区");
			values22.put("explanation", "");
			values22.put("world_heritage_image_path", "");
			values22.put("area", "アジア・中東");
			db.insert("quiz", null, values22);

			ContentValues values23 = new ContentValues();
			values23.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values23.put("selection_one", "アンコール遺跡 ");
			values23.put("selection_two", "龍門石窟");
			values23.put("selection_three", "ゴンバデ・カーブース");
			values23.put("selection_four", "オロモウツの聖三位一体柱");
			values23.put("answer", "アンコール遺跡");
			values23.put("explanation", "");
			values23.put("world_heritage_image_path", "");
			values23.put("area", "アジア・中東");
			db.insert("quiz", null, values23);

			ContentValues values24 = new ContentValues();
			values24.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values24.put("selection_one", "万里の長城");
			values24.put("selection_two", "カパック・ニャン　アンデスの道");
			values24.put("selection_three", "紀伊山地の霊場と参詣道");
			values24.put("selection_four", "エルチェの椰子園");
			values24.put("answer", "万里の長城");
			values24.put("explanation", "");
			values24.put("world_heritage_image_path", "");
			values24.put("area", "アジア・中東");
			db.insert("quiz", null, values24);

			ContentValues values25 = new ContentValues();
			values25.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values25.put("selection_one", "富士山");
			values25.put("selection_two", "カマグェイの歴史地区");
			values25.put("selection_three", "ロンバルディアのサクリ・モンティ");
			values25.put("selection_four", "スタリ・ラスとソポチャニ");
			values25.put("answer", "富士山");
			values25.put("explanation", "");
			values25.put("world_heritage_image_path", "");
			values25.put("area", "アジア・中東");
			db.insert("quiz", null, values25);

			ContentValues values26 = new ContentValues();
			values26.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values26.put("selection_one", "モヘンジョダロ");
			values26.put("selection_two", "グレーター・ブルー・マウンテンズ地域");
			values26.put("selection_three", "ジャイアンツ・コーズウェー");
			values26.put("selection_four", "ラヴォー地区の葡萄畑");
			values26.put("answer", "モヘンジョダロ");
			values26.put("explanation", "");
			values26.put("world_heritage_image_path", "");
			values26.put("area", "アジア・中東");
			db.insert("quiz", null, values26);

			ContentValues values27 = new ContentValues();
			values27.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values27.put("selection_one", "原爆ドーム");
			values27.put("selection_two", "ドロットニングホルムの王領地");
			values27.put("selection_three", "ブルノのツゲンドハット邸");
			values27.put("selection_four", "開平の望楼群と村落");
			values27.put("answer", "原爆ドーム");
			values27.put("explanation", "");
			values27.put("world_heritage_image_path", "");
			values27.put("area", "アジア・中東");
			db.insert("quiz", null, values27);

			ContentValues values28 = new ContentValues();
			values28.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values28.put("selection_one", "秦始皇帝陵及び兵馬俑坑");
			values28.put("selection_two", "タリン歴史地区（旧市街）");
			values28.put("selection_three", "バルデヨフ市街保護区");
			values28.put("selection_four", "イルリサット・アイスフィヨルド");
			values28.put("answer", "秦始皇帝陵及び兵馬俑坑");
			values28.put("explanation", "");
			values28.put("world_heritage_image_path", "");
			values28.put("area", "アジア・中東");
			db.insert("quiz", null, values28);

			ContentValues values29 = new ContentValues();
			values29.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values29.put("selection_one", "ボロブドゥール寺院遺跡群");
			values29.put("selection_two", "独立記念館");
			values29.put("selection_three", "ランス・オ・メドー国定史跡");
			values29.put("selection_four", "カジュラーホの建造物群");
			values29.put("answer", "ボロブドゥール寺院遺跡群");
			values29.put("explanation", "");
			values29.put("world_heritage_image_path", "");
			values29.put("area", "アジア・中東");
			db.insert("quiz", null, values29);

			ContentValues values30 = new ContentValues();
			values30.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values30.put("selection_one", "古代都市ダマスカス");
			values30.put("selection_two", "バース市街");
			values30.put("selection_three", "アルビ司教都市");
			values30.put("selection_four", "ルクセンブルク市");
			values30.put("answer", "古代都市ダマスカス");
			values30.put("explanation", "");
			values30.put("world_heritage_image_path", "");
			values30.put("area", "アジア・中東");
			db.insert("quiz", null, values30);

			ContentValues values31 = new ContentValues();
			values31.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values31.put("selection_one", "シドニー・オペラハウス");
			values31.put("selection_two", "シュケリッグ・ヴィヒル");
			values31.put("selection_three", "アラゴン州のムデハル様式建造物");
			values31.put("selection_four", "ゴンバデ・カーブース");
			values31.put("answer", "シドニー・オペラハウス");
			values31.put("explanation", "");
			values31.put("world_heritage_image_path", "");
			values31.put("area", "オセアニア");
			db.insert("quiz", null, values31);

			ContentValues values32 = new ContentValues();
			values32.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values32.put("selection_one", "グレートバリアリーフ");
			values32.put("selection_two", "スンダルバンス国立公園");
			values32.put("selection_three", "聖地キャンディ");
			values32.put("selection_four", "河南登封の文化財“天地之中”");
			values32.put("answer", "グレートバリアリーフ");
			values32.put("explanation", "");
			values32.put("world_heritage_image_path", "");
			values32.put("area", "オセアニア");
			db.insert("quiz", null, values32);

			ContentValues values33 = new ContentValues();
			values33.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values33.put("selection_one", "ウルル＝カタ・ジュタ国立公園");
			values33.put("selection_two", "四川ジャイアントパンダ保護区群");
			values33.put("selection_three", "タッシリ・ナジェール");
			values33.put("selection_four", "ベルリンの近代集合住宅群");
			values33.put("answer", "ウルル＝カタ・ジュタ国立公園");
			values33.put("explanation", "");
			values33.put("world_heritage_image_path", "");
			values33.put("area", "オセアニア");
			db.insert("quiz", null, values33);

			ContentValues values34 = new ContentValues();
			values34.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values34.put("selection_one", "王立展示館とカールトン庭園");
			values34.put("selection_two", "ヴェルラ砕木・板紙工場");
			values34.put("selection_three", "エトナ山");
			values34.put("selection_four", "キロキティア");
			values34.put("answer", "王立展示館とカールトン庭園");
			values34.put("explanation", "");
			values34.put("world_heritage_image_path", "");
			values34.put("area", "オセアニア");
			db.insert("quiz", null, values34);

			ContentValues values35 = new ContentValues();
			values35.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values35.put("selection_one", "カカドゥ国立公園");
			values35.put("selection_two", "ネムルット・ダー");
			values35.put("selection_three", "スヴェシュタリのトラキア人の墳墓");
			values35.put("selection_four", "パサルガダエ");
			values35.put("answer", "カカドゥ国立公園");
			values35.put("explanation", "");
			values35.put("world_heritage_image_path", "");
			values35.put("area", "オセアニア");
			db.insert("quiz", null, values35);

			ContentValues values36 = new ContentValues();
			values36.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values36.put("selection_one", "ビキニ環礁核実験場");
			values36.put("selection_two", "コナーラクの太陽神寺院");
			values36.put("selection_three", "ロード・ハウ諸島");
			values36.put("selection_four", "自由の女神像");
			values36.put("answer", "ビキニ環礁核実験場");
			values36.put("explanation", "");
			values36.put("world_heritage_image_path", "");
			values36.put("area", "オセアニア");
			db.insert("quiz", null, values36);

			ContentValues values37 = new ContentValues();
			values37.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values37.put("selection_one", "首長ロイ・マタの地");
			values37.put("selection_two", "ヘッド-スマッシュト-イン・バッファロー・ジャンプ");
			values37.put("selection_three", "ディキスのコロンブス期首長制集落群");
			values37.put("selection_four", "スイスのサルドーナ地殻変動地帯");
			values37.put("answer", "首長ロイ・マタの地");
			values37.put("explanation", "");
			values37.put("world_heritage_image_path", "");
			values37.put("area", "オセアニア");
			db.insert("quiz", null, values37);

			ContentValues values38 = new ContentValues();
			values38.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values38.put("selection_one", "テ・ワヒポウナム");
			values20.put("selection_two", "ルーゴのローマの城壁群");
			values38.put("selection_three", "アミアン大聖堂");
			values38.put("selection_four", "サンタ・クルーズ・デ・モンポスの歴史地区");
			values38.put("answer", "テ・ワヒポウナム");
			values38.put("explanation", "");
			values38.put("world_heritage_image_path", "");
			values38.put("area", "オセアニア");
			db.insert("quiz", null, values38);

			ContentValues values39 = new ContentValues();
			values39.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values39.put("selection_one", "フェニックス諸島保護地域");
			values39.put("selection_two", "パラマリボ市街歴史地区");
			values39.put("selection_three", "韓国の歴史的集落群：河回と良洞");
			values39.put("selection_four", "グヌン・ムル国立公園");
			values39.put("answer", "フェニックス諸島保護地域");
			values39.put("explanation", "");
			values39.put("world_heritage_image_path", "");
			values39.put("area", "オセアニア");
			db.insert("quiz", null, values39);

			ContentValues values40 = new ContentValues();
			values40.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values40.put("selection_one", "クイーンズランドの湿潤熱帯地域");
			values40.put("selection_two", "九寨溝の渓谷の景観と歴史地域");
			values40.put("selection_three", "オヴス・ヌール盆地");
			values40.put("selection_four", "ラヴォー地区の葡萄畑");
			values40.put("answer", "クイーンズランドの湿潤熱帯地域");
			values40.put("explanation", "");
			values40.put("world_heritage_image_path", "");
			values40.put("area", "オセアニア");
			db.insert("quiz", null, values40);

			ContentValues values41 = new ContentValues();
			values41.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values41.put("selection_one", "アブ・シンベル神殿");
			values41.put("selection_two", "古代都市「タウリカのヘルソネソス」");
			values41.put("selection_three", "エンゲルスベリの製鉄所");
			values41.put("selection_four", "カジランガ国立公園");
			values41.put("answer", "アブ・シンベル神殿");
			values41.put("explanation", "");
			values41.put("world_heritage_image_path", "");
			values41.put("area", "アフリカ");
			db.insert("quiz", null, values41);

			ContentValues values42 = new ContentValues();
			values42.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values42.put("selection_one", "ヴィクトリアの滝");
			values42.put("selection_two", "ビルカとホーヴゴーデン");
			values42.put("selection_three", "イスファハンのイマーム広場");
			values42.put("selection_four", "五台山");
			values42.put("answer", "ヴィクトリアの滝");
			values42.put("explanation", "");
			values42.put("world_heritage_image_path", "");
			values42.put("area", "アフリカ");
			db.insert("quiz", null, values42);

			ContentValues values43 = new ContentValues();
			values43.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values43.put("selection_one", "モザンビーク島");
			values43.put("selection_two", "オーバーハルツ水利管理システム");
			values43.put("selection_three", "ヴィルヘルムスヘ－エ城公園");
			values43.put("selection_four", "ダンブッラの黄金寺院");
			values43.put("answer", "モザンビーク島");
			values43.put("explanation", "");
			values43.put("world_heritage_image_path", "");
			values43.put("area", "アフリカ");
			db.insert("quiz", null, values43);

			ContentValues values44 = new ContentValues();
			values44.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values44.put("selection_one", "キリマンジャロ国立公園");
			values44.put("selection_two", "西ノルウェーフィヨルド群");
			values44.put("selection_three", "ホンジャ・アフメッド・ヤサウイ廟");
			values44.put("selection_four", "白神山地");
			values44.put("answer", "キリマンジャロ国立公園");
			values44.put("explanation", "");
			values44.put("world_heritage_image_path", "");
			values44.put("area", "アフリカ");
			db.insert("quiz", null, values44);

			ContentValues values45 = new ContentValues();
			values45.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values45.put("selection_one", "メンフィスとその墓地遺跡");
			values45.put("selection_two", "クレスピ・ダッダ");
			values45.put("selection_three", "アクイレイアの遺跡地域");
			values45.put("selection_four", "開城の歴史的建造物と遺跡");
			values45.put("answer", "メンフィスとその墓地遺跡");
			values45.put("explanation", "");
			values45.put("world_heritage_image_path", "");
			values45.put("area", "アフリカ");
			db.insert("quiz", null, values45);

			ContentValues values46 = new ContentValues();
			values46.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values46.put("selection_one", "古代都市テーベ");
			values46.put("selection_two", "レ・ストラーデ・ヌオーヴェ");
			values46.put("selection_three", "武陵源の自然景観と歴史地域");
			values46.put("selection_four", "ティパサ");
			values46.put("answer", "古代都市テーベ");
			values46.put("explanation", "");
			values46.put("world_heritage_image_path", "");
			values46.put("area", "アフリカ");
			db.insert("quiz", null, values46);

			ContentValues values47 = new ContentValues();
			values47.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values47.put("selection_one", "アクスム");
			values47.put("selection_two", "サナア旧市街");
			values47.put("selection_three", "フォンニャ-ケバン国立公園");
			values47.put("selection_four", "オモ川下流域");
			values47.put("answer", "アクスム");
			values47.put("explanation", "");
			values47.put("world_heritage_image_path", "");
			values47.put("area", "アフリカ");
			db.insert("quiz", null, values47);

			ContentValues values48 = new ContentValues();
			values48.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values48.put("selection_one", "カルタゴ遺跡");
			values48.put("selection_two", "チャン・アン複合景観");
			values48.put("selection_three", "シエンフェゴスの都市歴史地区");
			values48.put("selection_four", "メ渓谷自然保護区");
			values48.put("answer", "カルタゴ遺跡");
			values48.put("explanation", "");
			values48.put("world_heritage_image_path", "");
			values48.put("area", "アフリカ");
			db.insert("quiz", null, values48);

			ContentValues values49 = new ContentValues();
			values49.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values49.put("selection_one", "ンゴロンゴロ保全地域");
			values49.put("selection_two", "ハワイ火山国立公園");
			values49.put("selection_three", "カラカスの大学都市");
			values49.put("selection_four", "セルー・ゲーム・リザーブ");
			values49.put("answer", "ンゴロンゴロ保全地域");
			values49.put("explanation", "");
			values49.put("world_heritage_image_path", "");
			values49.put("area", "アフリカ");
			db.insert("quiz", null, values49);

			ContentValues values50 = new ContentValues();
			values50.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values50.put("selection_one", "ドゥッガ／トゥッガ");
			values50.put("selection_two", "ウォータートン・グレーシャー");
			values50.put("selection_three", "ニオコロ-コバ国立公園");
			values50.put("selection_four", "ブルー・ナ・ボーニャ");
			values50.put("answer", "ドゥッガ／トゥッガ");
			values50.put("explanation", "");
			values50.put("world_heritage_image_path", "");
			values50.put("area", "アフリカ");
			db.insert("quiz", null, values50);

			ContentValues values51 = new ContentValues();
			values51.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values51.put("selection_one", "ナスカの地上絵");
			values51.put("selection_two", "エドワード１世の城群と市壁群");
			values51.put("selection_three", "ヴェガオヤン-ヴェガ群島");
			values51.put("selection_four", "福建の土楼");
			values51.put("answer", "ナスカの地上絵");
			values51.put("explanation", "");
			values51.put("world_heritage_image_path", "");
			values51.put("area", "北米・南米");
			db.insert("quiz", null, values51);

			ContentValues values52 = new ContentValues();
			values52.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values52.put("selection_one", "グランド・キャニオン");
			values52.put("selection_two", "オークニー諸島");
			values52.put("selection_three", "ビャウォヴィエジャの森");
			values52.put("selection_four", "中世都市トルニ");
			values52.put("answer", "グランド・キャニオン");
			values52.put("explanation", "");
			values52.put("world_heritage_image_path", "");
			values52.put("area", "北米・南米");
			db.insert("quiz", null, values52);

			ContentValues values53 = new ContentValues();
			values53.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values53.put("selection_one", "パパハナウモクアケア");
			values53.put("selection_two", "ルネサンス様式の記念碑的建造物群");
			values53.put("selection_three", "マルボルクのドイツ騎士団の城");
			values53.put("selection_four", "トゥバタハ岩礁自然公園");
			values53.put("answer", "パパハナウモクアケア");
			values53.put("explanation", "");
			values53.put("world_heritage_image_path", "");
			values53.put("area", "北米・南米");
			db.insert("quiz", null, values53);

			ContentValues values54 = new ContentValues();
			values54.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values54.put("selection_one", "ラパ・ヌイ国立公園");
			values54.put("selection_two", "中世市場都市プロヴァン");
			values54.put("selection_three", "カムチャツカ火山群");
			values54.put("selection_four", "新疆天山");
			values54.put("answer", "ラパ・ヌイ国立公園");
			values54.put("explanation", "");
			values54.put("world_heritage_image_path", "");
			values54.put("area", "北米・南米");
			db.insert("quiz", null, values54);

			ContentValues values55 = new ContentValues();
			values55.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values55.put("selection_one", "マチュ・ピチュの歴史保護区");
			values55.put("selection_two", "天日製塩施設");
			values55.put("selection_three", "クルシュー砂州");
			values55.put("selection_four", "コローメンスコエの昇天教会");
			values55.put("answer", "マチュ・ピチュの歴史保護区");
			values55.put("explanation", "");
			values55.put("world_heritage_image_path", "");
			values55.put("area", "北米・南米");
			db.insert("quiz", null, values55);

			ContentValues values56 = new ContentValues();
			values56.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values56.put("selection_one", "イグアス国立公園");
			values56.put("selection_two", "ラ・ルヴィエール及びル・ルー");
			values56.put("selection_three", "中央シホテ-アリン");
			values56.put("selection_four", "ノヴォデヴィチ女子修道院群");
			values56.put("answer", "イグアス国立公園");
			values56.put("explanation", "");
			values56.put("world_heritage_image_path", "");
			values56.put("area", "北米・南米");
			db.insert("quiz", null, values56);

			ContentValues values57 = new ContentValues();
			values57.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values57.put("selection_one", "カナイマ国立公園");
			values57.put("selection_two", "ブコヴィナ・ダルマティアの主教座施設");
			values57.put("selection_three", "パドヴァの植物園");
			values57.put("selection_four", "伽倻山海印寺");
			values57.put("answer", "カナイマ国立公園");
			values57.put("explanation", "");
			values57.put("world_heritage_image_path", "");
			values57.put("area", "北米・南米");
			db.insert("quiz", null, values57);

			ContentValues values58 = new ContentValues();
			values58.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values58.put("selection_one", "ガラパゴス諸島");
			values58.put("selection_two", "カールスクローナの軍港");
			values58.put("selection_three", "アルマデンとイドリア");
			values58.put("selection_four", "クサントス-レトーン");
			values58.put("answer", "ガラパゴス諸島");
			values58.put("explanation", "");
			values58.put("world_heritage_image_path", "");
			values58.put("area", "北米・南米");
			db.insert("quiz", null, values58);

			ContentValues values59 = new ContentValues();
			values59.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values59.put("selection_one", "ロス・グラシアレス");
			values59.put("selection_two", "バンスカー・シュティアヴニツァ歴史都市");
			values59.put("selection_three", "ピリン国立公園");
			values59.put("selection_four", "トゥウェイフルフォンテーン");
			values59.put("answer", "ロス・グラシアレス");
			values59.put("explanation", "");
			values59.put("world_heritage_image_path", "");
			values59.put("area", "北米・南米");
			db.insert("quiz", null, values59);

			ContentValues values60 = new ContentValues();
			values60.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values60.put("selection_one", "ポトシ市街");
			values60.put("selection_two", "僧院の島ライヒェナウ");
			values60.put("selection_three", "ドナウ・デルタ");
			values60.put("selection_four", "");
			values60.put("answer", "ポトシ市街");
			values60.put("explanation", "シギショアラ歴史地区");
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

	//ヨーロッパ1クイズ問題
	public String selectEurope1Quiz(SQLiteDatabase db){
		String result = null;
		String select = "SELECT problem, selection_one, selection_two, selection_three, selection_four, "
						+ "world_heritage_image_path "
						+ "FROM quiz "
						+ "WHERE area = ヨーロッパ1 "
						+ "ORDER BY RANDOM()";

		SQLiteCursor cursor =(SQLiteCursor)db.rawQuery(select, null);
		if(cursor.getCount() != 0){
			cursor.moveToFirst();
			result = cursor.getString(1);
		}
		cursor.close();
		return result;
	}

}
