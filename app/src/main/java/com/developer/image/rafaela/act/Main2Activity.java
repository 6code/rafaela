package com.developer.image.rafaela.act;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.developer.image.rafaela.R;
import com.developer.image.rafaela.model.pessoa;
import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Main2Activity extends AppCompatActivity {

    private TextView novoTest;
    private TextView resultado;
    private Button verificar;
    private EditText nome;
    private EditText idade;

    private long l1;
    private long l2;
    private long l3;
    private long l4;
    private long l5;

    private long IG;



    private pessoa p = new pessoa();

    WritableWorkbook wb = null;

    File file;

    File folder = new File(Environment.getExternalStorageDirectory()+"/GDLAM");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        if (!folder.exists()) {
            folder.mkdir();
        }


        file = new File(folder, "GDLAM.xls");

        if(file.exists()) {

        }else {criarTabela();}


        //recuperando elementos da interface pelo id

        novoTest = (TextView) findViewById(R.id.novoteste);
        resultado = (TextView) findViewById(R.id.resultado);
        verificar = (Button) findViewById(R.id.verificar);
        nome = (EditText) findViewById(R.id.nome);
        idade = (EditText) findViewById(R.id.idade);


        //recuperando parametros passado pela act

        Bundle bundle = getIntent().getExtras();

        l1 = bundle.getLong("resultado1");
        l2 = bundle.getLong("resultado2");
        l3 = bundle.getLong("resultado3");
        l4 = bundle.getLong("resultado4");
        l5 = bundle.getLong("resultado5");


//reuini todos os parametros e seta os atributos



        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nome.getText().toString().equals("") && idade.getText().toString().equals("")) {

                    Toast.makeText(Main2Activity.this, "Preencha todos os campos!!", Toast.LENGTH_LONG).show();

                }else{

                    IG = (((l1+l2+l3+l4)*2)+l5)/4;


                    p.setNome(nome.getText().toString());
                    p.setIdade(Integer.valueOf(idade.getText().toString()));
                    p.setTest1(l1);
                    p.setTest2(l2);
                    p.setTest3(l3);
                    p.setTest4(l4);
                    p.setTest5(l5);


                    String msg = "";


                    if(p.getIdade() >= 50 && p.getIdade() <= 59) {

                        msg ="";


                    }else if(p.getIdade() >= 60 && p.getIdade() <= 64){

                        if(IG<22280) {

                            msg ="MUITO BOM";

                        }else if(IG>22208 && IG< 27430){

                            msg =  "BOM";

                        }else if(IG>27440 && IG< 33010){

                            msg = "REGULAR";

                        }else if(IG< 33010){

                            msg =  "INSUFICIENTE";

                        }


                    }else if(p.getIdade() >= 65 && p.getIdade() <= 69){


                        if(IG<22820) {

                            msg ="MUITO BOM";

                        }else if(IG>22820 && IG< 28100){

                            msg =  "BOM";

                        }else if(IG>28110 && IG< 33710){

                            msg = "REGULAR";

                        }else if(IG< 33710){

                            msg =  "INSUFICIENTE";

                        }



                    }else if(p.getIdade() >= 70 && p.getIdade() <= 74){


                        if(IG<23370) {

                            msg ="MUITO BOM";

                        }else if(IG>23370 && IG< 28770){

                            msg =  "BOM";

                        }else if(IG>20770 && IG< 34410){

                            msg = "REGULAR";

                        }else if(IG< 34410){

                            msg =  "INSUFICIENTE";

                        }


                    }else if(p.getIdade() >= 75 && p.getIdade() <= 79){

                        if(IG < 23910) {

                            msg ="MUITO BOM";

                        }else if(IG > 23910 && IG < 29450){

                            msg =  "BOM";

                        }else if(IG > 29460 && IG < 35110){

                            msg = "REGULAR";

                        }else if(IG< 35110){

                            msg =  "INSUFICIENTE";

                        }




                    }else if (p.getIdade() >= 80){


                        if(IG<24460) {

                            msg ="MUITO BOM";

                        }else if(IG>24460 && IG< 30120){

                            msg =  "BOM";

                        }else if(IG>30130 && IG< 35810){

                            msg = "REGULAR";

                        }else if(IG< 35810){

                            msg =  "INSUFICIENTE";

                        }


                    }


                    p.setResultado("IG ("+IG+"): "+ msg);


                    resultado.setText(p.getResultado());

                    InserirTabela();

                }
            }
        });


//volta para tela principal

        novoTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }


    public void criarTabela(){


        //Em seguida vamos criar o Excel Workbook

        try {

            wb = Workbook.createWorkbook(file);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Já com o workbook criado, é preciso criar a planilha(Sheet).

        wb.createSheet("Planilha - GDLAM", 0);

        //Agora para escrever nesta planilha

        WritableSheet plan = wb.getSheet(0);


        Label label1 = new Label(0,0,"NOME");
        Label label2 = new Label(1,0,"IDADE");
        Label label3 = new Label(2,0,"C10M(ms)");
        Label label4 = new Label(3,0,"LPS(ms)");
        Label label5 = new Label(4,0,"LPDV(ms)");
        Label label6 = new Label(5,0,"VTC(ms)");
        Label label7 = new Label(6,0,"LCLC(ms)");
        Label label8 = new Label(7,0,"RESULTADO+IG");


        // Como o método pode levantar exceção '
        // iremos coloca-lo dentro de um try/catch

        try {


            plan.addCell(label1);
            plan.addCell(label2);
            plan.addCell(label3);
            plan.addCell(label4);
            plan.addCell(label5);
            plan.addCell(label6);
            plan.addCell(label7);
            plan.addCell(label8);

            wb.write();
            wb.close();



        } catch (RowsExceededException e1) {
            e1.printStackTrace();
        } catch (WriteException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void InserirTabela() {


        Workbook workbook = null;
        int j = 0;

        File file2 = new File(folder, "GDLAM.xls");

        try {

            File folder2 = new File(Environment.getExternalStorageDirectory()+"/GDLAM/GDLAM.xls");
            workbook = Workbook.getWorkbook(folder2);

            wb = Workbook.createWorkbook(file2, workbook);

            Sheet sheet = workbook.getSheet(0);
            j = sheet.getRows();

            WritableSheet plan1 = wb.getSheet(0);


            Label nome = new Label(0, j, p.getNome());
            Label idade = new Label(1, j, p.getIdade() + "");
            Label teste1 = new Label(2, j, p.getTest1() + "");
            Label teste2 = new Label(3, j, p.getTest2() + "");
            Label teste3 = new Label(4, j, p.getTest3() + "");
            Label teste4 = new Label(5, j, p.getTest4() + "");
            Label teste5 = new Label(6, j, p.getTest5() + "");
            Label resultado = new Label(7, j, p.getResultado());


            plan1.addCell(nome);
            plan1.addCell(idade);
            plan1.addCell(teste1);
            plan1.addCell(teste2);
            plan1.addCell(teste3);
            plan1.addCell(teste4);
            plan1.addCell(teste5);
            plan1.addCell(resultado);

            wb.write();
            wb.close();










        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }


    }



}
