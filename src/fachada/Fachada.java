/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import java.util.List;
import controler.MediadorConexion;
import model.PreguntaVO;

/**
 *
 * @author KRLOS
 */
public class Fachada {
    private static Fachada fachada = null;
    private MediadorConexion mediadorConexion = null;

    /**
     * Creates a new instance of FachadaFuncionalidad
     */
    private Fachada() {
        mediadorConexion = new MediadorConexion();
    }

    /**
     * Método que obtiene la instancia de la Fachada
     *
     * @return objeto FachadaGeneral
     */
    public static Fachada getInstance() {
        if (fachada == null) {
            fachada = new Fachada();
        }
        return fachada;
    }

    public PreguntaVO resultQuestion(PreguntaVO preguntaVO) {
        return mediadorConexion.resultQuestion(preguntaVO);
    }

    public List<PreguntaVO> listaPreguntas() {
        return mediadorConexion.listaPreguntaDefault();
    }
}
