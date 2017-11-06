package com.developer.image.rafaela.model;

public class CalculaIndices {

    private String resultadoGeral = "";
    private String resultadoC10M = "";
    private String resultadoLPS = "";
    private String resultadoLPDV = "";
    private String resultadoVTC = "";
    private String resultadoLCLC = "";
    private String resultadoIG = "";
    private String nome;
    private Integer idade;

    private long C10M;
    private long LPS;
    private long LPDV;
    private long VTC;
    private long LCLC;
    private long IG;



    public CalculaIndices(long c10M, long LPS, long LPDV, long VTC, long LCLC) {

        this.C10M = c10M;
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

        this.resultadoGeral = "\tResultados:"
                + "\n C10M: " + resultadoC10M
                + "\n LPS: " + resultadoLPS
                + "\n LPDV: " + resultadoLPDV
                + "\n VTC: " + resultadoVTC
                + "\n LCLC: " + resultadoLCLC
                + "\n IG: " + resultadoIG;

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

//50-59 -------------------------------------------------------------
        if (this.idade >= 50 && this.idade <= 59) {

            this.resultadoC10M = "";

//60-64 -------------------------------------------------------------
        } else if (this.idade >= 60 && this.idade <= 64) {

            if (this.C10M < 5520) {

                this.resultadoC10M = "Muito bom";

            } else if (this.C10M > 5520 && this.C10M < 7040) {

                this.resultadoC10M = "Bom";

            } else if (this.C10M > 7050 && this.C10M < 8920) {

                this.resultadoC10M = "Regular";

            } else if (this.C10M > 8920) {

                this.resultadoC10M = "Insuficiente";

            }
//65-69 -------------------------------------------------------------

        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.C10M < 5670) {

                this.resultadoC10M = "Muito bom";

            } else if (this.C10M > 5670 && this.C10M < 7210) {

                this.resultadoC10M = "bom";

            } else if (this.C10M > 7220 && this.C10M < 9040) {

                this.resultadoC10M = "Regular";

            } else if (this.C10M > 9040) {

                this.resultadoC10M = "Insufuciente";

            }
//70-74 -------------------------------------------------------------

        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.C10M < 5830) {

                this.resultadoC10M = "Muito bom";

            } else if (this.C10M > 5830 && this.C10M < 7380) {

                this.resultadoC10M = "Bom";

            } else if (this.C10M > 7390 && this.C10M < 9040) {

                this.resultadoC10M = "Regular";

            } else if (this.C10M > 9040) {

                this.resultadoC10M = "Insuficiente";

            }
//75-79 -------------------------------------------------------------

        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.C10M < 5980) {

                this.resultadoC10M = "Muito bom";

            } else if (this.C10M > 5970 && this.C10M < 7560) {

                this.resultadoC10M = "Bom";

            } else if (this.C10M > 7570 && this.C10M < 9280) {

                this.resultadoC10M = "Regular";

            } else if (this.C10M > 9280) {

                this.resultadoC10M = "Insuficiente";

            }
