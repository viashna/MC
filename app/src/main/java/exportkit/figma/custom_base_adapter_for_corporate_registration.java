package exportkit.figma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_base_adapter_for_corporate_registration extends BaseAdapter {

    Context context;
    String listfruit[];
    int listimages[];
    LayoutInflater inflater;

    public custom_base_adapter_for_corporate_registration(Context ctx, String [] fruitlist, int[] images){
        this.context=ctx;
        this.listfruit=fruitlist;
        this.listimages=images;
        inflater=LayoutInflater.from(ctx);

    }
    @Override
    public int getCount() {
        return listfruit.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.activity_custom_list_view_for_corporate_registration,null);
        TextView txt = (TextView) convertView.findViewById(R.id.label);
        ImageView img = (ImageView) convertView.findViewById(R.id.imageicon);
        txt.setText(listfruit[position]);
        img.setImageResource(listimages[position]);
        return convertView;
    }
}
