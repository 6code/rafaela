package com.developer.image.rafaela.model;

public class CalculaIndices {

    private String resultadoGeral;
    private String resultadoC10M;
    private String resultadoLPS;
    private String resultadoLPDV;
    private String resultadoVTC;
    private String resultadoLCLC;
    private String resultadoIG;
    private String nome;
    private Integer idade;

    private long C10M;
    private long LPS;
    private long LPDV;
    private long VTC;
    private long LCLC;
    private long IG;



    public CalculaIndices(long c10M, long LPS, long LPDV, long VTC, long LCLC) {

        C10M = c10M;
        this.LPS = LPS;
        this.LPDV = LPDV;
        this.VTC = VTC;
        this.LCLC = LCLC;
    }


    public String getResultadoC10M() {
        return resultadoC10M;
    }

    public void setResultadoC10M(String resultadoC10M) {
        this.resultadoC10M = resultadoC10M;
    }

    public String getResultadoLPS() {
        return resultadoLPS;
    }

    public void setResultadoLPS(String resultadoLPS) {
        this.resultadoLPS = resultadoLPS;
    }

    public String getResultadoLPDV() {
        return resultadoLPDV;
    }

    public void setResultadoLPDV(String resultadoLPDV) {
        this.resultadoLPDV = resultadoLPDV;
    }

    public String getResultadoVTC() {
        return resultadoVTC;
    }

    public void setResultadoVTC(String resultadoVTC) {
        this.resultadoVTC = resultadoVTC;
    }

    public String getResultadoGeral() {

        this.resultadoGeral = "\t\t\t Resultados:" + "\nC10M: " + resultadoC10M
                + "\nLPS: " + resultadoLPS
                + "\nLPDV: " + resultadoLPDV
                + "\nVTC: " + resultadoVTC
                + "\nLCLC: " + resultadoLCLC
                + "\nIG: " + resultadoIG;

        return this.resultadoGeral;
    }

    public String getResultadoLCLC() {
        return resultadoLCLC;
    }

    public void setResultadoLCLC(String resultadoLCLC) {
        this.resultadoLCLC = resultadoLCLC;
    }

    public String getResultadoIG() {
        return resultadoIG;
    }

    public void setResultadoIG(String resultadoIG) {
        this.resultadoIG = resultadoIG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public long getC10M() {
        return C10M;
    }

    public void setC10M(long c10M) {
        C10M = c10M;
    }

    public long getLPS() {
        return LPS;
    }

    public void setLPS(long LPS) {
        this.LPS = LPS;
    }

    public long getLPDV() {
        return LPDV;
    }

    public void setLPDV(long LPDV) {
        this.LPDV = LPDV;
    }

    public long getVTC() {
        return VTC;
    }

    public void setVTC(long VTC) {
        this.VTC = VTC;
    }

    public long getLCLC() {
        return LCLC;
    }

    public void setLCLC(long LCLC) {
        this.LCLC = LCLC;
    }

    public long getIG() {
        return IG;
    }

    public void setIG(long IG) {
        this.IG = IG;
    }

    public void calcularC10M() {

        this.resultadoC10M = "Teste da classe";
    }

    public void calcularLPS() {

        this.resultadoLPS = "Teste da classe";
    }

    public void calcularLPDV() {

        this.resultadoLPDV = "Teste da classe";
    }

    public void calcularVTC() {

        this.resultadoVTC = "Teste da classe";
    }

    public void calcularLCLC() {

        this.resultadoLCLC = "Teste da classe";
    }

    public void calcularIG() {


        this.IG = (((this.C10M + this.LPS + this.LPDV + this.VTC) * 2) + this.LCLC) / 4;

        if (this.idade >= 50 && this.idade <= 59) {

            this.resultadoIG = "";


        } else if (this.idade >= 60 && this.idade <= 64) {

            if (this.IG < 22280) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 22208 && this.IG < 27430) {

                this.resultadoIG = "Bom";

            } else if (this.IG > 27440 && this.IG < 33010) {

                this.resultadoIG = "Regular";

            } else if (this.IG < 33010) {

                this.resultadoIG = "Insuficiente";

            }


        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.IG < 22820) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 22820 && this.IG < 28100) {

                this.resultadoIG = "bom";

            } else if (this.IG > 28110 && this.IG < 33710) {

                this.resultadoIG = "Regular";

            } else if (this.IG < 33710) {

                this.resultadoIG = "Insufuciente";

            }


        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.IG < 23370) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 23370 && this.IG < 28770) {

                this.resultadoIG = "Bom";

            } else if (this.IG > 20770 && this.IG < 34410) {

                this.resultadoIG = "Regular";

            } else if (this.IG < 34410) {

                this.resultadoIG = "Insuficiente";

            }


        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.IG < 23910) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 23910 && this.IG < 29450) {

                this.resultadoIG = "Bom";

            } else if (this.IG > 29460 && this.IG < 35110) {

                this.resultadoIG = "Regular";

            } else if (this.IG < 35110) {

                this.resultadoIG = "Insuficiente";

            }


        } else if (this.idade >= 80) {


            if (this.IG < 24460) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 24460 && this.IG < 30120) {

                this.resultadoIG = "Bom";

            } else if (this.IG > 30130 && this.IG < 35810) {

                this.resultadoIG = "Regular";

            } else if (this.IG < 35810) {

                this.resultadoIG = "Insuficente";

            }

        }
    }

}