//>80 -------------------------------------------------------------

        } else if (this.idade >= 80) {


            if (this.C10M < 6140) {

                this.resultadoC10M = "Muito bom";

            } else if (this.C10M > 6140 && this.C10M < 7730) {

                this.resultadoC10M = "Bom";

            } else if (this.C10M > 7740 && this.C10M < 9400) {

                this.resultadoC10M = "Regular";

            } else if (this.C10M > 9400) {

                this.resultadoC10M = "Insuficente";

            }
        }

    }


    /***********************************************************************************/


    public void calcularLPS() {


//50-59 -------------------------------------------------------------
        if (this.idade >= 50 && this.idade <= 59) {

            this.resultadoLPS = "";

//60-64 -------------------------------------------------------------
        } else if (this.idade >= 60 && this.idade <= 64) {

            if (this.LPS < 6840) {

                this.resultadoLPS = "Muito bom";

            } else if (this.LPS > 6840 && this.LPS < 10120) {

                this.resultadoLPS = "Bom";

            } else if (this.LPS > 10130 && this.LPS < 13620) {

                this.resultadoLPS = "Regular";

            } else if (this.LPS > 13620) {

                this.resultadoLPS = "Insuficiente";

            }
//65-69 -------------------------------------------------------------

        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.LPS < 6910) {

                this.resultadoLPS = "Muito bom";

            } else if (this.LPS > 6910 && this.LPS < 10190) {

                this.resultadoLPS = "bom";

            } else if (this.LPS > 10200 && this.LPS < 13720) {

                this.resultadoLPS = "Regular";

            } else if (this.LPS > 13720) {

                this.resultadoLPS = "Insufuciente";

            }
//70-74 -------------------------------------------------------------

        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.LPS < 6970) {

                this.resultadoLPS = "Muito bom";

            } else if (this.LPS > 6970 && this.LPS < 10260) {

                this.resultadoLPS = "Bom";

            } else if (this.LPS > 10270 && this.LPS < 13810) {

                this.resultadoLPS = "Regular";

            } else if (this.LPS > 13810) {

                this.resultadoLPS = "Insuficiente";

            }
//75-79 -------------------------------------------------------------

        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.LPS < 7040) {

                this.resultadoLPS = "Muito bom";

            } else if (this.LPS > 7040 && this.LPS < 10330) {

                this.resultadoLPS = "Bom";

            } else if (this.LPS > 10340 && this.LPS < 13910) {

                this.resultadoLPS = "Regular";

            } else if (this.LPS > 13910) {

                this.resultadoLPS = "Insuficiente";

            }
//>80 -------------------------------------------------------------

        } else if (this.idade >= 80) {


            if (this.LPS < 7110) {

                this.resultadoLPS = "Muito bom";

            } else if (this.LPS > 7110 && this.LPS < 10400) {

                this.resultadoLPS = "Bom";

            } else if (this.LPS > 10410 && this.LPS < 14010) {

                this.resultadoLPS = "Regular";

            } else if (this.LPS > 14010) {

                this.resultadoLPS = "Insuficente";

            }


        }
    }


    /***********************************************************************************/



    public void calcularLPDV() {


//50-59 -------------------------------------------------------------
        if (this.idade >= 50 && this.idade <= 59) {

            this.resultadoLPDV = "";

//60-64 -------------------------------------------------------------
        } else if (this.idade >= 60 && this.idade <= 64) {

            if (this.LPDV < 2300) {

                this.resultadoLPDV = "Muito bom";

            } else if (this.LPDV > 2300 && this.LPDV < 3520) {

                this.resultadoLPDV = "Bom";

            } else if (this.LPDV > 3530 && this.LPDV < 5410) {

                this.resultadoLPDV = "Regular";

            } else if (this.LPDV > 5410) {

                this.resultadoLPDV = "Insuficiente";

            }
//65-69 -------------------------------------------------------------

        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.LPDV < 2470) {

                this.resultadoLPDV = "Muito bom";

            } else if (this.LPDV > 2047 && this.LPDV < 3810) {

                this.resultadoLPDV = "bom";

            } else if (this.LPDV > 3820 && this.LPDV < 5800) {

                this.resultadoLPDV = "Regular";

            } else if (this.LPDV > 5800) {

                this.resultadoLPDV = "Insufuciente";

            }
//70-74 -------------------------------------------------------------

        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.LPDV < 2630) {

                this.resultadoLPDV = "Muito bom";

            } else if (this.LPDV > 2630 && this.LPDV < 4110) {

                this.resultadoLPDV = "Bom";

            } else if (this.LPDV > 4120 && this.LPDV < 6200) {

                this.resultadoLPDV = "Regular";

            } else if (this.LPDV > 6200) {

                this.resultadoLPDV = "Insuficiente";

            }
