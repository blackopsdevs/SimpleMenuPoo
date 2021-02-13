/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.simplemenupoo.main.poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class DatosService {

    List<DatosVo> datos = new ArrayList<DatosVo>();

    public void addDatos(DatosVo datosVo) {
        datos.add(datosVo);
    }

    public List<DatosVo> listDatos() {
        return datos;
    }

}
