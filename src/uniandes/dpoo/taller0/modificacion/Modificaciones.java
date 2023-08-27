package uniandes.dpoo.taller0.modificacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Map;

import uniandes.dpoo.taller0.consola.ConsolaOlimpicos;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificaciones {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.out.println("hola,mundo!");
		
		CalculadoraEstadisticas calculadora = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		if (calculadora != null) {
            Map<String, Integer> paisMasMedallistas = calculadora.paisConMasMedallistas();
            System.out.println("El país con más medallistas es: " + paisMasMedallistas);
		}
	}
}
