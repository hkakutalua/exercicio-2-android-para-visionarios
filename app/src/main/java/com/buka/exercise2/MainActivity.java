package com.buka.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.buka.exercise2.models.Car;
import com.buka.exercise2.utils.CarArrayListGenerator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Car> cars = CarArrayListGenerator.generateCars();

        // Faça estes passos fora da MainActivity.java
        // TODO: Passo 2 - Crie o item gráfico (XML) que representará cada item no RecyclerView
        // TODO: Passo 3 - Crie o adapter (em um ficheiro Java separado)
        // TODO: Passo 4 - Crie o view holder para o seu adapter (dentro da classe do adapter)
        // TODO: Passo 5 - Implemente os métodos necessários para o funcionamento do adapter

        // Faça estes passos dentro do MainActivity.java
        // TODO: Passo 6 - Apague as linhas de código abaixo que usam a TextView, já que usará RecyclerView
        TextView carsTextView = findViewById(R.id.textview_cars);

        String allCars = "";

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            allCars = allCars + " " +  car.getManufacturer() + " " + car.getModel() + " " + car.getYear() + "\n";
        }

        carsTextView.setText(allCars);

        // TODO: Passo 7 - Obtenha a referência para o RecyclerView
        // TODO: Passo 8 - Instancie um LinearLayoutManager vertical e atribua ao RecyclerView
        // TODO: Passo 9 - Instancie o Adapter e atribua ao RecyclerView
        // TODO: Passo 10 - Passe a ArrayList de carros para o adapter afim de que sejam exibidos na lista
    }
}
