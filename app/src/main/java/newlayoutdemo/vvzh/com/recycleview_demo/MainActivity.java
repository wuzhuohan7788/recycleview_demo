package newlayoutdemo.vvzh.com.recycleview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initFruit();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruit() {
        for (int i = 0; i <= 2; i++) {
            Fruit apple = new Fruit("apple", R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit orange = new Fruit("orange", R.drawable.ic_launcher_background);
            fruitList.add(orange);
            Fruit banana = new Fruit("banana", R.drawable.ic_launcher_background);
            fruitList.add(banana);
            Fruit watermelon = new Fruit("watermelon ", R.drawable.ic_launcher_background);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("pear ", R.drawable.ic_launcher_background);
            fruitList.add(pear);
            Fruit grape = new Fruit("grape ", R.drawable.ic_launcher_background);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("pineapple", R.drawable.ic_launcher_background);
            fruitList.add(pineapple);
        }
        Log.i("MainActivity", String.valueOf(fruitList.size()));
    }

    private void init() {
        recyclerView = this.findViewById(R.id.fruit_RecView);
    }
}
