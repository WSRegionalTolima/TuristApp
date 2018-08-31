package com.regionaltolima.worldskills.turistapp.Clases;

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


    /**
     * Constuye Un Objeto de Tipo Sitio que guarda toda su informacion
     */
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

    /**
     * Obtengo el Tipo de sitio del obgeto Sitio
     * @return
     */
    public String getTipoSitio() {
        return tipoSitio;
    }

    /**
     * Obtengo La imagen del Sitio
     * @return
     */
    public int getImagenSitio() {
        return imagenSitio;
    }

    /**
     * Obtengo el nombre del objeto Sitio
     * @return
     */
    public String getNombreSitio() {
        return nombreSitio;
    }

    /**
     * Obtengo la descripcion corta del objeto Sitio
     * @return
     */
    public String getDescCortaSitio() {
        return descCortaSitio;
    }

    /**
     * Obtengo la Descripcion Larga del Sitio
     * @return
     */
    public String getDescLargaSitio() {
        return descLargaSitio;
    }

    /**
     * Obtengo la ubicacion del objeto Sitio
     * @return
     */
    public String getUbicacionSitio() {
        return ubicacionSitio;
    }

    /**
     * Obtengo la Latitud del objeto Sitio
     * @return
     */
    public double getLatSitio() {
        return latSitio;
    }

    /**
     * Obtengo la latitud del objeto Sitio
     * @return
     */
    public double getLonSitio() {
        return lonSitio;
    }


}
