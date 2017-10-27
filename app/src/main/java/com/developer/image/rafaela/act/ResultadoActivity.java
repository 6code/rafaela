package com.developer.image.rafaela.act;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.image.rafaela.R;
import com.developer.image.rafaela.model.CalculaIndices;

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

public class ResultadoActivity extends AppCompatActivity {


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

    private CalculaIndices c;
    private WritableWorkbook wb = null;
    private File file;
    private File folder = new File(Environment.getExternalStorageDirectory() + "/GDLAM"); //caminho da pasta que ira ser criada no diretorio interno

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //verifica se a pasta já exixte para poder criaŕ
        if (!folder.exists()) {
            folder.mkdir();
        }

        //verifica se o arquivo ja exixte para poder criar
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

        c = new CalculaIndices(l1, l2, l3, l4, l5); //passa os parametros para o construtor da classe Calcula indecies

        //evento de clique no botão para verificar os resultados
        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //verifica se os campos estão vazios antes de chamar os metodos
                if(nome.getText().toString().equals("") && idade.getText().toString().equals("")) {

                    Toast.makeText(ResultadoActivity.this, "Preencha todos os campos!!", Toast.LENGTH_LONG).show();

                }else{

                    c.setNome(nome.getText().toString()); //seta o nome digitado
                    c.setIdade(Integer.valueOf(idade.getText().toString())); //seta idade digitada

                    // chama os metodos de calcular os indices
                    c.calcularC10M();
                    c.calcularLPS();
                    c.calcularLPDV();
                    c.calcularVTC();
                    c.calcularLCLC();
                    c.calcularIG(); //calcula o IG

                    resultado.setText(c.getResultadoGeral()); //seta msg de resultado no textView
                    InserirTabela(); //insere o resultado na tabela

                }
            }
        });


        //seta o evento de clique volta para tela principal
        novoTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ResultadoActivity.this, TestesActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    // cria uma tabela padrão para inserir os resultados
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

        //cria celula por celula e insere os valores
        Label label1 = new Label(0, 0, "Nome:");
        Label label2 = new Label(1, 0, "Idade:");
        Label label3 = new Label(2,0,"C10M(ms)");
        Label label4 = new Label(3,0,"LPS(ms)");
        Label label5 = new Label(4,0,"LPDV(ms)");
        Label label6 = new Label(5,0,"VTC(ms)");
        Label label7 = new Label(6,0,"LCLC(ms)");
        Label label8 = new Label(7, 0, "IG(score)");
        Label label9 = new Label(8, 0, "Resultado Geral ");
        Label label10 = new Label(9, 0, " - "); //celula para indicar o final

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
            plan.addCell(label9);
            plan.addCell(label10);

            wb.write(); //escreve
            wb.close(); //e fecha o arquivo

        } catch (RowsExceededException e1) {
            e1.printStackTrace();
        } catch (WriteException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    //metodo que insere os resultados na tabela exixtente
    public void InserirTabela() {

        Workbook workbook = null;
        int j = 0;
        File file2 = new File(folder, "GDLAM.xls");

        try {

            File folder2 = new File(Environment.getExternalStorageDirectory()+"/GDLAM/GDLAM.xls");
            workbook = Workbook.getWorkbook(folder2);
            wb = Workbook.createWorkbook(file2, workbook);

            Sheet sheet = workbook.getSheet(0); //recuperando minha tabela 0
            j = sheet.getRows(); // esse metodo retorna o numero de linhas exixtentes

            WritableSheet plan1 = wb.getSheet(0);

            //criando celulas
            Label nome = new Label(0, j, c.getNome() + "");
            Label idade = new Label(1, j, c.getIdade() + "");
            Label teste1 = new Label(2, j, c.getC10M() + "");
            Label teste2 = new Label(3, j, c.getLPS() + "");
            Label teste3 = new Label(4, j, c.getLPDV() + "");
            Label teste4 = new Label(5, j, c.getVTC() + "");
            Label teste5 = new Label(6, j, c.getLCLC() + "");
            Label ig = new Label(7, j, c.getIG() + "");
            Label label9 = new Label(8, j, " " + c.getResultadoGeral());
            Label label10 = new Label(9, j, " - ");

            //adicionando na planilha
            plan1.addCell(nome);
            plan1.addCell(idade);
            plan1.addCell(teste1);
            plan1.addCell(teste2);
            plan1.addCell(teste3);
            plan1.addCell(teste4);
            plan1.addCell(teste5);
            plan1.addCell(ig);
            plan1.addCell(label9);
            plan1.addCell(label10);

            wb.write(); //grava
            wb.close(); //fecha

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
