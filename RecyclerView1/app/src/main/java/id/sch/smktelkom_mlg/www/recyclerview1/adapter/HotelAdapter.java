package id.sch.smktelkom_mlg.www.recyclerview1.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.www.recyclerview1.R;
import id.sch.smktelkom_mlg.www.recyclerview1.model.Hotel;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {
    ArrayList<Hotel> hotelList;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.tvJudul.setText(hotel.judul);
        holder.tvDeskripsi.setText(hotel.deskripsi);
        holder.ivfoto.setImageDrawable(hotel.foto);
    }

    @Override
    public int getItemCount() {
        if (hotelList != null)
            return hotelList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivfoto;
        TextView tvJudul, tvDeskripsi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivfoto = (ImageView) itemView.findViewById(R.id.imgView);
            tvJudul = (TextView) itemView.findViewById(R.id.txtViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.txtViewDeskripsi);
        }
    }

    public HotelAdapter(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
