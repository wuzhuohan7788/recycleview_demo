package newlayoutdemo.vvzh.com.recycleview_demo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private List<Fruit> mFruitList;

    public FruitAdapter(List<Fruit> mFruitList) {
        this.mFruitList = mFruitList;
    }

    @NonNull
    @Override
    public FruitAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fruit, null, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.ViewHolder viewHolder, int i) {
        Fruit Fruit = mFruitList.get(i);
        viewHolder.fruit_image.setImageResource(Fruit.getImgId());
        viewHolder.fruit_name.setText(Fruit.getFruit_name());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruit_image;
        TextView fruit_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruit_image = itemView.findViewById(R.id.fruit_image);
            fruit_name = itemView.findViewById(R.id.fruit_name);
        }
    }
}
