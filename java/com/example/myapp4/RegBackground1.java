package com.example.myapp4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.Editable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class RegBackground1 extends AsyncTask<String,Void,String> {
        Context context;
        AlertDialog alertDialog;
        RegBackground1(Context ctx){
            context=ctx;
        }
        @Override
        protected String doInBackground(String... params) {
            String type=params[0];
            String reg_url="http://192.168.1.102/ownerInsert1.php";
            if (type.equals("Reg")){
                try {
                    String FName=params[1];
                    String MName=params[2];
                    String LName=params[3];
                    String Nic=params[4];
                    String gender=params[5];
                    String dob=params[6];
                    String email=params[7];
                    String address=params[8];
                    String mobile=params[9];
                    String city=params[10];
                    String licenceNumber=params[11];
                    String Password=params[12];

                    String regDate=params[13];
                    URL url= new URL(reg_url);
                    HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                    String post_data= URLEncoder.encode("FName","UTF-8")+"="+URLEncoder.encode(FName,"UTF-8")+"&"+
                            URLEncoder.encode("MName","UTF-8")+"="+URLEncoder.encode(MName,"UTF-8")+"&"+
                            URLEncoder.encode("LName","UTF-8")+"="+URLEncoder.encode(LName,"UTF-8")+"&"+
                            URLEncoder.encode("Nic","UTF-8")+"="+URLEncoder.encode(Nic,"UTF-8")+"&"+
                            URLEncoder.encode("gender","UTF-8")+"="+URLEncoder.encode(gender,"UTF-8")+"&"+
                            URLEncoder.encode("dob","UTF-8")+"="+URLEncoder.encode(dob,"UTF-8")+"&"+
                            URLEncoder.encode("Email","UTF-8")+"="+URLEncoder.encode(email,"UTF-8")+"&"+
                            URLEncoder.encode("Address","UTF-8")+"="+URLEncoder.encode(address,"UTF-8")+"&"+
                            URLEncoder.encode("mobileNum","UTF-8")+"="+URLEncoder.encode(mobile,"UTF-8")+"&"+
                            URLEncoder.encode("city","UTF-8")+"="+URLEncoder.encode(city,"UTF-8")+"&"+
                            URLEncoder.encode("licenceNumber","UTF-8")+"="+URLEncoder.encode(licenceNumber,"UTF-8")+"&"+
                            URLEncoder.encode("Password","UTF-8")+"="+URLEncoder.encode(Password,"UTF-8")+"&"+
                            URLEncoder.encode("regDate","UTF-8")+"="+URLEncoder.encode(regDate,"UTF-8");
                    bufferedWriter.write(post_data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                    InputStream inputStream=httpURLConnection.getInputStream();
                    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.ISO_8859_1));
                    String result="";
                    String line;
                    while ((line=bufferedReader.readLine())!=null){
                        result+=line;
                    }
                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();

                        return result;

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        return null;
    }

    @Override
    protected void onPreExecute() {
        alertDialog=new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Login Status");
    }

    @Override
    protected void onPostExecute(String result) {
            alertDialog.setMessage(result);
            alertDialog.show();

    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
