package com.example.namasa.aprianil__1202150082_modul3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;


public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.holdermn> {
    private Context context;
    private List<MenuList> daftarmenu;

    //adpater daftar menu
    public AdapterMenu(Context context, List<MenuList> daftarmenu) {
        this.context = context;
        this.daftarmenu = daftarmenu;
    }

    @Override
    //Inflate
    public holdermn onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat view baru
        View vw = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        holdermn hldr = new holdermn(vw);
        return hldr;
    }

    @Override

    public void onBindViewHolder(holdermn holder, int position) {

        MenuList dt = daftarmenu.get(position);

        holder.nama.setText(dt.getNama());
        holder.detail.setText(dt.getDesc());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            holder.rl.setBackground(holder.rl.getResources().getDrawable(dt.getGambar()));
        }
        holder.rl.setTag(dt.getGambar());
    }

    @Override
    public int getItemCount() {
        return daftarmenu.size();
    }

    class holdermn extends RecyclerView.ViewHolder{
        TextView nama, detail;
        RelativeLayout rl;
        public holdermn(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namaAir);
            detail = itemView.findViewById(R.id.detailAir);
            rl = itemView.findViewById(R.id.rl);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                //ketika cardview di klik
                public void onClick(View view) {
                    Intent move = new Intent(context, DetailProduct.class);
                    move.putExtra("nama", nama.getText());
                    move.putExtra("detail", detail.getText());
                    move.putExtra("gambar",rl.getTag().toString());
                    context.startActivity(move);
                }
            });
        }
    }
}
