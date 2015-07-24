/**
 *
 */
package jp.ac.feelwind.worldheritagedetravel;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/**
 * @author student
 *
 */
public class TiikiQuiz extends Activity implements OnClickListener{
	private SQLiteDatabase sqlDB;
	DBManager dbm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.areaselect);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		dbm =new DBManager(this);
		sqlDB = dbm.getWritableDatabase();

		ImageView europe1 = (ImageView)findViewById(R.id.imageViewEurope1);
		europe1.setOnClickListener(this);
		ImageView europe2 = (ImageView)findViewById(R.id.imageViewEurope2);
		europe2.setOnClickListener(this);
		ImageView asiaMiddleEast = (ImageView)findViewById(R.id.imageViewAsiaMiddleEast);
		asiaMiddleEast.setOnClickListener(this);
		ImageView africa = (ImageView)findViewById(R.id.imageViewAfrica);
		africa.setOnClickListener(this);
		ImageView oceania = (ImageView)findViewById(R.id.imageViewOceania);
		oceania.setOnClickListener(this);
		ImageView northAmericaSouthAmerica = (ImageView)findViewById(R.id.imageViewNorthAmericaSouthAmerica);
		northAmericaSouthAmerica.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Intent intent = null;
		switch (v.getId()) {
			case R.id.imageViewEurope1:
				String quiz = dbm.selectEurope1Quiz(sqlDB);
				Log.v("log", quiz);
				intent = new Intent(TiikiQuiz.this,Europe1Quiz.class);
				break;

			case R.id.imageViewEurope2:
				intent = new Intent(TiikiQuiz.this,Europe2Quiz.class);
				break;

			case R.id.imageViewAsiaMiddleEast:
				intent = new Intent(TiikiQuiz.this,AsiaMiddleEastQuiz.class);
				break;

			case R.id.imageViewAfrica:
				intent = new Intent(TiikiQuiz.this,AfricaQuiz.class);
				break;

			case R.id.imageViewOceania:
				intent = new Intent(TiikiQuiz.this,OceaniaQuiz.class);
				break;

			case R.id.imageViewNorthAmericaSouthAmerica:
				intent = new Intent(TiikiQuiz.this,NorthAmericaSouthAmericaQuiz.class);
				break;
		}
		startActivity(intent);
	}

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
		sqlDB.close();
	}

}
