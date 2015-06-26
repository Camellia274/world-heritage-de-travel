package jp.ac.feelwind.worldheritagedetravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Top extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//クイズボタンが押されたら
		ImageView quiz = (ImageView)findViewById(R.id.quiz);
		quiz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(Top.this,QuizStart.class);
				startActivity(intent);
			}
		});

		//メニュボタンが押されたとき
		ImageView menu =(ImageView)findViewById(R.id.menu);
		menu.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(Top.this,Menu.class);
				startActivity(intent);
			}
		});

		//ランニングボタンが押されたとき
		ImageView ranking =(ImageView)findViewById(R.id.ranking);
		ranking.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(Top.this,RankingHeritage.class);
				startActivity(intent);
			}
		});

	}
}
