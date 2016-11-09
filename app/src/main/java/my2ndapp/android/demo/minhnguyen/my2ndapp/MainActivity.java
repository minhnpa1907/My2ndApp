package my2ndapp.android.demo.minhnguyen.my2ndapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlus, btnSubtract, btnOrder;

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnOrder = (Button) findViewById(R.id.btnOrder);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xử lý sự kiện khi click vào button + tại đây
                mNumber += 1;
                showWantedNumber(mNumber);
                showFinalNumber(mNumber);
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xử lý sự kiện khi click vào button - tại đây
                if (mNumber != 0)
                    mNumber -= 1;
                showWantedNumber(mNumber);
                showFinalNumber(mNumber);
            }
        });
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xử lý sự kiện khi click vào button order tại đây
                String total = String.format("%,d", 8000 * mNumber);
                showPrice(total);
            }
        });
    }

    void showWantedNumber(int sWantedNumber) {
        TextView tvWantedNumber;
        tvWantedNumber = (TextView) findViewById(R.id.tvWantedNumber);
        tvWantedNumber.setText(sWantedNumber + "");
    }

    void showFinalNumber(int sFinalNumber) {
        TextView tvFinalNumber;
        tvFinalNumber = (TextView) findViewById(R.id.tvFinalNumber);
        tvFinalNumber.setText("Bạn đang mua " + sFinalNumber + " ly caffee");
    }

    void showPrice(String sPrice) {
        TextView tvPrice;
        tvPrice = (TextView) findViewById(R.id.tvPrice);
        tvPrice.setText("Tổng tiền: " + sPrice + " VND");
    }
}
