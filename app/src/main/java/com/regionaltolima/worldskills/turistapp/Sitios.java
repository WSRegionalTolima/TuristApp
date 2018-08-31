package com.regionaltolima.worldskills.turistapp;

import java.io.Serializable;

/**
 * Clase para crear las entidades
 */
public class Sitios implements Serializable {

    private String tipoSitio;
    private int imagenSitio;
    private String nombreSitio;
    private String descLargaSitio;
    private String descCortaSitio;


    private String ubicacionSitio;
    private double latSitio;
    private double lonSitio;

    public Sitios(String tipoSitio, int imagenSitio, String nombreSitio, String descCortaSitio, String ubicacionSitio, String descLargaSitio, double latSitio, double lonSitio) {
        this.tipoSitio = tipoSitio;
        this.imagenSitio = imagenSitio;
        this.nombreSitio = nombreSitio;
        this.descCortaSitio = descCortaSitio;
        this.ubicacionSitio = ubicacionSitio;
        this.descLargaSitio = descLargaSitio;
        this.latSitio = latSitio;
        this.lonSitio = lonSitio;
    }



    public String getTipoSitio() {
        return tipoSitio;
    }

    public void setTipoSitio(String tipoSitio) {
        this.tipoSitio = tipoSitio;
    }

    public int getImagenSitio() {
        return imagenSitio;
    }

    public void setImagenSitio(int imagenSitio) {
        this.imagenSitio = imagenSitio;
    }

    public String getNombreSitio() {
        return nombreSitio;
    }

    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }

    public String getDescLargaSitio() {
        return descLargaSitio;
    }

    public void setDescLargaSitio(String descLargaSitio) {
        this.descLargaSitio = descLargaSitio;
    }

    public String getDescCortaSitio() {
        return descCortaSitio;
    }

    public void setDescCortaSitio(String descCortaSitio) {
        this.descCortaSitio = descCortaSitio;
    }

    public String getUbicacionSitio() {
        return ubicacionSitio;
    }

    public void setUbicacionSitio(String ubicacionSitio) {
        this.ubicacionSitio = ubicacionSitio;
    }

    public double getLatSitio() {
        return latSitio;
    }

    public void setLatSitio(double latSitio) {
        latSitio = latSitio;
    }

    public double getLonSitio() {
        return lonSitio;
    }

    public void setLonSitio(double lonSitio) {
        lonSitio = lonSitio;
    }

}
