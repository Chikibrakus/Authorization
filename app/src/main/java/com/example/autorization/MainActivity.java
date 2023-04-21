package com.example.autorization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    int start_x = 0; // Координата x при нажатии
    int end_x = 0; // Координата x при отпуске

    @Override
    // функция определения  свайпа
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction()) // определение метода
        {
            case  MotionEvent.ACTION_UP: // если нажатие
                start_x = (int) event.getX(); // определяем координату x
                break; // конец
            case  MotionEvent.ACTION_DOWN: // если отжатие
                end_x = (int) event.getX(); // определяем координату x
                break;
        }

        if(start_x != 0 && end_x != 0){ // если координаты не 0
            if(start_x > end_x){ // если начальная координата больше конечной
                // свайп влево
                setContentView(R.layout.activity_main); // меняем кран

            } else if(start_x < end_x) { // если начальная координата меньше конечной
                // свайп вправо
                setContentView(R.layout.regin); // меняем кран
            }

            start_x = 0; // обнуляем координаты
            end_x = 0; // обнуляем координаты
        }
        return false;
    }

}