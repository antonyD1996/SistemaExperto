package com.antycode.sistemaexperto;

import Rule.*;

public class SE {
    //Objeto BooleanRuleBase
    BooleanRuleBase reglas = new BooleanRuleBase("reglas");

    // Variables datos de entrada
    RuleVariable RigidezMuscular, ProblemasDeHabla,PerdidaDeMemo,DolorDeCabeza,NauseasyVomitos,VisionBorrosa,Convulsiones,SensibilidadLuz,
            PerdidaDeSensibilidad,SensacionDeHormigueo,ProblemasUrinarios,Desorientacion,CambiosDePersonalidad;

    //Variables de resultado
    RuleVariable ResultadoRigidezMuscular,ResultadoProblemasDeHabla,
            ResultadoPerdidaDeMemo,ResultadoDolorDeCabeza,ResultadoNauseasyVomitos,ResultadoVisionBorrosa,ResultadoConvulsiones,ResultadoSensibilidadLuz,
            ResultadoPerdidaDeSensibilidad,ResultadoSensacionDeHormigueo,ResultadoProblemasUrinarios,ResultadoDesorientacion,ResultadoCambiosDePersonalidad,ResultadoEnfermedad;

    String Resultado="";

    public String TieneRigidezMuscular(String respuesta)
    {
        BaseConocimiento();
        RigidezMuscular.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoRigidezMuscular.getValue();
        return Resultado;
    }
    public String TieneProblemasDeHabla(String respuesta)
    {
        BaseConocimiento();
        ProblemasDeHabla.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoProblemasDeHabla.getValue();
        return Resultado;
    }

    public String TienePerdidaDeMemo(String respuesta)
    {
        BaseConocimiento();
        PerdidaDeMemo.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoPerdidaDeMemo.getValue();
        return Resultado;
    }
    public String TieneDolorDeCabeza(String respuesta)
    {
        BaseConocimiento();
        DolorDeCabeza.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoDolorDeCabeza.getValue();
        return Resultado;
    }
    public String TieneNauseasyVomitos(String respuesta)
    {
        BaseConocimiento();
        NauseasyVomitos.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoNauseasyVomitos.getValue();
        return Resultado;
    }
    public String TieneVisionBorrosa(String respuesta)
    {
        BaseConocimiento();
        VisionBorrosa.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoVisionBorrosa.getValue();
        return Resultado;
    }
    public String TieneConvulsiones(String respuesta)
    {
        BaseConocimiento();
        Convulsiones.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoConvulsiones.getValue();
        return Resultado;
    }
    public String TieneSensibilidadLuz(String respuesta)
    {
        BaseConocimiento();
        SensibilidadLuz.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoSensibilidadLuz.getValue();
        return Resultado;
    }
    public String TienePerdidaDeSensibilidad(String respuesta)
    {
        BaseConocimiento();
        PerdidaDeSensibilidad.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoPerdidaDeSensibilidad.getValue();
        return Resultado;
    }
    public String TieneSensacionDeHormigueo(String respuesta)
    {
        BaseConocimiento();
        SensacionDeHormigueo.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoSensacionDeHormigueo.getValue();
        return Resultado;
    }
    public String TieneProblemasUrinarios(String respuesta)
    {
        BaseConocimiento();
        ProblemasUrinarios.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoProblemasUrinarios.getValue();
        return Resultado;
    }
    public String TieneDesorientacion(String respuesta)
    {
        BaseConocimiento();
        Desorientacion.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoDesorientacion.getValue();
        return Resultado;
    }
    public String TieneCambiosDePersonalidad(String respuesta)
    {
        BaseConocimiento();
        CambiosDePersonalidad.setValue(respuesta);
        reglas.forwardChain();
        Resultado= ResultadoCambiosDePersonalidad.getValue();
        return Resultado;
    }

