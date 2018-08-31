package com.regionaltolima.worldskills.turistapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Clase para crear la Base de Datos
 */
public class Database extends SQLiteOpenHelper {
    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Sitios(tipoSitio TEXT," +
                "imagenSitio TEXT," +
                "nombreSitio TEXT," +
                "descripcionCorta TEXT," +
                "ubicacionSitio TEXT," +
                "descripcionLarga TEXT," +
                "latSitio double," +
                "lonSitio)");

        db.execSQL("INSERT INTO Sitios " +
                "VALUES('Sitios'," +
                "'R.drawable.monserrate'," +
                "'Cerro de Monserrate'," +
                "'El Cerro de Monserrate los espera durante los 365 días del año'," +
                "'Carrera 2 E No. 21-48 | Paseo Bolívar, Bogota, Colombia'," +
                "'El cerro de Monserrate es el más conocido de los cerros Orientales de Bogotá. Junto a Guadalupe es uno de los cerros tutelares de la ciudad. Monserrate tiene una altitud de 3152 m y se ubica sobre la cordillera oriental.1\u200B Los cerros de Bogotá, de origen sedimentario, tienen por lo menos 16 millones de años de antigüedad, con rocas de edad cretácica pertenecientes al Grupo guadalupe, en lo que se refiere al aspecto geológico. Hasta mediados del siglo XVII fue conocido como cerro de Las Nieves. La basílica del Señor de Monserrate ha sido lugar de peregrinación religiosa desde la época colonial y se constituye en un atractivo natural, religioso, gastronómico de la ciudad. Se puede ascender al cerro por el sendero peatonal, por teleférico o por funicular.'" +
                ",4.6056941," +
                " -74.0642803)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
