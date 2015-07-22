/**
 *
 */
package jp.ac.feelwind.worldheritagedetravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/**
 * @author student
 *
 */
public class TiikiQuiz extends Activity implements OnClickListener{
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
				intent = new Intent(TiikiQuiz.this,Europe1Quiz.class);
				break;

			case R.id.imageViewEurope2:
				intent = new Intent(TiikiQuiz.this,Europe2Quiz.class);
				break;

			case R.id.imageViewAsiaMiddleEast:
				intent = new Intent(TiikiQuiz.this,Europe1Quiz.class);
				break;

			case R.id.imageViewAfrica:
				intent = new Intent(TiikiQuiz.this,Europe1Quiz.class);
				break;

			case R.id.imageViewOceania:
				intent = new Intent(TiikiQuiz.this,Europe1Quiz.class);
				break;

			case R.id.imageViewNorthAmericaSouthAmerica:
				intent = new Intent(TiikiQuiz.this,Europe1Quiz.class);
				break;
		}
		startActivity(intent);
	}

}
