package com.apphotel.model;

public class Servico {
    
    private String tipoServico;

    public Servico() {
        this.tipoServico = null;
    }

    public Servico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString() {
        return "Serviço solicitado: " + tipoServico;
    }
}
