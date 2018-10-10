/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Paciente;
import edu.eci.pdsw.entities.TipoIdentificacion;
import edu.eci.pdsw.persistence.DaoPaciente;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.services.ExcepcionServiciosSuscripciones;
import edu.eci.pdsw.services.ServiciosPaciente;
import java.util.List;

/**
 *
 * @author hcadavid
 */
public class ServiciosPacienteImpl implements ServiciosPaciente {

    @Inject
    private DaoPaciente daoPaciente;

    @Override
    public List<Paciente> consultarPacientes() throws ExcepcionServiciosSuscripciones {
        try {
            return daoPaciente.loadAll();
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosSuscripciones("Error al realizar la consulta:"+ex.getLocalizedMessage(), ex);
        }
    }

    @Override
    public Paciente consultarPacientesPorId(int id, TipoIdentificacion tipoIdentificacion) throws ExcepcionServiciosSuscripciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> consultarMenoresConEnfermedadContagiosa() throws ExcepcionServiciosSuscripciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
