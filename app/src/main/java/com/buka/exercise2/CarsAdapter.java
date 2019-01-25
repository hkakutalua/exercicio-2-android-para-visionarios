package com.buka.exercise2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.buka.exercise2.models.Car;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarViewHolder> {
    private ArrayList<Car> cars = new ArrayList<>();

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View carView = inflater.inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.carTextView.setText(car.getManufacturer() + " " + car.getModel() + " " + car.getYear());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public void setCars(ArrayList<Car> cars) {
        if (cars != null) {
            this.cars = cars;
            notifyDataSetChanged();
        }
    }

    class CarViewHolder extends RecyclerView.ViewHolder {
        TextView carTextView;

        public CarViewHolder(@NonNull View carView) {
            super(carView);
            carTextView = carView.findViewById(R.id.textview_car);
        }
    }
}