    public String Diagnostico
            (String rigidezMuscular, String problemasDeHabla, String perdidaDeMemo, String dolorDecabeza, String nauseasyvomitos, String visionBorrosa, String convulsiones, String sensibilidadLuz,
             String perdidaDesensibilidad, String sensacionDehormigueo, String problemasUrinarios, String desorientacion, String cambiosDepersonalidad)
    {
        BaseConocimiento();
        ResultadoRigidezMuscular.setValue(rigidezMuscular);
        ResultadoProblemasDeHabla.setValue(problemasDeHabla);
        ResultadoPerdidaDeMemo.setValue(perdidaDeMemo);
        ResultadoDolorDeCabeza.setValue(dolorDecabeza);
        ResultadoNauseasyVomitos.setValue(nauseasyvomitos);
        ResultadoVisionBorrosa.setValue(visionBorrosa);
        ResultadoConvulsiones.setValue(convulsiones);
        ResultadoSensibilidadLuz.setValue(sensibilidadLuz);
        ResultadoPerdidaDeSensibilidad.setValue(perdidaDesensibilidad);
        ResultadoSensacionDeHormigueo.setValue(sensacionDehormigueo);
        ResultadoProblemasUrinarios.setValue(problemasUrinarios);
        ResultadoDesorientacion.setValue(desorientacion);
        ResultadoCambiosDePersonalidad.setValue(cambiosDepersonalidad);
        reglas.forwardChain();
        Resultado = ResultadoEnfermedad.getValue();
        return Resultado;
    }

