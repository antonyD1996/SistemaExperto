package com.antycode.sistemaexperto;

public class Utilidades {
    static SE sistema = new SE();

    public static String RIGIDEZ_MUSCULAR = "no",
            PROBLEMAS_DE_HABLA = "no",
            PERDIDA_DE_MEMORIA = "no",
            DOLOR_DE_CABEZA = "no",
            NAUSEAS_Y_VOMITO = "no",
            VISION_BORRROSA = "no",
            CONVULSIONES = "no",
            SENSIBILIDAD_LUZ = "no",
            PERDIDA_DE_SENSIBILIDAD = "no",
            SENSACION_DE_HORMIGUEO = "no",
            PROBLEMAS_URINARIOS = "no",
            DESORIENTACION = "no",
            CAMBIOS_DE_PERSONALIDAD = "no";

    private static String rigidezMuscular, problemasDeHabla, perdidaDeMemo, dolorDecabeza, nauseasyvomitos, visionBorrosa, convulsiones, sensibilidadLuz,
            perdidaDesensibilidad, sensacionDehormigueo, problemasUrinarios, desorientacion, cambiosDepersonalidad, enfermedad, si = "si", no = "no";

    static String obtenerDiagnostico() {
        cargar();
        enfermedad = sistema.Diagnostico(rigidezMuscular, problemasDeHabla, perdidaDeMemo, dolorDecabeza, nauseasyvomitos, visionBorrosa, convulsiones, sensibilidadLuz,
                perdidaDesensibilidad, sensacionDehormigueo, problemasUrinarios, desorientacion, cambiosDepersonalidad);
        return enfermedad;
    }

    static String getReporteUrl() {
        String url = "";
        if (obtenerDiagnostico().equals("Parkinson")) {
            url = "https://drive.google.com/file/d/1GtYCKck903PXOtyV-AHK4ZXmNwQSfceS/view?usp=sharing";
        } else if (obtenerDiagnostico().equals("Alzheimer")) {
            url = "https://drive.google.com/file/d/1SRylb42aYUA_-w5sJ4vX0f0GtAEinfGg/view?usp=sharing";
        } else if (obtenerDiagnostico().equals("Aneurisma Cerebral")) {
            url = "https://drive.google.com/file/d/1QbzcBGiQ4p_tUIzzyV-gg5AVkGoqfFun/view?usp=sharing";
        } else if (obtenerDiagnostico().equals("Esclerosis Multiple")) {
            url = "https://drive.google.com/file/d/1RbO0C4ZlFKWGzA4YPv6yR4tHCbHNHa8p/view?usp=sharing";
        } else if (obtenerDiagnostico().equals("Migraña")) {
            url = "https://drive.google.com/file/d/1t0LuMXBswKhzrHRbrBy58HLkgzif_o8w/view?usp=sharing";
        }
        return url;
    }

    static void inicializar() {
        RIGIDEZ_MUSCULAR = "no";
        PROBLEMAS_DE_HABLA = "no";
        PERDIDA_DE_MEMORIA = "no";
        DOLOR_DE_CABEZA = "no";
        NAUSEAS_Y_VOMITO = "no";
        VISION_BORRROSA = "no";
        CONVULSIONES = "no";
        SENSIBILIDAD_LUZ = "no";
        PERDIDA_DE_SENSIBILIDAD = "no";
        SENSACION_DE_HORMIGUEO = "no";
        PROBLEMAS_URINARIOS = "no";
        DESORIENTACION = "no";
        CAMBIOS_DE_PERSONALIDAD = "no";
    }

    static void cargar() {
        rigidezMuscular = sistema.TieneRigidezMuscular(RIGIDEZ_MUSCULAR);
        dolorDecabeza = sistema.TieneDolorDeCabeza(DOLOR_DE_CABEZA);
        nauseasyvomitos = sistema.TieneNauseasyVomitos(NAUSEAS_Y_VOMITO);
        visionBorrosa = sistema.TieneVisionBorrosa(VISION_BORRROSA);
        sensibilidadLuz = sistema.TieneSensibilidadLuz(SENSIBILIDAD_LUZ);
        sensacionDehormigueo = sistema.TieneSensacionDeHormigueo(SENSACION_DE_HORMIGUEO);
        problemasDeHabla = sistema.TieneProblemasDeHabla(PROBLEMAS_DE_HABLA);
        perdidaDesensibilidad = sistema.TienePerdidaDeSensibilidad(PERDIDA_DE_SENSIBILIDAD);
        problemasUrinarios = sistema.TieneProblemasUrinarios(PROBLEMAS_URINARIOS);
        perdidaDeMemo = sistema.TienePerdidaDeMemo(PERDIDA_DE_MEMORIA);
        desorientacion = sistema.TieneDesorientacion(DESORIENTACION);
        cambiosDepersonalidad = sistema.TieneCambiosDePersonalidad(CAMBIOS_DE_PERSONALIDAD);
        convulsiones = sistema.TieneConvulsiones(CONVULSIONES);
    }

}
