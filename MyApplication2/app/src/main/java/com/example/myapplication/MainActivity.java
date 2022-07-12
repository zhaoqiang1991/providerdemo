package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.api.IHome;
import com.example.api.ILogin;
import com.example.order.module.api.IOrder;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView homeServiceTv;
    private TextView loginServiceTv;
    private TextView orderServiceTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeServiceTv = this.findViewById(R.id.home_service_tv);
        loginServiceTv = this.findViewById(R.id.login_service_tv);
        orderServiceTv = this.findViewById(R.id.order_service_tv);



        ServiceLoader<IHome> iHomeService = ServiceLoader.load(IHome.class);
        ServiceLoader<ILogin> iLoginService = ServiceLoader.load(ILogin.class);
        ServiceLoader<IOrder> iOrderService = ServiceLoader.load(IOrder.class);


        String result = iHomeService.iterator().next().show();
        boolean success = iLoginService.iterator().next().login("xxx","123");
        String orderInfo = iOrderService.iterator().next().getOrderMsg();

        Log.d(TAG,"--------> " +result);
        homeServiceTv.setText(result);


        if(success){
            loginServiceTv.setText("登录成功");
        }else{
            loginServiceTv.setText("登录失败");
        }

        orderServiceTv.setText(orderInfo);

    }
}