    public void BaseConocimiento(){


        RigidezMuscular= new RuleVariable(reglas, "");
        ProblemasDeHabla= new RuleVariable(reglas, "");
        PerdidaDeMemo= new RuleVariable(reglas, "");
        DolorDeCabeza= new RuleVariable(reglas, "");
        NauseasyVomitos= new RuleVariable(reglas, "");
        VisionBorrosa= new RuleVariable(reglas, "");
        Convulsiones= new RuleVariable(reglas, "");
        SensibilidadLuz= new RuleVariable(reglas, "");
        PerdidaDeSensibilidad= new RuleVariable(reglas, "");
        SensacionDeHormigueo= new RuleVariable(reglas, "");
        ProblemasUrinarios= new RuleVariable(reglas, "");
        Desorientacion= new RuleVariable(reglas, "");
        CambiosDePersonalidad= new RuleVariable(reglas, "");

        ResultadoRigidezMuscular = new RuleVariable(reglas,"");
        ResultadoProblemasDeHabla = new RuleVariable(reglas,"");
        ResultadoPerdidaDeMemo = new RuleVariable(reglas,"");
        ResultadoDolorDeCabeza = new RuleVariable(reglas,"");
        ResultadoNauseasyVomitos = new RuleVariable(reglas,"");
        ResultadoVisionBorrosa = new RuleVariable(reglas,"");
        ResultadoConvulsiones = new RuleVariable(reglas,"");
        ResultadoSensibilidadLuz = new RuleVariable(reglas,"");
        ResultadoPerdidaDeSensibilidad = new RuleVariable(reglas,"");
        ResultadoSensacionDeHormigueo = new RuleVariable(reglas,"");
        ResultadoProblemasUrinarios = new RuleVariable(reglas,"");
        ResultadoDesorientacion = new RuleVariable(reglas,"");
        ResultadoCambiosDePersonalidad = new RuleVariable(reglas,"");
        ResultadoEnfermedad = new RuleVariable(reglas,"");

        // CONDICIONES
        Condition igual = new Condition("=");

        Rule reglaSiRigidezMuscular = new Rule(
                reglas,
                "reglaSiRigidezMuscular",
                new Clause[]{
                        new Clause(RigidezMuscular,igual,"si")
                },
                new Clause(ResultadoRigidezMuscular,igual,"SiRigidezMuscular")
        );
        Rule reglaNoRigidezMuscular = new Rule(
                reglas,
                "reglaNoRigidezMuscular",
                new Clause[]{
                        new Clause(RigidezMuscular,igual,"no")
                },
                new Clause(ResultadoRigidezMuscular,igual,"NoRigidezMuscular")
        );
        Rule reglaSiProblemasDeHabla = new Rule(
                reglas,
                "reglaSiProblemasDeHabla",
                new Clause[]{
                        new Clause(ProblemasDeHabla,igual,"si")
                },
                new Clause(ResultadoProblemasDeHabla,igual,"SiProblemasDeHabla")
        );
        Rule reglaNoProblemasDeHabla = new Rule(
                reglas,
                "reglaNoProblemasDeHabla",
                new Clause[]{
                        new Clause(ProblemasDeHabla,igual,"no")
                },
                new Clause(ResultadoProblemasDeHabla,igual,"NoProblemasDeHabla")
        );
        Rule reglaSiPerdidaDeMemo = new Rule(
                reglas,
                "reglaSiPerdidaDeMemo",
                new Clause[]{
                        new Clause(PerdidaDeMemo,igual,"si")
                },
                new Clause(ResultadoPerdidaDeMemo,igual,"SiPerdidaDeMemo")
        );
        Rule reglaNoPerdidaDeMemo = new Rule(
                reglas,
                "reglaNoPerdidaDeMemo",
                new Clause[]{
                        new Clause(PerdidaDeMemo,igual,"no")
                },
                new Clause(ResultadoPerdidaDeMemo,igual,"NoPerdidaDeMemo")
        );
        Rule reglaSiDolorDeCabeza = new Rule(
                reglas,
                "reglaSiDolorDeCabeza",
                new Clause[]{
                        new Clause(DolorDeCabeza,igual,"si")
                },
                new Clause(ResultadoDolorDeCabeza,igual,"SiDolorDeCabeza")
        );
        Rule reglaNoDolorDeCabeza = new Rule(
                reglas,
                "reglaNoDolorDeCabeza",
                new Clause[]{
                        new Clause(DolorDeCabeza,igual,"no")
                },
                new Clause(ResultadoDolorDeCabeza,igual,"NoDolorDeCabeza")
        );
        Rule reglaSiNauseasyVomitos = new Rule(
                reglas,
                "reglaSiNauseasyVomitos",
                new Clause[]{
                        new Clause(NauseasyVomitos,igual,"si")
                },
                new Clause(ResultadoNauseasyVomitos,igual,"SiNauseasyVomitos")
        );
        Rule reglaNoNauseasyVomitos = new Rule(
                reglas,
                "reglaNoNauseasyVomitos",
                new Clause[]{
                        new Clause(NauseasyVomitos,igual,"no")
                },
                new Clause(ResultadoNauseasyVomitos,igual,"NoNauseasyVomitos")
        );

        Rule reglaSiVisionBorrosa = new Rule(
                reglas,
                "reglaSiVisionBorrosa",
                new Clause[]{
                        new Clause(VisionBorrosa,igual,"si")
                },
                new Clause(ResultadoVisionBorrosa,igual,"SiVisionBorrosa")
        );
        Rule reglaNoVisionBorrosa = new Rule(
                reglas,
                "reglaNoVisionBorrosa",
                new Clause[]{
                        new Clause(VisionBorrosa,igual,"no")
                },
                new Clause(ResultadoVisionBorrosa,igual,"NoVisionBorrosa")
        );
        Rule reglaSiConvulsiones = new Rule(
                reglas,
                "reglaSiConvulsiones",
                new Clause[]{
                        new Clause(Convulsiones,igual,"si")
                },
                new Clause(ResultadoConvulsiones,igual,"SiConvulsiones")
        );
        Rule reglaNoConvulsiones = new Rule(
                reglas,
                "reglaNoConvulsiones",
                new Clause[]{
                        new Clause(Convulsiones,igual,"no")
                },
                new Clause(ResultadoConvulsiones,igual,"NoConvulsiones")
        );

        Rule reglaSiSensibilidadLuz = new Rule(
                reglas,
                "reglaSiSensibilidadLuz",
                new Clause[]{
                        new Clause(SensibilidadLuz,igual,"si")
                },
                new Clause(ResultadoSensibilidadLuz,igual,"SiSensibilidadLuz")
        );
        Rule reglaNoSensibilidadLuz = new Rule(
                reglas,
                "reglaNoSensibilidadLuz",
                new Clause[]{
                        new Clause(SensibilidadLuz,igual,"no")
                },
                new Clause(ResultadoSensibilidadLuz,igual,"NoSensibilidadLuz")
        );

        Rule reglaSiPerdidaDeSensibilidad = new Rule(
                reglas,
                "reglaSiPerdidaDeSensibilidad",
                new Clause[]{
                        new Clause(PerdidaDeSensibilidad,igual,"si")
                },
                new Clause(ResultadoPerdidaDeSensibilidad,igual,"SiPerdidaDeSensibilidad")
        );
        Rule reglaNoPerdidaDeSensibilidad = new Rule(
                reglas,
                "reglaNoPerdidaDeSensibilidad",
                new Clause[]{
                        new Clause(PerdidaDeSensibilidad,igual,"no")
                },
                new Clause(ResultadoPerdidaDeSensibilidad,igual,"NoPerdidaDeSensibilidad")
        );

        Rule reglaSiSensacionDeHormigueo = new Rule(
                reglas,
                "reglaSiSensacionDeHormigueo",
                new Clause[]{
                        new Clause(SensacionDeHormigueo,igual,"si")
                },
                new Clause(ResultadoSensacionDeHormigueo,igual,"SiSensacionDeHormigueo")
        );
        Rule reglaNoSensacionDeHormigueo = new Rule(
                reglas,
                "reglaNoSensacionDeHormigueo",
                new Clause[]{
                        new Clause(SensacionDeHormigueo,igual,"no")
                },
                new Clause(ResultadoSensacionDeHormigueo,igual,"NoSensacionDeHormigueo")
        );

        Rule reglaSiProblemasUrinarios = new Rule(
                reglas,
                "reglaSiProblemasUrinarios",
                new Clause[]{
                        new Clause(ProblemasUrinarios,igual,"si")
                },
                new Clause(ResultadoProblemasUrinarios,igual,"SiProblemasUrinarios")
        );
        Rule reglaNoProblemasUrinarios = new Rule(
                reglas,
                "reglaNoProblemasUrinarios",
                new Clause[]{
                        new Clause(ProblemasUrinarios,igual,"no")
                },
                new Clause(ResultadoProblemasUrinarios,igual,"NoProblemasUrinarios")
        );

        Rule reglaSiDesorientacion = new Rule(
                reglas,
                "reglaSiDesorientacion",
                new Clause[]{
                        new Clause(Desorientacion,igual,"si")
                },
                new Clause(ResultadoDesorientacion,igual,"SiDesorientacion")
        );
        Rule reglaNoDesorientacion = new Rule(
                reglas,
                "reglaNoDesorientacion",
                new Clause[]{
                        new Clause(Desorientacion,igual,"no")
                },
                new Clause(ResultadoDesorientacion,igual,"NoDesorientacion")
        );
        Rule reglaSiCambiosDePersonalidad = new Rule(
                reglas,
                "reglaSiCambiosDePersonalidad",
                new Clause[]{
                        new Clause(CambiosDePersonalidad,igual,"si")
                },
                new Clause(ResultadoCambiosDePersonalidad,igual,"SiCambiosDePersonalidad")
        );
        Rule reglaNoCambiosDePersonalidad = new Rule(
                reglas,
                "reglaNoCambiosDePersonalidad",
                new Clause[]{
                        new Clause(CambiosDePersonalidad,igual,"no")
                },
                new Clause(ResultadoCambiosDePersonalidad,igual,"NoCambiosDePersonalidad")
        );
        Rule reglaParkinson = new Rule(
                reglas,
                "reglaParkinson",
                new Clause[]{
                        new Clause(ResultadoRigidezMuscular,igual,"SiRigidezMuscular"),
                        new Clause(ResultadoProblemasDeHabla,igual,"SiProblemasDeHabla"),
                        new Clause(ResultadoPerdidaDeMemo,igual,"SiPerdidaDeMemo"),
                        new Clause(ResultadoDolorDeCabeza,igual,"SiDolorDeCabeza"),
                        new Clause(ResultadoVisionBorrosa,igual,"SiVisionBorrosa")
                },
                new Clause(ResultadoEnfermedad,igual,"Parkinson")
        );

        Rule reglaAlzheimer = new Rule(
                reglas,
                "reglaAlzheimer",
                new Clause[]{
                        new Clause(ResultadoRigidezMuscular,igual,"SiRigidezMuscular"),
                        new Clause(ResultadoProblemasDeHabla,igual,"SiProblemasDeHabla"),
                        new Clause(ResultadoPerdidaDeMemo,igual,"SiPerdidaDeMemo"),
                        new Clause(ResultadoDesorientacion,igual,"SiDesorientacion"),
                        new Clause(ResultadoCambiosDePersonalidad,igual,"SiCambiosDePersonalidad")
                },
                new Clause(ResultadoEnfermedad,igual,"Alzheimer")
        );



        Rule reglaAneurismaCerebral = new Rule(
                reglas,
                "reglaAneurismaCerebral",
                new Clause[]{
                        new Clause(ResultadoRigidezMuscular,igual,"SiRigidezMuscular"),
                        new Clause(ResultadoPerdidaDeMemo,igual,"SiPerdidaDeMemo"),
                        new Clause(ResultadoDolorDeCabeza,igual,"SiDolorDeCabeza"),
                        new Clause(ResultadoNauseasyVomitos,igual,"SiNauseasyVomitos"),
                        new Clause(ResultadoVisionBorrosa,igual,"SiVisionBorrosa"),
                        new Clause(ResultadoConvulsiones,igual,"SiConvulsiones"),
                        new Clause(ResultadoSensibilidadLuz,igual,"SiSensibilidadLuz")
                },
                new Clause(ResultadoEnfermedad,igual,"Aneurisma Cerebral")
        );

        Rule reglaEsclerosisMultiple = new Rule(
                reglas,
                "reglaEsclerosisMultiple",
                new Clause[]{
                        new Clause(ResultadoRigidezMuscular,igual,"SiRigidezMuscular"),
                        new Clause(ResultadoProblemasDeHabla,igual,"SiProblemasDeHabla"),
                        new Clause(ResultadoVisionBorrosa,igual,"SiVisionBorrosa"),
                        new Clause(ResultadoPerdidaDeSensibilidad,igual,"SiPerdidaDeSensibilidad"),
                        new Clause(ResultadoSensacionDeHormigueo,igual,"SiSensacionDeHormigueo"),
                        new Clause(ResultadoProblemasUrinarios,igual,"SiProblemasUrinarios")
                },
                new Clause(ResultadoEnfermedad,igual,"Esclerosis Multiple")
        );

        Rule reglaMigraña = new Rule(
                reglas,
                "reglaMigraña",
                new Clause[]{
                        new Clause(ResultadoRigidezMuscular,igual,"SiRigidezMuscular"),
                        new Clause(ResultadoDolorDeCabeza,igual,"SiDolorDeCabeza"),
                        new Clause(ResultadoNauseasyVomitos,igual,"SiNauseasyVomitos"),
                        new Clause(ResultadoVisionBorrosa,igual,"SiVisionBorrosa"),
                        new Clause(ResultadoSensibilidadLuz,igual,"SiSensibilidadLuz"),
                        new Clause(ResultadoSensacionDeHormigueo,igual,"SiSensacionDeHormigueo")
                },
                new Clause(ResultadoEnfermedad,igual,"Migraña")
        );

    }
}