package com.example.tecknet.view.open_malfunctions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tecknet.R;
import com.example.tecknet.model.malfunctionView;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class OpenMalfunctionsAdapter extends ArrayAdapter<malfunctionView> {

    private Context mContext;
    private  int mResource;

    public OpenMalfunctionsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<malfunctionView> obj) {
        super(context, resource, obj);
        mContext = context;
        mResource = resource;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater linf = LayoutInflater.from(mContext);
        convertView = linf.inflate(R.layout.fragment_open_malfunctions_row, parent, false);

        TextView tvArea = convertView.findViewById(R.id.txtArea);
        tvArea.setText(getItem(position).getArea());

        TextView tvDevice = convertView.findViewById(R.id.txtDevice);
        tvDevice.setText(getItem(position).getDevice());

        return convertView;
    }
}
