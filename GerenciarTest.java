/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class GerenciarTest {
    
    public GerenciarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGerenciar() {
    Gerenciar aero = new Gerenciar();
    
    Aviao a1 = new Aviao();
    Aeroporto al1 = new Aeroporto();
    al1.nome = "Teste";
    al1.prefixo = "Tst";
    a1.companhia = "TAM";
    a1.prefixo = "T";
    aero.pousar(al1,a1);
    
    aero.listar();
    
    
    }
    
}
