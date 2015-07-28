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
			values2.put("world_heritage_image_path", "@drawable/isan_europe1_notorudamu");
			values2.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values2);

			ContentValues values3 = new ContentValues();
			values3.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values3.put("selection_one", "サンタ・マリア教会");
			values3.put("selection_two", "日光の社寺");
			values3.put("selection_three", "古都ビガン");
			values3.put("selection_four", "デル・モンテ城");
			values3.put("answer", "サンタ・マリア教会");
			values3.put("explanation", "1296年、アルノルフォ・デ・カンピオの設計により大聖堂を取り壊して着工し、"
					+ "ジョット、フランチェスコ・タランティらが造営主任をつとめる。以降、ミラノ公フランチェスコ・ス"
					+ "フォルツァがドミニコ修道院と教会の建設を指示し、建築家ソラーリによって長い年月をかけ1469年に"
					+ "完成した。教会のアプスは1492年以降、ドナト・ブラマンテにより改築されたものとされる（明白な証"
					+ "拠はない、という指摘もある）。当時ブラマンテはミラノに居住しており、教会の歴史書のなかにも一"
					+ "度登場している。");
			values3.put("world_heritage_image_path", "@drawable/isan_europe1_santa");
			values3.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values3);

			ContentValues values4 = new ContentValues();
			values4.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values4.put("selection_one", "ヴェネツィアとその潟");
			values4.put("selection_two", "コルフ旧市街");
			values4.put("selection_three", "パラマリボ市街歴史地区");
			values4.put("selection_four", "ウィーン歴史地区");
			values4.put("answer", "ヴェネツィアとその潟");
			values4.put("explanation", "ヴェネツィアは、5世紀頃、ゲルマン族の進入から逃れるために、当時湿地帯であっ"
					+ "た場所に街を作ったのが始まりといわれている。その後、海洋貿易での立国を目指した。十字軍の遠征"
					+ "による権益の拡大、ジェノヴァ共和国との戦争で繁栄は最高潮を迎えた。また、ルネッサンス時代"
					+ "には、ヴェネツィア派と呼ばれる画家を輩出した。アドリア海の女王とうたわれたヴェネツィアも他の"
					+ "ヨーロッパ諸国が地中海貿易に進出するに至った上に、大航海時代が始まり、アメリカ大陸や日本の発"
					+ "見などによって貿易の中心が大西洋や太平洋といった外海に移った事によって衰退に向かう。18世紀に"
					+ "は一年の半分をカーニバルで過ごす歓楽の都と化してしまった。"
					+ "ヴェネツィアの街は100以上の島々が、およそ400の橋と150をこえる大小の運河で結ばれている。");
			values4.put("world_heritage_image_path", "@drawable/isan_europe1_venetia");
			values4.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values4);

			ContentValues values5 = new ContentValues();
			values5.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values5.put("selection_one", "アムステルダムの運河");
			values5.put("selection_two", "フレーザー島");
			values5.put("selection_three", "チャン・チャン遺跡地帯");
			values5.put("selection_four", "カピバラ山地国立公園");
			values5.put("answer", "アムステルダムの運河");
			values5.put("explanation", "アムステルダムの運河システムの多くは、都市計画の優れた産物である。アムステ"
					+ "ルダムは、オランダ独立戦争を境に没落していったアントウェルペンに代わり、16世紀末以降、国際的"
					+ "な中継貿易の拠点となっていった。ヨーロッパ商業の変化に適応するとともに、ジェノヴァに代わって"
					+ "国際的な金融市場の機能も備えて急成長したアムステルダムの人口は、3万（16世紀末）、10.5万（162"
					+ "2年）、22万（1660年 - 1670年）と急増していった。そうして17世紀初頭に増大した移民に対応するこ"
					+ "とと防衛上の観点から、アイ湾を終端とする4つの主要な半円状の運河を含む包括的な都市計画が立案"
					+ "された。");
			values5.put("world_heritage_image_path", "@drawable/isan_europe1_amusuterudamu");
			values5.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values5);

			ContentValues values6 = new ContentValues();
			values6.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values6.put("selection_one", "アテナイのアクロポリス");
			values6.put("selection_two", "スクーグシュルコゴーデン");
			values6.put("selection_three", "ヴルコリニェツ");
			values6.put("selection_four", "リトミシュル城");
			values6.put("answer", "アテナイのアクロポリス");
			values6.put("explanation", "アテナイのアクロポリスは世界でもっともよく知られているアクロポリス(ギリシャ"
					+ "語: akros, akron+ polis,)である。 ギリシャには多数のアクロポリスがあるが、アテナイのアクロポ"
					+ "リスは一般的に「アクロポリス」で通じる点に意義がある。2007年3月26日、アクロポリスは正式にヨー"
					+ "ロッパの文化遺産リストに卓越した遺産として発表された。このアクロポリスはアテネの海抜150 m (49"
					+ "0 ft)の平らな岩の上に立っており、3ヘクタールの面積がある。 最初のアテナイの王ケクロプスにちな"
					+ "んだCecropiaという名でも知られていた。");
			values6.put("world_heritage_image_path", "@drawable/isan_europe1_akuroporisu");
			values6.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values6);

			ContentValues values7 = new ContentValues();
			values7.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values7.put("selection_one", "サグラダ・ファミリア");
			values7.put("selection_two", "昌徳宮");
			values7.put("selection_three", "古都ビガン");
			values7.put("selection_four", "クロンボー城");
			values7.put("answer", "サグラダ・ファミリア");
			values7.put("explanation", "サグラダ・ファミリアは、カタロニア・モダニズム建築の最も良く知られた作品例"
					+ "であり、カタロニアの建築家アントニ・ガウディの未完作品である。バルセロナ市のシンボルであるこ"
					+ "の建物は、綿密に構成された象徴詩的なシンボロジーと共に、パラボリックな（放物線状の）構造のア"
					+ "ーチや、鐘楼に据えられた自然主義と抽象主義の混在する彫刻などで、大胆な建築様式を誇っている。"
					+ "2004年の統計によれば、サグラダ・ファミリアはアルハンブラ宮殿やマドリッドのプラド美術館を抜い"
					+ "てスペインで最も観光客を集めたモニュメントとなり、2008年には270万人を集めた。生前のガウディ"
					+ "が実現できたのは地下聖堂と生誕のファサードなどであるが、これらは2005年にユネスコの世界遺産に"
					+ "登録された。 贖罪教会なので、作業の財政は喜捨に頼っている。そのために、別々の箇所を同時に建設"
					+ "することはできなかったのだが、1990年代以降は訪問者の流れと作品の世評の高まりが財政状況を好転"
					+ "させた。");
			values7.put("world_heritage_image_path", "@drawable/isan_europe1_sakurada");
			values7.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values7);

			ContentValues values8 = new ContentValues();
			values8.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values8.put("selection_one", "ケルン大聖堂");
			values8.put("selection_two", "アシャンティの建築物群");
			values8.put("selection_three", "エルビル城塞");
			values8.put("selection_four", "凱旋門");
			values8.put("answer", "ケルン大聖堂");
			values8.put("explanation", "現存の大聖堂は3代目で、初代が完成したのは4世紀のことであった。正方形の建物"
					+ "で、最も古い聖堂として知られていた。ナポレオン戦争の影響によりドイツでナショナリズムが高揚す"
					+ "る中、中世ドイツに自民族の伝統を探し求める動きが強まった。建築ではゴシック・リヴァイヴァルの"
					+ "潮流が強まり、建設途中であったケルン大聖堂に注目が集まったため、1842年に建設が再開され、もう"
					+ "ひとつの塔の完成が急がれた。全てが完成したのは建設開始から600年以上が経過した1880年のことで"
					+ "あり、高さが157mの大聖堂はアメリカのワシントン記念塔（高さ169m）が完成する1884年まで建築物と"
					+ "しては世界一の高さを誇った。「皇帝の鐘」と称される鐘が南塔にとりつけられたが、第一次世界大戦"
					+ "の際に接収され、溶かされたのちに武器として用いられた。");
			values8.put("world_heritage_image_path", "@drawable/isan_europe1_kreunn");
			values8.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values8);

			ContentValues values9 = new ContentValues();
			values9.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values9.put("selection_one", "アルタのロックアート");
			values9.put("selection_two", "ブルー・マウンテンズ");
			values9.put("selection_three", "グラン・プレの景観");
			values9.put("selection_four", "ビソトゥーン");
			values9.put("answer", "アルタのロックアート");
			values9.put("explanation", "アルタの岩絵は、紀元前4200年から500年頃までに狩猟・漁撈民によって描かれた岩"
					+ "面刻画および岩陰彫刻群で、花崗岩の岩盤の上に刻まれたものである。これまでにおよそ20 - 40cm大の"
					+ "ものが5000点以上発見された。 北欧およびロシア北部に見られる極北美術の出土例の1つとなっている。"
					+ "海岸線の隆起によって制作年代の古いものほど高い位置に、新しいものほど低い位置に描かれている。 "
					+ "モチーフとなっているのは、トナカイをはじめ、ヘラジカ、クマなど北極圏に生息する動物たちとそれを"
					+ "追って狩りをする人々、舟を出して魚を獲る人々などである。登録エリアのうち、最も大きなヒェメルフ"
					+ "ト／イープマルオクタ地区（50.09ha）にある岩絵はアルタ博物館で一般公開されている。冬季は降雪に"
					+ "より見ることができない。");
			values9.put("world_heritage_image_path", "@drawable/isan_europe1_aruta");
			values9.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values9);

			ContentValues values10 = new ContentValues();
			values10.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values10.put("selection_one", "ウェストミンスター宮殿");
			values10.put("selection_two", "チャコ文化");
			values10.put("selection_three", "セント・キルダ");
			values10.put("selection_four", "レブカ歴史的港町");
			values10.put("answer", "ウェストミンスター宮殿");
			values10.put("explanation", "ウェストミンスター宮殿（ウェストミンスターきゅうでん、英語：Palace of Westmin"
					+ "ster）は、イギリスのロンドン中心部、テムズ川河畔に存在する宮殿。現在は英国議会が議事堂として使"
					+ "用している。併設されている時計塔（ビッグ・ベン）と共にロンドンを代表する景色として挙げられる。"
					+ "所在地はロンドンのミルバンク。なお近隣のテムズハウスは保安局（MI5）の本部となっている。");
			values10.put("world_heritage_image_path", "@drawable/isan_europe1_wesutominnsuta");
			values10.put("area", "ヨーロッパ1");
			db.insert("quiz", null, values10);

			ContentValues values11 = new ContentValues();
			values11.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values11.put("selection_one", "ストーンヘンジ");
			values11.put("selection_two", "モンバサのジーザス要塞");
			values11.put("selection_three", "マルペロの動植物保護区");
			values11.put("selection_four", "スカン・グアイ");
			values11.put("answer", "ストーンヘンジ");
			values11.put("explanation", "ストーンヘンジ、エーヴベリーと関連する遺跡群は、イングランドのウィルトシャー"
					+ "にあるユネスコの世界遺産登録物件である。世界遺産登録対象となっているのは、特定の記念建造物では"
					+ "なくそれらが点在する二つの地域で、それぞれ「ストーンヘンジと関連する記念建造物群」と「エーヴベ"
					+ "リーと関連する記念建造物群」の名で登録されている。それらは互いに 30 km ほど離れている。ストーン"
					+ "ヘンジと関連する記念建造物群（Stonehenge and Associated Monuments, ID 373-001）は、ソールズベ"
					+ "リーの南ウィルトシャーに位置している先史時代の巨石建造物群である。登録面積は約 26 km² で、ス"
					+ "トーンヘンジを中心としている。建造年代は紀元前3000年頃から大きく三期に分けられているが、建造目"
					+ "的等は諸説あって確定していない。");
			values11.put("world_heritage_image_path", "@drawable/isan_europe2_sutonhenji");
			values11.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values11);

			ContentValues values12 = new ContentValues();
			values12.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values12.put("selection_one", "古都セントジョージ");
			values12.put("selection_two", "ローマ帝国の国境線");
			values12.put("selection_three", "タスマニア原生地域");
			values12.put("selection_four", "アッコ旧市街");
			values12.put("answer", "古都セントジョージ");
			values12.put("explanation", "セント・ジョージ （St. George's、公式にはTown of St. GeorgeまたはSt. Georg"
					+ "e's Town）は、バミューダ諸島のバミューダ島にある町。バミューダ諸島中最初に定住が進められた町"
					+ "であり、今日でもアメリカ大陸最古のイギリス植民地とされている。セント・ジョージに初めて定住が"
					+ "始まったのは、最初のイングランド人植民者がバミューダへやってきてから3年後の1612年だった。イン"
					+ "グランド人植民者たちはバージニア植民地（現在のアメリカ合衆国バージニア州）へ向かう途上、乗って"
					+ "いたシー・ヴェンチュア号が慎重に珊瑚礁内を進んで到達したセント・ジョージズ島へ降り立った。植民"
					+ "者たちはイングランド海軍提督ジョージ・ソマーズと陸軍大将トーマス・ゲイツ（バージニア植民地の町"
					+ "ジョージタウンの知事）に率いられた。生存者たちは新たに2隻の船をつくり、ほとんどの人々がジェーム"
					+ "ズタウンを目指して旅を続けたが、バージニア会社は島の所有を主張した。そのときにシー・ヴェンチュ"
					+ "ア号から残った3人の男性たちと、後から60人の新たな植民者集団が加わり、隣のセント・デイヴィッズ島"
					+ "での悲惨な時期の後、悪天候時には船を守っておける避難所となる入り江にセント・ジョージの建設"
					+ "を始めた。");
			values12.put("world_heritage_image_path", "@drawable/isan_europe2_sentjoji");
			values12.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values12);

			ContentValues values13 = new ContentValues();
			values13.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values13.put("selection_one", "コルドバ歴史地区");
			values13.put("selection_two", "パンタナル保全地域");
			values13.put("selection_three", "承徳の避暑山荘と外八廟");
			values13.put("selection_four", "ガンメルスタードの教会街 ");
			values13.put("answer", "コルドバ歴史地区");
			values13.put("explanation", "コルドバ歴史地区（コルドバれきしちく）は後ウマイヤ朝の都であったコルドバに"
					+ "ある世界遺産（文化遺産）地域。メスキータやローマ橋などの建造物とユダヤ人街が登録されている。"
					+ "後ウマイヤ朝時代、メスキータはモスクとして建てられ、市の中心であった。その後レコンキスタによ"
					+ "りキリスト勢力が失地を回復すると、メスキータの一部は壊され、キリスト教会に改築された。メスキ"
					+ "ータの窓などはイスラム装飾が残っている。ユダヤ人街の花の小径は有名。");
			values13.put("world_heritage_image_path", "@drawable/isan_europe2_korudoba");
			values13.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values13);

			ContentValues values14 = new ContentValues();
			values14.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values14.put("selection_one", "メテオラ");
			values14.put("selection_two", "コインブラ大学－アルタとソフィア");
			values14.put("selection_three", "インドの山岳鉄道群");
			values14.put("selection_four", "ヴェズレーの教会と丘");
			values14.put("answer", "メテオラ");
			values14.put("explanation", "メテオラ（Μετέωρα）は、ギリシア北西部、セサリア（テッサリア）地方北端"
					+ "の奇岩群とその上に建設された修道院共同体、いわゆるメテオラ修道院群の総称である。その地形及びギ"
					+ "リシア正教の修道院文化の価値からユネスコ世界遺産（文化・自然複合遺産）に指定されている。その名"
					+ "はギリシア語で「中空の」を意味する「メテオロス」（μετέωρος）という言葉に由来している。");
			values14.put("world_heritage_image_path", "@drawable/isan_europe2_meteora");
			values14.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values14);

			ContentValues values15 = new ContentValues();
			values15.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values15.put("selection_one", "ヘラクレスの塔");
			values15.put("selection_two", "ティヴォリのエステ家別荘");
			values15.put("selection_three", "カホキア墳丘群州立史跡");
			values15.put("selection_four", "イルリサット・アイスフィヨルド");
			values15.put("answer", "ヘラクレスの塔");
			values15.put("explanation", "ヘラクレスの塔（ヘラクレスのとう、ガリシア語・スペイン語共にTorre de Hérc"
					+ "ules）またはエルクレスの塔（エルクレスのとう）は、スペイン・ガリシア州のア・コルーニャ県の県"
					+ "都ア・コルーニャの中心部から2.4キロメートル離れた半島に建つローマ建築の灯台である。海抜57メ"
					+ "ートルの丘に建つこの塔は55メートルの高さがあり、スペインにおいてチピオーナ灯台（スペイン語版）"
					+ " (62m) についで高い灯台である。灯台からは北大西洋を一望することができる。20世紀まではブリガン"
					+ "ティウムの塔 (Farum Brigantium) の名で知られていた。1791年に改築工事が施されたものの、ローマ時"
					+ "代に建築されてから既に約1,900年が経過しているにも関わらず、ヘラクレスの塔は21世紀になった今も"
					+ "なお現役の灯台として利用されている。2009年6月27日、UNESCOの世界遺産に登録された。");
			values15.put("world_heritage_image_path", "@drawable/isan_europe2_herakuresu");
			values15.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values15);

			ContentValues values16 = new ContentValues();
			values16.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values16.put("selection_one", "モン・サン＝ミシェル");
			values16.put("selection_two", "ブリッゲン");
			values16.put("selection_three", "イビサ、生物多様性と文化");
			values16.put("selection_four", "東デヴォン海岸");
			values16.put("answer", "モン・サン＝ミシェル");
			values16.put("explanation", "モン・サン＝ミシェル（Mont Saint-Michel）は、フランス西海岸、サン・マロ湾上"
					+ "に浮かぶ小島であり、同名の修道院がある。モン・サン=ミシェルは「聖ミカエルの山」の意で、旧約聖"
					+ "書にその名が記される大天使・ミカエルのフランス語読みに由来する。行政上はル・モン＝サン＝ミシェ"
					+ "ルというコミューンを形成する。カトリックの巡礼地のひとつであり「西洋の驚異」と称され、1979年"
					+ "「モン・サン＝ミシェルとその湾」としてユネスコの世界遺産（文化遺産）に登録され、1994年10月に"
					+ "はラムサール条約登録地となった。");
			values16.put("world_heritage_image_path", "@drawable/isan_europe2_monsanmisyru");
			values16.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values16);

			ContentValues values17 = new ContentValues();
			values17.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values17.put("selection_one", "ポンペイ");
			values17.put("selection_two", "セビージャの大聖堂");
			values17.put("selection_three", "リヨン歴史地区");
			values17.put("selection_four", "スルツエイ");
			values17.put("answer", "ポンペイ");
			values17.put("explanation", "ポンペイ（ラテン語: Pompeii、イタリア語: Pompei）は、イタリア・ナポリ近郊に"
					+ "あった古代都市。79年のヴェスヴィオ火山噴火による火砕流によって地中に埋もれたことで知られ、その"
					+ "遺跡は「ポンペイ、ヘルクラネウム及びトッレ・アンヌンツィアータの遺跡地域」の主要部分として、ユ"
					+ "ネスコの世界遺産に登録されている。ローマ人の余暇地として繁栄したポンペイの最盛期の人口は約2万"
					+ "人といわれる。18世紀に発掘が開始され、現在は主要な部分が有料で一般公開されている。この遺跡は、"
					+ "カンパニア州ナポリ県所属の基礎自治体（コムーネ）・ポンペイの市域に所在するが、現在のポンペイ市"
					+ "街は19世紀末に建設されたもので、その中心部は古代ローマ時代のポンペイとは少し離れている。なお、"
					+ "イタリア語での発音は e にアクセントがあるため、「ポンペーイ」に近い。古典ラテン語ではeと最後の"
					+ "iが長母音なので、「ポンペーイイー」である。");
			values17.put("world_heritage_image_path", "@drawable/isan_europe2_ponpei");
			values17.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values17);

			ContentValues values18 = new ContentValues();
			values18.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values18.put("selection_one", "アマルフィ海岸");
			values18.put("selection_two", "プリトヴィッチェ湖群国立公園");
			values18.put("selection_three", "ワッデン海");
			values18.put("selection_four", "ヘッド-スマッシュト-イン・バッファロー・ジャンプ");
			values18.put("answer", "アマルフィ海岸");
			values18.put("explanation", "アマルフィ海岸（イタリア語: Costiera Amalfitana）は、イタリア南部のソレント"
					+ "半島南岸、アマルフィ一帯（カンパニア州サレルノ県北西部）のサレルノ湾に面した海岸を指す名称。"
					+ "「世界一美しい海岸」と云われる景勝地・避寒地で、1997年にユネスコの世界遺産（文化遺産）に登録"
					+ "された。ヘラクレスが愛したニュンペーの名に由来した地名で「ヘラクレスはそのニュンペーと仲睦まじ"
					+ "く暮らしていたが、ある日突然、彼女が死んでしまう。それを嘆いたヘラクレスはこの世でもっとも美し"
					+ "い土地に彼女を葬り、街を切り開いて彼女の名を付けた」とされる。");
			values18.put("world_heritage_image_path", "@drawable/isan_europe2_amarufi");
			values18.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values18);

			ContentValues values19 = new ContentValues();
			values19.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values19.put("selection_one", "ラポニアン・エリア");
			values19.put("selection_two", "高句麗古墳群");
			values19.put("selection_three", "峨眉山と楽山大仏");
			values19.put("selection_four", "サン・クリストバル・デ・ラ・ラグナ");
			values19.put("answer", "ラポニアン・エリア");
			values19.put("explanation", "大自然とサーメ文化が共存する複合遺産ヨックモックとイェリヴァーレ付近にある"
					+ "ラポニアエリアは、約5000年前から暮らすアジア系少数民族、サーメ人の集落が文化遺産として、壮大な"
					+ "自然環境が自然遺産として評価され、大自然とサーメ文化が共存する複合遺産として世界遺産に登録され"
					+ "た。またラポニアン・エリアは『白夜の聖地』とも言われ有名なオーロラスポット。世界遺産でオーロ"
					+ "ラが見られるなんて是非とも行ってみたい場所の一つだ。アクセスはキルナからバスや車で向かう。キ"
					+ "ルナへはストックフォルムから国内線が出ている。キルーナから約17km東のユッカスヤルヴィ村にはあ"
					+ "の有名なアイスホテルもある。");
			values19.put("world_heritage_image_path", "@drawable/isan_europe2_raponiann");
			values19.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values19);

			ContentValues values20 = new ContentValues();
			values20.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values20.put("selection_one", "バチカン市国");
			values20.put("selection_two", "オカピ野生生物保護区");
			values20.put("selection_three", "頤和園、北京の皇帝の庭園");
			values20.put("selection_four", "Ir.D.F.ヴァウダヘマール");
			values20.put("answer", "バチカン市国");
			values20.put("explanation", "バチカン市国（バチカンしこく、英: Vatican City、仏: Cité du Vatican）は、ユ"
					+ "ネスコの世界遺産のひとつ。イタリア・ローマにある世界最小の国家バチカンの国土全域が世界遺産とし"
					+ "て登録されている。この項目では世界遺産としてのバチカン市国を解説する。国家そのものについては"
					+ "「バチカン」を参照のこと。バチカンはテベレ川の西側に位置し、カトリックの総本山として知られる。"
					+ "前述のとおり、バチカン全域が世界遺産として登録されている。また、イタリアの世界遺産物件であるロ"
					+ "ーマ歴史地区、教皇領とサン・パオロ・フオーリ・レ・ムーラ大聖堂と隣接している。");
			values20.put("world_heritage_image_path", "@drawable/isan_europe2_batikann");
			values20.put("area", "ヨーロッパ2");
			db.insert("quiz", null, values20);

			ContentValues values21 = new ContentValues();
			values21.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values21.put("selection_one", "タージ・マハル");
			values21.put("selection_two", "クックの初期農耕遺跡");
			values21.put("selection_three", "バリ州の文化的景観");
			values21.put("selection_four", "アイアンブリッジ峡谷");
			values21.put("answer", "タージ・マハル");
			values21.put("explanation", "タージ・マハル（ヒンディー語: ताज महल, ウルドゥー語: تاج محل‎, 英語: Taj Mahal）"
					+ "は、インド北部アーグラにある、ムガル帝国第5代皇帝シャー・ジャハーンが、1631年に死去した愛妃ム"
					+ "ムターズ・マハルのため建設した総大理石の墓廟。インド・イスラーム文化の代表的建築である。");
			values21.put("world_heritage_image_path", "@drawable/isan_azia_tajimaharu");
			values21.put("area", "アジア・中東");
			db.insert("quiz", null, values21);

			ContentValues values22 = new ContentValues();
			values22.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values22.put("selection_one", "イスタンブルの歴史地区");
			values22.put("selection_two", "ゴフ島及びインアクセシブル島");
			values22.put("selection_three", "ドニャーナ国立公園");
			values22.put("selection_four", "カールズバッド洞窟群国立公園");
			values22.put("answer", "イスタンブルの歴史地区");
			values22.put("explanation", "イスタンブルの歴史地区は、トルコ最大の都市イスタンブルの旧市街にある歴史的"
					+ "建造物群に設定されたユネスコの世界遺産リスト登録物件（文化遺産）。日本では「イスタンブール"
					+ "（の）歴史地区」、「イスタンブール歴史地域」などとも表記される。");
			values22.put("world_heritage_image_path", "@drawable/isan_azia_isutanpuru");
			values22.put("area", "アジア・中東");
			db.insert("quiz", null, values22);

			ContentValues values23 = new ContentValues();
			values23.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values23.put("selection_one", "アンコール遺跡 ");
			values23.put("selection_two", "龍門石窟");
			values23.put("selection_three", "ゴンバデ・カーブース");
			values23.put("selection_four", "オロモウツの聖三位一体柱");
			values23.put("answer", "アンコール遺跡");
			values23.put("explanation", "アンコール遺跡群は現在のカンボジア王国の淵源となったクメール王朝の首都の"
					+ "跡である。この地には、9世紀頃から数々の王建設が開始された。この遺跡に特に大きく関わったとさ"
					+ "れるのはスーリヤヴァルマン2世（1113-1145年）とジャヤーヴァルマン7世（1181-1218年）といわれ"
					+ "る。スーリヤヴァルマン2世は特にアンコール・ワットの建設を行い、その死後30年ほど後に王に就い"
					+ "たとされるジャヤーヴァルマン7世はアンコール・トムの大部分を築いたとされる。しかし、ジャヤー"
					+ "ヴァルマン7世が崩御した後のアンコールはアユタヤ朝の進入を度々受けその存在を侵され始め、その"
					+ "後ポニャー・ヤット王にはついにアンコールを放棄するに至った。");
			values23.put("world_heritage_image_path", "@drawable/isan_azia_ankoru");
			values23.put("area", "アジア・中東");
			db.insert("quiz", null, values23);

			ContentValues values24 = new ContentValues();
			values24.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values24.put("selection_one", "万里の長城");
			values24.put("selection_two", "カパック・ニャン　アンデスの道");
			values24.put("selection_three", "紀伊山地の霊場と参詣道");
			values24.put("selection_four", "エルチェの椰子園");
			values24.put("answer", "万里の長城");
			values24.put("explanation", "万里の長城（ばんりのちょうじょう、中国語: 万里长城 ワンリーツァンツェン"
					+ " Wàn lǐ Chángchéng）は、中華人民共和国に存在する城壁の遺跡である。ユネスコの世界遺産（文"
					+ "化遺産）に登録されており、新・世界七不思議にも選ばれている。2009年4月18日の中華人民共和国"
					+ "国家文物局の発表により東端の遼寧省虎山から西端の甘粛省嘉峪関まで総延長は8,851.8kmとされて"
					+ "いたが、2012年6月5日に総延長は従来の2倍以上の21,196.18kmと発表された。ただし現存する人工壁"
					+ "の延長は6,259.6kmであり、また、全長にわたって同じ規格作られているわけではなく、場所によっ"
					+ "て高さや幅や材料などが異なっている。英語をはじめとする漢字文化圏以外の言語では、「（中国"
					+ "の）大きな壁」を意味する訳が充てられている。");
			values24.put("world_heritage_image_path", "@drawable/isan_azia_banrinotyojo");
			values24.put("area", "アジア・中東");
			db.insert("quiz", null, values24);

			ContentValues values25 = new ContentValues();
			values25.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values25.put("selection_one", "富士山");
			values25.put("selection_two", "カマグェイの歴史地区");
			values25.put("selection_three", "ロンバルディアのサクリ・モンティ");
			values25.put("selection_four", "スタリ・ラスとソポチャニ");
			values25.put("answer", "富士山");
			values25.put("explanation", "富士山（ふじさん、英語表記：Mount Fuji）は静岡県（富士宮市、裾野市、富士"
					+ "市、御殿場市、駿東郡小山町）と、山梨県（富士吉田市、南都留郡鳴沢村）に跨る活火山である。標"
					+ "高3,776 m、日本最高峰（剣ヶ峰）の独立峰で、その優美な風貌は日本国外でも日本の象徴として広く"
					+ "知られている。数多くの芸術作品の題材とされ、芸術面でも大きな影響を与えた。懸垂曲線の山容を"
					+ "有した玄武岩質成層火山で構成され、その山体は駿河湾の海岸まで及ぶ。");
			values25.put("world_heritage_image_path", "@drawable/isan_azia_fujisan");
			values25.put("area", "アジア・中東");
			db.insert("quiz", null, values25);

			ContentValues values26 = new ContentValues();
			values26.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values26.put("selection_one", "モヘンジョダロ");
			values26.put("selection_two", "グレーター・ブルー・マウンテンズ地域");
			values26.put("selection_three", "ジャイアンツ・コーズウェー");
			values26.put("selection_four", "ラヴォー地区の葡萄畑");
			values26.put("answer", "モヘンジョダロ");
			values26.put("explanation", "モヘンジョ＝ダロ（ウルドゥー語：موئن جو دڑو、シンド語：موئن جو دڙو、英語: Moenjo"
					+ "daro, Mohenjo-daro）は、インダス文明最大級の都市遺跡。紀元前2500年から紀元前1800年にかけ繁"
					+ "栄し、最大で4万人近くが居住していたと推測される。しかしその後短期間で衰退した。原因としてさ"
					+ "まざまな説があげられたが、近年の研究では大規模な洪水で衰退したと考えられている。");
			values26.put("world_heritage_image_path", "@drawable/isan_azia_mohenjodaro");
			values26.put("area", "アジア・中東");
			db.insert("quiz", null, values26);

			ContentValues values27 = new ContentValues();
			values27.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values27.put("selection_one", "原爆ドーム");
			values27.put("selection_two", "ドロットニングホルムの王領地");
			values27.put("selection_three", "ブルノのツゲンドハット邸");
			values27.put("selection_four", "開平の望楼群と村落");
			values27.put("answer", "原爆ドーム");
			values27.put("explanation", "原爆ドーム（げんばくドーム、英: Atomic Bomb Dome）の名で知られる広島平和記"
					+ "念碑（ひろしまへいわきねんひ、英: Hiroshima Peace Memorial）は、日本の広島市に投下された原子"
					+ "爆弾の惨禍を今に伝える記念碑（被爆建造物）である。元は広島県物産陳列館として開館し、原爆投下"
					+ "当時は広島県産業奨励館と呼ばれていた。ユネスコの世界遺産（文化遺産）に登録されており、「二度"
					+ "と同じような悲劇が起こらないように」との戒めや願いをこめて、特に負の世界遺産と呼ばれている。");
			values27.put("world_heritage_image_path", "@drawable/isan_azia_genbakudomu");
			values27.put("area", "アジア・中東");
			db.insert("quiz", null, values27);

			ContentValues values28 = new ContentValues();
			values28.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values28.put("selection_one", "秦始皇帝陵及び兵馬俑坑");
			values28.put("selection_two", "タリン歴史地区（旧市街）");
			values28.put("selection_three", "バルデヨフ市街保護区");
			values28.put("selection_four", "イルリサット・アイスフィヨルド");
			values28.put("answer", "秦始皇帝陵及び兵馬俑坑");
			values28.put("explanation", "秦の始皇帝は中国史初の皇帝であったが、その強大な力を利用し大きな陵墓を建"
					+ "てた（人形を作り埋葬したのは二代皇帝胡亥という説もある）。これが秦始皇帝陵である。1974年に"
					+ "地元の住民により発見された。また兵馬俑坑は、この陵を取り巻くように配置されており、その規模"
					+ "は2万m2余におよぶ、きわめて大きなもので、3つの俑坑には戦車が100余台、陶馬が600体、武士俑は"
					+ "成人男性の等身大で8000体ちかくあり、みな東を向いている。");
			values28.put("world_heritage_image_path", "@drawable/isan_azia_sikouryou");
			values28.put("area", "アジア・中東");
			db.insert("quiz", null, values28);

			ContentValues values29 = new ContentValues();
			values29.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values29.put("selection_one", "ボロブドゥール寺院遺跡群");
			values29.put("selection_two", "独立記念館");
			values29.put("selection_three", "ランス・オ・メドー国定史跡");
			values29.put("selection_four", "カジュラーホの建造物群");
			values29.put("answer", "ボロブドゥール寺院遺跡群");
			values29.put("explanation", "ボロブドゥール遺跡は、中部ジャワの中心都市ジョグジャカルタの北西約42kmに"
					+ "所在し、巨大なムラピ火山に囲まれた平原の中央に立地する。遺跡総面積はおよそ1.5万m2。高さはも"
					+ "ともと42mあったが、現在は破損して33.5mになっている。シャイレーンドラ朝の時代、大乗仏教を奉"
					+ "じていたシャイレーンドラ王家によって、ダルマトゥンガ王治下の780年頃から建造が開始され、792"
					+ "年頃に一応の完成をみたと考えられるが、サマラトゥンガ王（位812年～832年）のときに増築されて"
					+ "いる。");
			values29.put("world_heritage_image_path", "@drawable/isan_azia_borobuduru");
			values29.put("area", "アジア・中東");
			db.insert("quiz", null, values29);

			ContentValues values30 = new ContentValues();
			values30.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values30.put("selection_one", "古代都市ダマスカス");
			values30.put("selection_two", "バース市街");
			values30.put("selection_three", "アルビ司教都市");
			values30.put("selection_four", "ルクセンブルク市");
			values30.put("answer", "古代都市ダマスカス");
			values30.put("explanation", "エジプト、メソポタミア、地中海地域を結ぶ交通の要衝の地として、紀元前3000"
					+ "年ごろから形成された都市。中東でも最古の都市の1つである。バラダ川の南側にあるダマスカス旧市"
					+ "街(Old Damascus)は、城壁に囲まれた歴史のある地域である。この城壁は、1世紀頃、ローマが最初に"
					+ "建設したと言われている。2004年現在残っているものは、13世紀から14世紀にかけて、十字軍やモン"
					+ "ゴル帝国の侵略を防ぐために、アラブ人が建築したものである。城壁には、7つの門が残っている。旧"
					+ "市街地は、狭い入り組んだ道になっているが、東西に走る真っ直ぐな道(Straight Street)は、新約聖"
					+ "書にも登場している。世界最古のモスクといわれる、ウマイヤド・モスクも旧市街地にある。");
			values30.put("world_heritage_image_path", "@drawable/isan_azia_damasukusu");
			values30.put("area", "アジア・中東");
			db.insert("quiz", null, values30);

			ContentValues values31 = new ContentValues();
			values31.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values31.put("selection_one", "シドニー・オペラハウス");
			values31.put("selection_two", "シュケリッグ・ヴィヒル");
			values31.put("selection_three", "アラゴン州のムデハル様式建造物");
			values31.put("selection_four", "ゴンバデ・カーブース");
			values31.put("answer", "シドニー・オペラハウス");
			values31.put("explanation", "シドニー・オペラハウス（Sydney Opera House）は、オーストラリア・シドニー"
					+ "にある20世紀を代表する近代建築物であり、世界的に有名な歌劇場・コンサートホール・劇場でもあ"
					+ "る。オペラ・オーストラリア、シドニー・シアター・カンパニー、シドニー交響楽団の本拠地になっ"
					+ "ている。設計者は計画決定当時無名だった建築家ヨーン・ウツソンであるが、独創的な形状と構造設"
					+ "計の困難さなどにより工事は大幅に遅れ、1959年に着工したものの竣工は1973年だった。大幅な工期"
					+ "と予算の超過にもかかわらず、完成後はシドニーのみならずオーストラリアのシンボルとしても親し"
					+ "まれ、また世界で最も建造年代が新しい世界遺産にもなる。");
			values31.put("world_heritage_image_path", "@drawable/isan_oceania_operahausu");
			values31.put("area", "オセアニア");
			db.insert("quiz", null, values31);

			ContentValues values32 = new ContentValues();
			values32.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values32.put("selection_one", "グレートバリアリーフ");
			values32.put("selection_two", "スンダルバンス国立公園");
			values32.put("selection_three", "聖地キャンディ");
			values32.put("selection_four", "河南登封の文化財“天地之中”");
			values32.put("answer", "グレートバリアリーフ");
			values32.put("explanation", "グレート・バリア・リーフ（英: Great Barrier Reef）は、オーストラリア北東岸"
					+ "に広がる世界最大のサンゴ礁地帯。漢字表記は大堡礁（だいほしょう）。南緯10度から24度にかけて広"
					+ "がり、2600km（1,600マイル）を超える長さに2,900以上の暗礁群と約900の島を持ち、総面積は344,400"
					+ "km2以上となる。地理的な位置は、クイーンズランド州沿岸の珊瑚海に存在する。グレート・バリア・リ"
					+ "ーフは宇宙空間からも確認できるほど広大であり、生物が作り出した単一の構造物としては世界最大で"
					+ "ある。しかし、その生物とは微小なサンゴやポリプ等の有機体であり、これらが数十億集まって形成し"
					+ "ているサンゴ礁。そして、この暗礁は生物多様性を支える重要な役目を持ち、1981年に世界遺産（自然"
					+ "遺産）に登録された。");
			values32.put("world_heritage_image_path", "@drawable/isan_oceania_guretobariarifu");
			values32.put("area", "オセアニア");
			db.insert("quiz", null, values32);

			ContentValues values33 = new ContentValues();
			values33.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values33.put("selection_one", "ウルル＝カタ・ジュタ国立公園");
			values33.put("selection_two", "四川ジャイアントパンダ保護区群");
			values33.put("selection_three", "タッシリ・ナジェール");
			values33.put("selection_four", "ベルリンの近代集合住宅群");
			values33.put("answer", "ウルル＝カタ・ジュタ国立公園");
			values33.put("explanation", "地球のへそと呼ばれるウルル（エアーズロック）と、同じく岩石の山であるカタ・"
					+ "ジュタ（オルガ山）を有し壮大な景観を有する。またアボリジニの重要な聖地の一つでもあり、古来か"
					+ "らのアボリジニの痕跡を随所に残す文化的な場所でもある。公園はアナングと呼ばれるアボリジニの民"
					+ "族集団による所有地である。国立公園へは、３日間有効の入園券（パークチケット）を＄２５（オース"
					+ "トラリアドル）で購入することが必要である。セイキインコ、コシアカショウビン、チャイロハヤブサ"
					+ "など160種類の鳥類やトゲトカゲ、トゲホップマウスが生息する。植物は「逆さま植物」という意味でマ"
					+ "メ科のアップサイドダウンスプラウト、マツバボタンの一種のパラキーヤ、ヨーロツパから伝わりレン"
					+ "ジャーの駆除対象となっているイヌナスビが自生する。");
			values33.put("world_heritage_image_path", "@drawable/isan_oceania_eazurokku");
			values33.put("area", "オセアニア");
			db.insert("quiz", null, values33);

			ContentValues values34 = new ContentValues();
			values34.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values34.put("selection_one", "王立展示館とカールトン庭園");
			values34.put("selection_two", "ヴェルラ砕木・板紙工場");
			values34.put("selection_three", "エトナ山");
			values34.put("selection_four", "キロキティア");
			values34.put("answer", "王立展示館とカールトン庭園");
			values34.put("explanation", "世界遺産に登録された王立展示館は1880年、メルボルン博覧会で使用されるために"
					+ "建てられた建築物で、オーストラリアで最初の大陸ヨーロッパ風建築物と言われる。ゴシック様式やロ"
					+ "マネスク様式など数種の様式が混ざり合った独特の建物である。カールトン庭園は園芸が盛んといわれ"
					+ "るオーストラリア有数の庭園の一つである。");
			values34.put("world_heritage_image_path", "@drawable/isan_oceania_karuton");
			values34.put("area", "オセアニア");
			db.insert("quiz", null, values34);

			ContentValues values35 = new ContentValues();
			values35.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values35.put("selection_one", "カカドゥ国立公園");
			values35.put("selection_two", "ネムルット・ダー");
			values35.put("selection_three", "スヴェシュタリのトラキア人の墳墓");
			values35.put("selection_four", "パサルガダエ");
			values35.put("answer", "カカドゥ国立公園");
			values35.put("explanation", "カカドゥ国立公園（Kakadu National Park）はノーザンテリトリーにあるオースト"
					+ "ラリアの国立公園の一つ。ユネスコの世界遺産（複合遺産）に登録されている。40万年以上前から人が"
					+ "住んだ形跡があり、洞窟壁画が残されている、文化的意義と固有の動物や、氾濫原などを有する環境的"
					+ "意義両方を有する国立公園である。この公園の名前になっているカカドゥの名前はガグジュと呼ばれる"
					+ "アボリジニの方言の一つである。現在ではこの方言を話す民族集団は消滅したが、この民族集団の子孫"
					+ "は現在でもカカドゥに住んでいる。公園内の気候は、大きく分けて雨期と乾期の二つに分かれる。雨期"
					+ "（10月 - 4月）は観光が不可能になるが、乾期（5月 - 9月）には可能になる。また特に先住民である"
					+ "ビニンジ、ムングイと呼ばれるアボリジニはこの公園における季節を以下の6つに分けている。");
			values35.put("world_heritage_image_path", "@drawable/isan_oceania_kakadu");
			values35.put("area", "オセアニア");
			db.insert("quiz", null, values35);

			ContentValues values36 = new ContentValues();
			values36.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values36.put("selection_one", "ビキニ環礁核実験場");
			values36.put("selection_two", "コナーラクの太陽神寺院");
			values36.put("selection_three", "ロード・ハウ諸島");
			values36.put("selection_four", "自由の女神像");
			values36.put("answer", "ビキニ環礁核実験場");
			values36.put("explanation", "ビキニ環礁（ビキニかんしょう、Bikini Atoll）は、マーシャル諸島共和国に属す"
					+ "る環礁。23の島嶼からなり、礁湖の面積は594.1平方キロメートル。1946年から1958年にかけて、太平洋"
					+ "核実験場の一つとしてアメリカ合衆国が23回の核実験を行った。2010年、第34回世界遺産委員会におい"
					+ "て、ユネスコの世界遺産リスト（文化遺産）に登録された。マーシャル諸島共和国初の世界遺産となっ"
					+ "た。");
			values36.put("world_heritage_image_path", "@drawable/isan_oceania_bikini");
			values36.put("area", "オセアニア");
			db.insert("quiz", null, values36);

			ContentValues values37 = new ContentValues();
			values37.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values37.put("selection_one", "首長ロイ・マタの地");
			values37.put("selection_two", "ヘッド-スマッシュト-イン・バッファロー・ジャンプ");
			values37.put("selection_three", "ディキスのコロンブス期首長制集落群");
			values37.put("selection_four", "スイスのサルドーナ地殻変動地帯");
			values37.put("answer", "首長ロイ・マタの地");
			values37.put("explanation", "ロイ・マタ首長の領地は、バヌアツにある世界遺産登録物件である。バヌアツの口"
					+ "承物語で語り継がれてきた伝説的な首長であるロイ・マタの領地だった場所のうち、特にその生涯にゆ"
					+ "かりのある象徴的な場所、つまり邸宅、死んだ場所、墓の3箇所が対象となっている。これらは首都ポー"
					+ "トビラのあるエファテ島と、その北東に浮かぶ2つの小島（レレパ島、エレトカ島）に散在している。");
			values37.put("world_heritage_image_path", "@drawable/isan_oceania_roimata");
			values37.put("area", "オセアニア");
			db.insert("quiz", null, values37);

			ContentValues values38 = new ContentValues();
			values38.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values38.put("selection_one", "テ・ワヒポウナム");
			values20.put("selection_two", "ルーゴのローマの城壁群");
			values38.put("selection_three", "アミアン大聖堂");
			values38.put("selection_four", "サンタ・クルーズ・デ・モンポスの歴史地区");
			values38.put("answer", "テ・ワヒポウナム");
			values38.put("explanation", "テ・ワヒポウナムは、マオリ語で「グリーンストーン（翡翠）の産地」を意味する名"
					+ "称である。公園内にはクック山など大きな山が広がり、いわゆるサザン・アルプス山脈を形成。壮大な光"
					+ "景が広がる。また海岸部には1万4千年前の氷河期に形成されたフィヨルド、ミルフォード・サウンドがあ"
					+ "る。その自然は非常に厳しく、テ・ワヒポウナムへの調査は1960年代にようやく始まった。氷河期からほ"
					+ "とんど変化を見せていない固有の種や、肉食のカタツムリなど非常に興味深い側面を持つ自然地帯でもあ"
					+ "る。");
			values38.put("world_heritage_image_path", "@drawable/isan_oceania_tewahipounamu");
			values38.put("area", "オセアニア");
			db.insert("quiz", null, values38);

			ContentValues values39 = new ContentValues();
			values39.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values39.put("selection_one", "フェニックス諸島保護地域");
			values39.put("selection_two", "パラマリボ市街歴史地区");
			values39.put("selection_three", "韓国の歴史的集落群：河回と良洞");
			values39.put("selection_four", "グヌン・ムル国立公園");
			values39.put("answer", "フェニックス諸島保護地域");
			values39.put("explanation", "2010年に登録された世界遺産（自然遺産）。中部太平洋の小さな国キリバスにある"
					+ "世界最大の海洋保護区。フェニックス諸島は同国の3つの諸島の一つで、保護区の面積は40万8250km2。"
					+ "死火山と推定される14の海山(かいざん)を含め、自然のままの生態系が残されており、約200種の珊瑚、"
					+ "500種の魚類、18種の海洋哺乳類、44種の鳥類などの生息が認められている。キリバス初の世界遺産。");
			values39.put("world_heritage_image_path", "@drawable/isan_oceania_fenikkusu");
			values39.put("area", "オセアニア");
			db.insert("quiz", null, values39);

			ContentValues values40 = new ContentValues();
			values40.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values40.put("selection_one", "クイーンズランドの湿潤熱帯地域");
			values40.put("selection_two", "九寨溝の渓谷の景観と歴史地域");
			values40.put("selection_three", "オヴス・ヌール盆地");
			values40.put("selection_four", "ラヴォー地区の葡萄畑");
			values40.put("answer", "クイーンズランドの湿潤熱帯地域");
			values40.put("explanation", "クイーンズランドの湿潤熱帯地域（しつじゅんねったいちいき）はオーストラリア"
					+ "のクイーンズランド州にあるユネスコの世界遺産（自然遺産）に登録された地帯。クイーンズランドの"
					+ "湿潤熱帯地域は、グレート・バリア・リーフに沿うように存在する熱帯雨林地帯で、南北に長い。その"
					+ "範囲は700以上の私有地を含めた国立公園や保護区からなり、多数の動物を抱える。中には絶滅の危機に"
					+ "瀕した種も存在する。");
			values40.put("world_heritage_image_path", "@drawable/isan_oceania_kuinzurando");
			values40.put("area", "オセアニア");
			db.insert("quiz", null, values40);

			ContentValues values41 = new ContentValues();
			values41.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values41.put("selection_one", "アブ・シンベル神殿");
			values41.put("selection_two", "古代都市「タウリカのヘルソネソス」");
			values41.put("selection_three", "エンゲルスベリの製鉄所");
			values41.put("selection_four", "カジランガ国立公園");
			values41.put("answer", "アブ・シンベル神殿");
			values41.put("explanation", "オリジナルは、砂岩でできた岩山を掘り進める形で作られた岩窟神殿。大神殿と小"
					+ "神殿からなる。建造主は新王国時代第19王朝の王、ラムセス2世。大神殿は太陽神ラーを、小神殿はハト"
					+ "ホル女神を祭神としている（小神殿は最愛の王妃ネフェルタリのために建造されたものでもある）。建"
					+ "設後、長い年月の内に砂に埋もれていたが、1813年にスイスの東洋学者ヨハン・ルートヴィヒ・ブルク"
					+ "ハルトによって小壁の一部が発見され、1817年にブルクハルトの知人であったイタリア人探検家ジョヴ"
					+ "ァンニ・バッティスタ・ベルツォーニによって出入り口が発掘された。");
			values41.put("world_heritage_image_path", "@drawable/isan_afurika_abusinberu");
			values41.put("area", "アフリカ");
			db.insert("quiz", null, values41);

			ContentValues values42 = new ContentValues();
			values42.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values42.put("selection_one", "ヴィクトリアの滝");
			values42.put("selection_two", "ビルカとホーヴゴーデン");
			values42.put("selection_three", "イスファハンのイマーム広場");
			values42.put("selection_four", "五台山");
			values42.put("answer", "ヴィクトリアの滝");
			values42.put("explanation", "かつて地元のバントゥー系民族はこの滝を Shungu na mutitima と呼んでおり、"
					+ "その後この地にやって来たマタベレ族 (Matabele) は aManz' aThunqayo と呼んだ。バツワナ人 (Bat"
					+ "swana) とマコロロ人 (Makololo) は「雷鳴の轟く水煙」という意味の「Mosi-oa-Tunya 」と呼んでい"
					+ "た。 ヨーロッパ人としてはイギリスの宣教師であり探検家でもあるデイヴィッド・リヴィングストン"
					+ "が1855年に見たのが最初だったと信じられている。そこでイギリス人は当時のイギリス女王の名 Vict"
					+ "oriaを冠して「Victoria Falls」と呼ぶことを行いはじめた。");
			values42.put("world_heritage_image_path", "@drawable/isan_afurika_vikutoria");
			values42.put("area", "アフリカ");
			db.insert("quiz", null, values42);

			ContentValues values43 = new ContentValues();
			values43.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values43.put("selection_one", "モザンビーク島");
			values43.put("selection_two", "オーバーハルツ水利管理システム");
			values43.put("selection_three", "ヴィルヘルムスヘ－エ城公園");
			values43.put("selection_four", "ダンブッラの黄金寺院");
			values43.put("answer", "モザンビーク島");
			values43.put("explanation", "1498年にヴァスコ・ダ・ガマが到達するよりもずっと前から、ここはアラブ人の港"
					+ "であり、造船所でもあった。1507年にはポルトガルが港と海軍拠点を建造し、1522年にはノサ・セニョ"
					+ "ラ・デ・バルアルテ礼拝堂が建てられた。この礼拝堂は、南半球における現存最古のヨーロッパ建築と"
					+ "見なされている。16世紀にサン・セバスティアン要塞が建造され、次いで建てられたポルトガルの植民"
					+ "都市モザンビークは、ポルトガル領東アフリカの首都となった。同時に、この島はキリスト教の重要な"
					+ "伝道拠点にもなった。1586年末に天正遣欧少年使節一行が日本への帰途天候待ちのため滞在した。1607"
					+ "年と1608年にはオランダの侵攻にも耐え、インド航路におけるポルトガルの重要な拠点としての地位を"
					+ "保持し続け、黒人奴隷、香辛料、金などの交易が行われていた。");
			values43.put("world_heritage_image_path", "@drawable/isan_afurika_mozanbiku");
			values43.put("area", "アフリカ");
			db.insert("quiz", null, values43);

			ContentValues values44 = new ContentValues();
			values44.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values44.put("selection_one", "キリマンジャロ国立公園");
			values44.put("selection_two", "西ノルウェーフィヨルド群");
			values44.put("selection_three", "ホンジャ・アフメッド・ヤサウイ廟");
			values44.put("selection_four", "白神山地");
			values44.put("answer", "キリマンジャロ国立公園");
			values44.put("explanation", "キリマンジャロは、標高5,895mでアフリカ最高峰。また南米のコトパクシ山に並"
					+ "ぶ標高を持つ世界最高峰級の火山でもある。キリマンジャロの頂上には、氷河が形成されている。こ"
					+ "の氷河から供給される水で出来た高山湿地帯を始め、標高別に、砂漠、高山湿地帯、高地草原、草原"
					+ "、熱帯雨林と広がっている。キリマンジャロ山とその周囲の森林は、ドイツ植民地時代の20世紀初頭"
					+ "から保護対象となっていた。192年に、法的な保護対象となり、タンザニア独立後の1973年、山域の一"
					+ "部75,575haが国立公園として指定された。1987年に世界遺産に登録され、自然保護が活発的に行われ"
					+ "ている。一方、キリマンジャロ周囲の乾燥化に伴い、山頂の氷河の縮小が懸念されている。");
			values44.put("world_heritage_image_path", "@drawable/isan_afurika_kirimanjaro");
			values44.put("area", "アフリカ");
			db.insert("quiz", null, values44);

			ContentValues values45 = new ContentValues();
			values45.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values45.put("selection_one", "メンフィスとその墓地遺跡");
			values45.put("selection_two", "クレスピ・ダッダ");
			values45.put("selection_three", "アクイレイアの遺跡地域");
			values45.put("selection_four", "開城の歴史的建造物と遺跡");
			values45.put("answer", "メンフィスとその墓地遺跡");
			values45.put("explanation", "「メンフィスとその墓地遺跡 - ギザからダハシュールまでのピラミッド地帯」は、"
					+ "エジプトにあるユネスコの世界遺産登録物件のひとつ。その名前に端的に表れているように、エジプトの"
					+ "ピラミッドとしてよく知られている特徴的なピラミッドの数々が含まれている。");
			values45.put("world_heritage_image_path", "@drawable/isan_afurika_piramiddo");
			values45.put("area", "アフリカ");
			db.insert("quiz", null, values45);

			ContentValues values46 = new ContentValues();
			values46.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values46.put("selection_one", "古代都市テーベ");
			values46.put("selection_two", "レ・ストラーデ・ヌオーヴェ");
			values46.put("selection_three", "武陵源の自然景観と歴史地域");
			values46.put("selection_four", "ティパサ");
			values46.put("answer", "古代都市テーベ");
			values46.put("explanation", "ナイル川東岸、地中海から約800km南方に位置する。上エジプト4番目の都市であ"
					+ "り、現地では「ワセト」(Waset)と呼ばれた（「ワセト」は「都市」とほぼ同義）。「テーベ」は東岸"
					+ "を意味する「タ・アペト」との音の類似により、ギリシャ人がボイオティアの古都「テーバイ」と同"
					+ "じ呼称を与えたものという説がある。古代エジプトの王都はメンフィスに置かれることが多かったが、"
					+ "中王国の第11王朝から新王国の第18王朝までテーベがエジプトの都とされた。その後、第19王朝でデル"
					+ "タに遷都されたが、アメン信仰の総本山であるカルナック神殿を中心として、重要な宗教都市としての"
					+ "地位を保ち続けた。");
			values46.put("world_heritage_image_path", "@drawable/isan_afurika_tebe");
			values46.put("area", "アフリカ");
			db.insert("quiz", null, values46);

			ContentValues values47 = new ContentValues();
			values47.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values47.put("selection_one", "アクスム");
			values47.put("selection_two", "サナア旧市街");
			values47.put("selection_three", "フォンニャ-ケバン国立公園");
			values47.put("selection_four", "オモ川下流域");
			values47.put("answer", "アクスム");
			values47.put("explanation", "アクスムは、エチオピア北部の街。アドワ山地の麓に近いティグレー地方メハケ"
					+ "レグナウ圏 (Mehakelegnaw Zone) にある。かつてのアクスム王国の中心地である。この王国は、イエ"
					+ "ス誕生の頃に勃興し、在りし日のペルシャ帝国に対抗する東ローマ帝国の半同盟国として、海上貿易"
					+ "で栄えたキリスト教国であった。しかし、この王国は7世紀に没落した。理由は不明だが、イスラーム"
					+ "の勃興により、沿岸部の航海しかできないでいた貿易船の航行が妨害され、アレクサンドリアやコン"
					+ "スタンティノポリスなどの主要市場との関係が絶たれたことが衰退につながったと推測されている。"
					+ "王国の衰退とともにアスクムの都市も衰退した。この結果、エチオピア帝国の中心地は内陸部にシフ"
					+ "トした。");
			values47.put("world_heritage_image_path", "@drawable/isan_afurika_akusumu");
			values47.put("area", "アフリカ");
			db.insert("quiz", null, values47);

			ContentValues values48 = new ContentValues();
			values48.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values48.put("selection_one", "カルタゴ遺跡");
			values48.put("selection_two", "チャン・アン複合景観");
			values48.put("selection_three", "シエンフェゴスの都市歴史地区");
			values48.put("selection_four", "メ渓谷自然保護区");
			values48.put("answer", "カルタゴ遺跡");
			values48.put("explanation", "カルタゴ（ラテン語: Carthāgō または Karthāgō[1] カルターゴー、アラビア"
					+ "語: قرطاج‎ Qarṭāj、英語:Carthage）は、現在のチュニジア共和国の首都チュニスに程近い湖である"
					+ "チュニス湖  (Lake of Tunis)  東岸にあった古代都市国家。現在は歴史的な遺跡のある観光地とな"
					+ "っているほか、行政上はチュニス県カルタゴ市として首都圏の一部を成す。「カルタゴ」の名は、"
					+ "フェニキア語のカルト・ハダシュト（Kart Hadasht＝「新しい町」）に由来するとされる。");
			values48.put("world_heritage_image_path", "@drawable/isan_afurika_karutago");
			values48.put("area", "アフリカ");
			db.insert("quiz", null, values48);

			ContentValues values49 = new ContentValues();
			values49.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values49.put("selection_one", "ンゴロンゴロ保全地域");
			values49.put("selection_two", "ハワイ火山国立公園");
			values49.put("selection_three", "カラカスの大学都市");
			values49.put("selection_four", "セルー・ゲーム・リザーブ");
			values49.put("answer", "ンゴロンゴロ保全地域");
			values49.put("explanation", "ンゴロンゴロ地域には、ンゴロンゴロ・オルモティ・エンパカーイという3つのク"
					+ "レーターが並び、これら活動を停止したものも含め9つの火山が分布する。ンゴロンゴロクレーターは"
					+ "数百万年前に出来た火山のカルデラに広がる平野を指す。外輪は南北16km、東西19kmと世界有数のカル"
					+ "デラである。中央には湖が存在する。人類発祥の地と目されるオルドパイ渓谷がこのクレーターの西に"
					+ "ある。ンゴロンゴロの外輪は標高2,400mあり、カルデラ内部の平野(1,800m程度)と比べて高い。このた"
					+ "めカルデラ内部は外部と遮断されており、このカルデラ内に生息する大型動物のほとんどはカルデラの"
					+ "外にでることはない。周囲と隔離された生態系が形成されるに至った。しかしながら、キリンやインパ"
					+ "ラ以外の東アフリカのサバンナに生息する動物はほぼ観察することができる。");
			values49.put("world_heritage_image_path", "@drawable/isan_afurika_ngorongoro");
			values49.put("area", "アフリカ");
			db.insert("quiz", null, values49);

			ContentValues values50 = new ContentValues();
			values50.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values50.put("selection_one", "ドゥッガ／トゥッガ");
			values50.put("selection_two", "ウォータートン・グレーシャー");
			values50.put("selection_three", "ニオコロ-コバ国立公園");
			values50.put("selection_four", "ブルー・ナ・ボーニャ");
			values50.put("answer", "ドゥッガ／トゥッガ");
			values50.put("explanation", "ドゥッガまたはトゥッガは、チュニジア北部にある65ヘクタールの広さを持つロ"
					+ "ーマ時代の遺跡である。元、ドゥッガは城壁に囲まれたベルベル人の村であり、トゥッガは「牧場」"
					+ "を意味していた。その後、紀元前2世紀にヌミディア王マシニッサがこの地を所在地とした。ローマ人"
					+ "は紀元前2世紀後半にこの街を占領した。ドゥッガは東ローマ帝国の支配地となった後、ヴァンダル人"
					+ "に占有された。ドゥッガには印象的なローマの遺跡が残っており、1997年にユネスコの世界遺産に登"
					+ "録された。");
			values50.put("world_heritage_image_path", "@drawable/isan_afurika_duga");
			values50.put("area", "アフリカ");
			db.insert("quiz", null, values50);

			ContentValues values51 = new ContentValues();
			values51.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values51.put("selection_one", "ナスカの地上絵");
			values51.put("selection_two", "エドワード１世の城群と市壁群");
			values51.put("selection_three", "ヴェガオヤン-ヴェガ群島");
			values51.put("selection_four", "福建の土楼");
			values51.put("answer", "ナスカの地上絵");
			values51.put("explanation", "1939年6月22日、動植物の地上絵は考古学者のポール・コソック博士により発見さ"
					+ "れる。その後ドイツの数学者、マリア・ライヒェが終生この地に住み着き、彼女を中心として、地上絵"
					+ "の解明作業と、保護が行われるようになった。あまりにも巨大な絵が多く、空からでないとほとんどの"
					+ "地上絵の全体像の把握が難しい。なぜこのような巨大な地上絵を描いたのかということが大きな謎の一"
					+ "つとなっている。2011年1月18日、山形大学は、人文学部坂井正人教授（文化人類学・アンデス考古学）"
					+ "らのグループがペルー南部のナスカ台地で新たな地上絵2つを発見したと発表した。新たな地上絵二つ"
					+ "（人の頭部、動物）はナスカ川の北岸付近で見つかった。人間の頭部と見られる絵は横約4.2メートル、"
					+ "縦約3.1メートルで、両目・口・右耳の形が確認されている。動物と見られる絵は、横約2.7メートル、"
					+ "縦約6.9メートル。種類は特定できていない。山形大学は2012年10月30日にナスカ市にナスカ研究所を開"
					+ "所した。2013年に入って同大はさらに2つ並んだ人物と見られる地上絵を発見、発表した。");
			values51.put("world_heritage_image_path", "@drawable/isan_america_nasuka");
			values51.put("area", "北米・南米");
			db.insert("quiz", null, values51);

			ContentValues values52 = new ContentValues();
			values52.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values52.put("selection_one", "グランド・キャニオン");
			values52.put("selection_two", "オークニー諸島");
			values52.put("selection_three", "ビャウォヴィエジャの森");
			values52.put("selection_four", "中世都市トルニ");
			values52.put("answer", "グランド・キャニオン");
			values52.put("explanation", "グランドキャニオン国立公園 (Grand Canyon National Park) はアメリカ合衆国の"
					+ "最も古い国立公園の1つでありアリゾナ州北西部に位置している。公園内には、コロラド川の峡谷である"
					+ "グランドキャニオンがあり、これは大自然の驚異の1つとされている。この公園は1,902 mi² (4927 km²) "
					+ "の面積を占めている。グランド・キャニオン周辺地域は1908年1月11日に国定公園となり、1919年2月26日"
					+ "に国立公園に指定された。この公園の誕生は環境保護運動の初期の成功例である。国立公園というステー"
					+ "タスが、公園内でコロラド川をせき止めるという提案を退けるのに役立ったのかもしれない。1979年に"
					+ "は、世界遺産に登録された。");
			values52.put("world_heritage_image_path", "@drawable/isan_america_gurandokyanion");
			values52.put("area", "北米・南米");
			db.insert("quiz", null, values52);

			ContentValues values53 = new ContentValues();
			values53.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values53.put("selection_one", "パパハナウモクアケア");
			values53.put("selection_two", "ルネサンス様式の記念碑的建造物群");
			values53.put("selection_three", "マルボルクのドイツ騎士団の城");
			values53.put("selection_four", "トゥバタハ岩礁自然公園");
			values53.put("answer", "パパハナウモクアケア");
			values53.put("explanation", "2010年に登録された世界遺産（複合遺産）。アメリカのハワイ諸島の北西約250km"
					+ "に分布する北西ハワイ諸島とその周辺海域に展開する、全長約1900kmにもおよぶ世界最大級の海洋保護"
					+ "区の一つ。面積は36万km2。多種多様な動植物の生息地で、1400万羽を超える海鳥と絶滅危惧種のハワ"
					+ "イモンクアザラシの生息地であるほか、アオウミガメの産卵地としても知られる。パパハナウモクアケ"
					+ "アとは、母なる神パパハナウモクと父なる神ワケアを組み合わせたハワイ語の造語。分布する島々のう"
					+ "ち、重要な考古学遺跡や多くの歴史的価値のある遺構があるニホア島とモクマナマナ島は、自然との融"
					+ "合を基調とするハワイ先住民にとって、魂の拠りどころとされる聖地でもある。");
			values53.put("world_heritage_image_path", "@drawable/isan_america_papahanau");
			values53.put("area", "北米・南米");
			db.insert("quiz", null, values53);

			ContentValues values54 = new ContentValues();
			values54.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values54.put("selection_one", "ラパ・ヌイ国立公園");
			values54.put("selection_two", "中世市場都市プロヴァン");
			values54.put("selection_three", "カムチャツカ火山群");
			values54.put("selection_four", "新疆天山");
			values54.put("answer", "ラパ・ヌイ国立公園");
			values54.put("explanation", "ラパ・ヌイは、先住民の言葉で大きい島という意味である。イースター島に残る"
					+ "モアイ像が有名である。モアイは約900体が残っているがその殆どは、16世紀から17世紀に起きた部族"
					+ "抗争で破壊されてしまった。7世紀から1,000年にわたって作られたモアイ像は部族の長の姿を表した"
					+ "のだと云われている。モアイ以外にも、洞窟内の壁画や住居跡などラパ・ヌイ文化を示すものも含ま"
					+ "れている。");
			values54.put("world_heritage_image_path", "@drawable/isan_america_rapanui");
			values54.put("area", "北米・南米");
			db.insert("quiz", null, values54);

			ContentValues values55 = new ContentValues();
			values55.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values55.put("selection_one", "マチュ・ピチュの歴史保護区");
			values55.put("selection_two", "天日製塩施設");
			values55.put("selection_three", "クルシュー砂州");
			values55.put("selection_four", "コローメンスコエの昇天教会");
			values55.put("answer", "マチュ・ピチュの歴史保護区");
			values55.put("explanation", "マチュ・ピチュの歴史保護区（マチュ・ピチュのれきしほごく）は、ペルーのクス"
					+ "コ県にあるマチュ・ピチュ遺跡と、その周辺を対象とするUNESCOの世界遺産リスト登録物件である。マ"
					+ "チュ・ピチュ遺跡はインカ帝国時代の遺跡の中では保存状態がきわめて良く、それに加えて周辺の自然"
					+ "環境は優れた景観の中に絶滅危惧種・危急種をはじめとする重要な動物相・植物相を含んでいることか"
					+ "ら、1983年に複合遺産として登録された。総面積は約326km2で、そのうち都市遺跡部分は約5km2である。");
			values55.put("world_heritage_image_path", "@drawable/isan_america_matyupityu");
			values55.put("area", "北米・南米");
			db.insert("quiz", null, values55);

			ContentValues values56 = new ContentValues();
			values56.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values56.put("selection_one", "イグアス国立公園");
			values56.put("selection_two", "ラ・ルヴィエール及びル・ルー");
			values56.put("selection_three", "中央シホテ-アリン");
			values56.put("selection_four", "ノヴォデヴィチ女子修道院群");
			values56.put("answer", "イグアス国立公園");
			values56.put("explanation", "アルゼンチンのイグアス国立公園は、1934年に設定された国立公園。ミシオネス"
					+ "州北部のイグアス県にある。その名の通り、アルゼンチン最大級の自然美を誇るイグアスの滝と周辺"
					+ "の亜熱帯の密林を対象とする。イグアス川の対岸には、ブラジルのイグアス国立公園が存在し、とも"
					+ "に世界遺産に登録されている。公園の動物相には絶滅危惧種も含まれ、オセロット、ジャガー、アメ"
					+ "リカバク、アリクイ類、森林性の猛禽類、オオハシ類、ホウカンチョウ科、 クチビロカイマン、ハナ"
					+ "グマ類（ハナグマ属、ヤマハナグマ属）や、多岐にわたる蝶などが生息している。イグアス川は、132"
					+ "0km流れてイグアスの滝から23km下流でパラナ川に合流する。公園内での最大幅は1500mで、最初に南"
					+ "へ曲がったあと北へ曲がり、大きなU字型を描いている。土手に沿って花がアルゼンチンの国花にもな"
					+ "っているアメリカデイゴを含む木々が密生している。");
			values56.put("world_heritage_image_path", "@drawable/isan_america_iguasu");
			values56.put("area", "北米・南米");
			db.insert("quiz", null, values56);

			ContentValues values57 = new ContentValues();
			values57.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values57.put("selection_one", "カナイマ国立公園");
			values57.put("selection_two", "ブコヴィナ・ダルマティアの主教座施設");
			values57.put("selection_three", "パドヴァの植物園");
			values57.put("selection_four", "伽倻山海印寺");
			values57.put("answer", "カナイマ国立公園");
			values57.put("explanation", "1962年にベネズエラの国立公園に指定されている。1994年、ユネスコの世界遺産"
					+ "(自然遺産)として登録されている。未だに人類未踏の場所が点在し、世界最後の秘境ともいわれる。面"
					+ "積は、30,000平方キロメートル以上である。関東地方(東京都、神奈川県、千葉県、埼玉県、茨城県、"
					+ "群馬県、栃木県)より少し狭い程度。四国の約1.6倍である。テーブルマウンテンが大小100余りジャン"
					+ "グルに浮かぶ一帯があり、ギアナ高地と呼ばれている。この地帯は、プレートテクトニクスの影響をほ"
					+ "とんど受けていないため、約20億年前の地質がそのまま残っていると考えられている。");
			values57.put("world_heritage_image_path", "@drawable/isan_america_kanaima");
			values57.put("area", "北米・南米");
			db.insert("quiz", null, values57);

			ContentValues values58 = new ContentValues();
			values58.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values58.put("selection_one", "ガラパゴス諸島");
			values58.put("selection_two", "カールスクローナの軍港");
			values58.put("selection_three", "アルマデンとイドリア");
			values58.put("selection_four", "クサントス-レトーン");
			values58.put("answer", "ガラパゴス諸島");
			values58.put("explanation", "ガラパゴス諸島（ガラパゴスしょとう、スペイン語: Islas Galápagos、英語: Ga"
					+ "lápagos Islands）は、東太平洋上の赤道下にあるエクアドル領の諸島。Islas Galápagos は「ゾウガ"
					+ "メの島」という意味で、スペイン語でゾウガメを意味する galápago からきている。正式名称はコロン"
					+ "諸島（スペイン語: Archipiélago de Colón）で「コロンブスの群島」を意味する。行政面ではガラパ"
					+ "ゴス県にある。約2万5124人(2010年統計)が居住し、主要言語はスペイン語。");
			values58.put("world_heritage_image_path", "@drawable/isan_america_garapagosu");
			values58.put("area", "北米・南米");
			db.insert("quiz", null, values58);

			ContentValues values59 = new ContentValues();
			values59.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values59.put("selection_one", "ロス・グラシアレス");
			values59.put("selection_two", "バンスカー・シュティアヴニツァ歴史都市");
			values59.put("selection_three", "ピリン国立公園");
			values59.put("selection_four", "トゥウェイフルフォンテーン");
			values59.put("answer", "ロス・グラシアレス");
			values59.put("explanation", "ロス・グラシアレス国立公園は、アンデス山脈の南端パタゴニアに位置し、南極、"
					+ "グリーンランドに次ぐ、地球上で第3位の面積を持つ南パタゴニア氷原および氷河群がある。ロス・グラ"
					+ "シアレス（Los Glaciares）はスペイン語の「氷河」の複数形なので、公園名は「氷河群」といった意味"
					+ "である。この地域では冬でも気温が-5℃前後までしか下がらず、氷河は溶けたり凍ったりを繰り返して"
					+ "いる。その上に雪が積もるため氷河の重みは増し、山の斜面をどんどん押し出されてくる。気温が上が"
					+ "る夏には、ビルほどの高さの氷の塊が轟音と共に一気に湖へと崩れ落ちる様子が見られる。");
			values59.put("world_heritage_image_path", "@drawable/isan_america_rosugurasiaresu");
			values59.put("area", "北米・南米");
			db.insert("quiz", null, values59);

			ContentValues values60 = new ContentValues();
			values60.put("problem", "この画像の世界遺産の名前は、なんでしょう？");
			values60.put("selection_one", "ポトシ市街");
			values60.put("selection_two", "僧院の島ライヒェナウ");
			values60.put("selection_three", "ドナウ・デルタ");
			values60.put("selection_four", "シギショアラ歴史地区");
			values60.put("answer", "ポトシ市街");
			values60.put("explanation", "ポトシ（スペイン語: Potosí'シ'にアクセント）は、ボリビアの南部にある都市。"
					+ "ポトシ県の行政府所在地。ボリビアの首都ラパスから南東に約 440 km に位置する。アンデス山脈中の"
					+ "盆地にあり、標高約 4,000 mと人が住む都市としては世界最高地点である。高山地域のうえ乾燥気候で"
					+ "あるために植生には乏しい。インディオの特徴を強く持つ人が多く、チョリータが多い。ケチュア語を"
					+ "話す人が多いが、スペイン語を全く解さない人は近年だいぶ少なくなってきた。スペイン以前の状況は"
					+ "不詳であるが、町は1546年に鉱山町として設立された。人口も一時は20万人を数えた。労働力としてア"
					+ "フリカ人奴隷も連れてこられている。");
			values60.put("world_heritage_image_path", "@drawable/isan_america_potosi");
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
