package com.developer.image.rafaela.model;

public class CalculaIndices {

    private String msg;
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


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
        return this.C10M;
    }

    public long getLPS() {
        return this.LPS;
    }

    public long getLPDV() {
        return this.LPDV;
    }

    public long getVTC() {
        return this.VTC;
    }

    public long getLCLC() {
        return this.LCLC;
    }

    public long getIG() {
        return this.IG;
    }


    public void calcularC10M(int idade) {

    }

    public void calcularLPS(int idade) {

    }

    public void calcularLPDV(int idade) {

    }

    public void calcularVTC(int idade) {

    }

    public void calcularLCLC(int idade) {

    }

    public void calcularIG() {


        this.IG = (((this.C10M + this.LPS + this.LPDV + this.VTC) * 2) + this.LCLC) / 4;

        if (this.idade >= 50 && this.idade <= 59) {

            this.msg = "";


        } else if (this.idade >= 60 && this.idade <= 64) {

            if (this.IG < 22280) {

                this.msg = "MUITO BOM";

            } else if (this.IG > 22208 && this.IG < 27430) {

                this.msg = "BOM";

            } else if (this.IG > 27440 && this.IG < 33010) {

                this.msg = "REGULAR";

            } else if (this.IG < 33010) {

                this.msg = "INSUFICIENTE";

            }


        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.IG < 22820) {

                this.msg = "MUITO BOM";

            } else if (this.IG > 22820 && this.IG < 28100) {

                this.msg = "BOM";

            } else if (this.IG > 28110 && this.IG < 33710) {

                this.msg = "REGULAR";

            } else if (this.IG < 33710) {

                this.msg = "INSUFICIENTE";

            }


        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.IG < 23370) {

                this.msg = "MUITO BOM";

            } else if (this.IG > 23370 && this.IG < 28770) {

                this.msg = "BOM";

            } else if (this.IG > 20770 && this.IG < 34410) {

                this.msg = "REGULAR";

            } else if (this.IG < 34410) {

                this.msg = "INSUFICIENTE";

            }


        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.IG < 23910) {

                this.msg = "MUITO BOM";

            } else if (this.IG > 23910 && this.IG < 29450) {

                this.msg = "BOM";

            } else if (this.IG > 29460 && this.IG < 35110) {

                this.msg = "REGULAR";

            } else if (this.IG < 35110) {

                this.msg = "INSUFICIENTE";

            }


        } else if (this.idade >= 80) {


            if (this.IG < 24460) {

                this.msg = "MUITO BOM";

            } else if (this.IG > 24460 && this.IG < 30120) {

                this.msg = "BOM";

            } else if (this.IG > 30130 && this.IG < 35810) {

                this.msg = "REGULAR";

            } else if (this.IG < 35810) {

                this.msg = "INSUFICIENTE";

            }

        }
    }

}