//75-79 -------------------------------------------------------------

        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.LPDV < 2800) {

                this.resultadoLPDV = "Muito bom";

            } else if (this.LPDV > 2800 && this.LPDV < 4400) {

                this.resultadoLPDV = "Bom";

            } else if (this.LPDV > 4410 && this.LPDV < 6600) {

                this.resultadoLPDV = "Regular";

            } else if (this.LPDV > 6600) {

                this.resultadoLPDV = "Insuficiente";

            }
//>80 -------------------------------------------------------------

        } else if (this.idade >= 80) {


            if (this.LPDV < 2960) {

                this.resultadoLPDV = "Muito bom";

            } else if (this.LPDV > 2960 && this.LPDV < 4700) {

                this.resultadoLPDV = "Bom";

            } else if (this.LPDV > 4710 && this.LPDV < 6990) {

                this.resultadoLPDV = "Regular";

            } else if (this.LPDV > 6990) {

                this.resultadoLPDV = "Insuficente";

            }


        }

    }


    /***********************************************************************************/





    public void calcularVTC() {

//50-59 -------------------------------------------------------------
        if (this.idade >= 50 && this.idade <= 59) {

            this.resultadoVTC = "";

//60-64 -------------------------------------------------------------
        } else if (this.idade >= 60 && this.idade <= 64) {

            if (this.VTC < 8220) {

                this.resultadoVTC = "Muito bom";

            } else if (this.VTC > 8220 && this.VTC < 11450) {

                this.resultadoVTC = "Bom";

            } else if (this.VTC > 11460 && this.VTC < 15510) {

                this.resultadoVTC = "Regular";

            } else if (this.VTC > 15510) {

                this.resultadoVTC = "Insuficiente";

            }
//65-69 -------------------------------------------------------------

        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.VTC < 875) {

                this.resultadoVTC = "Muito bom";

            } else if (this.VTC > 8750 && this.VTC < 12000) {

                this.resultadoVTC = "bom";

            } else if (this.VTC > 12100 && this.VTC < 16040) {

                this.resultadoVTC = "Regular";

            } else if (this.VTC > 16040) {

                this.resultadoVTC = "Insufuciente";

            }
//70-74 -------------------------------------------------------------

        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.VTC < 9290) {

                this.resultadoVTC = "Muito bom";

            } else if (this.VTC > 9290 && this.VTC < 12540) {

                this.resultadoVTC = "Bom";

            } else if (this.VTC > 12550 && this.VTC < 16560) {

                this.resultadoVTC = "Regular";

            } else if (this.VTC > 16560) {

                this.resultadoVTC = "Insuficiente";

            }
//75-79 -------------------------------------------------------------

        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.VTC < 9830) {

                this.resultadoVTC = "Muito bom";

            } else if (this.VTC > 9830 && this.VTC < 12080) {

                this.resultadoVTC = "Bom";

            } else if (this.VTC > 13090 && this.VTC < 17080) {

                this.resultadoVTC = "Regular";

            } else if (this.VTC > 17080) {

                this.resultadoVTC = "Insuficiente";

            }
