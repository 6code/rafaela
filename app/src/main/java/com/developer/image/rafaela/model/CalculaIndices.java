package com.developer.image.rafaela.model;

public class CalculaIndices {


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

    public String calcularIG(int idade) {

        String msg = null;

        this.IG = (((this.C10M + this.LPS + this.LPDV + this.VTC) * 2) + this.LCLC) / 4;

        if (idade >= 50 && idade <= 59) {

            msg = "";


        } else if (idade >= 60 && idade <= 64) {

            if (this.IG < 22280) {

                msg = "MUITO BOM";

            } else if (this.IG > 22208 && this.IG < 27430) {

                msg = "BOM";

            } else if (this.IG > 27440 && this.IG < 33010) {

                msg = "REGULAR";

            } else if (this.IG < 33010) {

                msg = "INSUFICIENTE";

            }


        } else if (idade >= 65 && idade <= 69) {


            if (this.IG < 22820) {

                msg = "MUITO BOM";

            } else if (this.IG > 22820 && this.IG < 28100) {

                msg = "BOM";

            } else if (this.IG > 28110 && this.IG < 33710) {

                msg = "REGULAR";

            } else if (this.IG < 33710) {

                msg = "INSUFICIENTE";

            }


        } else if (idade >= 70 && idade <= 74) {


            if (this.IG < 23370) {

                msg = "MUITO BOM";

            } else if (this.IG > 23370 && this.IG < 28770) {

                msg = "BOM";

            } else if (this.IG > 20770 && this.IG < 34410) {

                msg = "REGULAR";

            } else if (this.IG < 34410) {

                msg = "INSUFICIENTE";

            }


        } else if (idade >= 75 && idade <= 79) {

            if (this.IG < 23910) {

                msg = "MUITO BOM";

            } else if (this.IG > 23910 && this.IG < 29450) {

                msg = "BOM";

            } else if (this.IG > 29460 && this.IG < 35110) {

                msg = "REGULAR";

            } else if (this.IG < 35110) {

                msg = "INSUFICIENTE";

            }


        } else if (idade >= 80) {


            if (this.IG < 24460) {

                msg = "MUITO BOM";

            } else if (this.IG > 24460 && this.IG < 30120) {

                msg = "BOM";

            } else if (this.IG > 30130 && this.IG < 35810) {

                msg = "REGULAR";

            } else if (this.IG < 35810) {

                msg = "INSUFICIENTE";

            }


        }

        return msg;
    }



}
