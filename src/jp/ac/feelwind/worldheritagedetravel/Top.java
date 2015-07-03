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
		setContentView(R.layout.top);

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

		//おすすめが押されたとき
		ImageView osusume =(ImageView)findViewById(R.id.osusume);
		osusume.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(Top.this,RankingHeritage.class);
				startActivity(intent);
			}
		});

		//チェックリストが押されたとき
		ImageView checklist =(ImageView)findViewById(R.id.checklist);
		checklist.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(Top.this,CheckList.class);
				startActivity(intent);
			}
		});

		//キャラクターが押されたら
		ImageView character =(ImageView)findViewById(R.id.character);
		character.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(Top.this,Character.class);
				startActivity(intent);
			}
		});

	}
}