//>80 -------------------------------------------------------------

        } else if (this.idade >= 80) {


            if (this.VTC < 10360) {

                this.resultadoVTC = "Muito bom";

            } else if (this.VTC > 10360 && this.VTC < 13630) {

                this.resultadoVTC = "Bom";

            } else if (this.VTC > 13640 && this.VTC < 17600) {

                this.resultadoVTC = "Regular";

            } else if (this.VTC > 17600) {

                this.resultadoVTC = "Insuficente";

            }


        }
    }


    /***********************************************************************************/





    public void calcularLCLC() {


//50-59 -------------------------------------------------------------
        if (this.idade >= 50 && this.idade <= 59) {

            this.resultadoLCLC = "";

//60-64 -------------------------------------------------------------
        } else if (this.idade >= 60 && this.idade <= 64) {

            if (this.LCLC < 35170) {

                this.resultadoLCLC = "Muito bom";

            } else if (this.LCLC > 35170 && this.LCLC < 42370) {

                this.resultadoLCLC = "Bom";

            } else if (this.LCLC > 42380 && this.LCLC < 49680) {

                this.resultadoLCLC = "Regular";

            } else if (this.LCLC > 49680) {

                this.resultadoLCLC = "Insuficiente";

            }
//65-69 -------------------------------------------------------------

        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.LCLC < 35960) {

                this.resultadoLCLC = "Muito bom";

            } else if (this.LCLC > 35960 && this.LCLC < 43280) {

                this.resultadoLCLC = "bom";

            } else if (this.LCLC > 43290 && this.LCLC < 50810) {

                this.resultadoLCLC = "Regular";

            } else if (this.LCLC > 50810) {

                this.resultadoLCLC = "Insufuciente";

            }
//70-74 -------------------------------------------------------------

        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.C10M < 36760) {

                this.resultadoLCLC = "Muito bom";

            } else if (this.LCLC > 367660 && this.LCLC < 44190) {

                this.resultadoLCLC = "Bom";

            } else if (this.LCLC > 44200 && this.LCLC < 51940) {

                this.resultadoLCLC = "Regular";

            } else if (this.LCLC > 51940) {

                this.resultadoLCLC = "Insuficiente";

            }
//75-79 -------------------------------------------------------------

        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.LCLC < 37550) {

                this.resultadoLCLC = "Muito bom";

            } else if (this.LCLC > 37550 && this.LCLC < 45110) {

                this.resultadoLCLC = "Bom";

            } else if (this.LCLC > 45120 && this.LCLC < 53060) {

                this.resultadoLCLC = "Regular";

            } else if (this.LCLC > 53060) {

                this.resultadoLCLC = "Insuficiente";

            }
//>80 -------------------------------------------------------------

        } else if (this.idade >= 80) {


            if (this.LCLC < 38350) {

                this.resultadoLCLC = "Muito bom";

            } else if (this.LCLC > 38350 && this.LCLC < 46020) {

                this.resultadoLCLC = "Bom";

            } else if (this.LCLC > 46030 && this.LCLC < 54190) {

                this.resultadoLCLC = "Regular";

            } else if (this.LCLC > 54190) {

                this.resultadoLCLC = "Insuficente";

            }


        }
    }


    /***********************************************************************************/




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

            } else if (this.IG > 33010) {

                this.resultadoIG = "Insuficiente";

            }


        } else if (this.idade >= 65 && this.idade <= 69) {


            if (this.IG < 22820) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 22820 && this.IG < 28100) {

                this.resultadoIG = "bom";

            } else if (this.IG > 28110 && this.IG < 33710) {

                this.resultadoIG = "Regular";

            } else if (this.IG > 33710) {

                this.resultadoIG = "Insufuciente";

            }


        } else if (this.idade >= 70 && this.idade <= 74) {


            if (this.IG < 23370) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 23370 && this.IG < 28770) {

                this.resultadoIG = "Bom";

            } else if (this.IG > 20770 && this.IG < 34410) {

                this.resultadoIG = "Regular";

            } else if (this.IG > 34410) {

                this.resultadoIG = "Insuficiente";

            }


        } else if (this.idade >= 75 && this.idade <= 79) {

            if (this.IG < 23910) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 23910 && this.IG < 29450) {

                this.resultadoIG = "Bom";

            } else if (this.IG > 29460 && this.IG < 35110) {

                this.resultadoIG = "Regular";

            } else if (this.IG > 35110) {

                this.resultadoIG = "Insuficiente";

            }


        } else if (this.idade >= 80) {


            if (this.IG < 24460) {

                this.resultadoIG = "Muito bom";

            } else if (this.IG > 24460 && this.IG < 30120) {

                this.resultadoIG = "Bom";

            } else if (this.IG > 30130 && this.IG < 35810) {

                this.resultadoIG = "Regular";

            } else if (this.IG > 35810) {

                this.resultadoIG = "Insuficente";

            }

        }
    }

}
