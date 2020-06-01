/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import java.util.List;
import org.jpl7.Query;
import model.PreguntaVO;

/**
 *
 * @author KRLOS
 */
public class MediadorConexion {
    
    public MediadorConexion() {
    }
    
    public PreguntaVO resultQuestion(PreguntaVO preguntaVO) {
        try {
            System.out.println("Iniciando");
            String conexion = "consult('bancoPreguntas.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion + " " + con.hasMoreSolutions());
            String respuesta = preguntaVO.isRespuesta() ? "si" : "no";
            String querySi = "validarsi(" + preguntaVO.getId() +",'" + respuesta + "').";
            //String querySi = "validarsi(" + preguntaVO.getId() +",'" + respuesta + "').";
            Query validarSi = new Query(querySi);
            System.out.println(querySi + " " + validarSi.hasMoreSolutions());
            String queryNo = "validarno(" + preguntaVO.getId() +",'" + respuesta + "').";
            if (validarSi.hasMoreSolutions()) {
                preguntaVO.setPuntosObtenidos(preguntaVO.getPuntos());
            }
            Query validarNo = new Query(queryNo);
            System.out.println(queryNo + " " + validarNo.hasMoreSolutions());
            if (validarNo.hasMoreSolutions()) {
                preguntaVO.setPuntosObtenidos(0);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return preguntaVO;
    }
    public List<PreguntaVO> listaPreguntaDefault() {
        List<PreguntaVO> lista = new ArrayList<>();
        PreguntaVO preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Usted tiene tos?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(1);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(0);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Usted tiene escalosfrios?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(1);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(1);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha tenido diarrea?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(1);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(2);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Tiene dolor de garganta?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(1);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(3);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha tenido dolores musculares?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(1);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(4);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Tiene dolor de cabeza?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(1);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(5);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha tenido fiebre (38° ó más)?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(1);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(6);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Tiene dificultad para respirar?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(2);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(7);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha sentido cansancio/debilidad?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(2);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(8);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha viajado en los últimos 14 días?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(3);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(9);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha visitado áreas infectadas por Covid 19?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(3);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(10);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Visitó ó ha cuidado pacientes con Covid 19 positivo?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(3);
        preguntaVO.setPuntosObtenidos(0);
        preguntaVO.setId(11);
        lista.add(preguntaVO);
        return lista;
    }

    public String indicaciones(List<PreguntaVO> lista) {
        String cad = "";
        if (lista != null  && lista.size() > 0) {
            int ptos = 0;
            String pegSi = "Preguntas marcadas como si";
            String pegNo = "\nPreguntas marcadas como no";
            for (PreguntaVO preguntaVO : lista) {
                if (preguntaVO.isRespuesta()) {
                    pegSi += "\n" + preguntaVO.getPregunta();
                } else {
                    pegNo += "\n" + preguntaVO.getPregunta();
                }
                ptos += preguntaVO.getPuntosObtenidos();
            }
            cad = pegSi + pegNo + "\npuntos obtenido" + ptos;
        }
        return cad;
    }
}
