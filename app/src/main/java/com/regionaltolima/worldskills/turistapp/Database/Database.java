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
                "'@drawable/monserrate'," +
                "'Cerro de Monserrate'," +
                "'El Cerro de Monserrate los espera durante los 365 días del año'," +
                "'Carrera 2 E No. 21-48 | Paseo Bolívar, Bogota, Colombia'," +
                "'El cerro de Monserrate es el más conocido de los cerros Orientales de Bogotá. Junto a Guadalupe es uno de los cerros tutelares de la ciudad. Monserrate tiene una altitud de 3152 m y se ubica sobre la cordillera oriental.1\u200B Los cerros de Bogotá, de origen sedimentario, tienen por lo menos 16 millones de años de antigüedad, con rocas de edad cretácica pertenecientes al Grupo guadalupe, en lo que se refiere al aspecto geológico. Hasta mediados del siglo XVII fue conocido como cerro de Las Nieves. La basílica del Señor de Monserrate ha sido lugar de peregrinación religiosa desde la época colonial y se constituye en un atractivo natural, religioso, gastronómico de la ciudad. Se puede ascender al cerro por el sendero peatonal, por teleférico o por funicular.'" +
                ",4.6056941," +
                " -74.0642803)," +
                "('Sitios'," +
                "'@drawable/simonbolivar'," +
                "'Parque Metropolitano Simon Bolivar'," +
                "'Área verde urbana con recorridos para caminantes y ciclistas, lago para andar en bote y un área de juego.'," +
                "'Av. Calle 53 y Av. Esmeralda s/n, Bogotá, Cundinamarca'," +
                "'Este es el más grande e importante de la ciudad por varias razones: su estratégica ubicación en el corazón de Bogotá; sus amplios espacios verdes acompañados de un innumerable número de árboles o por la cantidad y variedad de los escenarios que lo conforman.\n" +
                "\n" +
                "Este pulmón de la ciudad, que se ha convertido en parte esencial de la vida de los capitalinos, está conformado por:\n" +
                "\n" +
                "- El parque Central Simón Bolívar(Calle 63 y 53 entre carreras 48 y 68)\n" +
                "- El parque Los Novios (o parque El Lago)\n" +
                "- El Complejo Acuático\n" +
                "- El Centro de Alto Rendimiento\n" +
                "- La Cancha Popular de Golf\n" +
                "- La Plaza de los Artesanos\n" +
                "- El Salitre PRD (Recreodeportivo)\n" +
                "- El Museo de los Niños\n" +
                "- La biblioteca Virgilio Barco\n" +
                "- La Unidad Deportiva El Salitre\n" +
                "- El Salitre Mágico\n" +
                "- El Jardín Botánico',4.6482361,-74.3009552)," +
                "('Sitios','@drawable/plazadebolivar','Plaza de Bolivar','Centro urbano espacioso rodeado por una catedral y edificios importantes con una arquitectura destacada.','Cra. 7 #11-10, Bogotá','\"La Plaza Mayor, como se conocía esta plaza en los inicios de la ciudad, es uno de los lugares más importantes de la ciudad y del país pues es un importante escenario social, cultural y político, alrededor del cual se toman las decisiones más trascendentales para los colombianos y para la historia de Colombia.\n" +
                "\n" +
                "La Plaza Mayor, actualmente conocida como la Plaza de Bolívar en honor a El Libertador, fue fundada casi un año después de la creación de Bogotá,  exactamente el 27 de abril de 1539, por Sebastián de Belalcázar, uno de los más reconocidos personajes españoles de la conquista de América.',4.5981259," +
                "-74.0782322)," +
                "('Sitios','@drawable/andino','Centro Comercial Andino','El Centro Comercial Andino es el corazón de una de las zonas preferidas por los bogotanos y extranjeros','Cra. 11 #82-71, Bogotá, Cundinamarca','\"El Centro Comercial Andino es el corazón de una de las zonas preferidas por los bogotanos y extranjeros, y es reconocido como el Centro Comercial más exclusivo de la ciudad. \n" +
                "\n" +
                "La privilegiada ubicación, ambiente, comodidad, seguridad, excelente servicio y amplia gama de tiendas reconocidas a nivel nacional e internacional, lo convierten en la mejor opción para sus compras y entretenimiento.\n" +
                "\n" +
                "Cuenta con 230 locales comerciales distribuidos en 4 niveles, 700 parqueaderos ubicados en dos sótanos con valet parking y servicios exclusivos para niños y adultos.\"\n'," +
                "4.6667313,-74.0553429)," +
                "('Sitios','@drawable/centromayor','Centro Comercial Centro Mayor','\"Centro comercial Centro Mayor\n" +
                "Grandes emociones para todos.\n" +
                "Centro comercial Centro Mayor en Bogotá Cund - Colombia.jpg\n" +
                "Entrada principal del centro comercial.\n" +
                "Ubicación Bandera de Colombia Bogotá, Colombia\n" +
                "Localidad de Antonio Nariño\n" +
                "Coordenadas 4°35′30″N 74°07′26″OCoordenadas: 4°35′30″N 74°07′26″O (mapa)\n" +
                "Dirección Avenida NQS con 38A sur\n" +
                "Apertura 26 de marzo de 2010 (8 años)\n" +
                "Desarrollador Arquitectura & Concreto\n" +
                "Gerencia Ospinas\n" +
                "Propietario Luis Carlos Sarmiento Angulo\n" +
                "Arquitectos Contexto Urbano\n" +
                "Tiendas y servicios 354 tiendas\n" +
                "Superficie total 300.000 m²\n" +
                "Estacionamiento 3.141 espacios\n" +
                "N.º de plantas 3 niveles\n" +
                "Centro Comercial Centro Mayor\n" +
                "[editar datos en Wikidata]\n" +
                "El centro comercial Centro Mayor es un centro comercial ubicado en la localidad de Antonio Nariño, situada al sur de Bogotá\"\n'," +
                "'Calle 38 A #Sur No. 34D-51, Bogotá\n','\"El centro comercial cuenta con una disposición especial en su interior. Tiene una temática circense adoptada en su estructura y en su decoración. En cuanto a responsabilidad ambiental, su arquitectura bioclimática aprovecha los recursos climáticos (sol, lluvia, vientos) para disminuir los impactos ambientales y reducir el consumo de energía.4\u200B Cada una de las plazoletas en las que se divide el establecimiento tienen por nombre el de algún personaje circense y tienen en ellas esculturas de más de cuatro metros alusivas a dichos personajes:\n" +
                "\n" +
                "Plaza del Acordeonista\n" +
                "Plaza del Mago\n" +
                "Plaza del Contorsionista\n" +
                "Plaza del Malabarista\n" +
                "Plaza del Equilibrista\n" +
                "Plaza del Payaso\n" +
                "Plaza del Trapecista (Plaza principal)\"\n'," +
                "4.5926585," +
                "-74.1263605)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
