package com.antycode.sistemaexperto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    FragmentInicio fragmentInicio;
    FragmentRigidezMuscular fragmentRigidezMuscular;
    FragmentDolorCabeza fragmentDolorCabeza;
    FragmentPerdidaMemoria fragmentPerdidaMemoria;
    FragmentSinResultado fragmentSinResultado;
    FragmentProblemasHabla fragmentProblemasHabla;
    FragmentNauseasVomito fragmentNauseasVomito;
    FragmentResultado fragmentResultado;
    FragmentVisionBorrosa fragmentVisionBorrosa;
    FragmentDesorientacion fragmentDesorientacion;
    FragmentCambioPersonalidad fragmentCambioPersonalidad;
    FragmentSensasionHormigueo fragmentSensasionHormigueo;
    FragmentSensibilidadLuz fragmentSensibilidadLuz;
    FragmentConvulsiones fragmentConvulsiones;
    FragmentPerdidaSensibilidad fragmentPerdidaSensibilidad;
    FragmentProblemasUrinarios fragmentProblemasUrinarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio = new FragmentInicio();
        fragmentRigidezMuscular = new FragmentRigidezMuscular();
        fragmentDolorCabeza = new FragmentDolorCabeza();
        fragmentPerdidaMemoria = new FragmentPerdidaMemoria();
        fragmentSinResultado = new FragmentSinResultado();
        fragmentProblemasHabla = new FragmentProblemasHabla();
        fragmentNauseasVomito = new FragmentNauseasVomito();
        fragmentVisionBorrosa = new FragmentVisionBorrosa();
        fragmentDesorientacion = new FragmentDesorientacion();
        fragmentCambioPersonalidad = new FragmentCambioPersonalidad();
        fragmentSensasionHormigueo = new FragmentSensasionHormigueo();
        fragmentSensibilidadLuz = new FragmentSensibilidadLuz();
        fragmentConvulsiones = new FragmentConvulsiones();
        fragmentPerdidaSensibilidad = new FragmentPerdidaSensibilidad();
        fragmentProblemasUrinarios = new FragmentProblemasUrinarios();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        getSupportFragmentManager().beginTransaction().add(R.id.idContenedorFrame, fragmentInicio).commit();
    }


    public void onClick(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btnComenzarTest: {

                Utilidades.inicializar();
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentRigidezMuscular);
            }
            break;
            case R.id.idRespuestaSiRigidez: {
                Utilidades.RIGIDEZ_MUSCULAR = "si";
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentVisionBorrosa);
            }
            break;
            case R.id.idRespuestaNoRigidez: {
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentSinResultado);
            }
            break;
            case R.id.idRespuestaSiVisionBorrosa: {
                Utilidades.VISION_BORRROSA = "si";
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentDolorCabeza);
            }
            break;
            case R.id.idRespuestaNoVisionBorrosa: {
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentPerdidaMemoria);
            }
            break;
            case R.id.idRespuestaSiDolorCabeza:
                Utilidades.DOLOR_DE_CABEZA = "si";
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentPerdidaMemoria);
                break;
            case R.id.idRespuestaNoDolorCabeza:
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentProblemasHabla);
                break;
            case R.id.idRespuestaSiPerdidaMemoria:
                Utilidades.PERDIDA_DE_MEMORIA = "si";
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentProblemasHabla);
                break;
            case R.id.idRespuestaNoPerdidaMemoria:
                if(Utilidades.VISION_BORRROSA.equals("si")){
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentNauseasVomito);
                }else{
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentSinResultado);
                }
                break;
            case R.id.idRespuestaNoDesorientacion:
            case R.id.idRespuestaNoSensibilidadLuz:
            case R.id.idRespuestaNoCambioPersonalidad:
            case R.id.idRespuestaNoConvulsiones:
            case R.id.idRespuestaNoPerdidaSensibilidad:
            case R.id.idRespuestaNoProblemasUrinarios:
            case R.id.idRespuestaNoSensasionHormigueo:
            case R.id.idRespuestaNoNauseasVomito:
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentSinResultado);
                break;
            case R.id.idRespuestaSiProblemasHabla:
                Utilidades.PROBLEMAS_DE_HABLA = "si";
                if (Utilidades.VISION_BORRROSA.equals("si")) {
                    if (Utilidades.DOLOR_DE_CABEZA.equals("no")) {
                        fragmentTransaction.replace(R.id.idContenedorFrame, fragmentSensasionHormigueo);
                    } else {
                        fragmentResultado = new FragmentResultado();
                        fragmentTransaction.replace(R.id.idContenedorFrame, fragmentResultado);
                    }
                } else {
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentDesorientacion);
                }
                break;
            case R.id.idRespuestaNoProblemasHabla:
                if (Utilidades.PERDIDA_DE_MEMORIA.equals("no")) {
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentSinResultado);
                } else {
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentNauseasVomito);
                }
                break;
            case R.id.idRespuestaSiDesorientacion:
                Utilidades.DESORIENTACION = "si";
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentCambioPersonalidad);
                break;
            case R.id.idRespuestaSiCambioPersonalidad:
                Utilidades.CAMBIOS_DE_PERSONALIDAD = "si";
                fragmentResultado = new FragmentResultado();
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentResultado);
                break;
            case R.id.idRespuestaSiSensasionHormigueo:
                Utilidades.SENSACION_DE_HORMIGUEO = "si";
                if (Utilidades.SENSIBILIDAD_LUZ.equals("si")) {
                    fragmentResultado = new FragmentResultado();
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentResultado);
                } else {
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentPerdidaSensibilidad);
                }
                break;
            case R.id.idRespuestaSiPerdidaSensibilidad:
                Utilidades.PERDIDA_DE_SENSIBILIDAD = "si";
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentProblemasUrinarios);
                break;
            case R.id.idRespuestaSiProblemasUrinarios:
                Utilidades.PROBLEMAS_URINARIOS = "si";
                fragmentResultado = new FragmentResultado();
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentResultado);
                break;
            case R.id.idRespuestaSiNauseasVomito: {
                Utilidades.NAUSEAS_Y_VOMITO = "si";
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentSensibilidadLuz);
            }
            break;
            case R.id.idRespuestaSiSensibilidadLuz: {
                Utilidades.SENSIBILIDAD_LUZ = "si";
                if (Utilidades.PERDIDA_DE_MEMORIA.equals("si")) {
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentConvulsiones);
                } else {
                    fragmentTransaction.replace(R.id.idContenedorFrame, fragmentSensasionHormigueo);
                }
            }
            break;
            case R.id.idRespuestaSiConvulsiones: {
                Utilidades.CONVULSIONES = "si";
                fragmentResultado = new FragmentResultado();
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentResultado);
            }
            break;
            case R.id.idVolverAInicio:
                fragmentTransaction.replace(R.id.idContenedorFrame, fragmentInicio);
                break;
            case R.id.idVerReporteCompleto:
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
        }
        fragmentTransaction.commit();
    }


}
