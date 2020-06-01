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
            String conexion = "consult('ejercicio.pl')";
            Query con = new Query(conexion);
            String respuesta = preguntaVO.isRespuesta() ? "SI" : "NO";
            String query = "suma(" + preguntaVO.getId() +"," + respuesta + ",C).";
            Query ejecutar = new Query(query);
            if (ejecutar.hasSolution()) {
                String ptos = String.valueOf(ejecutar.oneSolution().get("C"));
                if (ptos.isEmpty()) {
                    ptos = "0";
                }
                preguntaVO.setPuntos(Integer.parseInt(ptos));
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
        preguntaVO.setPuntos(0);
        preguntaVO.setId(0);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Usted tiene escalosfrios?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(1);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha tenido diarrea?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(2);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Tiene dolor de garganta?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(3);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha tenido dolores musculares?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(4);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Tiene dolor de cabeza?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(5);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha tenido fiebre (38° ó más)?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(6);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Tiene dificultad para respirar?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(7);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha sentido cansancio/debilidad?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(8);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha viajado en los últimos 14 días?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(9);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Ha visitado áreas infectadas por Covid 19?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(10);
        lista.add(preguntaVO);
        preguntaVO = new PreguntaVO();
        preguntaVO.setPregunta("¿Visitó ó ha cuidado pacientes con Covid 19 positivo?");
        preguntaVO.setRespuesta(false);
        preguntaVO.setPuntos(0);
        preguntaVO.setId(11);
        lista.add(preguntaVO);
        return lista;
    }
}
