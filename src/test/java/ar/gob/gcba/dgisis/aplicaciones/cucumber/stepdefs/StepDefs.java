package ar.gob.gcba.dgisis.aplicaciones.cucumber.stepdefs;

import ar.gob.gcba.dgisis.aplicaciones.Mapa360AplicacionesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Mapa360AplicacionesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
